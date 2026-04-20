package com.alipay.mcp.springai.client;

import com.alipay.mcp.springai.transport.AlipayAuthInterceptor;
import com.alipay.mcp.springai.transport.AlipayMcpException;
import com.alipay.mcp.springai.transport.AlipaySseMcpTransport;
import io.modelcontextprotocol.client.McpClient;
import io.modelcontextprotocol.client.McpSyncClient;
import io.modelcontextprotocol.spec.McpSchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.security.PrivateKey;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 * 支付宝 MCP Client
 * 封装 Spring AI MCP 客户端，提供流式工具调用
 */
public class AlipayMcpClient implements AutoCloseable {

    private static final Logger log = LoggerFactory.getLogger(AlipayMcpClient.class);

    private final McpSyncClient syncClient;
    private final McpClient asyncClient;
    private final String appId;
    private final AlipaySseMcpTransport transport;

    public AlipayMcpClient(String appId, PrivateKey privateKey, String sseEndpoint) {
        this.appId = appId;

        // 构建自定义 Transport
        this.transport = AlipaySseMcpTransport.builder()
            .sseEndpoint(sseEndpoint)
            .addInterceptor(new AlipayAuthInterceptor(appId, privateKey, null))
            .build();

        // 创建 Spring AI MCP Client
        this.asyncClient = McpClient.async(transport)
            .requestTimeout(Duration.ofSeconds(30))
            .build();

        this.syncClient = McpClient.sync(transport)
            .requestTimeout(Duration.ofSeconds(30))
            .build();

        log.info("AlipayMcpClient initialized for appId: {}", appId);
    }

    /**
     * 获取可用工具列表
     */
    public List<McpSchema.Tool> listTools() {
        McpSchema.ListToolsResult result = syncClient.listTools();
        return result.tools();
    }

    /**
     * 流式获取工具列表
     */
    public Flux<McpSchema.Tool> listToolsStream() {
        return Mono.fromFuture(asyncClient.listTools())
            .flatMapMany(result -> Flux.fromIterable(result.tools()));
    }

    /**
     * 同步调用工具
     */
    public ToolCallResult callTool(String toolName, Map<String, Object> args) {
        log.debug("Calling tool: {} with args: {}", toolName, args);

        McpSchema.CallToolRequest request = new McpSchema.CallToolRequest(toolName, args);
        McpSchema.CallToolResult result = syncClient.callTool(request);

        // 聚合结果
        String text = result.content().stream()
            .map(content -> {
                if (content instanceof McpSchema.TextContent textContent) {
                    return textContent.text();
                }
                return content.toString();
            })
            .collect(Collectors.joining());

        boolean isError = result.isError() != null ? result.isError() : false;

        return new ToolCallResult(text, "text", isError);
    }

    /**
     * 流式调用工具
     */
    public Flux<ToolCallResult> callToolStream(String toolName, Map<String, Object> args) {
        log.debug("Streaming call to tool: {} with args: {}", toolName, args);

        McpSchema.CallToolRequest request = new McpSchema.CallToolRequest(toolName, args);

        return Mono.fromFuture(asyncClient.callTool(request))
            .flatMapMany(result -> {
                if (result.content() != null) {
                    return Flux.fromIterable(result.content())
                        .map(content -> {
                            if (content instanceof McpSchema.TextContent textContent) {
                                return new ToolCallResult(textContent.text(), "text", false);
                            }
                            return new ToolCallResult(content.toString(), "unknown", false);
                        });
                }
                return Flux.empty();
            })
            .onErrorResume(e -> {
                log.error("Error calling tool: {}", toolName, e);
                return Flux.error(new AlipayMcpException("TOOL_CALL_ERROR",
                    "调用工具失败: " + e.getMessage(), e));
            });
    }

    /**
     * 异步调用工具
     */
    public CompletableFuture<ToolCallResult> callToolAsync(String toolName, Map<String, Object> args) {
        return callToolStream(toolName, args)
            .reduce((a, b) -> new ToolCallResult(a.content() + b.content(), "text", a.isError() || b.isError()))
            .toFuture();
    }

    /**
     * 获取客户端信息
     */
    public McpSchema.Implementation getClientInfo() {
        return new McpSchema.Implementation("alipay-mcp-client", "1.0.0");
    }

    @Override
    public void close() {
        log.info("Closing AlipayMcpClient for appId: {}", appId);
        syncClient.close();
        asyncClient.close();
        transport.closeGracefully().block(Duration.ofSeconds(5));
    }

    // ============ 记录类 ============

    public record ToolCallResult(String content, String type, boolean isError) {

        public ToolCallResult(String content, String type) {
            this(content, type, false);
        }

        @Override
        public String toString() {
            return "ToolCallResult{" +
                "content='" + content + '\'' +
                ", type='" + type + '\'' +
                ", isError=" + isError +
                '}';
        }
    }
}

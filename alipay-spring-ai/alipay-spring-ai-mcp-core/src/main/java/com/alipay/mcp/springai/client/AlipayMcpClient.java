package com.alipay.mcp.springai.client;

import com.alipay.mcp.springai.transport.AlipayMcpException;
import com.alipay.mcp.springai.transport.AlipaySseMcpTransport;
import com.alipay.mcp.springai.transport.AlipayStreamableMcpTransport;
import io.modelcontextprotocol.client.McpAsyncClient;
import io.modelcontextprotocol.client.McpClient;
import io.modelcontextprotocol.client.McpSyncClient;
import io.modelcontextprotocol.spec.McpClientTransport;
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
 * 封装 MCP Java SDK，提供同步和流式工具调用
 */
public class AlipayMcpClient implements AutoCloseable {

    private static final Logger log = LoggerFactory.getLogger(AlipayMcpClient.class);

    private final McpSyncClient syncClient;
    private final McpAsyncClient asyncClient;
    private final String appId;
    private final McpClientTransport transport;
    private final TransportMode transportMode;

    /**
     * MCP 传输模式枚举
     */
    public enum TransportMode {
        SSE,        // HTTP with SSE (旧版协议)
        STREAMABLE  // Streamable HTTP (新版协议，2025-03-26)
    }

    /**
     * 创建 AlipayMcpClient（完整 SSE 端点，默认 SSE 模式）
     *
     * @param appId      应用 ID
     * @param privateKey 私钥字符串（PKCS8 格式，可带 PEM 标记）
     * @param sseEndpoint 完整 SSE 端点 URL（如 https://opengw.alipay.com/api/v1/open/mcps/xxx/sse）
     */
    public AlipayMcpClient(String appId, String privateKey, String sseEndpoint) {
        this(appId, privateKey, sseEndpoint, TransportMode.SSE);
    }

    /**
     * 创建 AlipayMcpClient（支持传输模式选择）
     *
     * @param appId      应用 ID
     * @param privateKey 私钥字符串（PKCS8 格式，可带 PEM 标记）
     * @param endpoint   端点 URL（SSE 或 Streamable）
     * @param mode       传输模式（SSE 或 STREAMABLE）
     */
    public AlipayMcpClient(String appId, String privateKey, String endpoint, TransportMode mode) {
        this.appId = appId;
        this.transportMode = mode;

        // 解析 baseUri 和 endpointPath
        String baseUri = extractBaseUri(endpoint);
        String endpointPath = extractEndpointPath(endpoint, baseUri, mode);

        log.info("初始化 AlipayMcpClient: mode={}, baseUri={}, endpointPath={}", mode, baseUri, endpointPath);

        // 根据模式创建 Transport
        if (mode == TransportMode.STREAMABLE) {
            this.transport = AlipayStreamableMcpTransport.builder(baseUri)
                .mcpEndpoint(endpointPath)
                .appId(appId)
                .privateKey(privateKey)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
        } else {
            this.transport = AlipaySseMcpTransport.builder(baseUri)
                .sseEndpoint(endpointPath)
                .appId(appId)
                .privateKey(privateKey)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
        }

        // 创建 MCP Client
        this.syncClient = McpClient.sync(transport)
            .requestTimeout(Duration.ofSeconds(30))
            .build();

        this.asyncClient = McpClient.async(transport)
            .requestTimeout(Duration.ofSeconds(30))
            .build();

        // 初始化客户端（MCP 握手）
        log.info("开始 MCP 初始化...");
        this.syncClient.initialize();
        log.info("AlipayMcpClient 初始化完成，appId: {}, mode: {}", appId, mode);
    }

    /**
     * 创建 AlipayMcpClient（使用 baseUri 和 mcpName，SSE 模式）
     *
     * @param appId      应用 ID
     * @param privateKey 私钥字符串（PKCS8 格式，可带 PEM 标记）
     * @param baseUri    基础 URI（如 https://opengw.alipay.com）
     * @param mcpName    MCP 名称
     */
    public AlipayMcpClient(String appId, String privateKey, String baseUri, String mcpName) {
        this(appId, privateKey, baseUri, mcpName, TransportMode.SSE);
    }

    /**
     * 创建 AlipayMcpClient（使用 baseUri 和 mcpName，支持传输模式选择）
     *
     * @param appId      应用 ID
     * @param privateKey 私钥字符串（PKCS8 格式，可带 PEM 标记）
     * @param baseUri    基础 URI（如 https://opengw.alipay.com）
     * @param mcpName    MCP 名称
     * @param mode       传输模式（SSE 或 STREAMABLE）
     */
    public AlipayMcpClient(String appId, String privateKey, String baseUri, String mcpName, TransportMode mode) {
        this(appId, privateKey, baseUri + "/api/v1/open/mcps/" + mcpName + (mode == TransportMode.STREAMABLE ? "/mcp" : "/sse"), mode);
    }

    /**
     * 创建 AlipayMcpClient（PrivateKey 对象版本，兼容旧 API）
     *
     * @deprecated 请使用 {@link #AlipayMcpClient(String, String, String)}
     */
    @Deprecated
    public AlipayMcpClient(String appId, PrivateKey privateKey, String sseEndpoint) {
        this(appId, privateKeyToString(privateKey), sseEndpoint);
    }

    /**
     * 创建 AlipayMcpClient（PrivateKey 对象版本，兼容旧 API）
     *
     * @deprecated 请使用 {@link #AlipayMcpClient(String, String, String, String)}
     */
    @Deprecated
    public AlipayMcpClient(String appId, PrivateKey privateKey, String baseUri, String mcpName) {
        this(appId, privateKeyToString(privateKey), baseUri, mcpName);
    }

    /**
     * PrivateKey 转字符串（PEM 格式）
     */
    private static String privateKeyToString(PrivateKey privateKey) {
        String encoded = java.util.Base64.getEncoder().encodeToString(privateKey.getEncoded());
        return "-----BEGIN PRIVATE KEY-----\n" +
            encoded.replaceAll("(.{64})", "$1\n") +
            "\n-----END PRIVATE KEY-----";
    }

    /**
     * 从完整 URL 中提取 baseUri
     */
    private String extractBaseUri(String endpoint) {
        try {
            java.net.URI uri = java.net.URI.create(endpoint);
            return uri.getScheme() + "://" + uri.getAuthority();
        } catch (Exception e) {
            // 如果解析失败，尝试按 /api 分割
            int idx = endpoint.indexOf("/api/");
            if (idx > 0) {
                return endpoint.substring(0, idx);
            }
            return endpoint;
        }
    }

    /**
     * 从完整 URL 中提取 endpoint path
     */
    private String extractEndpointPath(String endpoint, String baseUri, TransportMode mode) {
        if (endpoint.startsWith(baseUri)) {
            return endpoint.substring(baseUri.length());
        }
        // 根据模式返回默认端点
        return mode == TransportMode.STREAMABLE ? "/mcp" : "/sse";
    }

    /**
     * 从完整 URL 中提取 endpoint path（默认 SSE 模式，用于向后兼容）
     */
    private String extractEndpointPath(String sseEndpoint, String baseUri) {
        return extractEndpointPath(sseEndpoint, baseUri, TransportMode.SSE);
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
        return asyncClient.listTools()
            .flatMapMany(result -> Flux.fromIterable(result.tools()));
    }

    /**
     * 同步调用工具
     */
    public ToolCallResult callTool(String toolName, Map<String, Object> args) {
        log.debug("调用工具: {} 参数: {}", toolName, args);

        McpSchema.CallToolRequest request = McpSchema.CallToolRequest.builder()
            .name(toolName)
            .arguments(args)
            .build();

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
        log.debug("流式调用工具: {} 参数: {}", toolName, args);

        McpSchema.CallToolRequest request = McpSchema.CallToolRequest.builder()
            .name(toolName)
            .arguments(args)
            .build();

        return asyncClient.callTool(request)
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
                log.error("调用工具失败: {}", toolName, e);
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

    /**
     * 获取同步 MCP Client（用于 Spring AI 集成）
     */
    public McpSyncClient getSyncClient() {
        return syncClient;
    }

    /**
     * 获取异步 MCP Client
     */
    public McpAsyncClient getAsyncClient() {
        return asyncClient;
    }

    @Override
    public void close() {
        log.info("关闭 AlipayMcpClient, appId: {}", appId);
        syncClient.close();
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

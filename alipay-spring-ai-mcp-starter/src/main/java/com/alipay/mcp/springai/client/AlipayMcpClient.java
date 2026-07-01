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

import java.security.PrivateKey;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 * 支付宝 MCP Client
 * 封装 MCP Java SDK，提供同步和流式工具调用
 * 支持两种认证模式：RSA 签名（默认）和 API Key
 */
public class AlipayMcpClient implements AutoCloseable {

    private static final Logger log = LoggerFactory.getLogger(AlipayMcpClient.class);
    private static final Duration DEFAULT_REQUEST_TIMEOUT = Duration.ofSeconds(30);
    private static final Duration DEFAULT_CONNECT_TIMEOUT = Duration.ofSeconds(10);

    private final McpSyncClient syncClient;
    private final McpAsyncClient asyncClient;
    private final String appId;
    private final String privateKey;
    private final McpClientTransport transport;
    private final TransportMode transportMode;

    /**
     * MCP 传输模式枚举
     */
    public enum TransportMode {
        SSE,        // HTTP with SSE (旧版协议)
        STREAMABLE  // Streamable HTTP (新版协议，2025-03-26)
    }

    // ============ 签名模式构造函数 ============

    /**
     * 创建 AlipayMcpClient（完整 SSE 端点，默认 SSE 模式）
     *
     * @param appId       应用 ID
     * @param privateKey  私钥字符串（PKCS8 格式，可带 PEM 标记）
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
        this(appId, privateKey, endpoint, mode, DEFAULT_CONNECT_TIMEOUT);
    }

    /**
     * 创建 AlipayMcpClient（支持传输模式和连接超时配置）
     *
     * @param appId          应用 ID
     * @param privateKey     私钥字符串（PKCS8 格式，可带 PEM 标记）
     * @param endpoint       端点 URL（SSE 或 Streamable）
     * @param mode           传输模式（SSE 或 STREAMABLE）
     * @param connectTimeout 连接超时
     */
    public AlipayMcpClient(String appId, String privateKey, String endpoint, TransportMode mode, Duration connectTimeout) {
        this.appId = appId;
        this.privateKey = privateKey;
        this.transportMode = mode;
        this.transport = buildTransport(endpoint, mode, appId, privateKey, null, "sign", connectTimeout);
        this.syncClient = McpClient.sync(transport).requestTimeout(DEFAULT_REQUEST_TIMEOUT).build();
        this.asyncClient = McpClient.async(transport).requestTimeout(DEFAULT_REQUEST_TIMEOUT).build();
        log.info("初始化 AlipayMcpClient (签名模式): appId={}, mode={}, connectTimeout={}", appId, mode, connectTimeout);
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

    // ============ API Key 模式工厂方法 ============

    /**
     * 使用 API Key 创建 AlipayMcpClient（完整端点 URL）
     *
     * @param apiKey   API Key
     * @param endpoint 端点 URL（SSE 或 Streamable）
     * @param mode     传输模式（SSE 或 STREAMABLE）
     * @return AlipayMcpClient 实例
     */
    public static AlipayMcpClient withApiKey(String apiKey, String endpoint, TransportMode mode) {
        return new AlipayMcpClient(apiKey, endpoint, mode, DEFAULT_CONNECT_TIMEOUT);
    }

    /**
     * 使用 API Key 创建 AlipayMcpClient（完整端点 URL，支持连接超时配置）
     *
     * @param apiKey         API Key
     * @param endpoint       端点 URL（SSE 或 Streamable）
     * @param mode           传输模式（SSE 或 STREAMABLE）
     * @param connectTimeout 连接超时
     * @return AlipayMcpClient 实例
     */
    public static AlipayMcpClient withApiKey(String apiKey, String endpoint, TransportMode mode, Duration connectTimeout) {
        return new AlipayMcpClient(apiKey, endpoint, mode, connectTimeout);
    }

    /**
     * 使用 API Key 创建 AlipayMcpClient（baseUri + mcpName 方式）
     *
     * @param apiKey   API Key
     * @param baseUri  基础 URI（如 https://opengw.alipay.com）
     * @param mcpName  MCP 名称
     * @param mode     传输模式（SSE 或 STREAMABLE）
     * @return AlipayMcpClient 实例
     */
    public static AlipayMcpClient withApiKey(String apiKey, String baseUri, String mcpName, TransportMode mode) {
        return withApiKey(apiKey, baseUri + "/api/v1/open/mcps/" + mcpName + (mode == TransportMode.STREAMABLE ? "/mcp" : "/sse"), mode);
    }

    // ============ 兼容旧 API ============

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

    // ============ 内部：API Key 私有构造函数 ============

    private AlipayMcpClient(String apiKey, String endpoint, TransportMode mode, Duration connectTimeout) {
        this.appId = null;
        this.privateKey = null;
        this.transportMode = mode;
        this.transport = buildTransport(endpoint, mode, null, null, apiKey, "api_key", connectTimeout);
        this.syncClient = McpClient.sync(transport).requestTimeout(DEFAULT_REQUEST_TIMEOUT).build();
        this.asyncClient = McpClient.async(transport).requestTimeout(DEFAULT_REQUEST_TIMEOUT).build();
        log.info("初始化 AlipayMcpClient (API Key 模式): mode={}, connectTimeout={}", mode, connectTimeout);
    }

    // ============ 内部工具方法 ============

    private static McpClientTransport buildTransport(String endpoint, TransportMode mode,
                                                      String appId, String privateKey,
                                                      String apiKey, String authType,
                                                      Duration connectTimeout) {
        String baseUri = extractBaseUri(endpoint);
        String endpointPath = extractEndpointPath(endpoint, baseUri, mode);

        if (mode == TransportMode.STREAMABLE) {
            AlipayStreamableMcpTransport.Builder builder = AlipayStreamableMcpTransport.builder(baseUri)
                .mcpEndpoint(endpointPath)
                .authType(authType)
                .connectTimeout(connectTimeout);
            if ("sign".equals(authType)) {
                builder.appId(appId).privateKey(privateKey);
            } else {
                builder.apiKey(apiKey);
            }
            return builder.build();
        } else {
            AlipaySseMcpTransport.Builder builder = AlipaySseMcpTransport.builder(baseUri)
                .sseEndpoint(endpointPath)
                .authType(authType)
                .connectTimeout(connectTimeout);
            if ("sign".equals(authType)) {
                builder.appId(appId).privateKey(privateKey);
            } else {
                builder.apiKey(apiKey);
            }
            return builder.build();
        }
    }

    private static String privateKeyToString(PrivateKey privateKey) {
        String encoded = java.util.Base64.getEncoder().encodeToString(privateKey.getEncoded());
        return "-----BEGIN PRIVATE KEY-----\n" +
            encoded.replaceAll("(.{64})", "$1\n") +
            "\n-----END PRIVATE KEY-----";
    }

    private static String extractBaseUri(String endpoint) {
        try {
            java.net.URI uri = java.net.URI.create(endpoint);
            return uri.getScheme() + "://" + uri.getAuthority();
        } catch (Exception e) {
            int idx = endpoint.indexOf("/api/");
            if (idx > 0) {
                return endpoint.substring(0, idx);
            }
            return endpoint;
        }
    }

    private static String extractEndpointPath(String endpoint, String baseUri, TransportMode mode) {
        if (endpoint.startsWith(baseUri)) {
            return endpoint.substring(baseUri.length());
        }
        return mode == TransportMode.STREAMABLE ? "/mcp" : "/sse";
    }

    // ============ 公共 API ============

    /**
     * 初始化 MCP 客户端（执行 MCP 握手）
     * 必须在构造后调用此方法才能使用工具调用等功能。
     *
     * @return 初始化结果
     */
    public McpSchema.InitializeResult initialize() {
        log.info("开始 MCP 初始化, appId: {}, mode: {}", appId, transportMode);
        McpSchema.InitializeResult result = this.syncClient.initialize();
        log.info("AlipayMcpClient 初始化完成, appId: {}, mode: {}", appId, transportMode);
        return result;
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

        McpSchema.CallToolRequest request = new McpSchema.CallToolRequest(toolName, args);

        McpSchema.CallToolResult result = syncClient.callTool(request);

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

        McpSchema.CallToolRequest request = new McpSchema.CallToolRequest(toolName, args);

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
        asyncClient.close();
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
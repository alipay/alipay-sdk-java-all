package com.alipay.mcp;

import com.alipay.mcp.config.McpClientConfig;
import com.alipay.mcp.protocol.Tool;
import com.alipay.mcp.protocol.ToolCallResult;
import com.alipay.mcp.transport.McpEventListener;
import com.alipay.mcp.transport.ProgressUpdate;
import com.alipay.mcp.transport.LogMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * 简化版 MCP 客户端
 *
 * 特点：
 * - 同步阻塞模式，无需事件监听
 * - 自动完成初始化握手
 * - 更简洁的 API
 * - 支持异步调用
 *
 * 使用示例：
 * <pre>
 * SimpleMcpClient client = SimpleMcpClient.create()
 *     .appId("2021006141677002")
 *     .privateKey("...")
 *     .mcpName("aidata-convenience-life5")
 *     .build();
 *
 * // 同步获取工具列表
 * List<Tool> tools = client.listTools();
 *
 * // 同步调用工具
 * ToolCallResult result = client.callTool("testOpenApi")
 *     .nestedParam("toolParams", "date", "2024-01-01")
 *     .nestedParam("toolParams", "type", "1")
 *     .execute();
 *
 * // 异步调用工具
 * CompletableFuture<ToolCallResult> future = client.callToolAsync("testOpenApi", params);
 *
 * // 关闭
 * client.close();
 * </pre>
 */
public class SimpleMcpClient implements AutoCloseable {

    private static final Logger log = LoggerFactory.getLogger(SimpleMcpClient.class);

    private final McpClient delegate;
    private volatile boolean connected = false;

    private SimpleMcpClient(McpClient client) {
        this.delegate = client;
    }

    /**
     * 创建 Builder
     */
    public static SimpleMcpClientBuilder create() {
        return new SimpleMcpClientBuilder();
    }

    /**
     * 连接并初始化（自动调用）
     */
    public synchronized SimpleMcpClient connect() throws McpException {
        if (!connected) {
            delegate.connectAndInitialize(new McpEventListener() {
                @Override
                public void onError(McpException e) {
                    log.error("MCP 连接错误", e);
                }
            });
            connected = true;
        }
        return this;
    }

    // ==================== 同步 API ====================

    /**
     * 获取工具列表
     */
    public List<Tool> listTools() throws McpException {
        ensureConnected();
        return delegate.listTools();
    }

    /**
     * 调用工具（简单参数）
     */
    public ToolCallResult callTool(String toolName, Map<String, Object> args) throws McpException {
        ensureConnected();
        return delegate.callTool(toolName, args);
    }

    /**
     * 调用工具（Builder 模式）
     */
    public ToolCallBuilder callTool(String toolName) {
        return new ToolCallBuilder(this, toolName);
    }

    /**
     * 获取工具详情
     */
    public Tool getTool(String toolName) throws McpException {
        List<Tool> tools = listTools();
        return tools.stream()
                .filter(t -> t.getName().equals(toolName))
                .findFirst()
                .orElse(null);
    }

    /**
     * 检查工具是否存在
     */
    public boolean hasTool(String toolName) throws McpException {
        return getTool(toolName) != null;
    }

    // ==================== 异步 API ====================

    /**
     * 异步获取工具列表
     */
    public CompletableFuture<List<Tool>> listToolsAsync() {
        ensureConnectedAsync();
        return delegate.listToolsAsync();
    }

    /**
     * 异步调用工具
     */
    public CompletableFuture<ToolCallResult> callToolAsync(String toolName, Map<String, Object> args) {
        ensureConnectedAsync();
        return delegate.callToolAsync(toolName, args);
    }

    /**
     * 异步调用工具（Builder 模式）
     */
    public ToolCallAsyncBuilder callToolAsyncBuilder(String toolName) {
        return new ToolCallAsyncBuilder(this, toolName);
    }

    /**
     * 并发调用多个工具
     *
     * @param toolCalls 工具调用列表，每个元素是 [toolName, args]
     * @return 所有结果的 Future
     */
    @SuppressWarnings("unchecked")
    public CompletableFuture<List<ToolCallResult>> callToolsParallel(List<Object[]> toolCalls) {
        ensureConnectedAsync();
        CompletableFuture<ToolCallResult>[] futures = toolCalls.stream()
                .map(call -> delegate.callToolAsync((String) call[0], (Map<String, Object>) call[1]))
                .toArray(CompletableFuture[]::new);

        return CompletableFuture.allOf(futures)
                .thenApply(v -> Arrays.stream(futures)
                        .map(CompletableFuture::join)
                        .collect(Collectors.toList()));
    }

    // ==================== 私有方法 ====================

    private void ensureConnected() throws McpException {
        if (!connected) {
            connect();
        }
    }

    private void ensureConnectedAsync() {
        if (!connected) {
            try {
                connect();
            } catch (McpException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void close() {
        if (delegate != null) {
            delegate.close();
        }
        connected = false;
    }

    // ==================== 工具调用 Builder ====================

    /**
     * 同步工具调用 Builder
     */
    public static class ToolCallBuilder {
        private final SimpleMcpClient client;
        private final String toolName;
        private final Map<String, Object> params = new java.util.HashMap<>();

        ToolCallBuilder(SimpleMcpClient client, String toolName) {
            this.client = client;
            this.toolName = toolName;
        }

        /**
         * 添加参数
         */
        public ToolCallBuilder param(String key, Object value) {
            params.put(key, value);
            return this;
        }

        /**
         * 添加嵌套参数（如 toolParams.xxx）
         */
        @SuppressWarnings("unchecked")
        public ToolCallBuilder nestedParam(String parentKey, String childKey, Object value) {
            Map<String, Object> parent = (Map<String, Object>) params.get(parentKey);
            if (parent == null) {
                parent = new java.util.HashMap<>();
                params.put(parentKey, parent);
            }
            parent.put(childKey, value);
            return this;
        }

        /**
         * 批量添加参数
         */
        public ToolCallBuilder params(Map<String, Object> params) {
            this.params.putAll(params);
            return this;
        }

        /**
         * 同步执行调用
         */
        public ToolCallResult execute() throws McpException {
            return client.callTool(toolName, params);
        }

        /**
         * 异步执行调用
         */
        public CompletableFuture<ToolCallResult> executeAsync() {
            return client.callToolAsync(toolName, params);
        }
    }

    /**
     * 异步工具调用 Builder
     */
    public static class ToolCallAsyncBuilder {
        private final SimpleMcpClient client;
        private final String toolName;
        private final Map<String, Object> params = new java.util.HashMap<>();

        ToolCallAsyncBuilder(SimpleMcpClient client, String toolName) {
            this.client = client;
            this.toolName = toolName;
        }

        public ToolCallAsyncBuilder param(String key, Object value) {
            params.put(key, value);
            return this;
        }

        @SuppressWarnings("unchecked")
        public ToolCallAsyncBuilder nestedParam(String parentKey, String childKey, Object value) {
            Map<String, Object> parent = (Map<String, Object>) params.get(parentKey);
            if (parent == null) {
                parent = new java.util.HashMap<>();
                params.put(parentKey, parent);
            }
            parent.put(childKey, value);
            return this;
        }

        public ToolCallAsyncBuilder params(Map<String, Object> params) {
            this.params.putAll(params);
            return this;
        }

        /**
         * 异步执行
         */
        public CompletableFuture<ToolCallResult> execute() {
            return client.callToolAsync(toolName, params);
        }
    }

    // ==================== Builder ====================

    /**
     * SimpleMcpClient Builder
     */
    public static class SimpleMcpClientBuilder {
        private String appId;
        private String privateKey;
        private String apiKey;
        private String mcpName;
        private String sseEndpoint;
        private String streamableEndpoint;
        private String transportMode = "streamable";
        private String serverUrl;
        private int connectTimeout = 10000;
        private int readTimeout = 60000;
        private Consumer<ProgressUpdate> progressHandler;
        private Consumer<LogMessage> logHandler;
        private Consumer<McpException> errorHandler;

        // MCP 协议配置
        private String clientName = "mcp-java-sdk";
        private String clientVersion = "1.0.0";
        private String protocolVersion = "2024-11-05";
        private Map<String, Object> capabilities;

        public SimpleMcpClientBuilder appId(String appId) {
            this.appId = appId;
            return this;
        }

        public SimpleMcpClientBuilder privateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        public SimpleMcpClientBuilder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public SimpleMcpClientBuilder mcpName(String mcpName) {
            this.mcpName = mcpName;
            return this;
        }

        /**
         * 设置 SSE 端点完整 URL（优先于 mcpName）
         * 示例：https://opengw.alipay.com/api/v1/open/mcps/aidata-convenience-life5/sse
         */
        public SimpleMcpClientBuilder sseEndpoint(String sseEndpoint) {
            this.sseEndpoint = sseEndpoint;
            return this;
        }

        /**
         * 设置 Streamable HTTP 端点完整 URL（优先于 mcpName）
         * 示例：https://opengw.alipay.com/api/v1/open/mcps/aidata-convenience-life5/mcp
         */
        public SimpleMcpClientBuilder streamableEndpoint(String streamableEndpoint) {
            this.streamableEndpoint = streamableEndpoint;
            return this;
        }

        /**
         * 设置传输模式（默认：sse）
         * @param transportMode "sse" 或 "streamable"
         */
        public SimpleMcpClientBuilder transportMode(String transportMode) {
            this.transportMode = transportMode;
            return this;
        }

        public SimpleMcpClientBuilder serverUrl(String serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }

        public SimpleMcpClientBuilder connectTimeout(int connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }

        public SimpleMcpClientBuilder readTimeout(int readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }

        /**
         * 设置客户端名称（默认：mcp-java-sdk）
         */
        public SimpleMcpClientBuilder clientName(String clientName) {
            this.clientName = clientName;
            return this;
        }

        /**
         * 设置客户端版本（默认：1.0.0）
         */
        public SimpleMcpClientBuilder clientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * 设置 MCP 协议版本（默认：2024-11-05）
         */
        public SimpleMcpClientBuilder protocolVersion(String protocolVersion) {
            this.protocolVersion = protocolVersion;
            return this;
        }

        /**
         * 添加客户端能力
         */
        public SimpleMcpClientBuilder capability(String name, Object value) {
            if (this.capabilities == null) {
                this.capabilities = new java.util.HashMap<>();
            }
            this.capabilities.put(name, value);
            return this;
        }

        /**
         * 批量设置客户端能力
         */
        public SimpleMcpClientBuilder capabilities(Map<String, Object> capabilities) {
            if (this.capabilities == null) {
                this.capabilities = capabilities;
            } else {
                this.capabilities.putAll(capabilities);
            }
            return this;
        }

        /**
         * 设置进度回调
         */
        public SimpleMcpClientBuilder onProgress(Consumer<ProgressUpdate> handler) {
            this.progressHandler = handler;
            return this;
        }

        /**
         * 设置日志回调
         */
        public SimpleMcpClientBuilder onLog(Consumer<LogMessage> handler) {
            this.logHandler = handler;
            return this;
        }

        /**
         * 设置错误回调
         */
        public SimpleMcpClientBuilder onError(Consumer<McpException> handler) {
            this.errorHandler = handler;
            return this;
        }

        /**
         * 构建 SimpleMcpClient
         */
        public SimpleMcpClient build() {
            McpClientConfig config = new McpClientConfig();
            config.setAppId(appId);
            config.setPrivateKey(privateKey);

            // 根据是否设置了 apiKey 自动判断认证类型
            if (apiKey != null && !apiKey.isEmpty()) {
                config.setAuthType(McpClientConfig.AuthType.API_KEY);
                config.setApiKey(apiKey);
            } else {
                config.setAuthType(McpClientConfig.AuthType.SIGN);
            }

            config.setMcpName(mcpName);
            if (sseEndpoint != null) {
                config.setSseEndpoint(sseEndpoint);
            }
            if (streamableEndpoint != null) {
                config.setStreamableEndpoint(streamableEndpoint);
            }
            if (transportMode != null) {
                config.setTransportMode(transportMode);
            }
            if (serverUrl != null) {
                config.setServerUrl(serverUrl);
            }
            config.setConnectTimeout(connectTimeout);
            config.setReadTimeout(readTimeout);

            // MCP 协议配置
            config.setClientName(clientName);
            config.setClientVersion(clientVersion);
            // 根据传输模式设置默认协议版本
            if ("streamable".equalsIgnoreCase(transportMode)) {
                config.setProtocolVersion(protocolVersion != null ? protocolVersion : "2025-03-26");
            } else {
                config.setProtocolVersion(protocolVersion != null ? protocolVersion : "2024-11-05");
            }
            if (capabilities != null) {
                config.setCapabilities(capabilities);
            }

            McpClient client = new McpClient(config, null);
            return new SimpleMcpClient(client);
        }
    }
}
package com.alipay.mcp;

import com.alipay.mcp.config.McpClientConfig;
import com.alipay.mcp.interceptor.Interceptor;
import com.alipay.mcp.protocol.*;
import com.alipay.mcp.transport.McpEventListener;
import com.alipay.mcp.transport.SseConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

/**
 * MCP 客户端主类
 *
 * @author alipay
 */
public class McpClient implements AutoCloseable {

    private static final Logger log = LoggerFactory.getLogger(McpClient.class);

    private final McpClientConfig config;
    private final List<Interceptor> interceptors;
    private SseConnection sseConnection;

    /**
     * 构造函数
     *
     * @param config      客户端配置
     * @param interceptors 拦截器列表
     */
    public McpClient(McpClientConfig config, List<Interceptor> interceptors) {
        this.config = config;
        this.interceptors = interceptors != null ? interceptors : new ArrayList<>();
    }

    /**
     * 建立连接
     *
     * @param listener 事件监听器
     * @throws McpException 连接失败时抛出
     */
    public void connect(McpEventListener listener) throws McpException {
        sseConnection = new SseConnection(config, interceptors);
        sseConnection.connect(listener);
    }

    /**
     * 建立连接并自动完成初始化握手
     *
     * @param listener 事件监听器
     * @throws McpException 连接或初始化失败时抛出
     */
    public void connectAndInitialize(McpEventListener listener) throws McpException {
        connect(listener);
        sseConnection.sendInitialize(
                config.getClientName(),
                config.getClientVersion(),
                config.getProtocolVersion(),
                config.getCapabilities()
        );
        log.info("MCP 初始化完成");
    }

    /**
     * 获取拦截器列表
     */
    public List<Interceptor> getInterceptors() {
        return interceptors;
    }

    /**
     * 获取请求超时时间（毫秒）
     */
    private int getRequestTimeout() {
        return config.getRequestTimeout();
    }

    /**
     * 获取工具调用超时时间（毫秒）
     */
    private int getCallToolTimeout() {
        return config.getCallToolTimeout();
    }

    /**
     * 获取工具列表
     *
     * @return 工具列表
     * @throws McpException 获取失败时抛出
     */
    public List<Tool> listTools() throws McpException {
        try {
            CompletableFuture<JsonRpcMessage> future =
                    sseConnection.sendRequest("tools/list", null);
            JsonRpcMessage response = future.get(getRequestTimeout(), TimeUnit.MILLISECONDS);

            if (response.getError() != null) {
                throw new McpException("Tool list failed: " + response.getError().getMessage());
            }
            return parseTools(response.getResult());
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new McpException("获取工具列表失败", e);
        }
    }

    /**
     * 异步获取工具列表
     *
     * @return 工具列表 Future
     */
    public CompletableFuture<List<Tool>> listToolsAsync() {
        try {
            CompletableFuture<JsonRpcMessage> future = sseConnection.sendRequest("tools/list", null);

            return future.handle((response, ex) -> {
                if (ex != null) {
                    throw new CompletionException(new McpException("获取工具列表失败", ex));
                }
                if (response.getError() != null) {
                    throw new CompletionException(new McpException("Tool list failed: " + response.getError().getMessage()));
                }
                return parseTools(response.getResult());
            });
        } catch (McpException e) {
            CompletableFuture<List<Tool>> failed = new CompletableFuture<>();
            failed.completeExceptionally(e);
            return failed;
        }
    }

    /**
     * 调用工具
     *
     * @param toolName 工具名称
     * @param args 参数
     * @return 调用结果
     * @throws McpException 调用失败时抛出
     */
    public ToolCallResult callTool(String toolName, Map<String, Object> args) throws McpException {
        try {
            ToolCallParams params = new ToolCallParams();
            params.setName(toolName);
            params.setArguments(args);

            CompletableFuture<JsonRpcMessage> future =
                    sseConnection.sendRequest("tools/call", params);
            JsonRpcMessage response = future.get(getCallToolTimeout(), TimeUnit.MILLISECONDS);

            if (response.getError() != null) {
                throw new McpException("Tool call failed: " + response.getError().getMessage());
            }
            return parseResult(response.getResult());
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new McpException("调用工具失败", e);
        }
    }

    /**
     * 异步调用工具
     *
     * @param toolName 工具名称
     * @param args 参数
     * @return 调用结果 Future
     */
    public CompletableFuture<ToolCallResult> callToolAsync(String toolName, Map<String, Object> args) {
        try {
            ToolCallParams params = new ToolCallParams();
            params.setName(toolName);
            params.setArguments(args);

            CompletableFuture<JsonRpcMessage> future = sseConnection.sendRequest("tools/call", params);

            return future.handle((response, ex) -> {
                if (ex != null) {
                    throw new CompletionException(new McpException("调用工具失败", ex));
                }
                if (response.getError() != null) {
                    throw new CompletionException(new McpException("Tool call failed: " + response.getError().getMessage()));
                }
                return parseResult(response.getResult());
            });
        } catch (McpException e) {
            CompletableFuture<ToolCallResult> failed = new CompletableFuture<>();
            failed.completeExceptionally(e);
            return failed;
        }
    }

    /**
     * 发送初始化请求
     *
     * @param capabilities 客户端能力
     * @param clientInfo 客户端信息
     * @return 初始化结果
     * @throws McpException 初始化失败时抛出
     */
    public InitializeResult initialize(ClientCapabilities capabilities, ClientInfo clientInfo)
            throws McpException {
        try {
            InitializeParams params = new InitializeParams();
            params.setProtocolVersion("2024-11-05");
            params.setCapabilities(capabilities);
            params.setClientInfo(clientInfo);

            CompletableFuture<JsonRpcMessage> future =
                    sseConnection.sendRequest("initialize", params);
            JsonRpcMessage response = future.get(getRequestTimeout(), TimeUnit.MILLISECONDS);

            if (response.getError() != null) {
                throw new McpException("Initialize failed: " + response.getError().getMessage());
            }
            return parseInitializeResult(response.getResult());
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new McpException("初始化失败", e);
        }
    }

    /**
     * 发送通知（不等待响应）
     *
     * @param method 方法名
     * @param params 参数
     * @throws McpException 发送失败时抛出
     */
    public void sendNotification(String method, Object params) throws McpException {
        sseConnection.sendNotification(method, params);
    }

    private List<Tool> parseTools(Object result) {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        ToolListResponse response = gson.fromJson(gson.toJson(result), ToolListResponse.class);
        return response.getTools();
    }

    private ToolCallResult parseResult(Object result) {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        return gson.fromJson(gson.toJson(result), ToolCallResult.class);
    }

    private InitializeResult parseInitializeResult(Object result) {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        return gson.fromJson(gson.toJson(result), InitializeResult.class);
    }

    @Override
    public void close() {
        if (sseConnection != null) {
            sseConnection.close();
        }
    }

    // ==================== 内部辅助类 ====================

    static class ToolListResponse {
        private List<Tool> tools;

        public List<Tool> getTools() {
            return tools;
        }

        public void setTools(List<Tool> tools) {
            this.tools = tools;
        }
    }

    public static class InitializeParams {
        private String protocolVersion = "2024-11-05";
        private ClientCapabilities capabilities;
        private ClientInfo clientInfo;

        public String getProtocolVersion() {
            return protocolVersion;
        }

        public void setProtocolVersion(String protocolVersion) {
            this.protocolVersion = protocolVersion;
        }

        public ClientCapabilities getCapabilities() {
            return capabilities;
        }

        public void setCapabilities(ClientCapabilities capabilities) {
            this.capabilities = capabilities;
        }

        public ClientInfo getClientInfo() {
            return clientInfo;
        }

        public void setClientInfo(ClientInfo clientInfo) {
            this.clientInfo = clientInfo;
        }
    }

    public static class InitializeResult {
        private String protocolVersion;
        private ServerCapabilities capabilities;
        private ServerInfo serverInfo;

        public String getProtocolVersion() {
            return protocolVersion;
        }

        public void setProtocolVersion(String protocolVersion) {
            this.protocolVersion = protocolVersion;
        }

        public ServerCapabilities getCapabilities() {
            return capabilities;
        }

        public void setCapabilities(ServerCapabilities capabilities) {
            this.capabilities = capabilities;
        }

        public ServerInfo getServerInfo() {
            return serverInfo;
        }

        public void setServerInfo(ServerInfo serverInfo) {
            this.serverInfo = serverInfo;
        }
    }

    public static class ClientCapabilities {
        private Map<String, Object> experimental;
        private Map<String, Object> sampling;
        private Map<String, Object> roots;

        public Map<String, Object> getExperimental() {
            return experimental;
        }

        public void setExperimental(Map<String, Object> experimental) {
            this.experimental = experimental;
        }

        public Map<String, Object> getSampling() {
            return sampling;
        }

        public void setSampling(Map<String, Object> sampling) {
            this.sampling = sampling;
        }

        public Map<String, Object> getRoots() {
            return roots;
        }

        public void setRoots(Map<String, Object> roots) {
            this.roots = roots;
        }
    }

    public static class ClientInfo {
        private String name;
        private String version;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }
    }

    public static class ServerCapabilities {
        private Map<String, Object> experimental;
        private Map<String, Object> logging;
        private Map<String, Object> prompts;
        private Map<String, Object> resources;
        private Map<String, Object> tools;

        public Map<String, Object> getExperimental() {
            return experimental;
        }

        public void setExperimental(Map<String, Object> experimental) {
            this.experimental = experimental;
        }

        public Map<String, Object> getLogging() {
            return logging;
        }

        public void setLogging(Map<String, Object> logging) {
            this.logging = logging;
        }

        public Map<String, Object> getPrompts() {
            return prompts;
        }

        public void setPrompts(Map<String, Object> prompts) {
            this.prompts = prompts;
        }

        public Map<String, Object> getResources() {
            return resources;
        }

        public void setResources(Map<String, Object> resources) {
            this.resources = resources;
        }

        public Map<String, Object> getTools() {
            return tools;
        }

        public void setTools(Map<String, Object> tools) {
            this.tools = tools;
        }
    }

    public static class ServerInfo {
        private String name;
        private String version;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }
    }
}
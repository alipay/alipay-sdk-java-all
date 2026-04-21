package com.alipay.mcp.config;

import java.util.HashMap;
import java.util.Map;

/**
 * MCP 客户端配置类
 */
public class McpClientConfig {

    /**
     * 默认网关地址
     */
    private static final String DEFAULT_SERVER_URL = "https://opengw.alipay.com";

    /**
     * 默认连接超时（毫秒）
     */
    private static final int DEFAULT_CONNECT_TIMEOUT = 10000;

    /**
     * 默认读取超时（毫秒）
     */
    private static final int DEFAULT_READ_TIMEOUT = 60000;

    /**
     * 默认 SSE 连接超时（毫秒）
     */
    private static final int DEFAULT_SSE_CONNECT_TIMEOUT = 30000;

    /**
     * 默认 Endpoint 就绪超时（毫秒）
     */
    private static final int DEFAULT_ENDPOINT_READY_TIMEOUT = 10000;

    /**
     * 默认请求超时（毫秒）
     */
    private static final int DEFAULT_REQUEST_TIMEOUT = 30000;

    /**
     * 默认工具调用超时（毫秒）
     */
    private static final int DEFAULT_CALL_TOOL_TIMEOUT = 60000;

    // ==================== 必需参数 ====================

    /**
     * 应用ID
     */
    private String appId;

    /**
     * 私钥（PKCS8格式）
     */
    private String privateKey;

    /**
     * MCP 服务名称
     */
    private String mcpName;

    /**
     * SSE 端点完整 URL（可选，优先于 mcpName）
     * 示例：https://opengw.alipay.com/api/v1/open/mcps/aidata-convenience-life5/sse
     */
    private String sseEndpoint;

    /**
     * Streamable HTTP 端点完整 URL（可选，优先于 mcpName）
     * 示例：https://opengw.alipay.com/api/v1/open/mcps/aidata-convenience-life5/mcp
     */
    private String streamableEndpoint;

    /**
     * 传输模式：sse 或 streamable（默认：streamable）
     */
    private String transportMode = "streamable";

    // ==================== 可选参数 ====================

    /**
     * 网关地址
     */
    private String serverUrl = DEFAULT_SERVER_URL;

    /**
     * 连接超时（毫秒）
     */
    private int connectTimeout = DEFAULT_CONNECT_TIMEOUT;

    /**
     * 读取超时（毫秒）
     */
    private int readTimeout = DEFAULT_READ_TIMEOUT;

    /**
     * SSE 连接超时（毫秒）
     */
    private int sseConnectTimeout = DEFAULT_SSE_CONNECT_TIMEOUT;

    /**
     * Endpoint 就绪超时（毫秒）
     */
    private int endpointReadyTimeout = DEFAULT_ENDPOINT_READY_TIMEOUT;

    /**
     * 请求超时（毫秒）
     */
    private int requestTimeout = DEFAULT_REQUEST_TIMEOUT;

    /**
     * 工具调用超时（毫秒）
     */
    private int callToolTimeout = DEFAULT_CALL_TOOL_TIMEOUT;

    /**
     * 自定义请求头
     */
    private Map<String, String> customHeaders = new HashMap<>();

    /**
     * 支付宝公钥（用于验签）
     */
    private String alipayPublicKey;

    /**
     * 应用授权令牌
     */
    private String appAuthToken;

    // ==================== MCP 协议配置 ====================

    /**
     * 客户端名称（默认：mcp-java-sdk）
     */
    private String clientName = "mcp-java-sdk";

    /**
     * 客户端版本（默认：1.0.0）
     */
    private String clientVersion = "1.0.0";

    /**
     * MCP 协议版本（默认：2024-11-05）
     */
    private String protocolVersion = "2024-11-05";

    /**
     * 客户端能力声明
     */
    private Map<String, Object> capabilities;

    // ==================== Getters & Setters ====================

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getMcpName() {
        return mcpName;
    }

    public void setMcpName(String mcpName) {
        this.mcpName = mcpName;
    }

    public String getSseEndpoint() {
        return sseEndpoint;
    }

    public void setSseEndpoint(String sseEndpoint) {
        this.sseEndpoint = sseEndpoint;
    }

    public String getStreamableEndpoint() {
        return streamableEndpoint;
    }

    public void setStreamableEndpoint(String streamableEndpoint) {
        this.streamableEndpoint = streamableEndpoint;
    }

    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public int getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    public Map<String, String> getCustomHeaders() {
        return customHeaders;
    }

    public void setCustomHeaders(Map<String, String> customHeaders) {
        this.customHeaders = customHeaders;
    }

    public String getAlipayPublicKey() {
        return alipayPublicKey;
    }

    public void setAlipayPublicKey(String alipayPublicKey) {
        this.alipayPublicKey = alipayPublicKey;
    }

    public String getAppAuthToken() {
        return appAuthToken;
    }

    public void setAppAuthToken(String appAuthToken) {
        this.appAuthToken = appAuthToken;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientVersion() {
        return clientVersion;
    }

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    public String getProtocolVersion() {
        return protocolVersion;
    }

    public void setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    public Map<String, Object> getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(Map<String, Object> capabilities) {
        this.capabilities = capabilities;
    }

    public int getSseConnectTimeout() {
        return sseConnectTimeout;
    }

    public void setSseConnectTimeout(int sseConnectTimeout) {
        this.sseConnectTimeout = sseConnectTimeout;
    }

    public int getEndpointReadyTimeout() {
        return endpointReadyTimeout;
    }

    public void setEndpointReadyTimeout(int endpointReadyTimeout) {
        this.endpointReadyTimeout = endpointReadyTimeout;
    }

    public int getRequestTimeout() {
        return requestTimeout;
    }

    public void setRequestTimeout(int requestTimeout) {
        this.requestTimeout = requestTimeout;
    }

    public int getCallToolTimeout() {
        return callToolTimeout;
    }

    public void setCallToolTimeout(int callToolTimeout) {
        this.callToolTimeout = callToolTimeout;
    }

    /**
     * 校验必需参数
     */
    public void validate() {
        if (appId == null || appId.isEmpty()) {
            throw new IllegalArgumentException("appId 不能为空");
        }
        if (privateKey == null || privateKey.isEmpty()) {
            throw new IllegalArgumentException("privateKey 不能为空");
        }

        // 根据传输模式校验端点配置
        if ("streamable".equalsIgnoreCase(transportMode)) {
            boolean hasEndpoint = streamableEndpoint != null && !streamableEndpoint.isEmpty();
            boolean hasMcpName = mcpName != null && !mcpName.isEmpty();
            if (!hasEndpoint && !hasMcpName) {
                throw new IllegalArgumentException("streamable 模式下，streamableEndpoint 或 mcpName 必须指定其中一个");
            }
        } else {
            // sse 模式（默认）
            boolean hasEndpoint = sseEndpoint != null && !sseEndpoint.isEmpty();
            boolean hasMcpName = mcpName != null && !mcpName.isEmpty();
            if (!hasEndpoint && !hasMcpName) {
                throw new IllegalArgumentException("sse 模式下，sseEndpoint 或 mcpName 必须指定其中一个");
            }
        }
    }
}
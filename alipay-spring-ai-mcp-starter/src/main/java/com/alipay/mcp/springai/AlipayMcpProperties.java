package com.alipay.mcp.springai;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Duration;

/**
 * 支付宝 MCP 配置属性
 */
@ConfigurationProperties(prefix = "alipay.mcp")
public class AlipayMcpProperties {

    /**
     * 是否启用
     */
    private boolean enabled = true;

    /**
     * 应用 ID
     */
    private String appId;

    /**
     * 应用私钥（PKCS8 格式）
     */
    private String privateKey;

    /**
     * 认证类型：sign（RSA签名，默认）或 api_key
     */
    private String authType = "sign";

    /**
     * API Key（API Key 认证模式必填）
     */
    private String apiKey;

    /**
     * 传输模式：sse 或 streamable
     */
    private String transportMode = "sse";

    /**
     * SSE 端点 URL（旧配置，保留兼容）
     */
    @Deprecated
    private String sseEndpoint;

    /**
     * Streamable 端点 URL
     */
    private String streamableEndpoint;

    /**
     * 基础 URI（如 https://opengw.alipay.com）
     */
    private String baseUri;

    /**
     * MCP 名称（用于自动构建端点）
     */
    private String mcpName;

    /**
     * 连接超时
     */
    private Duration connectTimeout = Duration.ofSeconds(10);

    // Getters and Setters

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

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

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
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

    public String getBaseUri() {
        return baseUri;
    }

    public void setBaseUri(String baseUri) {
        this.baseUri = baseUri;
    }

    public String getMcpName() {
        return mcpName;
    }

    public void setMcpName(String mcpName) {
        this.mcpName = mcpName;
    }

    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    public Duration getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Duration connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    /**
     * 验证配置是否完整
     */
    public boolean isValid() {
        // 检查端点配置
        if (!hasEndpoint()) {
            return false;
        }

        // 根据认证类型校验
        if ("api_key".equalsIgnoreCase(authType)) {
            // API Key 模式需要 apiKey
            return apiKey != null && !apiKey.isEmpty();
        } else {
            // 签名模式（默认）需要 appId 和 privateKey
            return appId != null && !appId.isEmpty()
                    && privateKey != null && !privateKey.isEmpty();
        }
    }

    /**
     * 检查是否配置了端点
     */
    private boolean hasEndpoint() {
        if ("streamable".equalsIgnoreCase(transportMode)) {
            return streamableEndpoint != null || (baseUri != null && mcpName != null);
        } else {
            return sseEndpoint != null || (baseUri != null && mcpName != null);
        }
    }
}
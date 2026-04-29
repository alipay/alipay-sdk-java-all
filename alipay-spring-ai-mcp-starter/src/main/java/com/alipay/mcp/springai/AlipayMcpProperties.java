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
        if (appId == null || appId.isEmpty()) {
            return false;
        }
        if (privateKey == null || privateKey.isEmpty()) {
            return false;
        }
        // 检查端点配置
        if ("streamable".equalsIgnoreCase(transportMode)) {
            return streamableEndpoint != null || (baseUri != null && mcpName != null);
        } else {
            return sseEndpoint != null || (baseUri != null && mcpName != null);
        }
    }
}
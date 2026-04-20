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
     * SSE 端点 URL
     */
    private String sseEndpoint;

    /**
     * 连接超时
     */
    private Duration connectTimeout = Duration.ofSeconds(10);

    /**
     * 读取超时
     */
    private Duration readTimeout = Duration.ofSeconds(60);

    /**
     * 请求超时
     */
    private Duration requestTimeout = Duration.ofSeconds(30);

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

    public Duration getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Duration connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public Duration getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(Duration readTimeout) {
        this.readTimeout = readTimeout;
    }

    public Duration getRequestTimeout() {
        return requestTimeout;
    }

    public void setRequestTimeout(Duration requestTimeout) {
        this.requestTimeout = requestTimeout;
    }

    /**
     * 验证配置是否完整
     */
    public boolean isValid() {
        return appId != null && !appId.isEmpty()
            && privateKey != null && !privateKey.isEmpty()
            && sseEndpoint != null && !sseEndpoint.isEmpty();
    }
}

package com.alipay.mcp.builder;

import com.alipay.mcp.McpClient;
import com.alipay.mcp.config.McpClientConfig;
import com.alipay.mcp.config.McpClientConfig.AuthType;
import com.alipay.mcp.interceptor.Interceptor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MCP 客户端 Builder
 */
public class McpClientBuilder {

    private McpClientConfig config = new McpClientConfig();
    private List<Interceptor> interceptors = new ArrayList<>();

    // ==================== 必需参数 ====================

    /**
     * 设置应用ID
     */
    public McpClientBuilder appId(String appId) {
        if (appId == null || appId.isEmpty()) {
            throw new IllegalArgumentException("appId 不能为空");
        }
        config.setAppId(appId);
        return this;
    }

    /**
     * 设置私钥
     */
    public McpClientBuilder privateKey(String privateKey) {
        if (privateKey == null || privateKey.isEmpty()) {
            throw new IllegalArgumentException("privateKey 不能为空");
        }
        config.setPrivateKey(privateKey);
        return this;
    }

    /**
     * 设置 API Key（使用 API Key 认证模式）
     * 设置后自动切换为 API_KEY 认证模式
     */
    public McpClientBuilder apiKey(String apiKey) {
        if (apiKey == null || apiKey.isEmpty()) {
            throw new IllegalArgumentException("apiKey 不能为空");
        }
        config.setAuthType(AuthType.API_KEY);
        config.setApiKey(apiKey);
        return this;
    }

    /**
     * 设置认证类型（默认：SIGN，即 RSA 签名）
     * @param authType "sign" 或 "api_key"
     */
    public McpClientBuilder authType(String authType) {
        if (authType == null || authType.isEmpty()) {
            throw new IllegalArgumentException("authType 不能为空");
        }
        if ("api_key".equalsIgnoreCase(authType)) {
            config.setAuthType(AuthType.API_KEY);
        } else {
            config.setAuthType(AuthType.SIGN);
        }
        return this;
    }

    /**
     * 设置 MCP 服务名称
     */
    public McpClientBuilder mcpName(String mcpName) {
        config.setMcpName(mcpName);
        return this;
    }

    /**
     * 设置传输模式（默认：streamable）
     * @param transportMode "sse" 或 "streamable"
     */
    public McpClientBuilder transportMode(String transportMode) {
        config.setTransportMode(transportMode);
        return this;
    }

    /**
     * 设置 SSE 端点完整 URL（优先于 mcpName）
     * 示例：https://opengw.alipay.com/api/v1/open/mcps/aidata-convenience-life5/sse
     */
    public McpClientBuilder sseEndpoint(String sseEndpoint) {
        config.setSseEndpoint(sseEndpoint);
        return this;
    }

    // ==================== 可选参数 ====================

    /**
     * 设置网关地址
     */
    public McpClientBuilder serverUrl(String serverUrl) {
        config.setServerUrl(serverUrl);
        return this;
    }

    /**
     * 设置连接超时（毫秒）
     */
    public McpClientBuilder connectTimeout(int connectTimeout) {
        config.setConnectTimeout(connectTimeout);
        return this;
    }

    /**
     * 设置读取超时（毫秒）
     */
    public McpClientBuilder readTimeout(int readTimeout) {
        config.setReadTimeout(readTimeout);
        return this;
    }

    /**
     * 设置 SSE 连接超时（毫秒，默认 30000）
     */
    public McpClientBuilder sseConnectTimeout(int sseConnectTimeout) {
        config.setSseConnectTimeout(sseConnectTimeout);
        return this;
    }

    /**
     * 设置 Endpoint 就绪超时（毫秒，默认 10000）
     */
    public McpClientBuilder endpointReadyTimeout(int endpointReadyTimeout) {
        config.setEndpointReadyTimeout(endpointReadyTimeout);
        return this;
    }

    /**
     * 设置请求超时（毫秒，默认 30000）
     */
    public McpClientBuilder requestTimeout(int requestTimeout) {
        config.setRequestTimeout(requestTimeout);
        return this;
    }

    /**
     * 设置工具调用超时（毫秒，默认 60000）
     */
    public McpClientBuilder callToolTimeout(int callToolTimeout) {
        config.setCallToolTimeout(callToolTimeout);
        return this;
    }

    /**
     * 添加自定义请求头
     */
    public McpClientBuilder customHeader(String key, String value) {
        config.getCustomHeaders().put(key, value);
        return this;
    }

    /**
     * 批量设置自定义请求头
     */
    public McpClientBuilder customHeaders(Map<String, String> customHeaders) {
        if (customHeaders != null) {
            config.getCustomHeaders().putAll(customHeaders);
        }
        return this;
    }

    /**
     * 设置支付宝公钥（用于验签）
     */
    public McpClientBuilder alipayPublicKey(String alipayPublicKey) {
        config.setAlipayPublicKey(alipayPublicKey);
        return this;
    }

    /**
     * 设置应用授权令牌
     */
    public McpClientBuilder appAuthToken(String appAuthToken) {
        config.setAppAuthToken(appAuthToken);
        return this;
    }

    // ==================== MCP 协议配置 ====================

    /**
     * 设置客户端名称（默认：mcp-java-sdk）
     */
    public McpClientBuilder clientName(String clientName) {
        config.setClientName(clientName);
        return this;
    }

    /**
     * 设置客户端版本（默认：1.0.0）
     */
    public McpClientBuilder clientVersion(String clientVersion) {
        config.setClientVersion(clientVersion);
        return this;
    }

    /**
     * 设置 MCP 协议版本（默认：2024-11-05）
     */
    public McpClientBuilder protocolVersion(String protocolVersion) {
        config.setProtocolVersion(protocolVersion);
        return this;
    }

    /**
     * 添加客户端能力
     */
    public McpClientBuilder capability(String name, Object value) {
        if (config.getCapabilities() == null) {
            config.setCapabilities(new HashMap<>());
        }
        config.getCapabilities().put(name, value);
        return this;
    }

    /**
     * 批量设置客户端能力
     */
    public McpClientBuilder capabilities(Map<String, Object> capabilities) {
        if (config.getCapabilities() == null) {
            config.setCapabilities(capabilities);
        } else {
            config.getCapabilities().putAll(capabilities);
        }
        return this;
    }

    // ==================== 拦截器 ====================

    /**
     * 添加拦截器
     */
    public McpClientBuilder addInterceptor(Interceptor interceptor) {
        if (interceptor != null) {
            interceptors.add(interceptor);
        }
        return this;
    }

    /**
     * 移除拦截器
     */
    public McpClientBuilder removeInterceptor(Interceptor interceptor) {
        if (interceptor != null) {
            interceptors.remove(interceptor);
        }
        return this;
    }

    // ==================== 构建 ====================

    /**
     * 构建 MCP 客户端
     */
    public McpClient build() {
        // 校验必需参数
        config.validate();

        // 确保默认添加支付宝认证拦截器
        ensureDefaultInterceptors();

        return new McpClient(config, interceptors);
    }

    /**
     * 确保默认添加支付宝认证拦截器
     */
    private void ensureDefaultInterceptors() {
        // 检查是否已添加支付宝认证拦截器
        boolean hasAuthInterceptor = interceptors.stream()
                .anyMatch(i -> i instanceof com.alipay.mcp.interceptor.AlipayAuthInterceptor);

        if (!hasAuthInterceptor) {
            // 自动添加支付宝认证拦截器（放在最前面）
            interceptors.add(0, new com.alipay.mcp.interceptor.AlipayAuthInterceptor(config));
        }
    }
}
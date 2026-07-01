package com.alipay.mcp.springai.transport;

import io.modelcontextprotocol.client.transport.HttpClientStreamableHttpTransport;
import io.modelcontextprotocol.client.transport.customizer.McpSyncHttpClientRequestCustomizer;
import io.modelcontextprotocol.spec.McpClientTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.http.HttpClient;
import java.time.Duration;

/**
 * 支付宝 Streamable HTTP MCP Transport 工厂
 * 基于 HttpClientStreamableHttpTransport（MCP SDK 0.17.0），为所有 HTTP 请求添加支付宝签名
 *
 * <p>签名机制：通过 SDK 0.17.0 提供的 {@link McpSyncHttpClientRequestCustomizer} 扩展点，
 * 在每次 HTTP 请求时动态计算签名并注入 Authorization 头。</p>
 */
public class AlipayStreamableMcpTransport {

    private static final Logger log = LoggerFactory.getLogger(AlipayStreamableMcpTransport.class);

    /**
     * 创建带支付宝签名的 Streamable HTTP Transport
     *
     * @param appId       应用 ID
     * @param privateKey  私钥字符串（PKCS8 格式，可带 PEM 标记）
     * @param baseUri     基础 URI（如 https://opengw.alipay.com）
     * @param mcpEndpoint MCP 端点路径（如 /api/v1/open/mcps/xxx/mcp）
     * @return McpClientTransport 实例
     */
    public static McpClientTransport create(String appId, String privateKey, String baseUri, String mcpEndpoint) {
        return create(appId, privateKey, baseUri, mcpEndpoint, Duration.ofSeconds(10));
    }

    /**
     * 创建带支付宝签名的 Streamable HTTP Transport（完整配置）
     */
    public static McpClientTransport create(String appId, String privateKey, String baseUri,
                                             String mcpEndpoint, Duration connectTimeout) {
        AlipayAuthRequestCustomizer authCustomizer = new AlipayAuthRequestCustomizer(appId, privateKey);

        // 构建签名 customizer
        McpSyncHttpClientRequestCustomizer signingCustomizer = AlipaySseMcpTransport.createSigningCustomizer(authCustomizer);

        return HttpClientStreamableHttpTransport.builder(baseUri)
            .endpoint(mcpEndpoint)
            .clientBuilder(HttpClient.newBuilder()
                .connectTimeout(connectTimeout)
                .version(HttpClient.Version.HTTP_1_1))
            .httpRequestCustomizer(signingCustomizer)
            .connectTimeout(connectTimeout)
            .build();
    }

    /**
     * 创建 Transport 的 Builder 模式
     */
    public static Builder builder(String baseUri) {
        return new Builder(baseUri);
    }

    /**
     * Transport Builder
     */
    public static class Builder {
        private String baseUri;
        private String mcpEndpoint = "/mcp";
        private String appId;
        private String privateKey;
        private String apiKey;
        private String authType = "sign";
        private Duration connectTimeout = Duration.ofSeconds(10);

        public Builder(String baseUri) {
            this.baseUri = baseUri;
        }

        public Builder mcpEndpoint(String mcpEndpoint) {
            this.mcpEndpoint = mcpEndpoint;
            return this;
        }

        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        public Builder privateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public Builder authType(String authType) {
            this.authType = authType;
            return this;
        }

        public Builder connectTimeout(Duration timeout) {
            this.connectTimeout = timeout;
            return this;
        }

        public McpClientTransport build() {
            // 根据认证类型校验参数
            if ("api_key".equalsIgnoreCase(authType)) {
                if (apiKey == null || apiKey.isEmpty()) {
                    throw new IllegalArgumentException("apiKey is required when authType is api_key");
                }
                return createWithApiKey(apiKey, baseUri, mcpEndpoint, connectTimeout);
            } else {
                // 签名模式
                if (appId == null || appId.isEmpty()) {
                    throw new IllegalArgumentException("appId is required when authType is sign");
                }
                if (privateKey == null || privateKey.isEmpty()) {
                    throw new IllegalArgumentException("privateKey is required when authType is sign");
                }
                return create(appId, privateKey, baseUri, mcpEndpoint, connectTimeout);
            }
        }
    }

    /**
     * 使用 API Key 创建 Transport
     */
    private static McpClientTransport createWithApiKey(String apiKey, String baseUri,
                                                        String mcpEndpoint, Duration connectTimeout) {
        AlipayAuthRequestCustomizer authCustomizer = new AlipayAuthRequestCustomizer(null, null, apiKey);

        // 构建认证 customizer
        McpSyncHttpClientRequestCustomizer authReqCustomizer = AlipaySseMcpTransport.createSigningCustomizer(authCustomizer);

        return HttpClientStreamableHttpTransport.builder(baseUri)
            .endpoint(mcpEndpoint)
            .clientBuilder(HttpClient.newBuilder()
                .connectTimeout(connectTimeout)
                .version(HttpClient.Version.HTTP_1_1))
            .httpRequestCustomizer(authReqCustomizer)
            .connectTimeout(connectTimeout)
            .build();
    }
}

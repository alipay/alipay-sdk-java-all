package com.alipay.mcp.springai.transport;

import io.modelcontextprotocol.client.transport.HttpClientSseClientTransport;
import io.modelcontextprotocol.client.transport.customizer.McpSyncHttpClientRequestCustomizer;
import io.modelcontextprotocol.common.McpTransportContext;
import io.modelcontextprotocol.spec.McpClientTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.net.http.HttpClient;
import java.time.Duration;

/**
 * 支付宝 SSE MCP Transport 工厂
 * 基于 HttpClientSseClientTransport（MCP SDK 0.17.0），为所有 HTTP 请求添加支付宝签名
 *
 * <p>签名机制：通过 SDK 0.17.0 提供的 {@link McpSyncHttpClientRequestCustomizer} 扩展点，
 * 在每次 HTTP 请求（SSE GET 连接和 POST 消息）时动态计算签名并注入 Authorization 头。
 * 无需反射、无需包装类、无需独立 HttpClient。</p>
 */
public class AlipaySseMcpTransport {

    private static final Logger log = LoggerFactory.getLogger(AlipaySseMcpTransport.class);

    /**
     * 创建带支付宝签名的 MCP SSE Transport
     *
     * @param appId       应用 ID
     * @param privateKey  私钥字符串（PKCS8 格式，可带 PEM 标记）
     * @param baseUri     基础 URI（如 https://opengw.alipay.com）
     * @param sseEndpoint SSE 端点路径（如 /api/v1/open/mcps/xxx/sse）
     * @return McpClientTransport 实例
     */
    public static McpClientTransport create(String appId, String privateKey, String baseUri, String sseEndpoint) {
        return create(appId, privateKey, baseUri, sseEndpoint, Duration.ofSeconds(10));
    }

    /**
     * 创建带支付宝签名的 MCP SSE Transport（完整配置）
     */
    public static McpClientTransport create(String appId, String privateKey, String baseUri,
                                             String sseEndpoint, Duration connectTimeout) {
        AlipayAuthRequestCustomizer authCustomizer = new AlipayAuthRequestCustomizer(appId, privateKey);

        // 构建签名 customizer：每次 HTTP 请求时动态计算签名
        McpSyncHttpClientRequestCustomizer signingCustomizer = createSigningCustomizer(authCustomizer);

        return HttpClientSseClientTransport.builder(baseUri)
            .sseEndpoint(sseEndpoint)
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
        private String sseEndpoint = "/sse";
        private String appId;
        private String privateKey;
        private Duration connectTimeout = Duration.ofSeconds(10);

        public Builder(String baseUri) {
            this.baseUri = baseUri;
        }

        public Builder sseEndpoint(String sseEndpoint) {
            this.sseEndpoint = sseEndpoint;
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

        /**
         * @deprecated 请使用 {@link #privateKey(String)}
         */
        @Deprecated
        public Builder privateKey(java.security.PrivateKey privateKey) {
            throw new UnsupportedOperationException("请使用 String 格式的私钥");
        }

        public Builder connectTimeout(Duration timeout) {
            this.connectTimeout = timeout;
            return this;
        }

        public McpClientTransport build() {
            if (appId == null || appId.isEmpty()) {
                throw new IllegalArgumentException("appId is required");
            }
            if (privateKey == null || privateKey.isEmpty()) {
                throw new IllegalArgumentException("privateKey is required");
            }
            return create(appId, privateKey, baseUri, sseEndpoint, connectTimeout);
        }
    }

    /**
     * 创建签名 customizer
     *
     * <p>SDK 0.17.0 的 {@link McpSyncHttpClientRequestCustomizer#customize} 会在每次 HTTP 请求时调用，
     * 提供 {@code builder}、{@code method}、{@code uri}、{@code body} 四个参数，
     * 可以根据请求内容动态计算签名。</p>
     */
    static McpSyncHttpClientRequestCustomizer createSigningCustomizer(AlipayAuthRequestCustomizer authCustomizer) {
        return (builder, method, uri, body, context) -> {
            try {
                String path = uri.getPath();
                if (uri.getQuery() != null) {
                    path = path + "?" + uri.getQuery();
                }
                String authorization = authCustomizer.buildAuthorization(method, path, body != null ? body : "");
                builder.header("Authorization", authorization);
                builder.header("Content-Type", "application/json; charset=UTF-8");
                log.debug("[SIGN] 为 {} {} 请求添加 Authorization 头", method, path);
            } catch (Exception e) {
                log.warn("[SIGN] 构建签名失败: {}", e.getMessage());
            }
        };
    }
}

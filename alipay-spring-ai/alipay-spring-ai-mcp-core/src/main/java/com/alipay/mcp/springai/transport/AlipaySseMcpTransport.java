package com.alipay.mcp.springai.transport;

import com.alipay.mcp.springai.logging.McpTransportLogger;
import com.alipay.mcp.springai.util.PrivateKeyLoader;
import com.alipay.v3.ApiException;
import com.alipay.v3.util.AlipaySignature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.modelcontextprotocol.client.transport.AsyncHttpRequestCustomizer;
import io.modelcontextprotocol.client.transport.HttpClientSseClientTransport;
import io.modelcontextprotocol.spec.McpClientTransport;
import io.modelcontextprotocol.spec.McpSchema;
import org.reactivestreams.Publisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.net.http.HttpRequest;
import java.security.PrivateKey;
import java.time.Duration;
import java.util.List;

/**
 * 支付宝 SSE MCP Transport 工厂
 * 基于 HttpClientSseClientTransport，通过 AsyncHttpRequestCustomizer 添加支付宝签名
 */
public class AlipaySseMcpTransport {

    private static final Logger log = LoggerFactory.getLogger(AlipaySseMcpTransport.class);

    /**
     * 创建带支付宝签名的 MCP Transport
     *
     * @param appId      应用 ID
     * @param privateKey 私钥字符串（PKCS8 格式，可带 PEM 标记）
     * @param baseUri    基础 URI（如 https://opengw.alipay.com）
     * @param sseEndpoint SSE 端点路径（如 /api/v1/open/mcps/xxx/sse）
     * @return McpClientTransport 实例
     */
    public static McpClientTransport create(String appId, String privateKey, String baseUri, String sseEndpoint) {
        return create(appId, privateKey, baseUri, sseEndpoint, Duration.ofSeconds(10), new ObjectMapper());
    }

    /**
     * 创建带支付宝签名的 MCP Transport（完整配置）
     *
     * @param appId           应用 ID
     * @param privateKey      私钥字符串（PKCS8 格式，可带 PEM 标记）
     * @param baseUri         基础 URI
     * @param sseEndpoint     SSE 端点路径
     * @param connectTimeout  连接超时
     * @param objectMapper    ObjectMapper
     * @return McpClientTransport 实例
     */
    public static McpClientTransport create(String appId, String privateKey, String baseUri,
                                             String sseEndpoint, Duration connectTimeout, ObjectMapper objectMapper) {

        // 创建支付宝签名拦截器
        AlipayAuthRequestCustomizer authCustomizer = new AlipayAuthRequestCustomizer(appId, privateKey);

        // 构建 HttpClientSseClientTransport
        return HttpClientSseClientTransport.builder(baseUri)
            .sseEndpoint(sseEndpoint)
            .connectTimeout(connectTimeout)
            .objectMapper(objectMapper)
            .asyncHttpRequestCustomizer(authCustomizer)
            .build();
    }

    /**
     * 创建带支付宝签名的 MCP Transport（PrivateKey 对象版本，兼容旧 API）
     *
     * @deprecated 请使用 {@link #create(String, String, String, String)}
     */
    @Deprecated
    public static McpClientTransport create(String appId, PrivateKey privateKey, String baseUri, String sseEndpoint) {
        // 兼容旧 API，将 PrivateKey 转换回字符串格式（需要调用方自行处理）
        throw new UnsupportedOperationException("请使用 String 格式的私钥调用此方法");
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
        private ObjectMapper objectMapper = new ObjectMapper();

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
        public Builder privateKey(PrivateKey privateKey) {
            throw new UnsupportedOperationException("请使用 String 格式的私钥");
        }

        public Builder connectTimeout(Duration timeout) {
            this.connectTimeout = timeout;
            return this;
        }

        public Builder objectMapper(ObjectMapper objectMapper) {
            this.objectMapper = objectMapper;
            return this;
        }

        public McpClientTransport build() {
            if (appId == null || appId.isEmpty()) {
                throw new IllegalArgumentException("appId is required");
            }
            if (privateKey == null || privateKey.isEmpty()) {
                throw new IllegalArgumentException("privateKey is required");
            }
            return create(appId, privateKey, baseUri, sseEndpoint, connectTimeout, objectMapper);
        }
    }

    /**
     * 支付宝认证请求定制器
     * 通过 AsyncHttpRequestCustomizer 接口在请求发送前添加支付宝签名
     */
    static class AlipayAuthRequestCustomizer implements AsyncHttpRequestCustomizer {

        private final String appId;
        private final String privateKey;

        public AlipayAuthRequestCustomizer(String appId, String privateKey) {
            this.appId = appId;
            this.privateKey = privateKey;
        }

        @Override
        public Publisher<HttpRequest.Builder> customize(HttpRequest.Builder requestBuilder,
                                                         String method, URI uri, String body) {
            try {
                // 构建签名（只使用路径部分，不包含域名）
                String uriPath = uri.getPath();
                if (uri.getQuery() != null) {
                    uriPath = uriPath + "?" + uri.getQuery();
                }
                String authorization = buildAuthorization(method, uriPath, body);

                // 添加请求头
                requestBuilder.header("Authorization", authorization);
                requestBuilder.header("Content-Type", "application/json; charset=UTF-8");

                McpTransportLogger.logSigning("Authorization: " + maskSensitive(authorization));

                return Mono.just(requestBuilder);
            } catch (Exception e) {
                return Mono.error(new AlipayMcpException("SIGN_ERROR",
                    "构建签名失败：" + e.getMessage(), e));
            }
        }

        /**
         * 构建支付宝 Authorization 头
         * 签名格式与 alipay-mcp-sdk 保持一致
         */
        private String buildAuthorization(String method, String uri, String body) throws ApiException {
            // 1. 生成时间戳（毫秒，与 alipay-mcp-sdk 一致）
            String timestamp = String.valueOf(System.currentTimeMillis());
            String nonce = java.util.UUID.randomUUID().toString();

            // 2. 构建认证字符串（顺序：app_id, timestamp, nonce）
            String authString = "app_id=" + appId + ",timestamp=" + timestamp + ",nonce=" + nonce;

            // 3. 构建签名内容（末尾带换行符）
            StringBuilder signContent = new StringBuilder();
            signContent.append(authString).append("\n")
                       .append(method).append("\n")
                       .append(uri).append("\n")
                       .append(body != null ? body : "").append("\n");

            // 4. 使用 AlipaySignature 签名（RSA2）
            String sign = AlipaySignature.sign(signContent.toString(), privateKey, "utf-8", "RSA2");

            // 5. 构建 Authorization 头
            return "ALIPAY-SHA256withRSA " + authString + ",sign=" + sign;
        }

        private String maskSensitive(String input) {
            if (input == null) return "";
            return input.replaceAll("sign=[^,]+", "sign=***");
        }
    }
}
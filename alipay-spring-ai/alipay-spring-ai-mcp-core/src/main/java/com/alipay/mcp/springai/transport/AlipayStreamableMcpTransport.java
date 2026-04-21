package com.alipay.mcp.springai.transport;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.modelcontextprotocol.client.transport.AsyncHttpRequestCustomizer;
import io.modelcontextprotocol.client.transport.HttpClientStreamableHttpTransport;
import io.modelcontextprotocol.spec.McpClientTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

/**
 * 支付宝 Streamable HTTP MCP Transport 工厂
 * 基于 HttpClientStreamableHttpTransport，支持 MCP 2025-03-26 协议
 * 通过 AsyncHttpRequestCustomizer 添加支付宝签名
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
        return create(appId, privateKey, baseUri, mcpEndpoint, Duration.ofSeconds(10), new ObjectMapper());
    }

    /**
     * 创建带支付宝签名的 Streamable HTTP Transport（完整配置）
     *
     * @param appId           应用 ID
     * @param privateKey      私钥字符串（PKCS8 格式，可带 PEM 标记）
     * @param baseUri         基础 URI
     * @param mcpEndpoint     MCP 端点路径
     * @param connectTimeout  连接超时
     * @param objectMapper    ObjectMapper
     * @return McpClientTransport 实例
     */
    public static McpClientTransport create(String appId, String privateKey, String baseUri,
                                             String mcpEndpoint, Duration connectTimeout, ObjectMapper objectMapper) {

        // 创建支付宝签名拦截器
        AlipayAuthRequestCustomizer authCustomizer = new AlipayAuthRequestCustomizer(appId, privateKey);

        // 构建 HttpClientStreamableHttpTransport
        return HttpClientStreamableHttpTransport.builder(baseUri)
            .endpoint(mcpEndpoint)
            .connectTimeout(connectTimeout)
            .objectMapper(objectMapper)
            .asyncHttpRequestCustomizer(authCustomizer)
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
        private Duration connectTimeout = Duration.ofSeconds(10);
        private ObjectMapper objectMapper = new ObjectMapper();
        private boolean resumableStreams = false;
        private boolean openConnectionOnStartup = true;

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

        public Builder connectTimeout(Duration timeout) {
            this.connectTimeout = timeout;
            return this;
        }

        public Builder objectMapper(ObjectMapper objectMapper) {
            this.objectMapper = objectMapper;
            return this;
        }

        public Builder resumableStreams(boolean resumable) {
            this.resumableStreams = resumable;
            return this;
        }

        public Builder openConnectionOnStartup(boolean open) {
            this.openConnectionOnStartup = open;
            return this;
        }

        public McpClientTransport build() {
            if (appId == null || appId.isEmpty()) {
                throw new IllegalArgumentException("appId is required");
            }
            if (privateKey == null || privateKey.isEmpty()) {
                throw new IllegalArgumentException("privateKey is required");
            }

            // 创建支付宝签名拦截器
            AlipayAuthRequestCustomizer authCustomizer = new AlipayAuthRequestCustomizer(appId, privateKey);

            // 构建 HttpClientStreamableHttpTransport
            return HttpClientStreamableHttpTransport.builder(baseUri)
                .endpoint(mcpEndpoint)
                .connectTimeout(connectTimeout)
                .objectMapper(objectMapper)
                .asyncHttpRequestCustomizer(authCustomizer)
                .resumableStreams(resumableStreams)
                .openConnectionOnStartup(openConnectionOnStartup)
                .build();
        }
    }
}
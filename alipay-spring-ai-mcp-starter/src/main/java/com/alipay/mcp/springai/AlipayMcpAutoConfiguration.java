package com.alipay.mcp.springai;

import com.alipay.mcp.springai.client.AlipayMcpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.Duration;

/**
 * 支付宝 MCP Spring AI 自动配置
 *
 * 使用方式：
 * 1. 引入 alipay-spring-ai-mcp-starter
 * 2. 配置 alipay.mcp.app-id、private-key、transport-mode（sse 或 streamable）
 * 3. 注入 AlipayMcpClient 使用
 */
@AutoConfiguration
@EnableConfigurationProperties(AlipayMcpProperties.class)
@ConditionalOnProperty(prefix = "alipay.mcp", name = "enabled", havingValue = "true", matchIfMissing = true)
public class AlipayMcpAutoConfiguration {

    private static final Logger log = LoggerFactory.getLogger(AlipayMcpAutoConfiguration.class);

    /**
     * AlipayMcpClient（自带加签逻辑）
     * <p>MCP 握手采用延迟初始化，首次使用时自动执行，不会阻塞 Spring 启动。</p>
     */
    @Bean
    @ConditionalOnMissingBean(AlipayMcpClient.class)
    public AlipayMcpClient alipayMcpClient(AlipayMcpProperties properties) {
        if (!properties.isValid()) {
            throw new IllegalStateException(
                "Alipay MCP 配置不完整，请检查认证配置和端点配置");
        }

        // 构建端点
        String endpoint = buildEndpoint(properties);

        // 确定传输模式
        boolean isStreamable = "streamable".equalsIgnoreCase(properties.getTransportMode());
        AlipayMcpClient.TransportMode mode = isStreamable
            ? AlipayMcpClient.TransportMode.STREAMABLE
            : AlipayMcpClient.TransportMode.SSE;

        AlipayMcpClient client;

        // 根据认证类型选择创建客户端的方式
        Duration connectTimeout = properties.getConnectTimeout() != null ? properties.getConnectTimeout() : Duration.ofSeconds(10);

        if ("api_key".equalsIgnoreCase(properties.getAuthType())) {
            log.info("初始化 AlipayMcpClient (API Key 模式), mode: {}, connectTimeout: {}", mode, connectTimeout);
            client = AlipayMcpClient.withApiKey(
                properties.getApiKey(),
                endpoint,
                mode,
                connectTimeout
            );
        } else {
            log.info("初始化 AlipayMcpClient (签名模式), appId: {}, mode: {}, connectTimeout: {}", properties.getAppId(), mode, connectTimeout);
            client = new AlipayMcpClient(
                properties.getAppId(),
                properties.getPrivateKey(),
                endpoint,
                mode,
                connectTimeout
            );
        }

        // 延迟初始化：不在 Bean 创建时执行握手，避免 MCP 服务端不可达时阻塞 Spring 启动
        log.info("AlipayMcpClient 已创建，MCP 握手将在首次调用时自动执行");

        return client;
    }

    /**
     * 根据配置构建端点 URL
     */
    private String buildEndpoint(AlipayMcpProperties properties) {
        boolean isStreamable = "streamable".equalsIgnoreCase(properties.getTransportMode());

        // 1. 优先使用直接配置的端点
        if (isStreamable) {
            if (properties.getStreamableEndpoint() != null && !properties.getStreamableEndpoint().isEmpty()) {
                return properties.getStreamableEndpoint();
            }
        } else {
            if (properties.getSseEndpoint() != null && !properties.getSseEndpoint().isEmpty()) {
                return properties.getSseEndpoint();
            }
        }

        // 2. 使用 baseUri + mcpName 自动构建
        String baseUri = properties.getBaseUri();
        String mcpName = properties.getMcpName();

        if (baseUri != null && !baseUri.isEmpty() && mcpName != null && !mcpName.isEmpty()) {
            String suffix = isStreamable ? "/mcp" : "/sse";
            return baseUri + "/api/v1/open/mcps/" + mcpName + suffix;
        }

        // 3. SSE 模式回退到旧的 sseEndpoint（兼容旧配置）
        // streamable 模式不可回退到 sseEndpoint，避免协议不匹配
        if (!isStreamable && properties.getSseEndpoint() != null && !properties.getSseEndpoint().isEmpty()) {
            return properties.getSseEndpoint();
        }

        throw new IllegalStateException("请配置 alipay.mcp.sse-endpoint 或 alipay.mcp.streamable-endpoint，或者配置 base-uri 和 mcp-name");
    }
}
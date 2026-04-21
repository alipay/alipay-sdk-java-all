package com.alipay.mcp.springai;

import com.alipay.mcp.springai.client.AlipayMcpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

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
     */
    @Bean
    @ConditionalOnMissingBean(AlipayMcpClient.class)
    public AlipayMcpClient alipayMcpClient(AlipayMcpProperties properties) {
        if (!properties.isValid()) {
            throw new IllegalStateException(
                "Alipay MCP 配置不完整，请检查 alipay.mcp.app-id、alipay.mcp.private-key 和端点配置");
        }

        // 构建端点
        String endpoint = buildEndpoint(properties);

        // 确定传输模式
        AlipayMcpClient.TransportMode mode = "streamable".equalsIgnoreCase(properties.getTransportMode())
            ? AlipayMcpClient.TransportMode.STREAMABLE
            : AlipayMcpClient.TransportMode.SSE;

        log.info("初始化 AlipayMcpClient, appId: {}, mode: {}", properties.getAppId(), mode);

        return new AlipayMcpClient(
            properties.getAppId(),
            properties.getPrivateKey(),
            endpoint,
            mode
        );
    }

    /**
     * 根据配置构建端点 URL
     */
    private String buildEndpoint(AlipayMcpProperties properties) {
        // 1. 优先使用直接配置的端点
        if ("streamable".equalsIgnoreCase(properties.getTransportMode())) {
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
            String suffix = "streamable".equalsIgnoreCase(properties.getTransportMode()) ? "/mcp" : "/sse";
            return baseUri + "/api/v1/open/mcps/" + mcpName + suffix;
        }

        // 3. 回退到旧的 sseEndpoint（兼容旧配置）
        if (properties.getSseEndpoint() != null && !properties.getSseEndpoint().isEmpty()) {
            return properties.getSseEndpoint();
        }

        throw new IllegalStateException("请配置 alipay.mcp.sse-endpoint 或 alipay.mcp.streamable-endpoint，或者配置 base-uri 和 mcp-name");
    }
}
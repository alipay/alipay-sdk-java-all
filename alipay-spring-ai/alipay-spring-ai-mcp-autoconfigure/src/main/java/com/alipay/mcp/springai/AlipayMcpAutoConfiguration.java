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
 * 2. 配置 alipay.mcp.app-id、private-key、sse-endpoint
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
                "Alipay MCP 配置不完整，请检查 alipay.mcp.app-id、alipay.mcp.private-key 和 alipay.mcp.sse-endpoint");
        }

        log.info("初始化 AlipayMcpClient, appId: {}", properties.getAppId());

        return new AlipayMcpClient(
            properties.getAppId(),
            properties.getPrivateKey(),
            properties.getSseEndpoint()
        );
    }
}
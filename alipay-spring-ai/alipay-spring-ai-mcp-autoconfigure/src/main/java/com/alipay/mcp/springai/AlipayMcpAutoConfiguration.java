package com.alipay.mcp.springai;

import com.alipay.mcp.springai.client.AlipayMcpClient;
import com.alipay.mcp.springai.util.PrivateKeyLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.security.PrivateKey;

/**
 * 支付宝 MCP Spring AI 自动配置
 */
@AutoConfiguration
@ConditionalOnClass({AlipayMcpClient.class})
@EnableConfigurationProperties(AlipayMcpProperties.class)
@ConditionalOnProperty(prefix = "alipay.mcp", name = "enabled", havingValue = "true", matchIfMissing = true)
public class AlipayMcpAutoConfiguration {

    private static final Logger log = LoggerFactory.getLogger(AlipayMcpAutoConfiguration.class);

    @Bean
    @ConditionalOnMissingBean
    public AlipayMcpClient alipayMcpClient(AlipayMcpProperties properties) {
        if (!properties.isValid()) {
            throw new IllegalStateException(
                "Alipay MCP 配置不完整，请检查 alipay.mcp.app-id、alipay.mcp.private-key 和 alipay.mcp.sse-endpoint");
        }

        log.info("Initializing AlipayMcpClient for appId: {}", properties.getAppId());

        PrivateKey privateKey = PrivateKeyLoader.loadFromString(properties.getPrivateKey());

        return new AlipayMcpClient(
            properties.getAppId(),
            privateKey,
            properties.getSseEndpoint()
        );
    }
}

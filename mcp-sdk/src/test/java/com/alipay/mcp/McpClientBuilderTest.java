package com.alipay.mcp;

import com.alipay.mcp.builder.McpClientBuilder;
import com.alipay.mcp.config.McpClientConfig;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

/**
 * McpClientBuilder 单元测试
 */
public class McpClientBuilderTest {

    private static final Logger log = LoggerFactory.getLogger(McpClientBuilderTest.class);

    /**
     * 测试 McpClientBuilder 的 transportMode 方法
     */
    @Test
    public void testTransportMode() {
        log.info("=== 测试 McpClientBuilder transportMode 方法 ===");

        // 测试 streamable 模式
        McpClient client1 = new McpClientBuilder()
                .appId("test-app-id")
                .privateKey("test-private-key")
                .mcpName("test-mcp")
                .transportMode("streamable")
                .build();

        McpClientConfig config1 = getClientConfig(client1);
        assertEquals("streamable", config1.getTransportMode(), "transportMode 应该是 streamable");
        log.info("streamable 模式设置正确");

        // 测试 sse 模式
        McpClient client2 = new McpClientBuilder()
                .appId("test-app-id")
                .privateKey("test-private-key")
                .mcpName("test-mcp")
                .transportMode("sse")
                .build();

        McpClientConfig config2 = getClientConfig(client2);
        assertEquals("sse", config2.getTransportMode(), "transportMode 应该是 sse");
        log.info("sse 模式设置正确");

        log.info("=== 测试通过 ===");
    }

    /**
     * 测试 streamable 模式使用默认协议版本
     */
    @Test
    public void testStreamableDefaultProtocolVersion() {
        log.info("=== 测试 streamable 模式默认协议版本 ===");

        McpClient client = new McpClientBuilder()
                .appId("test-app-id")
                .privateKey("test-private-key")
                .mcpName("test-mcp")
                .transportMode("streamable")
                .build();

        McpClientConfig config = getClientConfig(client);
        assertEquals("2024-11-05", config.getProtocolVersion(),
                "默认协议版本应该是 2024-11-05");
        log.info("协议版本: {}", config.getProtocolVersion());

        log.info("=== 测试通过 ===");
    }

    /**
     * 测试显式设置协议版本
     */
    @Test
    public void testExplicitProtocolVersion() {
        log.info("=== 测试显式设置协议版本 ===");

        McpClient client = new McpClientBuilder()
                .appId("test-app-id")
                .privateKey("test-private-key")
                .mcpName("test-mcp")
                .transportMode("streamable")
                .protocolVersion("2025-03-26")
                .build();

        McpClientConfig config = getClientConfig(client);
        assertEquals("2025-03-26", config.getProtocolVersion(),
                "协议版本应该是显式设置的值");
        log.info("协议版本: {}", config.getProtocolVersion());

        log.info("=== 测试通过 ===");
    }

    /**
     * 测试默认传输模式为 streamable
     */
    @Test
    public void testDefaultTransportMode() {
        log.info("=== 测试默认传输模式 ===");

        // 不设置 transportMode，使用默认值
        McpClient client = new McpClientBuilder()
                .appId("test-app-id")
                .privateKey("test-private-key")
                .mcpName("test-mcp")
                .build();

        McpClientConfig config = getClientConfig(client);
        assertEquals("streamable", config.getTransportMode(),
                "默认传输模式应该是 streamable");
        log.info("默认传输模式: {}", config.getTransportMode());

        log.info("=== 测试通过 ===");
    }

    /**
     * 测试必需参数校验
     */
    @Test
    public void testRequiredParameters() {
        log.info("=== 测试必需参数校验 ===");

        // 缺少 appId
        assertThrows(IllegalArgumentException.class, () -> {
            new McpClientBuilder()
                    .privateKey("test-private-key")
                    .mcpName("test-mcp")
                    .build();
        }, "缺少 appId 应该抛出异常");
        log.info("缺少 appId 校验正确");

        // 缺少 privateKey
        assertThrows(IllegalArgumentException.class, () -> {
            new McpClientBuilder()
                    .appId("test-app-id")
                    .mcpName("test-mcp")
                    .build();
        }, "缺少 privateKey 应该抛出异常");
        log.info("缺少 privateKey 校验正确");

        log.info("=== 测试通过 ===");
    }

    /**
     * 通过反射获取 McpClient 的 config 字段
     */
    private McpClientConfig getClientConfig(McpClient client) {
        try {
            Field configField = McpClient.class.getDeclaredField("config");
            configField.setAccessible(true);
            return (McpClientConfig) configField.get(client);
        } catch (Exception e) {
            throw new RuntimeException("获取 config 字段失败", e);
        }
    }
}
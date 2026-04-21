package com.alipay.mcp;

import com.alipay.mcp.protocol.Tool;
import com.alipay.mcp.protocol.ToolCallResult;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * Streamable HTTP 模式测试
 */
public class StreamableHttpTest {

    private static final Logger log = LoggerFactory.getLogger(StreamableHttpTest.class);

    @Test
    public void testStreamableMode() {
        log.info("=== 测试 Streamable HTTP 模式 ===");

        SimpleMcpClient client = SimpleMcpClient.create()
                .appId("2021006141677002")
                .privateKey(System.getenv("ALIPAY_PRIVATE_KEY"))
                .mcpName("aidata-convenience-life5")
                .transportMode("streamable")
                .serverUrl("https://opengw-pre.alipay.com")
                .build();

        try {
            // 连接并初始化
            log.info("正在连接...");
            client.connect();
            log.info("连接成功！");

            // 获取工具列表
            log.info("正在获取工具列表...");
            List<Tool> tools = client.listTools();
            log.info("工具数量：{}", tools.size());

            for (Tool tool : tools) {
                log.info("工具：{} - {}", tool.getName(), tool.getDescription());
            }

            // 调用工具 - 使用 Holidays 工具
            if (!tools.isEmpty()) {
                log.info("正在调用工具 Holidays...");
                java.util.Map<String, Object> args = new java.util.HashMap<>();
                args.put("from", "2024-01-01");
                args.put("to", "2024-12-31");
                ToolCallResult result = client.callTool("Holidays", args);
                log.info("调用结果：{}", result.getContent());
            }

            log.info("=== 测试通过 ===");

        } catch (McpException e) {
            log.error("测试失败：{}", e.getMessage(), e);
            throw new RuntimeException("测试失败", e);
        } finally {
            client.close();
        }
    }

    @Test
    public void testSSEMode() {
        log.info("=== 测试 SSE 模式（对比） ===");

        SimpleMcpClient client = SimpleMcpClient.create()
                .appId("2021006141677002")
                .privateKey(System.getenv("ALIPAY_PRIVATE_KEY"))
                .mcpName("aidata-convenience-life5")
                .transportMode("sse")
                .serverUrl("https://opengw-pre.alipay.com")
                .build();

        try {
            log.info("正在连接...");
            client.connect();
            log.info("连接成功！");

            List<Tool> tools = client.listTools();
            log.info("工具数量：{}", tools.size());

            log.info("=== 测试通过 ===");

        } catch (McpException e) {
            log.error("测试失败：{}", e.getMessage(), e);
            throw new RuntimeException("测试失败", e);
        } finally {
            client.close();
        }
    }
}
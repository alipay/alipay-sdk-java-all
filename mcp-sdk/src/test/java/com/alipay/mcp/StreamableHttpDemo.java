package com.alipay.mcp;

import com.alipay.mcp.protocol.Tool;
import com.alipay.mcp.protocol.ToolCallResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * Streamable HTTP 模式 Demo 示例
 *
 * 使用方式：
 * 1. 设置环境变量：export ALIPAY_PRIVATE_KEY="your-private-key"
 * 2. 运行 main 方法
 *
 * @author alipay
 */
public class StreamableHttpDemo {

    private static final Logger log = LoggerFactory.getLogger(StreamableHttpDemo.class);

    public static void main(String[] args) {
        // 方式一：使用 mcpName + transportMode（推荐）
        testWithMcpName();

        // 方式二：使用完整的 streamableEndpoint
        testWithStreamableEndpoint();

        // 方式三：使用 Builder 模式配置回调
        testWithCallbacks();
    }

    /**
     * 方式一：使用 mcpName + transportMode
     */
    private static void testWithMcpName() {
        log.info("=== 方式一：使用 mcpName + transportMode ===");

        SimpleMcpClient client = SimpleMcpClient.create()
                .appId("2021006141677002")
                .privateKey(System.getenv("ALIPAY_PRIVATE_KEY"))
                .mcpName("aidata-convenience-life5")
                .transportMode("streamable")  // 设置为 streamable 模式
                .serverUrl("https://opengw-pre.alipay.com")  // 预发环境
                .build();

        try {
            // 连接并初始化
            client.connect();

            // 获取工具列表
            List<Tool> tools = client.listTools();
            log.info("工具数量：{}", tools.size());
            for (Tool tool : tools) {
                log.info("工具：{} - {}", tool.getName(), tool.getDescription());
            }

            // 调用工具 - 使用 Holidays 工具
            if (!tools.isEmpty()) {
                java.util.Map<String, Object> args = new java.util.HashMap<>();
                args.put("from", "2024-01-01");
                args.put("to", "2024-12-31");

                ToolCallResult result = client.callTool("Holidays", args);
                log.info("调用结果：{}", result.getContent());
            }

        } catch (McpException e) {
            log.error("测试失败", e);
        } finally {
            client.close();
        }
    }

    /**
     * 方式二：使用完整的 streamableEndpoint
     */
    private static void testWithStreamableEndpoint() {
        log.info("=== 方式二：使用完整的 streamableEndpoint ===");

        SimpleMcpClient client = SimpleMcpClient.create()
                .appId("2021006141677002")
                .privateKey(System.getenv("ALIPAY_PRIVATE_KEY"))
                .streamableEndpoint("https://opengw-pre.alipay.com/api/v1/open/mcps/aidata-convenience-life5/mcp")
                .transportMode("streamable")
                .build();

        try {
            client.connect();

            // 同步获取工具列表
            List<Tool> tools = client.listTools();
            log.info("工具数量：{}", tools.size());

            // 异步获取工具列表
            client.listToolsAsync().thenAccept(asyncTools -> {
                log.info("异步获取工具数量：{}", asyncTools.size());
            }).join();

        } catch (McpException e) {
            log.error("测试失败", e);
        } finally {
            client.close();
        }
    }

    /**
     * 方式三：使用 Builder 模式配置回调
     */
    private static void testWithCallbacks() {
        log.info("=== 方式三：使用 Builder 模式配置回调 ===");

        SimpleMcpClient client = SimpleMcpClient.create()
                .appId("2021006141677002")
                .privateKey(System.getenv("ALIPAY_PRIVATE_KEY"))
                .mcpName("aidata-convenience-life5")
                .transportMode("streamable")
                .serverUrl("https://opengw-pre.alipay.com")
                .onProgress(progress -> {
                    log.info("进度更新：{}", progress);
                })
                .onLog(logMessage -> {
                    log.info("日志：{}", logMessage);
                })
                .onError(exception -> {
                    log.error("错误：{}", exception.getMessage());
                })
                .build();

        try {
            client.connect();

            // 使用 Builder 模式调用工具 - Holidays
            ToolCallResult result = client.callTool("Holidays")
                    .param("from", "2024-01-01")
                    .param("to", "2024-12-31")
                    .execute();

            log.info("调用结果：{}", result.getContent());

        } catch (McpException e) {
            log.error("测试失败", e);
        } finally {
            client.close();
        }
    }
}
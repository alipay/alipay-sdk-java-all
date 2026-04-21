package com.alipay.mcp;

import com.alipay.mcp.protocol.Tool;
import com.alipay.mcp.protocol.ToolCallResult;
import com.alipay.mcp.protocol.Content;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SimpleMcpClient 使用示例
 *
 * SimpleMcpClient 是简化版客户端，提供更简洁的 API。
 * 自动完成连接和初始化，适合快速开发。
 */
public class SimpleMcpClientDemo {

    public static void main(String[] args) {
        String privateKey = System.getenv("ALIPAY_PRIVATE_KEY");
        if (privateKey == null || privateKey.isEmpty()) {
            System.err.println("请设置环境变量 ALIPAY_PRIVATE_KEY");
            return;
        }

        // ==================== 方式一：最简用法 ====================
        System.out.println("\n=== 方式一：最简用法 ===");
        basicUsage(privateKey);

        // ==================== 方式二：Streamable HTTP 模式 ====================
        System.out.println("\n=== 方式二：Streamable HTTP 模式 ===");
        streamableMode(privateKey);

        // ==================== 方式三：检查工具并调用 ====================
        System.out.println("\n=== 方式三：检查工具并调用 ===");
        checkAndCallTool(privateKey);
    }

    /**
     * 方式一：最简用法
     */
    private static void basicUsage(String privateKey) {
        try (SimpleMcpClient client = SimpleMcpClient.create()
                .appId("2021006141677002")
                .privateKey(privateKey)
                .mcpName("aidata-convenience-life5")
                .serverUrl("https://opengw-pre.alipay.com")
                .build()) {

            // 自动连接并初始化
            client.connect();

            // 获取工具列表
            List<Tool> tools = client.listTools();
            System.out.println("可用工具数：" + tools.size());
            tools.forEach(t -> System.out.println("  - " + t.getName() + ": " + t.getDescription()));

        } catch (McpException e) {
            System.err.println("错误：" + e.getMessage());
        }
    }

    /**
     * 方式二：Streamable HTTP 模式
     */
    private static void streamableMode(String privateKey) {
        try (SimpleMcpClient client = SimpleMcpClient.create()
                .appId("2021006141677002")
                .privateKey(privateKey)
                .mcpName("aidata-convenience-life5")
                .transportMode("streamable")
                .serverUrl("https://opengw-pre.alipay.com")
                .build()) {

            client.connect();

            List<Tool> tools = client.listTools();
            System.out.println("工具数：" + tools.size());

            // 调用 Holidays 工具
            System.out.println("\n--- 调用 Holidays 工具 ---");
            Map<String, Object> args = new HashMap<>();
            args.put("from", "2024-01-01");
            args.put("to", "2024-12-31");
            ToolCallResult result = client.callTool("Holidays", args);
            printResult(result);

        } catch (McpException e) {
            System.err.println("错误：" + e.getMessage());
        }
    }

    /**
     * 方式三：检查工具是否存在并调用
     */
    private static void checkAndCallTool(String privateKey) {
        try (SimpleMcpClient client = SimpleMcpClient.create()
                .appId("2021006141677002")
                .privateKey(privateKey)
                .mcpName("aidata-convenience-life5")
                .transportMode("streamable")
                .serverUrl("https://opengw-pre.alipay.com")
                .onError(e -> System.err.println("[回调错误] " + e.getMessage()))
                .build()) {

            client.connect();

            // 检查工具是否存在
            if (client.hasTool("Holidays")) {
                Tool tool = client.getTool("Holidays");
                System.out.println("工具名称：" + tool.getName());
                System.out.println("工具描述：" + tool.getDescription());

                // 使用 Builder 模式调用工具
                ToolCallResult result = client.callTool("Holidays")
                        .param("from", "2024-01-01")
                        .param("to", "2024-12-31")
                        .execute();
                printResult(result);
            } else {
                System.out.println("工具不存在");
            }

        } catch (McpException e) {
            System.err.println("错误：" + e.getMessage());
        }
    }

    /**
     * 打印调用结果
     */
    private static void printResult(ToolCallResult result) {
        if (result.getContent() != null) {
            for (Content c : result.getContent()) {
                System.out.println(c.getText());
            }
        }
        if (result.getIsError() != null && result.getIsError()) {
            System.out.println("[错误] 调用失败");
        }
    }
}
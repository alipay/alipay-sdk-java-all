package com.alipay.mcp;

import com.alipay.mcp.builder.McpClientBuilder;
import com.alipay.mcp.interceptor.Interceptor;
import com.alipay.mcp.interceptor.Request;
import com.alipay.mcp.interceptor.Response;
import com.alipay.mcp.protocol.Tool;
import com.alipay.mcp.protocol.ToolCallResult;
import com.alipay.mcp.transport.McpEventListener;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * McpClient 使用示例
 *
 * McpClient 是原生客户端，提供完整的 MCP 协议支持。
 * 通过 McpClientBuilder 构建，支持自定义拦截器。
 */
public class McpClientDemo {

    public static void main(String[] args) {
        String privateKey = System.getenv("ALIPAY_PRIVATE_KEY");
        if (privateKey == null || privateKey.isEmpty()) {
            System.err.println("请设置环境变量 ALIPAY_PRIVATE_KEY");
            return;
        }

        // ==================== 方式一：Streamable HTTP 模式 ====================
        System.out.println("\n=== 方式一：Streamable HTTP 模式 ===");
        streamableMode(privateKey);

        // ==================== 方式二：SSE 模式 ====================
        System.out.println("\n=== 方式二：SSE 模式 ===");
        sseMode(privateKey);

        // ==================== 方式三：自定义拦截器 ====================
        System.out.println("\n=== 方式三：自定义拦截器 ===");
        customInterceptor(privateKey);
    }

    /**
     * Streamable HTTP 模式（推荐）
     */
    private static void streamableMode(String privateKey) {
        try (McpClient client = new McpClientBuilder()
                .appId("2021006141677002")
                .privateKey(privateKey)
                .mcpName("aidata-convenience-life5")
                .transportMode("streamable")
                .serverUrl("https://opengw-pre.alipay.com")
                .build()) {

            client.connectAndInitialize(new McpEventListener() {
                @Override
                public void onConnected() {
                    System.out.println("✓ 连接已建立");
                }

                @Override
                public void onError(McpException e) {
                    System.err.println("✗ 错误：" + e.getMessage());
                }
            });

            // 获取工具列表
            List<Tool> tools = client.listTools();
            System.out.println("可用工具数：" + tools.size());
            tools.forEach(t -> System.out.println("  - " + t.getName() + ": " + t.getDescription()));

            // 调用工具
            callHolidayTool(client);

        } catch (McpException e) {
            System.err.println("错误：" + e.getMessage());
        }
    }

    /**
     * SSE 模式
     */
    private static void sseMode(String privateKey) {
        try (McpClient client = new McpClientBuilder()
                .appId("2021006141677002")
                .privateKey(privateKey)
                .mcpName("aidata-convenience-life5")
                .transportMode("sse")
                .serverUrl("https://opengw-pre.alipay.com")
                .build()) {

            client.connectAndInitialize(new McpEventListener() {
                @Override
                public void onConnected() {
                    System.out.println("✓ SSE 连接已建立");
                }

                @Override
                public void onError(McpException e) {
                    System.err.println("✗ 错误：" + e.getMessage());
                }
            });

            List<Tool> tools = client.listTools();
            System.out.println("工具数：" + tools.size());

        } catch (McpException e) {
            System.err.println("错误：" + e.getMessage());
        }
    }

    /**
     * 自定义拦截器
     */
    private static void customInterceptor(String privateKey) {
        // 创建日志拦截器
        Interceptor loggingInterceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws java.io.IOException {
                Request request = chain.request();
                long start = System.currentTimeMillis();

                System.out.println("[Logger] >>> " + request.getMethod() + " " + request.getUrl());

                Response response = chain.proceed(request);

                long cost = System.currentTimeMillis() - start;
                System.out.println("[Logger] <<< " + response.getCode() + " (" + cost + "ms)");

                return response;
            }
        };

        try (McpClient client = new McpClientBuilder()
                .appId("2021006141677002")
                .privateKey(privateKey)
                .mcpName("aidata-convenience-life5")
                .transportMode("streamable")
                .serverUrl("https://opengw-pre.alipay.com")
                .addInterceptor(loggingInterceptor)
                .build()) {

            client.connectAndInitialize(new McpEventListener() {
                @Override
                public void onError(McpException e) {
                    System.err.println("✗ 错误：" + e.getMessage());
                }
            });

            List<Tool> tools = client.listTools();
            System.out.println("工具数：" + tools.size());

        } catch (McpException e) {
            System.err.println("错误：" + e.getMessage());
        }
    }

    /**
     * 调用节假日查询工具
     */
    private static void callHolidayTool(McpClient client) throws McpException {
        System.out.println("\n--- 调用 Holidays 工具 ---");
        Map<String, Object> args = new HashMap<>();
        args.put("from", "2024-01-01");
        args.put("to", "2024-12-31");

        ToolCallResult result = client.callTool("Holidays", args);
        if (result.getContent() != null) {
            result.getContent().forEach(c -> System.out.println(c.getText()));
        }
    }
}
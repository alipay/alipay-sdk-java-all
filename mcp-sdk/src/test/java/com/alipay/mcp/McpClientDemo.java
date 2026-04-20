package com.alipay.mcp;

import com.alipay.mcp.builder.McpClientBuilder;
import com.alipay.mcp.interceptor.Interceptor;
import com.alipay.mcp.interceptor.Request;
import com.alipay.mcp.interceptor.Response;
import com.alipay.mcp.protocol.Tool;
import com.alipay.mcp.protocol.ToolCallResult;
import com.alipay.mcp.transport.LogMessage;
import com.alipay.mcp.transport.McpEventListener;
import com.alipay.mcp.transport.ProgressUpdate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MCP 客户端使用示例
 */
public class McpClientDemo {

    public static void main(String[] args) {
        // 从环境变量读取私钥
        String privateKey = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDORnQ5jZnurOS9U6o26J1ZH5wWSsaRHERQ3U3EXBI3iRnkHJGFjg1RK6OYswOnYEtzJKripFxaq6mzWS75qnmG4Ny49MyIVT1zL7rDWtMP9DYaGAVTrccCyZe8IjbQR0TW1zNbcj4ue+jYqkv5+/sHX0f/EtKOgcnTb7bXrYL+co7s0fFTQfdc6HbNisoX5ZdtjG1Y6166GDBTndxE8/95GBlBNkT5e8rF84OvATbATBCmuOAA4XcGfeRVUFjPPgwIjbIgpcprlmTZMWjVP7OFVAdC9HkNKsWgbinGigvBb/FCIrGx+10dCghRvegBH7Ua/LsIoFjgvyf1zbbqwt0dAgMBAAECggEAb97H89q3DDmaSI/SdbsMcyRwi6p8LIDvEAglwAPLIXFqqEtSJOOYl1gafps/tQvFf6n4P7iyGb6V553Lmz34cM0NCAZD0wCfthPBr2dXpoRkvxwd73cEwp9Aepj3r1ennvjRcpvv21f6PV+Gmwos55+mNVEo/n6nTdN9j1UcARB4k1rpK66YTwTUn1dwFBp4JMyUZy2LzbnpF4qa0sRvrwhUlgjKrJGXzaW26y0chI02SEx/k2AQ78wd+nbhYABYU/xTVioZiYoyCGM5e3ehDXsELs5Ks0JqD/MZD5JhS9P6KFOLgVsfz7UVf5EVHiDseLwKEXWLpJqQJ6qOogkmYQKBgQDyeYHPYGzOFyvov5FQC6VXYdXj4uO+E68aIaXyvnczbqOTYsWnw6gFDFcnNSMcVcfMhwkfLOKsWUQ/cbgnDi6pVrkjHhSIwude2K1RvHWQ7wzY8weT1CkORPWrR70V2MS2dv8qdRWZ9g6ic0QuJW/7ElngbDpdexGMfS1NOaANyQKBgQDZyAacynbO1w3Wk2TdF+S/TjkrBA6fEELZhmCQAmt250VIwLDP/ignmUKrzGa81fsF2M7Rlt6wDpppcTgZY4emtozreQZFaf6i4FyqGIPdBFFpM5R3VFqbkxDirYjlwl74H+SsQnmWC0DDnq+Cee0PKb4Ya2jRr6lEEuoUDKcutQKBgQDeh2j82y/ADD/+ASHpZma9xUo5NJdycDo5LzxPhUF8cEOrFfD0QHpI98RcdUXd0VPmft9+PwFgzyP1XfZ10Ww9eRu8APUzdjxFLXITG3SCKQGPcas4nnN3Zw5XvSTpkeEm3Brd6kqC2/EeYc7m0vDsaTEW5/zAohu+5XrX7tTXEQKBgQCmnrgYa3rco4KN4fUwhuBXUWTBuXfqUMmknX/xjjhkH2tNz0c3yu8z5Lkysc8EuP42KfuKNVCpCHMxKxNNsW2OqmpEmjKnFwJf4SJkbR8uEOisgW8coSg1kR5BH532k3CPi+8rsCxQFMn3IMiNHfW2PSyYiE0I6MmrMIFw14FtZQKBgHx08LIwK4Fk6vfsaxPpmD8DLPL76EbDOyNnNUkp6q2UmG5ZoGb5JEHEk52HnAdpbQ45aIE5jEVy54ubqjSkID8/Bxbp5vIwVpPr8D7boj6Xz99uy5qjiHCIfDXXlqb+yE863SQykQxzSkNj6TPCBMM2PYHVMRS3YtIk2UjfdVI5";

        // ==================== 方式一：基础用法 ====================
        System.out.println("=== 方式一：基础用法 ===");
        basicUsage(privateKey);

        // ==================== 方式二：自定义 Header ====================
        System.out.println("\n=== 方式二：自定义 Header ===");
        customHeadersUsage(privateKey);

        // ==================== 方式三：自定义拦截器 ====================
        System.out.println("\n=== 方式三：自定义拦截器 ===");
        customInterceptorUsage(privateKey);
    }

    /**
     * 方式一：基础用法（自动添加支付宝加签）
     */
    private static void basicUsage(String privateKey) {
        try (McpClient client = new McpClientBuilder()
                .appId("2021006141677002")
                .privateKey(privateKey)
                .mcpName("aidata-convenience-life5")
                .serverUrl("https://opengw-pre.alipay.com")  // 预发环境
                .build()) {

            // 使用 connectAndInitialize 自动完成 MCP 握手
            client.connectAndInitialize(new McpEventListener() {
                @Override
                public void onConnected() {
                    System.out.println("✓ SSE 连接已建立");
                }

                @Override
                public void onEndpointReady(String endpoint) {
                    System.out.println("✓ Endpoint 就绪：" + endpoint);
                }

                @Override
                public void onProgress(ProgressUpdate progress) {
                    System.out.printf("⏳ 进度：%d/%d%n", progress.getProgress(), progress.getTotal());
                }

                @Override
                public void onLog(LogMessage log) {
                    System.out.printf("[%s] %s: %s%n", log.getLevel(), log.getLogger(), log.getMessage());
                }

                @Override
                public void onError(McpException e) {
                    System.err.println("✗ 错误：" + e.getMessage());
                }

                @Override
                public void onDisconnected() {
                    System.out.println("连接已断开");
                }
            });

            // 获取工具列表
            System.out.println("\n=== 获取工具列表 ===");
            List<Tool> tools = client.listTools();
            System.out.println("可用工具数：" + tools.size());
            tools.forEach(t -> System.out.println("  - " + t.getName() + ": " + t.getDescription()));

            // 调用工具
            System.out.println("\n=== 调用工具 ===");
            Map<String, Object> toolParams = new HashMap<>();
            Map<String, Object> toolArgs = new HashMap<>();
            toolArgs.put("date", "2024-01-01");
            toolArgs.put("type", "1");
            toolParams.put("toolParams", toolArgs);

            ToolCallResult result = client.callTool("testOpenApi", toolParams);
            System.out.println("调用结果：");
            result.getContent().forEach(c -> System.out.println("  " + c.getText()));

        } catch (McpException e) {
            e.printStackTrace();
        }
    }

    /**
     * 方式二：自定义 Header
     */
    private static void customHeadersUsage(String privateKey) {
        try (McpClient client = new McpClientBuilder()
                .appId("2021006141677002")
                .privateKey(privateKey)
                .mcpName("aidata-convenience-life5")
                .serverUrl("https://opengw-pre.alipay.com")  // 预发环境
                .connectTimeout(15000)
                .readTimeout(120000)
                .customHeader("X-Custom-Header", "custom-value")
                .customHeader("X-Request-Source", "my-app")
                .build()) {

            // 使用 connectAndInitialize 自动完成 MCP 握手
            client.connectAndInitialize(new McpEventListener() {
                @Override
                public void onConnected() {
                    System.out.println("✓ 连接已建立");
                }

                @Override
                public void onEndpointReady(String endpoint) {
                    System.out.println("✓ Endpoint 就绪");
                }

                @Override
                public void onError(McpException e) {
                    System.err.println("✗ 错误：" + e.getMessage());
                }

                @Override
                public void onDisconnected() {
                }

                @Override
                public void onProgress(ProgressUpdate progress) {
                }

                @Override
                public void onLog(LogMessage log) {
                }
            });

            System.out.println("自定义 Header 已添加");
            List<Tool> tools = client.listTools();
            System.out.println("工具数：" + tools.size());

        } catch (McpException e) {
            e.printStackTrace();
        }
    }

    /**
     * 方式三：自定义拦截器
     */
    private static void customInterceptorUsage(String privateKey) {
        // 创建自定义拦截器
        Interceptor loggingInterceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws java.io.IOException {
                Request request = chain.request();
                long start = System.currentTimeMillis();

                System.out.println("[LoggingInterceptor] 请求: " + request.getMethod() + " " + request.getUrl());

                Response response = chain.proceed(request);

                long cost = System.currentTimeMillis() - start;
                System.out.println("[LoggingInterceptor] 响应: " + response.getCode() + ", 耗时: " + cost + "ms");

                return response;
            }
        };

        try (McpClient client = new McpClientBuilder()
                .appId("2021006141677002")
                .privateKey(privateKey)
                .mcpName("aidata-convenience-life5")
                .serverUrl("https://opengw-pre.alipay.com")  // 预发环境
                .addInterceptor(loggingInterceptor)  // 添加自定义拦截器
                .build()) {

            // 使用 connectAndInitialize 自动完成 MCP 握手
            client.connectAndInitialize(new McpEventListener() {
                @Override
                public void onConnected() {
                    System.out.println("✓ 连接已建立");
                }

                @Override
                public void onEndpointReady(String endpoint) {
                    System.out.println("✓ Endpoint 就绪");
                }

                @Override
                public void onError(McpException e) {
                    System.err.println("✗ 错误：" + e.getMessage());
                }

                @Override
                public void onDisconnected() {
                }

                @Override
                public void onProgress(ProgressUpdate progress) {
                }

                @Override
                public void onLog(LogMessage log) {
                }
            });

            List<Tool> tools = client.listTools();
            System.out.println("工具数：" + tools.size());

        } catch (McpException e) {
            e.printStackTrace();
        }
    }
}
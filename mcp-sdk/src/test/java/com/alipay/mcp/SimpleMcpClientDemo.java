package com.alipay.mcp;

import com.alipay.mcp.protocol.Tool;
import com.alipay.mcp.protocol.ToolCallResult;
import com.alipay.mcp.protocol.Content;

import java.util.List;

/**
 * SimpleMcpClient 使用示例
 */
public class SimpleMcpClientDemo {

    public static void main(String[] args) {
        String privateKey = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDORnQ5jZnurOS9U6o26J1ZH5wWSsaRHERQ3U3EXBI3iRnkHJGFjg1RK6OYswOnYEtzJKripFxaq6mzWS75qnmG4Ny49MyIVT1zL7rDWtMP9DYaGAVTrccCyZe8IjbQR0TW1zNbcj4ue+jYqkv5+/sHX0f/EtKOgcnTb7bXrYL+co7s0fFTQfdc6HbNisoX5ZdtjG1Y6166GDBTndxE8/95GBlBNkT5e8rF84OvATbATBCmuOAA4XcGfeRVUFjPPgwIjbIgpcprlmTZMWjVP7OFVAdC9HkNKsWgbinGigvBb/FCIrGx+10dCghRvegBH7Ua/LsIoFjgvyf1zbbqwt0dAgMBAAECggEAb97H89q3DDmaSI/SdbsMcyRwi6p8LIDvEAglwAPLIXFqqEtSJOOYl1gafps/tQvFf6n4P7iyGb6V553Lmz34cM0NCAZD0wCfthPBr2dXpoRkvxwd73cEwp9Aepj3r1ennvjRcpvv21f6PV+Gmwos55+mNVEo/n6nTdN9j1UcARB4k1rpK66YTwTUn1dwFBp4JMyUZy2LzbnpF4qa0sRvrwhUlgjKrJGXzaW26y0chI02SEx/k2AQ78wd+nbhYABYU/xTVioZiYoyCGM5e3ehDXsELs5Ks0JqD/MZD5JhS9P6KFOLgVsfz7UVf5EVHiDseLwKEXWLpJqQJ6qOogkmYQKBgQDyeYHPYGzOFyvov5FQC6VXYdXj4uO+E68aIaXyvnczbqOTYsWnw6gFDFcnNSMcVcfMhwkfLOKsWUQ/cbgnDi6pVrkjHhSIwude2K1RvHWQ7wzY8weT1CkORPWrR70V2MS2dv8qdRWZ9g6ic0QuJW/7ElngbDpdexGMfS1NOaANyQKBgQDZyAacynbO1w3Wk2TdF+S/TjkrBA6fEELZhmCQAmt250VIwLDP/ignmUKrzGa81fsF2M7Rlt6wDpppcTgZY4emtozreQZFaf6i4FyqGIPdBFFpM5R3VFqbkxDirYjlwl74H+SsQnmWC0DDnq+Cee0PKb4Ya2jRr6lEEuoUDKcutQKBgQDeh2j82y/ADD/+ASHpZma9xUo5NJdycDo5LzxPhUF8cEOrFfD0QHpI98RcdUXd0VPmft9+PwFgzyP1XfZ10Ww9eRu8APUzdjxFLXITG3SCKQGPcas4nnN3Zw5XvSTpkeEm3Brd6kqC2/EeYc7m0vDsaTEW5/zAohu+5XrX7tTXEQKBgQCmnrgYa3rco4KN4fUwhuBXUWTBuXfqUMmknX/xjjhkH2tNz0c3yu8z5Lkysc8EuP42KfuKNVCpCHMxKxNNsW2OqmpEmjKnFwJf4SJkbR8uEOisgW8coSg1kR5BH532k3CPi+8rsCxQFMn3IMiNHfW2PSyYiE0I6MmrMIFw14FtZQKBgHx08LIwK4Fk6vfsaxPpmD8DLPL76EbDOyNnNUkp6q2UmG5ZoGb5JEHEk52HnAdpbQ45aIE5jEVy54ubqjSkID8/Bxbp5vIwVpPr8D7boj6Xz99uy5qjiHCIfDXXlqb+yE863SQykQxzSkNj6TPCBMM2PYHVMRS3YtIk2UjfdVI5";

        // ==================== 方式一：最简用法 ====================
        System.out.println("=== 方式一：最简用法 ===");
        try (SimpleMcpClient client = SimpleMcpClient.create()
                .appId("2021006141677002")
                .privateKey(privateKey)
                .mcpName("aidata-convenience-life5")
                .build()) {

            // 自动连接并初始化
            client.connect();

            // 获取工具列表
            List<Tool> tools = client.listTools();
            System.out.println("可用工具数：" + tools.size());
            tools.forEach(t -> System.out.println("  - " + t.getName() + ": " + t.getDescription()));

            // 调用工具 - 链式参数构建
            ToolCallResult result = client.callTool("testOpenApi")
                    .nestedParam("toolParams", "date", "2024-01-01")
                    .nestedParam("toolParams", "type", "1")
                    .execute();

            System.out.println("\n调用结果：");
            if (result.getContent() != null) {
                for (Content c : result.getContent()) {
                    System.out.println("  " + c.getText());
                }
            }
            if (result.getIsError() != null && result.getIsError()) {
                System.out.println("  [错误] " + result.getContent());
            }

        } catch (McpException e) {
            System.err.println("错误：" + e.getMessage());
        }

        // ==================== 方式二：检查工具是否存在 ====================
        System.out.println("\n=== 方式二：检查工具 ===");
        try (SimpleMcpClient client = SimpleMcpClient.create()
                .appId("2021006141677002")
                .privateKey(privateKey)
                .mcpName("aidata-convenience-life5")
                .build()) {

            client.connect();

            // 检查工具是否存在
            if (client.hasTool("testOpenApi")) {
                Tool tool = client.getTool("testOpenApi");
                System.out.println("工具名称：" + tool.getName());
                System.out.println("工具描述：" + tool.getDescription());
                System.out.println("输入Schema：" + tool.getInputSchema());
            }

        } catch (McpException e) {
            System.err.println("错误：" + e.getMessage());
        }

        // ==================== 方式三：带回调 ====================
        System.out.println("\n=== 方式三：带回调 ===");
        try (SimpleMcpClient client = SimpleMcpClient.create()
                .appId("2021006141677002")
                .privateKey(privateKey)
                .mcpName("aidata-convenience-life5")
                .serverUrl("https://opengw.alipay.com")
                .connectTimeout(15000)
                .onError(e -> System.err.println("[回调错误] " + e.getMessage()))
                .onProgress(p -> System.out.println("[进度] " + p.getProgress() + "/" + p.getTotal()))
                .onLog(l -> System.out.println("[日志] " + l.getMessage()))
                .build()) {

            client.connect();
            List<Tool> tools = client.listTools();
            System.out.println("工具数：" + tools.size());

        } catch (McpException e) {
            System.err.println("错误：" + e.getMessage());
        }
    }
}
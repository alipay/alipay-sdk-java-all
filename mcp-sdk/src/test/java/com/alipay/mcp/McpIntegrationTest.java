package com.alipay.mcp;

import com.alipay.mcp.builder.McpClientBuilder;
import com.alipay.mcp.protocol.Tool;
import com.alipay.mcp.protocol.ToolCallResult;
import com.alipay.mcp.transport.McpEventListener;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MCP 客户端集成测试
 * 需要设置环境变量 ALIPAY_PRIVATE_KEY 才能运行
 */
@EnabledIfEnvironmentVariable(named = "ALIPAY_PRIVATE_KEY", matches = ".+")
public class McpIntegrationTest {

    private static final Logger log = LoggerFactory.getLogger(McpIntegrationTest.class);
    private static final String APP_ID = "2021006141677002";
    private static final String MCP_NAME = "aidata-convenience-life5";
    private static final String SERVER_URL = "https://opengw-pre.alipay.com";

    /**
     * 测试 SimpleMcpClient - SSE 模式
     */
    @Test
    public void testSimpleMcpClientSSE() {
        log.info("=== 测试 SimpleMcpClient SSE 模式 ===");

        SimpleMcpClient client = SimpleMcpClient.create()
                .appId(APP_ID)
                .privateKey(System.getenv("ALIPAY_PRIVATE_KEY"))
                .mcpName(MCP_NAME)
                .transportMode("sse")
                .serverUrl(SERVER_URL)
                .build();

        try {
            log.info("正在连接...");
            client.connect();
            log.info("连接成功！");

            List<Tool> tools = client.listTools();
            log.info("工具数量：{}", tools.size());

            for (Tool tool : tools) {
                log.info("工具：{} - {}", tool.getName(), tool.getDescription());
            }

            log.info("=== 测试通过 ===");

        } catch (McpException e) {
            log.error("测试失败：{}", e.getMessage(), e);
            throw new RuntimeException("测试失败", e);
        } finally {
            client.close();
        }
    }

    /**
     * 测试 SimpleMcpClient - Streamable HTTP 模式
     */
    @Test
    public void testSimpleMcpClientStreamable() {
        log.info("=== 测试 SimpleMcpClient Streamable HTTP 模式 ===");

        SimpleMcpClient client = SimpleMcpClient.create()
                .appId(APP_ID)
                .privateKey(System.getenv("ALIPAY_PRIVATE_KEY"))
                .mcpName(MCP_NAME)
                .transportMode("streamable")
                .serverUrl(SERVER_URL)
                .build();

        try {
            log.info("正在连接...");
            client.connect();
            log.info("连接成功！");

            List<Tool> tools = client.listTools();
            log.info("工具数量：{}", tools.size());

            for (Tool tool : tools) {
                log.info("工具：{} - {}", tool.getName(), tool.getDescription());
            }

            // 调用工具
            if (!tools.isEmpty()) {
                log.info("正在调用工具 Holidays...");
                Map<String, Object> args = new HashMap<>();
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

    /**
     * 测试 McpClientBuilder - Streamable HTTP 模式
     */
    @Test
    public void testMcpClientBuilderStreamable() {
        log.info("=== 测试 McpClientBuilder Streamable HTTP 模式 ===");

        McpClient client = new McpClientBuilder()
                .appId(APP_ID)
                .privateKey(System.getenv("ALIPAY_PRIVATE_KEY"))
                .mcpName(MCP_NAME)
                .transportMode("streamable")
                .serverUrl(SERVER_URL)
                .build();

        try {
            log.info("正在连接...");
            client.connectAndInitialize(new McpEventListener() {
                @Override
                public void onError(McpException e) {
                    log.error("连接错误", e);
                }
            });
            log.info("连接成功！");

            List<Tool> tools = client.listTools();
            log.info("工具数量：{}", tools.size());

            for (Tool tool : tools) {
                log.info("工具：{} - {}", tool.getName(), tool.getDescription());
            }

            // 调用工具
            if (!tools.isEmpty()) {
                log.info("正在调用工具 Holidays...");
                Map<String, Object> args = new HashMap<>();
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

    /**
     * 测试 McpClientBuilder - SSE 模式
     */
    @Test
    public void testMcpClientBuilderSSE() {
        log.info("=== 测试 McpClientBuilder SSE 模式 ===");

        McpClient client = new McpClientBuilder()
                .appId(APP_ID)
                .privateKey(System.getenv("ALIPAY_PRIVATE_KEY"))
                .mcpName(MCP_NAME)
                .transportMode("sse")
                .serverUrl(SERVER_URL)
                .build();

        try {
            log.info("正在连接...");
            client.connectAndInitialize(new McpEventListener() {
                @Override
                public void onError(McpException e) {
                    log.error("连接错误", e);
                }
            });
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
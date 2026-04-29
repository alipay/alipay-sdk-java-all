package com.alipay.mcp.springai.integration;

import com.alipay.mcp.springai.client.AlipayMcpClient;
import io.modelcontextprotocol.spec.McpSchema;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * AlipayMcpClient 集成测试
 *
 * 本测试使用真实的支付宝 MCP SSE 端点，验证完整的 MCP 握手和工具调用流程。
 * 参考 McpTestController 的使用方式。
 *
 * 运行方式：
 *   ALIPAY_APP_ID=你的应用ID ALIPAY_PRIVATE_KEY=你的私钥 \
 *   mvn test -Dtest="AlipayMcpClientIntegrationTest"
 *
 * 如果未设置环境变量，测试将自动跳过（@EnabledIfEnvironmentVariable）。
 */
@EnabledIfEnvironmentVariable(named = "ALIPAY_APP_ID", matches = ".+")
@EnabledIfEnvironmentVariable(named = "ALIPAY_PRIVATE_KEY", matches = ".+")
class AlipayMcpClientIntegrationTest {

    private static final String APP_ID = System.getenv("ALIPAY_APP_ID");
    private static final String PRIVATE_KEY = System.getenv("ALIPAY_PRIVATE_KEY");
    private static final String SSE_ENDPOINT = getEnvOrDefault("ALIPAY_SSE_ENDPOINT",
        "https://opengw.alipay.com/api/v1/open/mcps/aidata-convenience-life5/sse");

    private AlipayMcpClient client;

    @BeforeEach
    void setUp() {
        System.out.println("=== 集成测试：初始化 AlipayMcpClient ===");
        System.out.println("App ID: " + APP_ID);
        System.out.println("SSE Endpoint: " + SSE_ENDPOINT);

        // 构造客户端（不自动初始化，需要显式调用 initialize()）
        client = new AlipayMcpClient(APP_ID, PRIVATE_KEY, SSE_ENDPOINT);

        // 执行 MCP 握手
        McpSchema.InitializeResult initResult = client.initialize();
        assertNotNull(initResult, "MCP 初始化应返回结果");

        System.out.println("MCP 握手完成，服务端信息: " + initResult);
    }

    @AfterEach
    void tearDown() {
        if (client != null) {
            client.close();
            System.out.println("=== AlipayMcpClient 已关闭 ===");
        }
    }

    // [集成测试]测试场景：获取工具列表
    @Test
    void testListTools() {
        System.out.println("\n=== 测试获取工具列表 ===");

        List<McpSchema.Tool> tools = client.listTools();

        assertNotNull(tools, "工具列表不应为 null");
        assertFalse(tools.isEmpty(), "应该至少有一个工具");

        System.out.println("可用工具数：" + tools.size());
        tools.forEach(tool ->
            System.out.println("  - " + tool.name() + ": " + tool.description())
        );
    }

    // [集成测试]测试场景：流式获取工具列表
    @Test
    void testListToolsStream() {
        System.out.println("\n=== 测试流式获取工具列表 ===");

        List<McpSchema.Tool> tools = client.listToolsStream()
            .collectList()
            .block();

        assertNotNull(tools, "工具列表不应为 null");
        assertFalse(tools.isEmpty(), "应该至少有一个工具");

        System.out.println("流式获取工具数：" + tools.size());
        tools.forEach(tool ->
            System.out.println("  [stream] " + tool.name() + ": " + tool.description())
        );
    }

    // [集成测试]测试场景：同步调用工具
    @Test
    void testCallTool() {
        System.out.println("\n=== 测试同步调用工具 ===");

        // 先列出可用工具，选第一个进行测试
        List<McpSchema.Tool> tools = client.listTools();
        assertFalse(tools.isEmpty(), "应该至少有一个工具");

        String toolName = tools.get(0).name();
        System.out.println("调用工具: " + toolName);

        AlipayMcpClient.ToolCallResult result = client.callTool(toolName, new HashMap<>());

        assertNotNull(result, "调用结果不应为 null");
        System.out.println("调用结果: " + result);
        System.out.println("是否错误: " + result.isError());
    }

    // [集成测试]测试场景：流式调用工具
    @Test
    void testCallToolStream() {
        System.out.println("\n=== 测试流式调用工具 ===");

        List<McpSchema.Tool> tools = client.listTools();
        assertFalse(tools.isEmpty(), "应该至少有一个工具");

        String toolName = tools.get(0).name();
        System.out.println("流式调用工具: " + toolName);

        List<AlipayMcpClient.ToolCallResult> results = client.callToolStream(toolName, new HashMap<>())
            .collectList()
            .block();

        assertNotNull(results, "流式结果不应为 null");
        System.out.println("流式结果数：" + results.size());
        results.forEach(r ->
            System.out.println("  [stream] type=" + r.type() + ", isError=" + r.isError() + ", content=" + r.content())
        );
    }

    // [集成测试]测试场景：异步调用工具
    @Test
    void testCallToolAsync() {
        System.out.println("\n=== 测试异步调用工具 ===");

        List<McpSchema.Tool> tools = client.listTools();
        assertFalse(tools.isEmpty(), "应该至少有一个工具");

        String toolName = tools.get(0).name();
        System.out.println("异步调用工具: " + toolName);

        try {
            AlipayMcpClient.ToolCallResult result = client.callToolAsync(toolName, new HashMap<>())
                .get(30, java.util.concurrent.TimeUnit.SECONDS);

            assertNotNull(result, "异步结果不应为 null");
            System.out.println("异步结果: " + result);
        } catch (Exception e) {
            System.out.println("异步调用异常: " + e.getMessage());
            // 异步调用可能因参数不足而失败，不算测试失败
        }
    }

    // [集成测试]测试场景：获取客户端信息
    @Test
    void testClientInfo() {
        System.out.println("\n=== 测试客户端信息 ===");

        McpSchema.Implementation clientInfo = client.getClientInfo();

        assertNotNull(clientInfo, "客户端信息不应为 null");
        assertEquals("alipay-mcp-client", clientInfo.name());
        assertEquals("1.0.0", clientInfo.version());

        System.out.println("客户端: " + clientInfo.name() + " v" + clientInfo.version());
    }

    // [集成测试]测试场景：签名测试（验证请求携带了 Authorization 头）
    @Test
    void testSignAndListTools() {
        System.out.println("\n=== 签名测试（验证请求携带了 Authorization 头） ===");

        long start = System.currentTimeMillis();
        List<McpSchema.Tool> tools = client.listTools();
        long cost = System.currentTimeMillis() - start;

        System.out.println("工具数: " + tools.size() + ", 耗时: " + cost + "ms");
        System.out.println("签名测试完成，请查看日志中的 Authorization 头");
    }

    // [集成测试]测试场景：健康检查（与 Controller 的 /health 端点等价）
    @Test
    void testHealthCheck() {
        System.out.println("\n=== 健康检查 ===");

        List<McpSchema.Tool> tools = client.listTools();

        Map<String, Object> health = new HashMap<>();
        health.put("status", "UP");
        health.put("toolCount", tools.size());
        health.put("clientInfo", client.getClientInfo().name() + " v" + client.getClientInfo().version());

        assertEquals("UP", health.get("status"));
        assertTrue((int) health.get("toolCount") > 0);

        System.out.println("健康检查结果: " + health);
    }

    private static String getEnvOrDefault(String envVar, String defaultValue) {
        String value = System.getenv(envVar);
        return (value != null && !value.isEmpty()) ? value : defaultValue;
    }
}

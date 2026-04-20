package com.alipay.mcp.springai.integration;

import com.alipay.mcp.springai.client.AlipayMcpClient;
import com.alipay.mcp.springai.util.PrivateKeyLoader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.security.PrivateKey;
import java.time.Duration;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * AlipayMcpClient 集成测试
 *
 * 本测试需要真实的环境变量配置才能运行：
 * - ALIPAY_APP_ID: 支付宝应用 ID
 * - ALIPAY_PRIVATE_KEY: 应用私钥（PKCS8 格式）
 * - ALIPAY_SSE_ENDPOINT: MCP SSE 端点
 *
 * 参考 alipay-mcp-sdk 中的 McpClientDemo
 */
@EnabledIfEnvironmentVariable(named = "ALIPAY_APP_ID", matches = ".+")
class AlipayMcpClientIntegrationTest {

    private static final String APP_ID = System.getenv("ALIPAY_APP_ID");
    private static final String PRIVATE_KEY = System.getenv("ALIPAY_PRIVATE_KEY");
    private static final String SSE_ENDPOINT = System.getenv("ALIPAY_SSE_ENDPOINT");

    private AlipayMcpClient client;

    @BeforeEach
    void setUp() {
        assumeEnvironmentConfigured();

        PrivateKey privateKey = PrivateKeyLoader.loadFromString(PRIVATE_KEY);
        client = new AlipayMcpClient(APP_ID, privateKey, SSE_ENDPOINT);

        System.out.println("=== 初始化 AlipayMcpClient ===");
        System.out.println("App ID: " + APP_ID);
        System.out.println("SSE Endpoint: " + SSE_ENDPOINT);
    }

    @Test
    void testListTools() {
        System.out.println("\n=== 测试获取工具列表 ===");

        var tools = client.listTools();

        assertNotNull(tools);
        System.out.println("可用工具数：" + tools.size());
        tools.forEach(tool -> {
            System.out.println("  - " + tool.name() + ": " + tool.description());
        });

        assertFalse(tools.isEmpty(), "应该至少有一个工具");
    }

    @Test
    void testListToolsStream() {
        System.out.println("\n=== 测试流式获取工具列表 ===");

        Flux<io.modelcontextprotocol.spec.McpSchema.Tool> toolsFlux = client.listToolsStream();

        StepVerifier.create(toolsFlux)
            .assertNext(tool -> {
                assertNotNull(tool.name());
                System.out.println("  收到工具: " + tool.name());
            })
            .thenConsumeWhile(tool -> {
                System.out.println("  收到工具: " + tool.name());
                return true;
            })
            .verifyComplete();
    }

    @Test
    void testCallTool() {
        System.out.println("\n=== 测试同步调用工具 ===");

        // 获取第一个可用工具
        var tools = client.listTools();
        if (tools.isEmpty()) {
            System.out.println("没有可用工具，跳过测试");
            return;
        }

        String toolName = tools.get(0).name();
        System.out.println("调用工具: " + toolName);

        AlipayMcpClient.ToolCallResult result = client.callTool(toolName, Map.of());

        assertNotNull(result);
        System.out.println("调用结果: " + result);

        assertFalse(result.isError(), "工具调用不应该返回错误");
    }

    @Test
    void testCallToolStream() {
        System.out.println("\n=== 测试流式调用工具 ===");

        // 获取第一个可用工具
        var tools = client.listTools();
        if (tools.isEmpty()) {
            System.out.println("没有可用工具，跳过测试");
            return;
        }

        String toolName = tools.get(0).name();
        System.out.println("流式调用工具: " + toolName);

        Flux<AlipayMcpClient.ToolCallResult> resultFlux = client.callToolStream(toolName, Map.of());

        StepVerifier.create(resultFlux)
            .assertNext(result -> {
                assertNotNull(result.content());
                System.out.println("  收到结果: " + result.content());
            })
            .thenConsumeWhile(result -> {
                System.out.println("  收到结果: " + result.content());
                return true;
            })
            .verifyComplete();
    }

    @Test
    void testClientInfo() {
        System.out.println("\n=== 测试客户端信息 ===");

        var clientInfo = client.getClientInfo();

        assertNotNull(clientInfo);
        assertEquals("alipay-mcp-client", clientInfo.name());
        assertEquals("1.0.0", clientInfo.version());

        System.out.println("客户端: " + clientInfo.name() + " v" + clientInfo.version());
    }

    /**
     * 检查环境变量是否配置
     */
    private void assumeEnvironmentConfigured() {
        if (APP_ID == null || APP_ID.isEmpty()) {
            System.out.println("跳过测试：未设置环境变量 ALIPAY_APP_ID");
            org.junit.jupiter.api.Assumptions.assumeTrue(false);
        }
        if (PRIVATE_KEY == null || PRIVATE_KEY.isEmpty()) {
            System.out.println("跳过测试：未设置环境变量 ALIPAY_PRIVATE_KEY");
            org.junit.jupiter.api.Assumptions.assumeTrue(false);
        }
        if (SSE_ENDPOINT == null || SSE_ENDPOINT.isEmpty()) {
            System.out.println("跳过测试：未设置环境变量 ALIPAY_SSE_ENDPOINT");
            org.junit.jupiter.api.Assumptions.assumeTrue(false);
        }
    }
}

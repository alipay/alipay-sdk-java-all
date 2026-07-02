package com.alipay.mcp;

import com.alipay.mcp.builder.McpClientBuilder;
import com.alipay.mcp.protocol.Tool;
import com.alipay.mcp.protocol.ToolCallResult;
import com.alipay.mcp.transport.McpEventListener;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MCP 客户端集成测试
 * 使用 daniel-openbizmock-test-url5 (签名模式) 和 daniel-openbizmock-test-url7 (API Key 模式)
 */
public class McpIntegrationTest {

    private static final Logger log = LoggerFactory.getLogger(McpIntegrationTest.class);

    // ========== 签名模式配置 ==========
    private static final String APP_ID = "2021006142670009";
    private static final String PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCls8kutf8uZeCsngmQXq6FFHoBI4oHH43rY3Wm89muoLn+vxRwxhv+CRfzjrfqFlHfEROSnqGqt6BTSOCWe0l3w61Pl/oAeyBQiCq1MzK3b3hXxTlcpaDedcbOD1yr+LYPFkTRRcF/YXdTPMveOiEW7xVX6QsL39j/4BF3tLoU7yhBLJgOeTfs2SbOch4Qqa1geizHzraoNb0NhCQ3idGU/iEcjIDf6edb5WkZ+AbcNyb+FMY+bwolg9rDLtbjjhVySv5naNDpSOquP/tyglNzWYItNicM8rV6MVLAcHJJgEo5Qm+xtKXm7JP1+tvYy1Zla58FBRBG8LBn/AOwWlq3AgMBAAECggEAUgxi6tk9YPkbNf4PGEh5u/W2r8esOfi66jpWcHPAbwKw9l4hPfIqvDA+huA9WxDwOzcWbPxVatX/8h1c78ZeS4o9z/Kd3Q0apCW4l/6g90mf2j4TODffHyhMZ44dwh2l8HSDYOhcdrmJP1MUU5aO+e8qr1v6l0ehCJonrBF2LpSqghxycA7zz53qNtHu9pOsydC8CMAPbHXbCHW6ahCNgYcCdzd1r46sMrzSTnfd186H75PAzd/rXK2f1hf4ytTGjZepBr+eRVsh/lMl5bcTIgZxqTom5Gk0G/6gFFPuNIRsR9SU00UC2kpwVSli3yySKocBQlqLP29XbutGpPVXuQKBgQDz7ZLM33O4BU539Z3s2HySDCPg3wAg1Q899zc+Gt/co+Z6F4aJ03nVsUuOomXPfFZD6QuseSBLIrSH7MdDHcxrXuXGb5IG2V9I/RHffSBJ8evdb9Q+nJvF0vGnNKszMBNFClHktP+pqpPuRgUEBbTTGPpgxiIPvLbdeoOxqnbTqwKBgQCt5yNEjJRsH2mZP98Wo1Mw6tHuZkETBCdMFVsJYGnO7szyBE5Wer6IegWA+2BLHWuNAaW02h7X50Mgmo/BgWlEYtF83aakyabRhrqxrnRvX4J8/ZlRbTkGiYaXCRGI93ep8nsWyz7RV4NYLtCRcapawdemSdaEat7+PjjjznZJJQKBgE8EkN+JK0VbgrXdfREyd/gfsqev1azNGCjsopqdvhMNjSXT5SNUvEz7KAzGktCJ6LALGFsAyfNNBMpba5lUV9oYXbrQfa92TyWnxVhugj0x/0Q2a7z0oomM8fdGWoc0damR1EGQWJmvxkgTqqBI8PDJUKJ0zKfobByHCY5OODwNAoGAKrKUkzEdBAsWZ10qTimdtGYDU1Bh6+RaLbEUoBG/COLTCR0LiuoqO+IR1eBifS7lCEL+R5BCgGo0rh2k7DL1AKhunQTi9JTaU5mL3zJhPjMqG7w8V6TEmplLpWvBlWqFRAHYPPl8G/QruIwOA5fv5savRxHcDLkctTnbx/saSc0CgYAq71duYrWaHkzKH34Ekrna36riCe6O4tNSQUB8cyghSFcxz/KoZAfNTxno3n2m0zAIfgeXLyHG6XcjCVkeOjVmStVvAvqnxpbmWQeR2vdXhZih9IKYjQez5zJizc1cJn9aFjG3gSFGW3quCUMh01GjgAy5UsTqTLPTHV/oQmLB6w==";
    private static final String SIGN_SERVER_NAME = "daniel-openbizmock-test-url5";
    private static final String BASE_URL = "https://opengw.alipay.com";

    // ========== API Key 模式配置 ==========
    private static final String API_KEY = "sk-oagw-5582cfcf0a4628d56bd7b9bd25257d96";
    private static final String API_KEY_SERVER_NAME = "daniel-openbizmock-test-url7";

    // ========== 签名模式测试 ==========

    /**
     * 测试 SimpleMcpClient - SSE 签名模式
     */
    @Test
    public void testSimpleMcpClientSignSSE() {
        log.info("=== 测试 SimpleMcpClient SSE 签名模式 ===");
        log.info("Server: {}", SIGN_SERVER_NAME);

        SimpleMcpClient client = SimpleMcpClient.create()
                .appId(APP_ID)
                .privateKey(PRIVATE_KEY)
                .mcpName(SIGN_SERVER_NAME)
                .transportMode("sse")
                .serverUrl(BASE_URL)
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

            log.info("=== 签名模式 SSE 测试通过 ===");

        } catch (McpException e) {
            log.error("测试失败：{}", e.getMessage(), e);
            throw new RuntimeException("测试失败", e);
        } finally {
            client.close();
        }
    }

    /**
     * 测试 SimpleMcpClient - Streamable HTTP 签名模式
     */
    @Test
    public void testSimpleMcpClientSignStreamable() {
        log.info("=== 测试 SimpleMcpClient Streamable HTTP 签名模式 ===");
        log.info("Server: {}", SIGN_SERVER_NAME);

        SimpleMcpClient client = SimpleMcpClient.create()
                .appId(APP_ID)
                .privateKey(PRIVATE_KEY)
                .mcpName(SIGN_SERVER_NAME)
                .transportMode("streamable")
                .serverUrl(BASE_URL)
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

            log.info("=== 签名模式 Streamable 测试通过 ===");

        } catch (McpException e) {
            log.error("测试失败：{}", e.getMessage(), e);
            throw new RuntimeException("测试失败", e);
        } finally {
            client.close();
        }
    }

    // ========== API Key 模式测试 ==========

    /**
     * 测试 SimpleMcpClient - SSE API Key 模式
     */
    @Test
    public void testSimpleMcpClientApiKeySSE() {
        log.info("=== 测试 SimpleMcpClient SSE API Key 模式 ===");
        log.info("Server: {}", API_KEY_SERVER_NAME);

        SimpleMcpClient client = SimpleMcpClient.create()
                .apiKey(API_KEY)
                .mcpName(API_KEY_SERVER_NAME)
                .transportMode("sse")
                .serverUrl(BASE_URL)
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

            log.info("=== API Key 模式 SSE 测试通过 ===");

        } catch (McpException e) {
            log.error("测试失败：{}", e.getMessage(), e);
            throw new RuntimeException("测试失败", e);
        } finally {
            client.close();
        }
    }

    /**
     * 测试 SimpleMcpClient - Streamable HTTP API Key 模式
     */
    @Test
    public void testSimpleMcpClientApiKeyStreamable() {
        log.info("=== 测试 SimpleMcpClient Streamable HTTP API Key 模式 ===");
        log.info("Server: {}", API_KEY_SERVER_NAME);

        SimpleMcpClient client = SimpleMcpClient.create()
                .apiKey(API_KEY)
                .mcpName(API_KEY_SERVER_NAME)
                .transportMode("streamable")
                .serverUrl(BASE_URL)
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

            log.info("=== API Key 模式 Streamable 测试通过 ===");

        } catch (McpException e) {
            log.error("测试失败：{}", e.getMessage(), e);
            throw new RuntimeException("测试失败", e);
        } finally {
            client.close();
        }
    }

    // ========== McpClientBuilder 测试 ==========

    /**
     * 测试 McpClientBuilder - SSE 签名模式
     */
    @Test
    public void testMcpClientBuilderSignSSE() {
        log.info("=== 测试 McpClientBuilder SSE 签名模式 ===");
        log.info("Server: {}", SIGN_SERVER_NAME);

        McpClient client = new McpClientBuilder()
                .appId(APP_ID)
                .privateKey(PRIVATE_KEY)
                .mcpName(SIGN_SERVER_NAME)
                .transportMode("sse")
                .serverUrl(BASE_URL)
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

            log.info("=== McpClientBuilder 签名模式 SSE 测试通过 ===");

        } catch (McpException e) {
            log.error("测试失败：{}", e.getMessage(), e);
            throw new RuntimeException("测试失败", e);
        } finally {
            client.close();
        }
    }

    /**
     * 测试 McpClientBuilder - API Key 模式
     */
    @Test
    public void testMcpClientBuilderApiKey() {
        log.info("=== 测试 McpClientBuilder API Key 模式 ===");
        log.info("Server: {}", API_KEY_SERVER_NAME);

        McpClient client = new McpClientBuilder()
                .apiKey(API_KEY)
                .mcpName(API_KEY_SERVER_NAME)
                .transportMode("sse")
                .serverUrl(BASE_URL)
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

            log.info("=== McpClientBuilder API Key 模式测试通过 ===");

        } catch (McpException e) {
            log.error("测试失败：{}", e.getMessage(), e);
            throw new RuntimeException("测试失败", e);
        } finally {
            client.close();
        }
    }
}
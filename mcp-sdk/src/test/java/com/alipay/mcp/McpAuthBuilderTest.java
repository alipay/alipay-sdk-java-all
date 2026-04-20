package com.alipay.mcp;

import com.alipay.mcp.auth.McpAuthBuilder;
import com.alipay.v3.ApiException;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * McpAuthBuilder 单元测试
 *
 * 注意：本测试需要有效的 RSA 私钥才能通过。
 * 请设置环境变量 MCP_PRIVATE_KEY 或直接修改 TEST_PRIVATE_KEY 字段。
 * 可以使用以下命令生成测试私钥：
 * openssl genrsa 2048 | openssl pkcs8 -topk8 -nocrypt -outform PEM
 */
public class McpAuthBuilderTest {

    // 测试用私钥 - 从环境变量读取
    private static final String TEST_PRIVATE_KEY = System.getenv("MCP_PRIVATE_KEY");

    @Test
    public void testBuildAuthorization() {
        if (TEST_PRIVATE_KEY == null || TEST_PRIVATE_KEY.isEmpty()) {
            System.out.println("跳过测试：请设置环境变量 MCP_PRIVATE_KEY");
            return;
        }

        try {
            McpAuthBuilder authBuilder = new McpAuthBuilder("test-app-id", TEST_PRIVATE_KEY);

            String method = "GET";
            String uri = "/api/v1/test";
            String body = "";

            String authorization = authBuilder.buildAuthorization(method, uri, body);

            assertNotNull(authorization);
            assertTrue(authorization.startsWith("ALIPAY-SHA256withRSA"));
            assertTrue(authorization.contains("app_id=test-app-id"));
            assertTrue(authorization.contains("timestamp="));
            assertTrue(authorization.contains("nonce="));
            assertTrue(authorization.contains(",sign="));
        } catch (ApiException e) {
            fail("签名失败：" + e.getMessage());
        }
    }

    @Test
    public void testBuildHeaders() {
        if (TEST_PRIVATE_KEY == null || TEST_PRIVATE_KEY.isEmpty()) {
            System.out.println("跳过测试：请设置环境变量 MCP_PRIVATE_KEY");
            return;
        }

        try {
            McpAuthBuilder authBuilder = new McpAuthBuilder("test-app-id", TEST_PRIVATE_KEY);

            Map<String, String> headers = authBuilder.buildHeaders("POST", "/api/v1/test", "{\"key\":\"value\"}");

            assertNotNull(headers);
            assertTrue(headers.containsKey("Authorization"));
            String authorization = headers.get("Authorization");
            assertTrue(authorization.contains("sign="));
        } catch (ApiException e) {
            fail("签名失败：" + e.getMessage());
        }
    }

    @Test
    public void testBuildHeadersWithDifferentMethods() {
        if (TEST_PRIVATE_KEY == null || TEST_PRIVATE_KEY.isEmpty()) {
            System.out.println("跳过测试：请设置环境变量 MCP_PRIVATE_KEY");
            return;
        }

        try {
            McpAuthBuilder authBuilder = new McpAuthBuilder("test-app-id", TEST_PRIVATE_KEY);

            // GET 请求
            Map<String, String> getHeaders = authBuilder.buildHeaders("GET", "/api/v1/test", "");
            assertNotNull(getHeaders);
            assertTrue(getHeaders.containsKey("Authorization"));

            // POST 请求
            Map<String, String> postHeaders = authBuilder.buildHeaders("POST", "/api/v1/test", "{\"data\":\"test\"}");
            assertNotNull(postHeaders);
            assertTrue(postHeaders.containsKey("Authorization"));

            // PUT 请求
            Map<String, String> putHeaders = authBuilder.buildHeaders("PUT", "/api/v1/test", "{\"data\":\"updated\"}");
            assertNotNull(putHeaders);
            assertTrue(putHeaders.containsKey("Authorization"));
        } catch (ApiException e) {
            fail("签名失败：" + e.getMessage());
        }
    }
}
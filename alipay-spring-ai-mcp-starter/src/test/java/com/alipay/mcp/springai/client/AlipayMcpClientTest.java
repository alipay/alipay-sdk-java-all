package com.alipay.mcp.springai.client;

import io.modelcontextprotocol.spec.McpSchema;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * AlipayMcpClient 单元测试
 *
 * 注意：构造函数不再自动调用 initialize()，因此纯构造测试无需连接真实 MCP 服务器。
 * 需要真实服务器的集成测试请参见 AlipayMcpClientIntegrationTest。
 */
class AlipayMcpClientTest {

    /**
     * 测试私钥（模拟字符串，用于构造参数）
     * 构造函数不再调用 initialize()，因此不需要有效的 RSA 密钥
     */
    private static final String TEST_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\n" +
        "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDORnQ5jZnurOS9" +
        "U6o26J1ZH5wWSsaRHERQ3U3EXBI3iRnkHJGFjg1RK6OYswOnYEtzJKripFxaq6mz" +
        "WS75qnmG4Ny49MyIVT1zL7rDWtMP9DYaGAVTrccCyZe8IjbQR0TW1zNbcj4ue+jY" +
        "qkv5+/sHX0f/EtKOgcnTb7bXrYL+co7s0fFTQfdc6HbNisoX5ZdtjG1Y6166GDBT" +
        "ndxE8/95GBlBNkT5e8rF84OvATbATBCmuOAA4XcGfeRVUFjPPgwIjbIgpcprlmTZ" +
        "MWjVP7OFVAdC9HkNKsWgbinGigvBb/FCIrGx+10dCghRvegBH7Ua/LsIoFjgvyf1" +
        "zbbqwt0dAgMBAAECggEAb97H89q3DDmaSI/SdbsMcyRwi6p8LIDvEAglwAPLIXFq" +
        "qEtSJOOYl1gafps/tQvFf6n4P7iyGb6V553Lmz34cM0NCAZD0wCfthPBr2dXpoRk" +
        "vxwd73cEwp9Aepj3r1ennvjRcpvv21f6PV+Gmwos55+mNVEo/n6nTdN9j1UcARB4" +
        "k1rpK66YTwTUn1dwFBp4JMyUZy2LzbnpF4qa0sRvrwhUlgjKrJGXzaW26y0chI02" +
        "SEx/k2AQ78wd+nbhYABYU/xTVioZiYoyCGM5e3ehDXsELs5Ks0JqD/MZD5JhS9P6" +
        "KFOLgVsfz7UVf5EVHiDseLwKEXWLpJqQJ6qOogkmYQKBgQDyeYHPYGzOFyvov5FQ" +
        "C6VXYdXj4uO+E68aIaXyvnczbqOTYsWnw6gFDFcnNSMcVcfMhwkfLOKsWUQ/cbgn" +
        "Di6pVrkjHhSIwude2K1RvHWQ7wzY8weT1CkORPWrR70V2MS2dv8qdRWZ9g6ic0Qu" +
        "JW/7ElngbDpdexGMfS1NOaANyQKBgQDZyAacynbO1w3Wk2TdF+S/TjkrBA6fEELZ" +
        "hmCQAmt250VIwLDP/ignmUKrzGa81fsg50fqQnVQjt5cMLPYK3EEHwlpE0MvNYmF" +
        "PEe/6PFIiYWpC2KiAmVThu7C6RLb5b5hEwDMOvT0SbKa0beTnbJkeRfWsyR9BfqP" +
        "qFFbaZ4ZtwKBgBi/zyQqTb1LUm2VwmhSCdwgz8BseOmF4dmKq90FNXm0ldM6gC2V" +
        "nA8ArGnuW8C3rdnhIzJF3L4xQbWtM0Jh/3EZOE9pyqM28FWLd/9axq7EIWb9La1e" +
        "EfLZIlMnT6GUFo4W8GF0Iz+PeO8Pxtjcm5R0XO2kgDSkqWJuo1B5NhAoGBAJmYR5" +
        "KJsO2WcDJFJhXv4K9R4NqK5U6V5DéjàR3fD0F5Yh0R/5R2cqZ0t0bh8VK4BqLT1h" +
        "8x7O5l1IEh6eDe9CHD6OFfULiAGp3/OnT5JqkN3lM0V3L5S5J7D5T8pJh7NbK5f3" +
        "M8I1h1BG6Ra3BQ0aN8RO1cq0EfSZCAoGBAN9fP7VeHu1fM3ph9LbK7Rp0Y6sJ4Y1" +
        "htXZPOs9VwJ2LN7F0eR9u3e5Sh2IXF7Ly1W8iN2h1D6t1OqfX6A4R5E1NBH2N0IV" +
        "6JP8M3O5T8V1VFAke5U4Px0B9c0uY1V7T1D2R4H5X6O7U8F9G0H1I2J3K4L5M6N7" +
        "O8P9Q0R1S2T3U4V5W6X7Y8Z9" +
        "\n-----END PRIVATE KEY-----";

    private static final String TEST_APP_ID = "test-app-id";

    // [单测用例]测试场景：客户端构造（不连接真实服务器）
    @Test
    void testClientConstruction() {
        System.out.println("=== 测试客户端构造（不初始化） ===");

        String mockEndpoint = "http://localhost:9999/sse";

        AlipayMcpClient client = new AlipayMcpClient(TEST_APP_ID, TEST_PRIVATE_KEY, mockEndpoint);

        assertNotNull(client);
        assertEquals("test-app-id", getAppIdFromClient(client));

        System.out.println("客户端构造成功");

        client.close();
    }

    // [单测用例]测试场景：获取客户端信息（不连接真实服务器）
    @Test
    void testGetClientInfo() {
        System.out.println("=== 测试获取客户端信息（不初始化） ===");

        String mockEndpoint = "http://localhost:9999/sse";
        AlipayMcpClient client = new AlipayMcpClient(TEST_APP_ID, TEST_PRIVATE_KEY, mockEndpoint);

        // getClientInfo() 不需要 MCP 连接
        McpSchema.Implementation clientInfo = client.getClientInfo();

        assertNotNull(clientInfo);
        assertEquals("alipay-mcp-client", clientInfo.name());
        assertEquals("1.0.0", clientInfo.version());

        System.out.println("客户端信息: " + clientInfo.name() + " v" + clientInfo.version());

        client.close();
    }

    // [单测用例]测试场景：ToolCallResult record 的构造和访问
    @Test
    void testToolCallResultRecord() {
        System.out.println("=== 测试 ToolCallResult 记录 ===");

        // 测试正常结果
        AlipayMcpClient.ToolCallResult result1 = new AlipayMcpClient.ToolCallResult(
            "success data", "text", false);
        assertEquals("success data", result1.content());
        assertEquals("text", result1.type());
        assertFalse(result1.isError());

        // 测试错误结果
        AlipayMcpClient.ToolCallResult result2 = new AlipayMcpClient.ToolCallResult(
            "error message", "text", true);
        assertTrue(result2.isError());

        // 测试简化构造
        AlipayMcpClient.ToolCallResult result3 = new AlipayMcpClient.ToolCallResult(
            "simple data", "text");
        assertFalse(result3.isError());

        System.out.println("ToolCallResult 测试通过");
    }

    // [单测用例]测试场景：ToolCallResult toString 方法
    @Test
    void testToolCallResultToString() {
        System.out.println("=== 测试 ToolCallResult toString ===");

        AlipayMcpClient.ToolCallResult result = new AlipayMcpClient.ToolCallResult(
            "test content", "text", false);

        String str = result.toString();
        assertTrue(str.contains("test content"));
        assertTrue(str.contains("text"));
        assertTrue(str.contains("isError=false"));

        System.out.println("toString: " + str);
    }

    // [单测用例]测试场景：AutoCloseable 接口（不初始化）
    @Test
    void testClientAutoCloseable() {
        System.out.println("=== 测试 AutoCloseable（不初始化） ===");

        String mockEndpoint = "http://localhost:9999/sse";

        try (AlipayMcpClient client = new AlipayMcpClient(TEST_APP_ID, TEST_PRIVATE_KEY, mockEndpoint)) {
            assertNotNull(client);
            System.out.println("客户端创建成功，将在 try 结束时自动关闭");
        }

        System.out.println("客户端已关闭");
    }

    // [单测用例]测试场景：传输模式枚举
    @Test
    void testTransportModeEnum() {
        System.out.println("=== 测试 TransportMode 枚举 ===");

        assertEquals(AlipayMcpClient.TransportMode.SSE, AlipayMcpClient.TransportMode.valueOf("SSE"));
        assertEquals(AlipayMcpClient.TransportMode.STREAMABLE, AlipayMcpClient.TransportMode.valueOf("STREAMABLE"));
        assertEquals(2, AlipayMcpClient.TransportMode.values().length);

        System.out.println("TransportMode 枚举测试通过");
    }

    /**
     * 通过反射获取 appId（仅用于测试）
     */
    private String getAppIdFromClient(AlipayMcpClient client) {
        try {
            java.lang.reflect.Field field = AlipayMcpClient.class.getDeclaredField("appId");
            field.setAccessible(true);
            return (String) field.get(client);
        } catch (Exception e) {
            return null;
        }
    }
}

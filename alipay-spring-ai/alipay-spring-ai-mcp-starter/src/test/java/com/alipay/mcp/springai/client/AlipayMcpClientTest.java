package com.alipay.mcp.springai.client;

import com.alipay.mcp.springai.util.PrivateKeyLoader;
import io.modelcontextprotocol.spec.McpSchema;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.security.PrivateKey;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static org.junit.jupiter.api.Assertions.*;

/**
 * AlipayMcpClient 单元测试
 *
 * 注意：本测试需要有效的 SSE 端点才能完全通过。
 * 在没有真实端点的情况下，测试主要验证构造和配置。
 */
class AlipayMcpClientTest {

    /**
     * 测试私钥（与 alipay-mcp-sdk 保持一致）
     */
    private static final String TEST_PRIVATE_KEY = "-----BEGIN PRIVATE KEY----- " +
        "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDORnQ5jZnurOS9U6o26J1ZH5wWSsaRHERQ3U3EXBI3iRnkHJGFjg1RK6OYswOnYEtzJKripFxaq6mzWS75qnmG4Ny49MyIVT1zL7rDWtMP9DYaGAVTrccCyZe8IjbQR0TW1zNbcj4ue+jYqkv5+/sHX0f/EtKOgcnTb7bXrYL+co7s0fFTQfdc6HbNisoX5ZdtjG1Y6166GDBTndxE8/95GBlBNkT5e8rF84OvATbATBCmuOAA4XcGfeRVUFjPPgwIjbIgpcprlmTZMWjVP7OFVAdC9HkNKsWgbinGigvBb/FCIrGx+10dCghRvegBH7Ua/LsIoFjgvyf1zbbqwt0dAgMBAAECggEAb97H89q3DDmaSI/SdbsMcyRwi6p8LIDvEAglwAPLIXFqqEtSJOOYl1gafps/tQvFf6n4P7iyGb6V553Lmz34cM0NCAZD0wCfthPBr2dXpoRkvxwd73cEwp9Aepj3r1ennvjRcpvv21f6PV+Gmwos55+mNVEo/n6nTdN9j1UcARB4k1rpK66YTwTUn1dwFBp4JMyUZy2LzbnpF4qa0sRvrwhUlgjKrJGXzaW26y0chI02SEx/k2AQ78wd+nbhYABYU/xTVioZiYoyCGM5e3ehDXsELs5Ks0JqD/MZD5JhS9P6KFOLgVsfz7UVf5EVHiDseLwKEXWLpJqQJ6qOogkmYQKBgQDyeYHPYGzOFyvov5FQC6VXYdXj4uO+E68aIaXyvnczbqOTYsWnw6gFDFcnNSMcVcfMhwkfLOKsWUQ/cbgnDi6pVrkjHhSIwude2K1RvHWQ7wzY8weT1CkORPWrR70V2MS2dv8qdRWZ9g6ic0QuJW/7ElngbDpdexGMfS1NOaANyQKBgQDZyAacynbO1w3Wk2TdF+S/TjkrBA6fEELZhmCQAmt250VIwLDP/ignmUKrzGa81fsF2M7Rlt6wDpppcTgZY4emtozreQZFaf6i4FyqGIPdBFFpM5R3VFqbkxDirYjlwl74H+SsQnmWC0DDnq+Cee0PKb4Ya2jRr6lEEuoUDKcutQKBgQDeh2j82y/ADD/+ASHpZma9xUo5NJdycDo5LzxPhUF8cEOrFfD0QHpI98RcdUXd0VPmft9+PwFgzyP1XfZ10Ww9eRu8APUzdjxFLXITG3SCKQGPcas4nnN3Zw5XvSTpkeEm3Brd6kqC2/EeYc7m0vDsaTEW5/zAohu+5XrX7tTXEQKBgQCmnrgYa3rco4KN4fUwhuBXUWTBuXfqUMmknX/xjjhkH2tNz0c3yu8z5Lkysc8EuP42KfuKNVCpCHMxKxNNsW2OqmpEmjKnFwJf4SJkbR8uEOisgW8coSg1kR5BH532k3CPi+8rsCxQFMn3IMiNHfW2PSyYiE0I6MmrMIFw14FtZQKBgHx08LIwK4Fk6vfsaxPpmD8DLPL76EbDOyNnNUkp6q2UmG5ZoGb5JEHEk52HnAdpbQ45aIE5jEVy54ubqjSkID8/Bxbp5vIwVpPr8D7boj6Xz99uy5qjiHCIfDXXlqb+yE863SQykQxzSkNj6TPCBMM2PYHVMRS3YtIk2UjfdVI5 " +
        "-----END PRIVATE KEY-----";

    private static final String TEST_APP_ID = "test-app-id";

    private PrivateKey privateKey;

    @BeforeEach
    void setUp() {
        privateKey = PrivateKeyLoader.loadFromString(TEST_PRIVATE_KEY);
    }

    @Test
    void testClientConstruction() {
        System.out.println("=== 测试客户端构造 ===");

        // 注意：这里使用一个无效的端点，仅测试构造
        String mockEndpoint = "http://localhost:9999/sse";

        AlipayMcpClient client = new AlipayMcpClient(TEST_APP_ID, privateKey, mockEndpoint);

        assertNotNull(client);
        assertEquals("test-app-id", getAppIdFromClient(client));

        System.out.println("客户端构造成功");

        client.close();
    }

    @Test
    void testGetClientInfo() {
        System.out.println("=== 测试获取客户端信息 ===");

        String mockEndpoint = "http://localhost:9999/sse";
        AlipayMcpClient client = new AlipayMcpClient(TEST_APP_ID, privateKey, mockEndpoint);

        McpSchema.Implementation clientInfo = client.getClientInfo();

        assertNotNull(clientInfo);
        assertEquals("alipay-mcp-client", clientInfo.name());
        assertEquals("1.0.0", clientInfo.version());

        System.out.println("客户端信息: " + clientInfo.name() + " v" + clientInfo.version());

        client.close();
    }

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

    @Test
    void testClientAutoCloseable() {
        System.out.println("=== 测试 AutoCloseable ===");

        String mockEndpoint = "http://localhost:9999/sse";

        try (AlipayMcpClient client = new AlipayMcpClient(TEST_APP_ID, privateKey, mockEndpoint)) {
            assertNotNull(client);
            System.out.println("客户端创建成功，将在 try 结束时自动关闭");
        }

        System.out.println("客户端已关闭");
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

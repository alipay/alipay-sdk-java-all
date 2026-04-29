package com.alipay.mcp.springai.transport;

import io.modelcontextprotocol.spec.McpClientTransport;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * AlipaySseMcpTransport 单元测试
 *
 * 参考 alipay-mcp-sdk 中的测试用例
 */
class AlipaySseMcpTransportTest {

    /**
     * 测试私钥（与 alipay-mcp-sdk 保持一致）
     */
    private static final String TEST_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\n" +
        "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDORnQ5jZnurOS9U6o26J1ZH5wWSsaRHERQ3U3EXBI3iRnkHJGFjg1RK6OYswOnYEtzJKripFxaq6mzWS75qnmG4Ny49MyIVT1zL7rDWtMP9DYaGAVTrccCyZe8IjbQR0TW1zNbcj4ue+jYqkv5+/sHX0f/EtKOgcnTb7bXrYL+co7s0fFTQfdc6HbNisoX5ZdtjG1Y6166GDBTndxE8/95GBlBNkT5e8rF84OvATbATBCmuOAA4XcGfeRVUFjPPgwIjbIgpcprlmTZMWjVP7OFVAdC9HkNKsWgbinGigvBb/FCIrGx+10dCghRvegBH7Ua/LsIoFjgvyf1zbbqwt0dAgMBAAECggEAb97H89q3DDmaSI/SdbsMcyRwi6p8LIDvEAglwAPLIXFqqEtSJOOYl1gafps/tQvFf6n4P7iyGb6V553Lmz34cM0NCAZD0wCfthPBr2dXpoRkvxwd73cEwp9Aepj3r1ennvjRcpvv21f6PV+Gmwos55+mNVEo/n6nTdN9j1UcARB4k1rpK66YTwTUn1dwFBp4JMyUZy2LzbnpF4qa0sRvrwhUlgjKrJGXzaW26y0chI02SEx/k2AQ78wd+nbhYABYU/xTVioZiYoyCGM5e3ehDXsELs5Ks0JqD/MZD5JhS9P6KFOLgVsfz7UVf5EVHiDseLwKEXWLpJqQJ6qOogkmYQKBgQDyeYHPYGzOFyvov5FQC6VXYdXj4uO+E68aIaXyvnczbqOTYsWnw6gFDFcnNSMcVcfMhwkfLOKsWUQ/cbgnDi6pVrkjHhSIwude2K1RvHWQ7wzY8weT1CkORPWrR70V2MS2dv8qdRWZ9g6ic0QuJW/7ElngbDpdexGMfS1NOaANyQKBgQDZyAacynbO1w3Wk2TdF+S/TjkrBA6fEELZhmCQAmt250VIwLDP/ignmUKrzGa81fsF2M7Rlt6wDpppcTgZY4emtozreQZFaf6i4FyqGIPdBFFpM5R3VFqbkxDirYjlwl74H+SsQnmWC0DDnq+Cee0PKb4Ya2jRr6lEEuoUDKcutQKBgQDeh2j82y/ADD/+ASHpZma9xUo5NJdycDo5LzxPhUF8cEOrFfD0QHpI98RcdUXd0VPmft9+PwFgzyP1XfZ10Ww9eRu8APUzdjxFLXITG3SCKQGPcas4nnN3Zw5XvSTpkeEm3Brd6kqC2/EeYc7m0vDsaTEW5/zAohu+5XrX7tTXEQKBgQCmnrgYa3rco4KN4fUwhuBXUWTBuXfqUMmknX/xjjhkH2tNz0c3yu8z5Lkysc8EuP42KfuKNVCpCHMxKxNNsW2OqmpEmjKnFwJf4SJkbR8uEOisgW8coSg1kR5BH532k3CPi+8rsCxQFMn3IMiNHfW2PSyYiE0I6MmrMIFw14FtZQKBgHx08LIwK4Fk6vfsaxPpmD8DLPL76EbDOyNnNUkp6q2UmG5ZoGb5JEHEk52HnAdpbQ45aIE5jEVy54ubqjSkID8/Bxbp5vIwVpPr8D7boj6Xz99uy5qjiHCIfDXXlqb+yE863SQykQxzSkNj6TPCBMM2PYHVMRS3YtIk2UjfdVI5\n" +
        "-----END PRIVATE KEY-----";

    private static final String TEST_APP_ID = "2021006141677002";
    private static final String TEST_BASE_URI = "https://opengw.alipay.com";
    private static final String TEST_SSE_ENDPOINT = "/api/v1/open/mcps/aidata-convenience-life5/sse";

    @Test
    void testCreateTransport() {
        System.out.println("=== 测试创建 Transport ===");

        McpClientTransport transport = AlipaySseMcpTransport.create(
            TEST_APP_ID, TEST_PRIVATE_KEY, TEST_BASE_URI, TEST_SSE_ENDPOINT);

        assertNotNull(transport);
        System.out.println("Transport 创建成功");
    }

    @Test
    void testBuilder() {
        System.out.println("=== 测试 Builder 模式 ===");

        McpClientTransport transport = AlipaySseMcpTransport.builder(TEST_BASE_URI)
            .sseEndpoint(TEST_SSE_ENDPOINT)
            .appId(TEST_APP_ID)
            .privateKey(TEST_PRIVATE_KEY)
            .build();

        assertNotNull(transport);
        System.out.println("使用 Builder 创建 Transport 成功");
    }

    @Test
    void testBuilderMissingAppId() {
        System.out.println("=== 测试 Builder 缺少 appId ===");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            AlipaySseMcpTransport.builder(TEST_BASE_URI)
                .sseEndpoint(TEST_SSE_ENDPOINT)
                .privateKey(TEST_PRIVATE_KEY)
                .build();
        });

        assertTrue(exception.getMessage().contains("appId"));
        System.out.println("预期异常：" + exception.getMessage());
    }

    @Test
    void testBuilderMissingPrivateKey() {
        System.out.println("=== 测试 Builder 缺少 privateKey ===");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            AlipaySseMcpTransport.builder(TEST_BASE_URI)
                .sseEndpoint(TEST_SSE_ENDPOINT)
                .appId(TEST_APP_ID)
                .build();
        });

        assertTrue(exception.getMessage().contains("privateKey"));
        System.out.println("预期异常：" + exception.getMessage());
    }

    @Test
    void testProtocolVersions() {
        System.out.println("=== 测试协议版本 ===");

        McpClientTransport transport = AlipaySseMcpTransport.create(
            TEST_APP_ID, TEST_PRIVATE_KEY, TEST_BASE_URI, TEST_SSE_ENDPOINT);

        // 验证 transport 实例创建成功
        assertNotNull(transport);

        System.out.println("Transport 创建成功（SDK 0.17.0）");
    }
}
package com.alipay.mcp.springai.util;

import org.junit.jupiter.api.Test;

import java.security.PrivateKey;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 私钥加载工具测试
 *
 * 参考 alipay-mcp-sdk 中的 PrivateKeyTest
 */
class PrivateKeyLoaderTest {

    /**
     * 测试私钥（与 alipay-mcp-sdk 中的 PrivateKeyTest 保持一致）
     */
    private static final String TEST_PRIVATE_KEY = "-----BEGIN PRIVATE KEY----- " +
        "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDORnQ5jZnurOS9U6o26J1ZH5wWSsaRHERQ3U3EXBI3iRnkHJGFjg1RK6OYswOnYEtzJKripFxaq6mzWS75qnmG4Ny49MyIVT1zL7rDWtMP9DYaGAVTrccCyZe8IjbQR0TW1zNbcj4ue+jYqkv5+/sHX0f/EtKOgcnTb7bXrYL+co7s0fFTQfdc6HbNisoX5ZdtjG1Y6166GDBTndxE8/95GBlBNkT5e8rF84OvATbATBCmuOAA4XcGfeRVUFjPPgwIjbIgpcprlmTZMWjVP7OFVAdC9HkNKsWgbinGigvBb/FCIrGx+10dCghRvegBH7Ua/LsIoFjgvyf1zbbqwt0dAgMBAAECggEAb97H89q3DDmaSI/SdbsMcyRwi6p8LIDvEAglwAPLIXFqqEtSJOOYl1gafps/tQvFf6n4P7iyGb6V553Lmz34cM0NCAZD0wCfthPBr2dXpoRkvxwd73cEwp9Aepj3r1ennvjRcpvv21f6PV+Gmwos55+mNVEo/n6nTdN9j1UcARB4k1rpK66YTwTUn1dwFBp4JMyUZy2LzbnpF4qa0sRvrwhUlgjKrJGXzaW26y0chI02SEx/k2AQ78wd+nbhYABYU/xTVioZiYoyCGM5e3ehDXsELs5Ks0JqD/MZD5JhS9P6KFOLgVsfz7UVf5EVHiDseLwKEXWLpJqQJ6qOogkmYQKBgQDyeYHPYGzOFyvov5FQC6VXYdXj4uO+E68aIaXyvnczbqOTYsWnw6gFDFcnNSMcVcfMhwkfLOKsWUQ/cbgnDi6pVrkjHhSIwude2K1RvHWQ7wzY8weT1CkORPWrR70V2MS2dv8qdRWZ9g6ic0QuJW/7ElngbDpdexGMfS1NOaANyQKBgQDZyAacynbO1w3Wk2TdF+S/TjkrBA6fEELZhmCQAmt250VIwLDP/ignmUKrzGa81fsF2M7Rlt6wDpppcTgZY4emtozreQZFaf6i4FyqGIPdBFFpM5R3VFqbkxDirYjlwl74H+SsQnmWC0DDnq+Cee0PKb4Ya2jRr6lEEuoUDKcutQKBgQDeh2j82y/ADD/+ASHpZma9xUo5NJdycDo5LzxPhUF8cEOrFfD0QHpI98RcdUXd0VPmft9+PwFgzyP1XfZ10Ww9eRu8APUzdjxFLXITG3SCKQGPcas4nnN3Zw5XvSTpkeEm3Brd6kqC2/EeYc7m0vDsaTEW5/zAohu+5XrX7tTXEQKBgQCmnrgYa3rco4KN4fUwhuBXUWTBuXfqUMmknX/xjjhkH2tNz0c3yu8z5Lkysc8EuP42KfuKNVCpCHMxKxNNsW2OqmpEmjKnFwJf4SJkbR8uEOisgW8coSg1kR5BH532k3CPi+8rsCxQFMn3IMiNHfW2PSyYiE0I6MmrMIFw14FtZQKBgHx08LIwK4Fk6vfsaxPpmD8DLPL76EbDOyNnNUkp6q2UmG5ZoGb5JEHEk52HnAdpbQ45aIE5jEVy54ubqjSkID8/Bxbp5vIwVpPr8D7boj6Xz99uy5qjiHCIfDXXlqb+yE863SQykQxzSkNj6TPCBMM2PYHVMRS3YtIk2UjfdVI5 " +
        "-----END PRIVATE KEY-----";

    @Test
    void testLoadFromStringWithPemMarkers() {
        System.out.println("=== 测试带 PEM 标记的私钥加载 ===");
        System.out.println("原始私钥长度：" + TEST_PRIVATE_KEY.length());

        PrivateKey loadedKey = PrivateKeyLoader.loadFromString(TEST_PRIVATE_KEY);

        assertNotNull(loadedKey);
        assertEquals("RSA", loadedKey.getAlgorithm());
        assertEquals("PKCS#8", loadedKey.getFormat());

        System.out.println("私钥加载成功！");
        System.out.println("算法：" + loadedKey.getAlgorithm());
        System.out.println("格式：" + loadedKey.getFormat());
    }

    @Test
    void testLoadFromStringWithoutPemMarkers() {
        System.out.println("=== 测试不带 PEM 标记的私钥加载 ===");

        // 移除 PEM 标记
        String keyWithoutMarkers = TEST_PRIVATE_KEY
            .replace("-----BEGIN PRIVATE KEY-----", "")
            .replace("-----END PRIVATE KEY-----", "")
            .replaceAll("\\s", "");

        System.out.println("Base64 长度：" + keyWithoutMarkers.length());

        PrivateKey loadedKey = PrivateKeyLoader.loadFromString(keyWithoutMarkers);

        assertNotNull(loadedKey);
        assertEquals("RSA", loadedKey.getAlgorithm());

        System.out.println("私钥加载成功！");
    }

    @Test
    void testLoadFromStringWithWhitespace() {
        System.out.println("=== 测试带换行和空格的私钥加载 ===");

        // 添加额外的空白字符
        String keyWithWhitespace = TEST_PRIVATE_KEY.replaceAll(" ", "\\n");

        PrivateKey loadedKey = PrivateKeyLoader.loadFromString(keyWithWhitespace);

        assertNotNull(loadedKey);
        assertEquals("RSA", loadedKey.getAlgorithm());

        System.out.println("私钥加载成功（带换行）！");
    }

    @Test
    void testLoadFromStringInvalidKey() {
        System.out.println("=== 测试无效私钥 ===");

        Exception exception = assertThrows(Exception.class, () -> {
            PrivateKeyLoader.loadFromString("invalid-key-data");
        });

        assertNotNull(exception.getMessage());
        System.out.println("预期异常：" + exception.getMessage());
    }

    @Test
    void testLoadFromStringEmptyKey() {
        System.out.println("=== 测试空私钥 ===");

        Exception exception = assertThrows(Exception.class, () -> {
            PrivateKeyLoader.loadFromString("");
        });

        assertNotNull(exception);
        System.out.println("预期异常：" + exception.getMessage());
    }
}

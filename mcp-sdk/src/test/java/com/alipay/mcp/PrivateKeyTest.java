package com.alipay.mcp;

import org.bouncycastle.util.encoders.Base64;
import org.junit.jupiter.api.Test;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;

/**
 * 私钥格式验证测试
 */
public class PrivateKeyTest {

    // 测试私钥（从 Postman 复制）
    private static final String PRIVATE_KEY = "-----BEGIN PRIVATE KEY----- MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDORnQ5jZnurOS9U6o26J1ZH5wWSsaRHERQ3U3EXBI3iRnkHJGFjg1RK6OYswOnYEtzJKripFxaq6mzWS75qnmG4Ny49MyIVT1zL7rDWtMP9DYaGAVTrccCyZe8IjbQR0TW1zNbcj4ue+jYqkv5+/sHX0f/EtKOgcnTb7bXrYL+co7s0fFTQfdc6HbNisoX5ZdtjG1Y6166GDBTndxE8/95GBlBNkT5e8rF84OvATbATBCmuOAA4XcGfeRVUFjPPgwIjbIgpcprlmTZMWjVP7OFVAdC9HkNKsWgbinGigvBb/FCIrGx+10dCghRvegBH7Ua/LsIoFjgvyf1zbbqwt0dAgMBAAECggEAb97H89q3DDmaSI/SdbsMcyRwi6p8LIDvEAglwAPLIXFqqEtSJOOYl1gafps/tQvFf6n4P7iyGb6V553Lmz34cM0NCAZD0wCfthPBr2dXpoRkvxwd73cEwp9Aepj3r1ennvjRcpvv21f6PV+Gmwos55+mNVEo/n6nTdN9j1UcARB4k1rpK66YTwTUn1dwFBp4JMyUZy2LzbnpF4qa0sRvrwhUlgjKrJGXzaW26y0chI02SEx/k2AQ78wd+nbhYABYU/xTVioZiYoyCGM5e3ehDXsELs5Ks0JqD/MZD5JhS9P6KFOLgVsfz7UVf5EVHiDseLwKEXWLpJqQJ6qOogkmYQKBgQDyeYHPYGzOFyvov5FQC6VXYdXj4uO+E68aIaXyvnczbqOTYsWnw6gFDFcnNSMcVcfMhwkfLOKsWUQ/cbgnDi6pVrkjHhSIwude2K1RvHWQ7wzY8weT1CkORPWrR70V2MS2dv8qdRWZ9g6ic0QuJW/7ElngbDpdexGMfS1NOaANyQKBgQDZyAacynbO1w3Wk2TdF+S/TjkrBA6fEELZhmCQAmt250VIwLDP/ignmUKrzGa81fsF2M7Rlt6wDpppcTgZY4emtozreQZFaf6i4FyqGIPdBFFpM5R3VFqbkxDirYjlwl74H+SsQnmWC0DDnq+Cee0PKb4Ya2jRr6lEEuoUDKcutQKBgQDeh2j82y/ADD/+ASHpZma9xUo5NJdycDo5LzxPhUF8cEOrFfD0QHpI98RcdUXd0VPmft9+PwFgzyP1XfZ10Ww9eRu8APUzdjxFLXITG3SCKQGPcas4nnN3Zw5XvSTpkeEm3Brd6kqC2/EeYc7m0vDsaTEW5/zAohu+5XrX7tTXEQKBgQCmnrgYa3rco4KN4fUwhuBXUWTBuXfqUMmknX/xjjhkH2tNz0c3yu8z5Lkysc8EuP42KfuKNVCpCHMxKxNNsW2OqmpEmjKnFwJf4SJkbR8uEOisgW8coSg1kR5BH532k3CPi+8rsCxQFMn3IMiNHfW2PSyYiE0I6MmrMIFw14FtZQKBgHx08LIwK4Fk6vfsaxPpmD8DLPL76EbDOyNnNUkp6q2UmG5ZoGb5JEHEk52HnAdpbQ45aIE5jEVy54ubqjSkID8/Bxbp5vIwVpPr8D7boj6Xz99uy5qjiHCIfDXXlqb+yE863SQykQxzSkNj6TPCBMM2PYHVMRS3YtIk2UjfdVI5 -----END PRIVATE KEY-----";

    @Test
    public void testPrivateKeyDecode() {
        System.out.println("=== 私钥格式验证 ===");
        System.out.println("原始私钥长度：" + PRIVATE_KEY.length());
        System.out.println("原始私钥：\n" + PRIVATE_KEY);

        // 提取 Base64 部分
        String privateKeyPEM = PRIVATE_KEY
                .replace("-----BEGIN PRIVATE KEY-----", "")
                .replace("-----END PRIVATE KEY-----", "")
                .replaceAll("\\s+", "");  // 移除所有空白字符（空格、换行、制表符）

        System.out.println("\n=== 处理后的 Base64 ===");
        System.out.println("Base64 长度：" + privateKeyPEM.length());
        System.out.println("Base64 内容：" + privateKeyPEM);

        try {
            // 尝试 Base64 解码
            System.out.println("\n=== 尝试 Base64 解码 ===");
            byte[] decoded = Base64.decode(privateKeyPEM.getBytes());
            System.out.println("Base64 解码成功！字节长度：" + decoded.length);

            // 尝试解析为 PrivateKey
            System.out.println("\n=== 尝试解析为 PrivateKey ===");
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(decoded);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PrivateKey privateKey = keyFactory.generatePrivate(keySpec);
            System.out.println("私钥解析成功！");
            System.out.println("算法：" + privateKey.getAlgorithm());
            System.out.println("格式：" + privateKey.getFormat());

        } catch (Exception e) {
            System.out.println("失败：" + e.getMessage());
            e.printStackTrace();
        }
    }
}
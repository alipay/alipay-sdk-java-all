package com.alipay.mcp.springai.util;

import com.alipay.mcp.springai.transport.AlipayMcpException;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

/**
 * 私钥加载工具类
 */
public class PrivateKeyLoader {

    /**
     * 从字符串加载 PKCS8 格式私钥
     */
    public static PrivateKey loadFromString(String privateKeyStr) {
        try {
            String key = privateKeyStr
                .replace("-----BEGIN PRIVATE KEY-----", "")
                .replace("-----END PRIVATE KEY-----", "")
                .replace("-----BEGIN RSA PRIVATE KEY-----", "")
                .replace("-----END RSA PRIVATE KEY-----", "")
                .replaceAll("\\s", "");

            byte[] keyBytes = Base64.getDecoder().decode(key);
            PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            return keyFactory.generatePrivate(spec);
        } catch (Exception e) {
            throw new AlipayMcpException("INVALID_KEY", "加载私钥失败: " + e.getMessage(), e);
        }
    }

    /**
     * 从文件加载私钥
     */
    public static PrivateKey loadFromFile(String filePath) {
        try {
            String content = new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(filePath)));
            return loadFromString(content);
        } catch (Exception e) {
            throw new AlipayMcpException("LOAD_KEY_ERROR", "从文件加载私钥失败: " + e.getMessage(), e);
        }
    }
}

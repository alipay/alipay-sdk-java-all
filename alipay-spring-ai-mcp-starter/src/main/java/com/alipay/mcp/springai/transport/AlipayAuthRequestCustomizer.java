package com.alipay.mcp.springai.transport;

import com.alipay.v3.ApiException;
import com.alipay.v3.util.AlipaySignature;

import java.net.URI;
import java.util.UUID;

/**
 * 支付宝签名工具
 * 为 HTTP 请求构建支付宝 RSA2 签名 Authorization 头
 */
public class AlipayAuthRequestCustomizer {

    private final String appId;
    private final String privateKey;

    public AlipayAuthRequestCustomizer(String appId, String privateKey) {
        this.appId = appId;
        this.privateKey = privateKey;
    }

    /**
     * 构建支付宝 Authorization 头
     * 签名格式：ALIPAY-SHA256withRSA app_id=xxx,timestamp=xxx,nonce=xxx,sign=xxx
     *
     * @param method HTTP 方法
     * @param uri    请求 URI（仅路径部分，不含域名）
     * @param body   请求体
     * @return Authorization 头的值
     */
    public String buildAuthorization(String method, String uri, String body) throws ApiException {
        // 1. 生成时间戳（毫秒）
        String timestamp = String.valueOf(System.currentTimeMillis());
        String nonce = UUID.randomUUID().toString();

        // 2. 构建认证字符串（顺序：app_id, timestamp, nonce）
        String authString = "app_id=" + appId + ",timestamp=" + timestamp + ",nonce=" + nonce;

        // 3. 构建签名内容（末尾带换行符）
        StringBuilder signContent = new StringBuilder();
        signContent.append(authString).append("\n")
                   .append(method).append("\n")
                   .append(uri).append("\n")
                   .append(body != null ? body : "").append("\n");

        // 4. 使用 AlipaySignature 签名（RSA2）
        String sign = AlipaySignature.sign(signContent.toString(), privateKey, "utf-8", "RSA2");

        // 5. 构建 Authorization 头
        return "ALIPAY-SHA256withRSA " + authString + ",sign=" + sign;
    }

    /**
     * 从完整 URI 中提取路径部分（用于签名）
     */
    public static String extractPath(URI uri) {
        String path = uri.getPath();
        if (uri.getQuery() != null) {
            path = path + "?" + uri.getQuery();
        }
        return path;
    }
}
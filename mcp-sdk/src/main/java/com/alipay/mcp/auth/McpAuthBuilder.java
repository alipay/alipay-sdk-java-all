package com.alipay.mcp.auth;

import com.alipay.v3.util.AlipaySignature;
import com.alipay.v3.ApiException;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * MCP 认证头构建器
 * 复用 AlipaySignature 进行签名
 *
 * @author alipay
 */
public class McpAuthBuilder {

    private final String appId;
    private final String privateKey;

    public McpAuthBuilder(String appId, String privateKey) {
        this.appId = appId;
        // 去除 PEM 格式标记，只保留 Base64 部分
        this.privateKey = privateKey
                .replace("-----BEGIN PRIVATE KEY-----", "")
                .replace("-----END PRIVATE KEY-----", "")
                .replaceAll("\\s+", "");
    }

    /**
     * 构建完整请求头
     *
     * @param method HTTP 方法
     * @param uri 请求 URI (不含域名)
     * @param body 请求体
     * @return 完整的请求头 Map
     * @throws ApiException 签名失败时抛出
     */
    public Map<String, String> buildHeaders(String method, String uri, String body)
            throws ApiException {
        return buildHeaders(method, uri, body, null);
    }

    /**
     * 构建完整请求头（支持 app auth token）
     *
     * @param method HTTP 方法
     * @param uri 请求 URI (不含域名)
     * @param body 请求体
     * @param appAuthToken 可选的应用授权令牌
     * @return 完整的请求头 Map
     * @throws ApiException 签名失败时抛出
     */
    public Map<String, String> buildHeaders(String method, String uri, String body, String appAuthToken)
            throws ApiException {

        // 生成认证字符串（顺序：app_id, timestamp, nonce - 与 Postman 一致）
        String timestamp = String.valueOf(System.currentTimeMillis());
        String nonce = UUID.randomUUID().toString();
        String authString = "app_id=" + appId + ",timestamp=" + timestamp + ",nonce=" + nonce;

        // 构建签名内容（与 Postman 一致）
        StringBuilder signContent = new StringBuilder();
        signContent.append(authString).append("\n")
                   .append(method).append("\n")
                   .append(uri).append("\n")
                   .append(body != null ? body : "").append("\n");

        // 如果有 app auth token，追加到签名内容
        if (appAuthToken != null && !appAuthToken.isEmpty()) {
            signContent.append(appAuthToken).append("\n");
        }

        // 使用 AlipaySignature 已有的 sign 方法
        String sign = AlipaySignature.sign(signContent.toString(), privateKey, "utf-8", "RSA2");

        // 构建请求头
        Map<String, String> headers = new HashMap<>();
        String authorization = "ALIPAY-SHA256withRSA " + authString + ",sign=" + sign;
        headers.put("Authorization", authorization);

        // 如果有 app auth token，添加到 header
        if (appAuthToken != null && !appAuthToken.isEmpty()) {
            headers.put("alipay-app-auth-token", appAuthToken);
        }

        return headers;
    }

    /**
     * 只构建 Authorization 头
     *
     * @param method HTTP 方法
     * @param uri 请求 URI (不含域名)
     * @param body 请求体
     * @return Authorization 头值
     * @throws ApiException 签名失败时抛出
     */
    public String buildAuthorization(String method, String uri, String body)
            throws ApiException {
        return buildHeaders(method, uri, body).get("Authorization");
    }
}
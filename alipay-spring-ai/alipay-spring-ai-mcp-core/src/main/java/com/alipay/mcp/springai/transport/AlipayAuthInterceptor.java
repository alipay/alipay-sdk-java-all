package com.alipay.mcp.springai.transport;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.PrivateKey;
import java.security.Signature;
import java.time.Instant;
import java.util.Base64;
import java.util.UUID;

/**
 * 支付宝 MCP 请求签名拦截器
 * 拦截所有 HTTP 请求，添加支付宝认证头
 */
public class AlipayAuthInterceptor implements ClientHttpRequestInterceptor {

    private static final String ALIPAY_ALGORITHM = "ALIPAY-SHA256withRSA";
    private static final String SIGNATURE_ALGORITHM = "SHA256withRSA";

    private final String appId;
    private final PrivateKey privateKey;
    private final String authToken;

    public AlipayAuthInterceptor(String appId, PrivateKey privateKey, String authToken) {
        this.appId = appId;
        this.privateKey = privateKey;
        this.authToken = authToken;
    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body,
                                        ClientHttpRequestExecution execution) throws IOException {
        // 1. 构建认证字符串
        String timestamp = String.valueOf(Instant.now().getEpochSecond());
        String nonce = UUID.randomUUID().toString();

        String authString = String.format("app_id=%s,timestamp=%s,nonce=%s",
            appId, timestamp, nonce);

        // 2. 构建签名原文
        String method = request.getMethod().name();
        String url = request.getURI().toString();
        String bodyStr = body.length > 0 ? new String(body, StandardCharsets.UTF_8) : "";

        String signContent = authString + "\n"
            + method + "\n"
            + url + "\n"
            + bodyStr;

        if (authToken != null && !authToken.isEmpty()) {
            signContent += "\n" + authToken;
        }

        // 3. 签名
        String signature = sign(signContent);

        // 4. 设置 Authorization 头
        String authorization = String.format("%s %s,sign=%s",
            ALIPAY_ALGORITHM, authString, signature);
        request.getHeaders().set("Authorization", authorization);

        // 5. 设置其他必要头
        request.getHeaders().set("Content-Type", "application/json; charset=UTF-8");
        request.getHeaders().set("Accept", "text/event-stream");

        return execution.execute(request, body);
    }

    private String sign(String content) {
        try {
            Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
            signature.initSign(privateKey);
            signature.update(content.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(signature.sign());
        } catch (Exception e) {
            throw new AlipayMcpException("SIGN_ERROR", "签名失败: " + e.getMessage(), e);
        }
    }
}

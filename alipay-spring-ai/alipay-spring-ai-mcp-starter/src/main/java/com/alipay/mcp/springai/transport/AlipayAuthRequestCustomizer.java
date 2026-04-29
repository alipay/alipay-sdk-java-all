package com.alipay.mcp.springai.transport;

import com.alipay.v3.ApiException;
import com.alipay.v3.util.AlipaySignature;
import io.modelcontextprotocol.client.transport.AsyncHttpRequestCustomizer;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.net.http.HttpRequest;
import java.util.UUID;

/**
 * 支付宝认证请求定制器
 * 通过 AsyncHttpRequestCustomizer 接口在请求发送前添加支付宝签名
 */
public class AlipayAuthRequestCustomizer implements AsyncHttpRequestCustomizer {

    private final String appId;
    private final String privateKey;

    public AlipayAuthRequestCustomizer(String appId, String privateKey) {
        this.appId = appId;
        this.privateKey = privateKey;
    }

    @Override
    public Publisher<HttpRequest.Builder> customize(HttpRequest.Builder requestBuilder,
                                                     String method, URI uri, String body) {
        try {
            // 构建签名（只使用路径部分，不包含域名）
            String uriPath = uri.getPath();
            if (uri.getQuery() != null) {
                uriPath = uriPath + "?" + uri.getQuery();
            }
            String authorization = buildAuthorization(method, uriPath, body);

            // 添加请求头
            requestBuilder.header("Authorization", authorization);
            requestBuilder.header("Content-Type", "application/json; charset=UTF-8");

            return Mono.just(requestBuilder);
        } catch (Exception e) {
            return Mono.error(new AlipayMcpException("SIGN_ERROR",
                "构建签名失败：" + e.getMessage(), e));
        }
    }

    /**
     * 构建支付宝 Authorization 头
     * 签名格式：ALIPAY-SHA256withRSA app_id=xxx,timestamp=xxx,nonce=xxx,sign=xxx
     */
    private String buildAuthorization(String method, String uri, String body) throws ApiException {
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
}
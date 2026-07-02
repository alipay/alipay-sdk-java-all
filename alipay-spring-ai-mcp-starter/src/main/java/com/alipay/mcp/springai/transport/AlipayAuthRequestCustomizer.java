package com.alipay.mcp.springai.transport;

import com.alipay.v3.ApiException;
import com.alipay.v3.util.AlipaySignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.util.UUID;

/**
 * 支付宝认证工具
 * 支持两种认证模式：RSA 签名（默认）和 API Key
 */
public class AlipayAuthRequestCustomizer {

    private static final Logger log = LoggerFactory.getLogger(AlipayAuthRequestCustomizer.class);

    private final String appId;
    private final String privateKey;
    private final String apiKey;
    private final boolean useApiKey;

    /**
     * 签名模式构造函数
     */
    public AlipayAuthRequestCustomizer(String appId, String privateKey) {
        this(appId, privateKey, null);
    }

    /**
     * 通用构造函数（支持签名和 API Key 模式）
     * @param appId 应用 ID（签名模式必填）
     * @param privateKey 私钥（签名模式必填）
     * @param apiKey API Key（API Key 模式必填，签名模式传 null）
     */
    public AlipayAuthRequestCustomizer(String appId, String privateKey, String apiKey) {
        this.appId = appId;
        // 去除 PEM 格式标记和空白，只保留 Base64 部分
        this.privateKey = privateKey != null ? privateKey
                .replace("-----BEGIN PRIVATE KEY-----", "")
                .replace("-----END PRIVATE KEY-----", "")
                .replaceAll("\\s+", "") : null;
        this.useApiKey = apiKey != null && !apiKey.trim().isEmpty();
        this.apiKey = this.useApiKey ? apiKey : null;
        if (this.useApiKey) {
            if (appId != null || privateKey != null) {
                log.warn("API Key 模式下 appId/privateKey 将被忽略");
            }
        } else {
            if (appId == null || appId.trim().isEmpty()) {
                throw new IllegalArgumentException("签名模式下 appId 不能为空");
            }
            if (privateKey == null || privateKey.trim().isEmpty()) {
                throw new IllegalArgumentException("签名模式下 privateKey 不能为空");
            }
        }
    }

    /**
     * 构建 Authorization 头（根据配置自动选择模式）
     *
     * @param method HTTP 方法
     * @param uri    请求 URI（仅路径部分，不含域名）
     * @param body   请求体
     * @return Authorization 头的值
     */
    public String buildAuthorization(String method, String uri, String body) {
        if (useApiKey) {
            // API Key 模式
            return "Bearer " + apiKey;
        }

        // 签名模式
        try {
            return buildSignAuthorization(method, uri, body);
        } catch (ApiException e) {
            throw new RuntimeException("构建支付宝签名失败: " + e.getMessage(), e);
        }
    }

    /**
     * 构建支付宝 RSA 签名 Authorization 头
     * 签名格式：ALIPAY-SHA256withRSA app_id=xxx,timestamp=xxx,nonce=xxx,sign=xxx
     */
    private String buildSignAuthorization(String method, String uri, String body) throws ApiException {
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

    /**
     * 判断是否使用 API Key 模式
     */
    public boolean isUseApiKey() {
        return useApiKey;
    }
}
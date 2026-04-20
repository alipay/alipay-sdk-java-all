package com.alipay.mcp.interceptor;

import com.alipay.mcp.auth.McpAuthBuilder;
import com.alipay.mcp.config.McpClientConfig;
import com.alipay.v3.ApiException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Map;

/**
 * 支付宝认证拦截器
 * 负责生成签名并添加到请求头中
 */
public class AlipayAuthInterceptor implements Interceptor {

    private static final Logger log = LoggerFactory.getLogger(AlipayAuthInterceptor.class);

    private final McpClientConfig config;
    private final McpAuthBuilder authBuilder;

    public AlipayAuthInterceptor(McpClientConfig config) {
        this.config = config;
        this.authBuilder = new McpAuthBuilder(config.getAppId(), config.getPrivateKey());
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        log.debug("AlipayAuthInterceptor - 处理请求: {} {}", request.getMethod(), request.getUrl());

        try {
            // 解析 URI（去掉域名部分）
            String uri = parseUri(request.getUrl());

            // 构建认证头
            Map<String, String> authHeaders = authBuilder.buildHeaders(
                    request.getMethod(),
                    uri,
                    request.getBody() != null ? request.getBody() : "",
                    config.getAppAuthToken()
            );

            // 添加认证头到请求
            for (Map.Entry<String, String> header : authHeaders.entrySet()) {
                request.addHeader(header.getKey(), header.getValue());
            }

            log.debug("AlipayAuthInterceptor - 认证头已添加");

            // 继续执行链
            return chain.proceed(request);

        } catch (ApiException e) {
            throw new IOException("认证处理失败: " + e.getMessage(), e);
        }
    }

    /**
     * 解析 URI（去掉域名部分）
     */
    private String parseUri(String fullUrl) {
        try {
            int pathStart = fullUrl.indexOf("://");
            if (pathStart == -1) {
                return fullUrl;
            }
            pathStart = fullUrl.indexOf("/", pathStart + 3);
            if (pathStart == -1) {
                return "/";
            }
            return fullUrl.substring(pathStart);
        } catch (Exception e) {
            return fullUrl;
        }
    }
}
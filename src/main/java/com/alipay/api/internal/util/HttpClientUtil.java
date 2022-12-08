/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.alipay.api.internal.util;

import com.alipay.api.FileItem;
import okhttp3.*;

import javax.net.ssl.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * 网络工具类（支持设置连接池）
 *
 * @author jishupei.jsp
 * @version : HttpClientUtil, v0.1 2022年05月22日 7:04 下午 jishupei.jsp Exp $
 */
public class HttpClientUtil extends AbstractHttpClient {
    //OkHttpClients should be shared
    public static final ConcurrentHashMap<String, OkHttpClient> clients = new ConcurrentHashMap<String, OkHttpClient>();

    private static final String METHOD_POST = "POST";
    private static final String METHOD_GET = "GET";

    private static HostnameVerifier verifier = null;
    private static SSLSocketFactory socketFactory = null;
    private static X509TrustManager trustManager = null;

    static {

        try {
            trustManager = new X509TrustManager() {
                @Override
                public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
                }

                @Override
                public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
                }

                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            };
            SSLContext ctx = SSLContext.getInstance("TLS");
            ctx.init(new KeyManager[0], new TrustManager[]{trustManager}, new SecureRandom());

            ctx.getClientSessionContext().setSessionTimeout(15);
            ctx.getClientSessionContext().setSessionCacheSize(1000);

            socketFactory = ctx.getSocketFactory();
        } catch (Exception e) {

        }

        verifier = new HostnameVerifier() {
            public boolean verify(String hostname, SSLSession session) {
                return false; //不允许URL的主机名和服务器的标识主机名不匹配的情况
            }
        };
    }

    @Override
    public String doPost(String url, Map<String, String> params, String charset, Map<String, String> resHeaders) throws IOException {
        String ctype = "application/x-www-form-urlencoded;charset=" + charset;
        String query = WebUtils.buildQuery(params, charset);
        byte[] content = {};
        if (query != null) {
            content = query.getBytes(charset);
        }
        return execute(METHOD_POST, ctype, content, url, charset, getConnectTimeout(), getReadTimeout(),
                getMaxIdleConnections(), getKeepAliveDuration(), getProxyHost(), getProxyPort(), getCustomHeaders(), resHeaders);
    }

    @Override
    public String doPost(String url, Map<String, String> params, Map<String, FileItem> fileParams, String charset, Map<String, String> resHeaders) throws IOException {
        if (fileParams == null || fileParams.isEmpty()) {
            doPost(url, params, charset, resHeaders);
        }
        String boundary = System.currentTimeMillis() + "";
        String ctype = "multipart/form-data;boundary=" + boundary + ";charset=" + charset;
        byte[] entryBoundaryBytes = ("\r\n--" + boundary + "\r\n").getBytes(charset);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        // 组装文本请求参数
        Set<Map.Entry<String, String>> textEntrySet = params.entrySet();
        for (Map.Entry<String, String> textEntry : textEntrySet) {
            byte[] textBytes = WebUtils.getTextEntry(textEntry.getKey(), textEntry.getValue(),
                    charset);
            stream.write(entryBoundaryBytes);
            stream.write(textBytes);
        }

        // 组装文件请求参数
        Set<Map.Entry<String, FileItem>> fileEntrySet = fileParams.entrySet();
        for (Map.Entry<String, FileItem> fileEntry : fileEntrySet) {
            FileItem fileItem = fileEntry.getValue();
            byte[] fileBytes = WebUtils.getFileEntry(fileEntry.getKey(), fileItem.getFileName(),
                    fileItem.getMimeType(), charset);
            stream.write(entryBoundaryBytes);
            stream.write(fileBytes);
            stream.write(fileItem.getContent());
        }

        // 添加请求结束标志
        byte[] endBoundaryBytes = ("\r\n--" + boundary + "--\r\n").getBytes(charset);
        stream.write(endBoundaryBytes);

        byte[] content = stream.toByteArray();

        return execute(METHOD_POST, ctype, content, url, charset, getConnectTimeout(), getReadTimeout(),
                getMaxIdleConnections(), getKeepAliveDuration(), getProxyHost(), getProxyPort(), getCustomHeaders(), resHeaders);
    }

    private String execute(String methodType, String ctype, byte[] content, String url, String charset, int connectTimeout,
                           int readTimeout, int maxIdleConnections, long keepAliveDuration, String proxyHost, int proxyPort,
                           Map<String, String> headers, Map<String, String> resHeaders) throws IOException {
        String rsp;
        Response response = null;
        try {
            URL netUrl = new URL(url);
            String key;
            if (!StringUtils.isEmpty(proxyHost)) {
                key = String.format("%s:%d", proxyHost, proxyPort);
            } else {
                key = String.format("%s:%d", netUrl.getHost(), netUrl.getPort());
            }
            OkHttpClient okHttpClient = clients.get(key);
            if (okHttpClient == null) {
                okHttpClient = getOkHttpClient(netUrl, connectTimeout, readTimeout, maxIdleConnections, keepAliveDuration, proxyHost, proxyPort);
                clients.put(key, okHttpClient);
            }

            if (METHOD_POST.equals(methodType)) {
                response = okHttpClient.newCall(getOkRequestBuilder(netUrl, headers, ctype)
                                .post(RequestBody.create(MediaType.parse(ctype), content))
                                .build())
                        .execute();
            } else if (METHOD_GET.equals(methodType)) {
                response = okHttpClient.newCall(getOkRequestBuilder(netUrl, headers, ctype)
                                .get()
                                .build())
                        .execute();
            }

            if (response == null) return null;
            rsp = getResponseAsString(response, charset);
            if (resHeaders != null) {
                resHeaders.put("trace_id", response.header("trace_id"));
            }

        } catch (IOException e) {
            Map<String, String> map = WebUtils.getParamsFromUrl(url);
            AlipayLogger.logCommError(e, url, map.get("app_key"), map.get("method"), content);
            throw e;
        } finally {
            if (response != null) {
                //The response body must be closed
                response.close();
            }
        }

        return rsp;
    }

    private OkHttpClient getOkHttpClient(URL url, int connectTimeout, int readTimeout, int maxIdleConnections,
                                         long keepAliveDuration, String proxyHost, int proxyPort) throws IOException {
        OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
        builder.connectTimeout(connectTimeout, TimeUnit.MILLISECONDS)
                .readTimeout(readTimeout, TimeUnit.MILLISECONDS);
        if (maxIdleConnections > 0) {
            builder.connectionPool(new ConnectionPool(maxIdleConnections, keepAliveDuration, TimeUnit.MILLISECONDS));
        }
        if ("https".equals(url.getProtocol()) && !WebUtils.isNeedCheckServerTrusted()) {
            //不校验SSL服务端证书
            builder.sslSocketFactory(socketFactory, trustManager).hostnameVerifier(verifier);
        }
        if (!StringUtils.isEmpty(proxyHost)) {
            builder.proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort)));
        }
        return builder.build();
    }

    private Request.Builder getOkRequestBuilder(URL url, Map<String, String> headers, String ctype) throws IOException {
        Request.Builder builder = new Request.Builder();
        builder.url(url);
        builder.header("Accept", "text/plain,text/xml,text/javascript,text/html");
        builder.header("User-Agent", "aop-sdk-java");
        builder.header("Content-Type", ctype);
        if (headers != null) {
            for (Map.Entry<String, String> header : headers.entrySet()) {
                builder.header(header.getKey(), header.getValue());
            }
        }
        return builder;
    }

    protected String getResponseAsString(Response response, String charset) throws IOException {
        InputStream body = response.body() == null ? null : response.body().byteStream();
        if (null == body || !response.isSuccessful()) {
            throw new IOException(response.code() + ":" + response.message());
        }
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        byte[] buff = new byte[4096];
        try {
            while (true) {
                final int read = body.read(buff);
                if (read == -1) {
                    break;
                }
                os.write(buff, 0, read);
            }
        } catch (IOException e) {
            throw e;
        }
        return os.toString(charset);
    }
}

package com.alipay.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import com.alipay.api.internal.parser.json.ObjectJsonParser;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.internal.util.AlipayLogger;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.internal.util.RequestParametersHolder;
import com.alipay.api.internal.util.StreamUtil;
import com.alipay.api.internal.util.StringUtils;
import com.alipay.api.internal.util.json.JSONWriter;

/**
 * 多媒体文件客户端
 * @author yikai.hu
 * @version $Id: AlipayMobilePublicMultiMediaClient.java, v 0.1 Aug 15, 2014 10:19:01 AM yikai.hu Exp $
 */
public class AlipayMobilePublicMultiMediaClient implements AlipayClient {

    private static final String DEFAULT_CHARSET = AlipayConstants.CHARSET_UTF8;
    private static final String METHOD_POST     = "POST";
    private static final String METHOD_GET      = "GET";

    private String              serverUrl;
    private String              appId;
    private String              privateKey;
    private String              prodCode;
    private String              format          = AlipayConstants.FORMAT_JSON;
    private String              sign_type       = AlipayConstants.SIGN_TYPE_RSA;

    private String              charset;

    private int                 connectTimeout  = 3000;
    private int                 readTimeout     = 15000;

    private static class DefaultTrustManager implements X509TrustManager {
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }

        public void checkClientTrusted(X509Certificate[] chain,
                                       String authType) throws CertificateException {
        }

        public void checkServerTrusted(X509Certificate[] chain,
                                       String authType) throws CertificateException {
        }
    }

    static {
        Security.setProperty("jdk.certpath.disabledAlgorithms", "");
    }

    public AlipayMobilePublicMultiMediaClient(String serverUrl, String appId, String privateKey) {
        this.serverUrl = serverUrl;
        this.appId = appId;
        this.privateKey = privateKey;
    }

    public AlipayMobilePublicMultiMediaClient(String serverUrl, String appId, String privateKey,
                                              String format) {
        this(serverUrl, appId, privateKey);
        this.format = format;
    }

    public AlipayMobilePublicMultiMediaClient(String serverUrl, String appId, String privateKey,
                                              String format, String charset) {
        this(serverUrl, appId, privateKey);
        this.format = format;
        this.charset = charset;
    }

    public AlipayMobilePublicMultiMediaClient(String serverUrl, String appId, String privateKey,
                                              String format, String charset, String signType) {
        this(serverUrl, appId, privateKey, format, charset);

        this.sign_type = signType;
    }

    /** 
     * @see com.alipay.api.AlipayClient#execute(com.alipay.api.AlipayRequest)
     */
    public <T extends AlipayResponse> T execute(AlipayRequest<T> request) throws AlipayApiException {
        return execute(request, null);
    }

    /** 
     * @see com.alipay.api.AlipayClient#execute(com.alipay.api.AlipayRequest, java.lang.String)
     */
    public <T extends AlipayResponse> T execute(AlipayRequest<T> request,
                                                String accessToken) throws AlipayApiException {

        return execute(request, accessToken, null);
    }

    /** 
     * @see com.alipay.api.AlipayClient#execute(com.alipay.api.AlipayRequest, java.lang.String, java.lang.String, java.lang.String)
     */
    public <T extends AlipayResponse> T execute(AlipayRequest<T> request, String accessToken,
                                                String appAuthToken) throws AlipayApiException {

        return _execute(request, accessToken, appAuthToken);
    }

    private <T extends AlipayResponse> T _execute(AlipayRequest<T> request, String authToken,
                                                  String appAuthToken) throws AlipayApiException {

        return doGet(request, appAuthToken);
    }

    public <T extends AlipayResponse> T doGet(AlipayRequest<T> request,
                                              String appAuthToken) throws AlipayApiException {

        if (StringUtils.isEmpty(charset)) {
            charset = AlipayConstants.CHARSET_UTF8;
        }

        RequestParametersHolder requestHolder = new RequestParametersHolder();
        AlipayHashMap appParams = new AlipayHashMap(request.getTextParams());

        // 仅当API包含biz_content参数且值为空时，序列化bizModel填充bizContent
        try {
            if (request.getClass().getMethod("getBizContent") != null
                && StringUtils.isEmpty(appParams.get(AlipayConstants.BIZ_CONTENT_KEY))
                && request.getBizModel() != null) {
                appParams.put(AlipayConstants.BIZ_CONTENT_KEY,
                    new JSONWriter().write(request.getBizModel(), true));
            }
        } catch (NoSuchMethodException e) {
            // 找不到getBizContent则什么都不做
        } catch (SecurityException e) {
            AlipayLogger.logBizError(e);
        }

        if (!StringUtils.isEmpty(appAuthToken)) {
            appParams.put(AlipayConstants.APP_AUTH_TOKEN, appAuthToken);
        }

        requestHolder.setApplicationParams(appParams);

        AlipayHashMap protocalMustParams = new AlipayHashMap();
        protocalMustParams.put(AlipayConstants.METHOD, request.getApiMethodName());
        protocalMustParams.put(AlipayConstants.VERSION, request.getApiVersion());
        protocalMustParams.put(AlipayConstants.APP_ID, this.appId);
        protocalMustParams.put(AlipayConstants.SIGN_TYPE, this.sign_type);
        protocalMustParams.put("charset", charset);

        Long timestamp = System.currentTimeMillis();
        DateFormat df = new SimpleDateFormat(AlipayConstants.DATE_TIME_FORMAT);
        df.setTimeZone(TimeZone.getTimeZone(AlipayConstants.DATE_TIMEZONE));
        protocalMustParams.put(AlipayConstants.TIMESTAMP, df.format(new Date(timestamp)));
        protocalMustParams.put(AlipayConstants.FORMAT, format);
        requestHolder.setProtocalMustParams(protocalMustParams);

        if (AlipayConstants.SIGN_TYPE_RSA.equals(this.sign_type)) {

            String signContent = AlipaySignature.getSignatureContent(requestHolder);

            protocalMustParams.put(AlipayConstants.SIGN,
                AlipaySignature.rsaSign(signContent, privateKey, charset));

        } else if (AlipayConstants.SIGN_TYPE_RSA2.equals(this.sign_type)) {

            String signContent = AlipaySignature.getSignatureContent(requestHolder);

            protocalMustParams.put(AlipayConstants.SIGN,
                AlipaySignature.rsa256Sign(signContent, privateKey, charset));

        } else {
            protocalMustParams.put(AlipayConstants.SIGN, "");
        }

        AlipayMobilePublicMultiMediaDownloadResponse rsp = null;
        try {

            if (request instanceof AlipayMobilePublicMultiMediaDownloadRequest) {
                OutputStream outputStream = ((AlipayMobilePublicMultiMediaDownloadRequest) request)
                    .getOutputStream();
                rsp = doGet(serverUrl, requestHolder, charset, connectTimeout, readTimeout,
                    outputStream);
            }
        } catch (IOException e) {
            throw new AlipayApiException(e);
        }
        return (T) rsp;
    }

    /**
     * 
     * @param url
     * @param params
     * @param charset
     * @param connectTimeout
     * @param readTimeout
     * @return
     * @throws IOException
     * @throws AlipayApiException 
     */
    @SuppressWarnings("unchecked")
    public static AlipayMobilePublicMultiMediaDownloadResponse doGet(String url,
                                                                     RequestParametersHolder requestHolder,
                                                                     String charset,
                                                                     int connectTimeout,
                                                                     int readTimeout,
                                                                     OutputStream output) throws AlipayApiException,
                                                                                          IOException {
        HttpURLConnection conn = null;
        AlipayMobilePublicMultiMediaDownloadResponse response = null;

        try {

            Map<String, String> params = new TreeMap<String, String>();
            AlipayHashMap appParams = requestHolder.getApplicationParams();
            if (appParams != null && appParams.size() > 0) {
                params.putAll(appParams);
            }
            AlipayHashMap protocalMustParams = requestHolder.getProtocalMustParams();
            if (protocalMustParams != null && protocalMustParams.size() > 0) {
                params.putAll(protocalMustParams);
            }
            AlipayHashMap protocalOptParams = requestHolder.getProtocalOptParams();
            if (protocalOptParams != null && protocalOptParams.size() > 0) {
                params.putAll(protocalOptParams);
            }

            String ctype = "application/x-www-form-urlencoded;charset=" + charset;
            String query = buildQuery(params, charset);
            try {
                conn = getConnection(buildGetUrl(url, query), METHOD_GET, ctype);
                conn.setConnectTimeout(connectTimeout);
                conn.setReadTimeout(readTimeout);
            } catch (IOException e) {
                Map<String, String> map = getParamsFromUrl(url);
                AlipayLogger.logCommError(e, url, map.get("app_key"), map.get("method"), params);
                throw e;
            }

            try {
                if (conn.getResponseCode() == 200) {
                    if (conn.getContentType() != null
                        && conn.getContentType().toLowerCase().contains("text/plain")) {
                        String rsp = getResponseAsString(conn);
                        ObjectJsonParser<AlipayMobilePublicMultiMediaDownloadResponse> parser = new ObjectJsonParser<AlipayMobilePublicMultiMediaDownloadResponse>(
                            AlipayMobilePublicMultiMediaDownloadResponse.class);
                        response = parser.parse(rsp);
                        response.setBody(rsp);
                        response.setParams(appParams);
                        return response;
                    }

                    StreamUtil.io(conn.getInputStream(), output);
                    response = new AlipayMobilePublicMultiMediaDownloadResponse();
                    response.setCode("200");
                    response.setMsg("成功");
                    response.setBody(
                        "{\"alipay_mobile_public_multimedia_download_response\":{\"code\":200,\"msg\":\"成功\"}}");
                    response.setParams(appParams);
                } else {
                    response = new AlipayMobilePublicMultiMediaDownloadResponse();
                    response.setCode(String.valueOf(conn.getResponseCode()));
                    response.setMsg(conn.getResponseMessage());
                    response.setParams(appParams);
                }
            } catch (IOException e) {
                Map<String, String> map = getParamsFromUrl(url);
                AlipayLogger.logCommError(e, conn, map.get("app_key"), map.get("method"), params);
                throw e;
            }

        } finally {
            if (conn != null) {
                conn.disconnect();
            }
            if (output != null) {
                output.close();
            }
        }
        return response;

    }

    private static HttpURLConnection getConnection(URL url, String method,
                                                   String ctype) throws IOException {
        HttpURLConnection conn = null;
        if ("https".equals(url.getProtocol())) {
            SSLContext ctx = null;
            try {
                ctx = SSLContext.getInstance("TLS");
                ctx.init(new KeyManager[0], new TrustManager[] { new DefaultTrustManager() },
                    new SecureRandom());
            } catch (Exception e) {
                throw new IOException(e);
            }
            HttpsURLConnection connHttps = (HttpsURLConnection) url.openConnection();
            connHttps.setSSLSocketFactory(ctx.getSocketFactory());
            connHttps.setHostnameVerifier(new HostnameVerifier() {
                public boolean verify(String hostname, SSLSession session) {
                    return false;
                }
            });
            conn = connHttps;
        } else {
            conn = (HttpURLConnection) url.openConnection();
        }

        conn.setRequestMethod(method);
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setRequestProperty("Accept", "text/xml,text/javascript,text/html");
        conn.setRequestProperty("User-Agent", "aop-sdk-java");
        conn.setRequestProperty("Content-Type", ctype);
        return conn;
    }

    protected static String getResponseAsString(HttpURLConnection conn) throws IOException {
        String charset = getResponseCharset(conn.getContentType());
        InputStream es = conn.getErrorStream();
        if (es == null) {
            return getStreamAsString(conn.getInputStream(), charset);
        } else {
            String msg = getStreamAsString(es, charset);
            if (StringUtils.isEmpty(msg)) {
                throw new IOException(conn.getResponseCode() + ":" + conn.getResponseMessage());
            } else {
                throw new IOException(msg);
            }
        }
    }

    private static String getStreamAsString(InputStream stream, String charset) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream, charset));
            StringWriter writer = new StringWriter();

            char[] chars = new char[256];
            int count = 0;
            while ((count = reader.read(chars)) > 0) {
                writer.write(chars, 0, count);
            }

            return writer.toString();
        } finally {
            if (stream != null) {
                stream.close();
            }
        }
    }

    private static String getResponseCharset(String ctype) {
        String charset = DEFAULT_CHARSET;

        if (!StringUtils.isEmpty(ctype)) {
            String[] params = ctype.split(";");
            for (String param : params) {
                param = param.trim();
                if (param.startsWith("charset")) {
                    String[] pair = param.split("=", 2);
                    if (pair.length == 2) {
                        if (!StringUtils.isEmpty(pair[1])) {
                            charset = pair[1].trim();
                        }
                    }
                    break;
                }
            }
        }

        return charset;
    }

    private static Map<String, String> getParamsFromUrl(String url) {
        Map<String, String> map = null;
        if (url != null && url.indexOf('?') != -1) {
            map = splitUrlQuery(url.substring(url.indexOf('?') + 1));
        }
        if (map == null) {
            map = new HashMap<String, String>();
        }
        return map;
    }

    private static URL buildGetUrl(String strUrl, String query) throws IOException {
        URL url = new URL(strUrl);
        if (StringUtils.isEmpty(query)) {
            return url;
        }

        if (StringUtils.isEmpty(url.getQuery())) {
            if (strUrl.endsWith("?")) {
                strUrl = strUrl + query;
            } else {
                strUrl = strUrl + "?" + query;
            }
        } else {
            if (strUrl.endsWith("&")) {
                strUrl = strUrl + query;
            } else {
                strUrl = strUrl + "&" + query;
            }
        }

        return new URL(strUrl);
    }

    public static String buildQuery(Map<String, String> params, String charset) throws IOException {
        if (params == null || params.isEmpty()) {
            return null;
        }

        StringBuilder query = new StringBuilder();
        Set<Entry<String, String>> entries = params.entrySet();
        boolean hasParam = false;

        for (Entry<String, String> entry : entries) {
            String name = entry.getKey();
            String value = entry.getValue();

            if (StringUtils.areNotEmpty(name, value)) {
                if (hasParam) {
                    query.append("&");
                } else {
                    hasParam = true;
                }

                query.append(name).append("=").append(URLEncoder.encode(value, charset));
            }
        }

        return query.toString();
    }

    /**
     * 
     * @param query
     * @return
     */
    public static Map<String, String> splitUrlQuery(String query) {
        Map<String, String> result = new HashMap<String, String>();

        String[] pairs = query.split("&");
        if (pairs != null && pairs.length > 0) {
            for (String pair : pairs) {
                String[] param = pair.split("=", 2);
                if (param != null && param.length == 2) {
                    result.put(param[0], param[1]);
                }
            }
        }

        return result;
    }

    public <T extends AlipayResponse> T pageExecute(AlipayRequest<T> request) throws AlipayApiException {
        return null;
    }

    public <T extends AlipayResponse> T pageExecute(AlipayRequest<T> request,
                                                    String method) throws AlipayApiException {
        return null;
    }

    public <TR extends AlipayResponse, T extends AlipayRequest<TR>> TR parseAppSyncResult(Map<String, String> result,
                                                                                          Class<T> requsetClazz) throws AlipayApiException {
        return null;
    }

    public <T extends AlipayResponse> T sdkExecute(AlipayRequest<T> request) throws AlipayApiException {
        return null;
    }

}

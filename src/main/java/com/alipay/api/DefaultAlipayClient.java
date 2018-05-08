/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.alipay.api;

import java.io.IOException;
import java.security.Security;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import com.alipay.api.internal.parser.json.ObjectJsonParser;
import com.alipay.api.internal.parser.xml.ObjectXmlParser;
import com.alipay.api.internal.util.AlipayEncrypt;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.internal.util.AlipayLogger;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.internal.util.AlipayUtils;
import com.alipay.api.internal.util.RequestParametersHolder;
import com.alipay.api.internal.util.StringUtils;
import com.alipay.api.internal.util.WebUtils;
import com.alipay.api.internal.util.json.JSONWriter;

/**
 * 
 * @author runzhi
 * @version $Id: DefaultAlipayClient.java, v 0.1 2012-11-49:45:21 runzhi Exp $
 */
public class DefaultAlipayClient implements AlipayClient {

    private String serverUrl;
    private String appId;
    private String privateKey;
    private String prodCode;
    private String format         = AlipayConstants.FORMAT_JSON;
    private String signType       = AlipayConstants.SIGN_TYPE_RSA;

    private String encryptType    = AlipayConstants.ENCRYPT_TYPE_AES;

    private String encryptKey;

    private String alipayPublicKey;

    private String charset;

    private int    connectTimeout = 3000;
    private int    readTimeout    = 15000;

    private String proxyHost;
    private int    proxyPort;

    static {
        //清除安全设置
        Security.setProperty("jdk.certpath.disabledAlgorithms", "");
    }

    public DefaultAlipayClient(String serverUrl, String appId, String privateKey) {
        this.serverUrl = serverUrl;
        this.appId = appId;
        this.privateKey = privateKey;
    }

    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format) {
        this(serverUrl, appId, privateKey);
        this.format = format;
    }

    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format,
                               String charset) {
        this(serverUrl, appId, privateKey, format);
        this.charset = charset;
    }

    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format,
                               String charset, String alipayPublicKey) {
        this(serverUrl, appId, privateKey, format, charset);
        this.alipayPublicKey = alipayPublicKey;
    }

    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format,
                               String charset, String alipayPublicKey, String signType) {
        this(serverUrl, appId, privateKey, format, charset, alipayPublicKey);
        this.signType = signType;
    }

    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format,
                               String charset, String alipayPublicKey, String signType,
                               String proxyHost, int proxyPort) {
        this(serverUrl, appId, privateKey, format, charset, alipayPublicKey, signType);
        this.proxyHost = proxyHost;
        this.proxyPort = proxyPort;
    }

    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format,
                               String charset, String alipayPublicKey, String signType,
                               String encryptKey, String encryptType) {
        this(serverUrl, appId, privateKey, format, charset, alipayPublicKey, signType);
        this.encryptKey = encryptKey;
        this.encryptType = encryptType;
    }

    public static Builder builder(String serverUrl, String appId, String privateKey) {
        return new Builder(serverUrl, appId, privateKey);
    }

    public <T extends AlipayResponse> T execute(AlipayRequest<T> request) throws AlipayApiException {
        return execute(request, null);
    }

    public <T extends AlipayResponse> T execute(AlipayRequest<T> request,
                                                String accessToken) throws AlipayApiException {

        return execute(request, accessToken, null);
    }

    public <T extends AlipayResponse> T execute(AlipayRequest<T> request, String accessToken,
                                                String appAuthToken) throws AlipayApiException {

        AlipayParser<T> parser = null;
        if (AlipayConstants.FORMAT_XML.equals(this.format)) {
            parser = new ObjectXmlParser<T>(request.getResponseClass());
        } else {
            parser = new ObjectJsonParser<T>(request.getResponseClass());
        }

        return _execute(request, parser, accessToken, appAuthToken);
    }

    public <T extends AlipayResponse> T pageExecute(AlipayRequest<T> request) throws AlipayApiException {
        return pageExecute(request, "POST");
    }

    public <T extends AlipayResponse> T pageExecute(AlipayRequest<T> request,
                                                    String httpMethod) throws AlipayApiException {
        RequestParametersHolder requestHolder = getRequestHolderWithSign(request, null, null);
        // 打印完整请求报文
        if (AlipayLogger.isBizDebugEnabled()) {
            AlipayLogger.logBizDebug(getRedirectUrl(requestHolder));
        }
        T rsp = null;
        try {
            Class<T> clazz = request.getResponseClass();
            rsp = clazz.newInstance();
        } catch (InstantiationException e) {
            AlipayLogger.logBizError(e);
        } catch (IllegalAccessException e) {
            AlipayLogger.logBizError(e);
        }
        if ("GET".equalsIgnoreCase(httpMethod)) {
            rsp.setBody(getRedirectUrl(requestHolder));
        } else {
            String baseUrl = getRequestUrl(requestHolder);
            rsp.setBody(WebUtils.buildForm(baseUrl, requestHolder.getApplicationParams()));
        }
        return rsp;
    }

    public <T extends AlipayResponse> T sdkExecute(AlipayRequest<T> request) throws AlipayApiException {
        RequestParametersHolder requestHolder = getRequestHolderWithSign(request, null, null);
        // 打印完整请求报文
        if (AlipayLogger.isBizDebugEnabled()) {
            AlipayLogger.logBizDebug(getSdkParams(requestHolder));
        }
        T rsp = null;
        try {
            Class<T> clazz = request.getResponseClass();
            rsp = clazz.newInstance();
        } catch (InstantiationException e) {
            AlipayLogger.logBizError(e);
        } catch (IllegalAccessException e) {
            AlipayLogger.logBizError(e);
        }
        rsp.setBody(getSdkParams(requestHolder));
        return rsp;
    }

    public <TR extends AlipayResponse, T extends AlipayRequest<TR>> TR parseAppSyncResult(Map<String, String> result,
                                                                                          Class<T> requsetClazz) throws AlipayApiException {
        TR tRsp = null;
        String rsp = result.get("result");

        try {
            T request = requsetClazz.newInstance();
            Class<TR> responseClazz = request.getResponseClass();

            //result为空直接返回SYSTEM_ERROR
            if (StringUtils.isEmpty(rsp)) {
                tRsp = responseClazz.newInstance();
                tRsp.setCode("20000");
                tRsp.setSubCode("ACQ.SYSTEM_ERROR");
                tRsp.setSubMsg(result.get("memo"));
            } else {
                AlipayParser<TR> parser = null;
                if (AlipayConstants.FORMAT_XML.equals(this.format)) {
                    parser = new ObjectXmlParser<TR>(responseClazz);
                } else {
                    parser = new ObjectJsonParser<TR>(responseClazz);
                }

                // 解析实际串
                tRsp = parser.parse(rsp);
                tRsp.setBody(rsp);

                // 验签是对请求返回原始串
                checkResponseSign(request, parser, rsp, tRsp.isSuccess());
                if (!tRsp.isSuccess()) {
                    AlipayLogger.logBizError(rsp);
                }
            }
        } catch (RuntimeException e) {
            AlipayLogger.logBizError(rsp);
            throw e;
        } catch (AlipayApiException e) {
            AlipayLogger.logBizError(rsp);
            throw new AlipayApiException(e);
        } catch (InstantiationException e) {
            AlipayLogger.logBizError(rsp);
            throw new AlipayApiException(e);
        } catch (IllegalAccessException e) {
            AlipayLogger.logBizError(rsp);
            throw new AlipayApiException(e);
        }
        return tRsp;
    }

    /**
     * 组装接口参数，处理加密、签名逻辑
     * 
     * @param request
     * @param accessToken
     * @param appAuthToken
     * @return
     * @throws AlipayApiException
     */
    private <T extends AlipayResponse> RequestParametersHolder getRequestHolderWithSign(AlipayRequest<?> request,
                                                                                        String accessToken,
                                                                                        String appAuthToken) throws AlipayApiException {
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

        // 只有新接口和设置密钥才能支持加密
        if (request.isNeedEncrypt()) {

            if (StringUtils.isEmpty(appParams.get(AlipayConstants.BIZ_CONTENT_KEY))) {

                throw new AlipayApiException("当前API不支持加密请求");
            }

            // 需要加密必须设置密钥和加密算法
            if (!StringUtils.areNotEmpty(this.encryptKey, this.encryptType)) {

                throw new AlipayApiException("API请求要求加密，则必须设置密钥和密钥类型：encryptKey=" + encryptKey
                                             + ",encryptType=" + encryptType);
            }

            String encryptContent = AlipayEncrypt.encryptContent(
                appParams.get(AlipayConstants.BIZ_CONTENT_KEY), this.encryptType, this.encryptKey,
                this.charset);

            appParams.put(AlipayConstants.BIZ_CONTENT_KEY, encryptContent);
        }

        if (!StringUtils.isEmpty(appAuthToken)) {
            appParams.put(AlipayConstants.APP_AUTH_TOKEN, appAuthToken);
        }

        requestHolder.setApplicationParams(appParams);

        if (StringUtils.isEmpty(charset)) {
            charset = AlipayConstants.CHARSET_UTF8;
        }

        AlipayHashMap protocalMustParams = new AlipayHashMap();
        protocalMustParams.put(AlipayConstants.METHOD, request.getApiMethodName());
        protocalMustParams.put(AlipayConstants.VERSION, request.getApiVersion());
        protocalMustParams.put(AlipayConstants.APP_ID, this.appId);
        protocalMustParams.put(AlipayConstants.SIGN_TYPE, this.signType);
        protocalMustParams.put(AlipayConstants.TERMINAL_TYPE, request.getTerminalType());
        protocalMustParams.put(AlipayConstants.TERMINAL_INFO, request.getTerminalInfo());
        protocalMustParams.put(AlipayConstants.NOTIFY_URL, request.getNotifyUrl());
        protocalMustParams.put(AlipayConstants.RETURN_URL, request.getReturnUrl());
        protocalMustParams.put(AlipayConstants.CHARSET, charset);

        if (request.isNeedEncrypt()) {
            protocalMustParams.put(AlipayConstants.ENCRYPT_TYPE, this.encryptType);
        }

        Long timestamp = System.currentTimeMillis();
        DateFormat df = new SimpleDateFormat(AlipayConstants.DATE_TIME_FORMAT);
        df.setTimeZone(TimeZone.getTimeZone(AlipayConstants.DATE_TIMEZONE));
        protocalMustParams.put(AlipayConstants.TIMESTAMP, df.format(new Date(timestamp)));
        requestHolder.setProtocalMustParams(protocalMustParams);

        AlipayHashMap protocalOptParams = new AlipayHashMap();
        protocalOptParams.put(AlipayConstants.FORMAT, format);
        protocalOptParams.put(AlipayConstants.ACCESS_TOKEN, accessToken);
        protocalOptParams.put(AlipayConstants.ALIPAY_SDK, AlipayConstants.SDK_VERSION);
        protocalOptParams.put(AlipayConstants.PROD_CODE, request.getProdCode());
        requestHolder.setProtocalOptParams(protocalOptParams);

        if (!StringUtils.isEmpty(this.signType)) {

            String signContent = AlipaySignature.getSignatureContent(requestHolder);
            protocalMustParams.put(AlipayConstants.SIGN,
                AlipaySignature.rsaSign(signContent, privateKey, charset, this.signType));

        } else {
            protocalMustParams.put(AlipayConstants.SIGN, "");
        }
        return requestHolder;
    }

    /**
     * 获取POST请求的base url
     * 
     * @param requestHolder
     * @return
     * @throws AlipayApiException
     */
    private String getRequestUrl(RequestParametersHolder requestHolder) throws AlipayApiException {
        StringBuffer urlSb = new StringBuffer(serverUrl);
        try {
            String sysMustQuery = WebUtils.buildQuery(requestHolder.getProtocalMustParams(),
                charset);
            String sysOptQuery = WebUtils.buildQuery(requestHolder.getProtocalOptParams(), charset);

            urlSb.append("?");
            urlSb.append(sysMustQuery);
            if (sysOptQuery != null & sysOptQuery.length() > 0) {
                urlSb.append("&");
                urlSb.append(sysOptQuery);
            }
        } catch (IOException e) {
            throw new AlipayApiException(e);
        }

        return urlSb.toString();
    }

    /**
     * GET模式下获取跳转链接
     * 
     * @param requestHolder
     * @return
     * @throws AlipayApiException
     */
    private String getRedirectUrl(RequestParametersHolder requestHolder) throws AlipayApiException {
        StringBuffer urlSb = new StringBuffer(serverUrl);
        try {
            Map<String, String> sortedMap = AlipaySignature.getSortedMap(requestHolder);
            String sortedQuery = WebUtils.buildQuery(sortedMap, charset);
            urlSb.append("?");
            urlSb.append(sortedQuery);
        } catch (IOException e) {
            throw new AlipayApiException(e);
        }

        return urlSb.toString();
    }

    /**
     * 拼装sdk调用时所传参数
     * 
     * @param requestHolder
     * @return
     * @throws AlipayApiException
     */
    private String getSdkParams(RequestParametersHolder requestHolder) throws AlipayApiException {
        StringBuffer urlSb = new StringBuffer();
        try {
            Map<String, String> sortedMap = AlipaySignature.getSortedMap(requestHolder);
            String sortedQuery = WebUtils.buildQuery(sortedMap, charset);
            urlSb.append(sortedQuery);
        } catch (IOException e) {
            throw new AlipayApiException(e);
        }

        return urlSb.toString();
    }

    private <T extends AlipayResponse> T _execute(AlipayRequest<T> request, AlipayParser<T> parser,
                                                  String authToken,
                                                  String appAuthToken) throws AlipayApiException {

        Map<String, Object> rt = doPost(request, authToken, appAuthToken);
        if (rt == null) {
            return null;
        }

        T tRsp = null;

        try {

            // 若需要解密则先解密
            ResponseEncryptItem responseItem = encryptResponse(request, rt, parser);

            // 解析实际串
            tRsp = parser.parse(responseItem.getRealContent());
            tRsp.setBody(responseItem.getRealContent());

            // 验签是对请求返回原始串
            checkResponseSign(request, parser, responseItem.getRespContent(), tRsp.isSuccess());

        } catch (RuntimeException e) {

            AlipayLogger.logBizError((String) rt.get("rsp"));
            throw e;
        } catch (AlipayApiException e) {

            AlipayLogger.logBizError((String) rt.get("rsp"));
            throw new AlipayApiException(e);
        }

        tRsp.setParams((AlipayHashMap) rt.get("textParams"));
        if (!tRsp.isSuccess()) {
            AlipayLogger.logErrorScene(rt, tRsp, "");
        }
        return tRsp;
    }

    /**
     * 
     * 
     * @param request
     * @param accessToken
     * @param appAuthToken
     * @return
     * @throws AlipayApiException
     */
    private <T extends AlipayResponse> Map<String, Object> doPost(AlipayRequest<T> request,
                                                                  String accessToken,
                                                                  String appAuthToken) throws AlipayApiException {
        Map<String, Object> result = new HashMap<String, Object>();
        RequestParametersHolder requestHolder = getRequestHolderWithSign(request, accessToken,
            appAuthToken);

        String url = getRequestUrl(requestHolder);

        // 打印完整请求报文
        if (AlipayLogger.isBizDebugEnabled()) {
            AlipayLogger.logBizDebug(getRedirectUrl(requestHolder));
        }

        String rsp = null;
        try {
            if (request instanceof AlipayUploadRequest) {
                AlipayUploadRequest<T> uRequest = (AlipayUploadRequest<T>) request;
                Map<String, FileItem> fileParams = AlipayUtils.cleanupMap(uRequest.getFileParams());
                rsp = WebUtils.doPost(url, requestHolder.getApplicationParams(), fileParams,
                    charset, connectTimeout, readTimeout, proxyHost, proxyPort);
            } else {
                rsp = WebUtils.doPost(url, requestHolder.getApplicationParams(), charset,
                    connectTimeout, readTimeout, proxyHost, proxyPort);
            }
        } catch (IOException e) {
            throw new AlipayApiException(e);
        }
        result.put("rsp", rsp);
        result.put("textParams", requestHolder.getApplicationParams());
        result.put("protocalMustParams", requestHolder.getProtocalMustParams());
        result.put("protocalOptParams", requestHolder.getProtocalOptParams());
        result.put("url", url);
        return result;
    }

    /**
     *  检查响应签名
     * 
     * @param request
     * @param parser
     * @param responseBody
     * @param responseIsSucess
     * @throws AlipayApiException
     */
    private <T extends AlipayResponse> void checkResponseSign(AlipayRequest<T> request,
                                                              AlipayParser<T> parser,
                                                              String responseBody,
                                                              boolean responseIsSucess) throws AlipayApiException {
        // 针对成功结果且有支付宝公钥的进行验签
        if (!StringUtils.isEmpty(this.alipayPublicKey)) {

            SignItem signItem = parser.getSignItem(request, responseBody);

            if (signItem == null) {

                throw new AlipayApiException("sign check fail: Body is Empty!");
            }

            if (responseIsSucess
                || (!responseIsSucess && !StringUtils.isEmpty(signItem.getSign()))) {

                boolean rsaCheckContent = AlipaySignature.rsaCheck(signItem.getSignSourceDate(),
                    signItem.getSign(), this.alipayPublicKey, this.charset, this.signType);

                if (!rsaCheckContent) {

                    // 针对JSON \/问题，替换/后再尝试做一次验证
                    if (!StringUtils.isEmpty(signItem.getSignSourceDate())
                        && signItem.getSignSourceDate().contains("\\/")) {

                        String srouceData = signItem.getSignSourceDate().replace("\\/", "/");

                        boolean jsonCheck = AlipaySignature.rsaCheck(srouceData, signItem.getSign(),
                            this.alipayPublicKey, this.charset, this.signType);

                        if (!jsonCheck) {
                            throw new AlipayApiException(
                                "sign check fail: check Sign and Data Fail！JSON also！");
                        }
                    } else {

                        throw new AlipayApiException("sign check fail: check Sign and Data Fail!");
                    }
                }
            }

        }
    }

    /**
     *  解密响应
     * 
     * @param request
     * @param rt
     * @param parser
     * @return
     * @throws AlipayApiException
     */
    private <T extends AlipayResponse> ResponseEncryptItem encryptResponse(AlipayRequest<T> request,
                                                                           Map<String, Object> rt,
                                                                           AlipayParser<T> parser) throws AlipayApiException {

        String responseBody = (String) rt.get("rsp");

        String realBody = null;

        // 解密
        if (request.isNeedEncrypt()) {

            // 解密原始串
            realBody = parser.encryptSourceData(request, responseBody, this.format,
                this.encryptType, this.encryptKey, this.charset);
        } else {

            // 解析原内容串
            realBody = (String) rt.get("rsp");
        }

        return new ResponseEncryptItem(responseBody, realBody);

    }

    void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    void setAppId(String appId) {
        this.appId = appId;
    }

    void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    void setFormat(String format) {
        this.format = format;
    }

    void setSignType(String signType) {
        this.signType = signType;
    }

    void setEncryptType(String encryptType) {
        this.encryptType = encryptType;
    }

    void setEncryptKey(String encryptKey) {
        this.encryptKey = encryptKey;
    }

    void setAlipayPublicKey(String alipayPublicKey) {
        this.alipayPublicKey = alipayPublicKey;
    }

    void setCharset(String charset) {
        this.charset = charset;
    }

    void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }

    public static class Builder {
        private DefaultAlipayClient client;

        Builder(String serverUrl, String appId, String privateKey) {
            client = new DefaultAlipayClient(serverUrl, appId, privateKey);
        }

        public DefaultAlipayClient build() {
            return client;
        }

        public Builder prodCode(String prodCode) {
            client.setProdCode(prodCode);
            return this;
        }

        public Builder format(String format) {
            client.setFormat(format);
            return this;
        }

        public Builder signType(String signType) {
            client.setSignType(signType);
            return this;
        }

        public Builder encryptType(String encryptType) {
            client.setEncryptType(encryptType);
            return this;
        }

        public Builder encryptKey(String encryptKey) {
            client.setEncryptKey(encryptKey);
            return this;
        }

        public Builder alipayPublicKey(String alipayPublicKey) {
            client.setAlipayPublicKey(alipayPublicKey);
            return this;
        }

        public Builder charset(String charset) {
            client.setCharset(charset);
            return this;
        }

        public Builder connectTimeout(int connectTimeout) {
            client.setConnectTimeout(connectTimeout);
            return this;
        }

        public Builder readTimeout(int readTimeout) {
            client.setReadTimeout(readTimeout);
            return this;
        }

        public Builder proxyHost(String proxyHost) {
            client.setProxyHost(proxyHost);
            return this;
        }

        public Builder proxyPort(int proxyPort) {
            client.setProxyPort(proxyPort);
            return this;
        }
    }
}

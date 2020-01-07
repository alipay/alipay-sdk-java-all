/**
 * Alipay.com Inc. Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.alipay.api;

import com.alipay.api.internal.parser.json.ObjectJsonParser;
import com.alipay.api.internal.parser.xml.ObjectXmlParser;
import com.alipay.api.internal.util.*;
import com.alipay.api.internal.util.codec.Base64;
import com.alipay.api.internal.util.file.FileUtils;
import com.alipay.api.internal.util.json.JSONWriter;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.net.ssl.SSLException;
import java.io.*;
import java.math.BigInteger;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author liuqun.lq
 * @version $Id: AbstractAlipayClient.java, v 0.1 2018-07-03 10:45:21 liuqun.lq Exp $
 */
public abstract class AbstractAlipayClient implements AlipayClient {
    private String serverUrl;
    private String appId;
    private String prodCode;
    private String format = AlipayConstants.FORMAT_JSON;
    private String signType = AlipayConstants.SIGN_TYPE_RSA;
    private String encryptType = AlipayConstants.ENCRYPT_TYPE_AES;

    private String charset;

    private int connectTimeout = 3000;
    private int readTimeout = 15000;

    private String proxyHost;
    private int proxyPort;
    private SignChecker signChecker;

    private String appCertSN;
    private String alipayCertSN;
    private String alipayRootCertSN;
    private String alipayRootSm2CertSN;
    private String rootCertContent;
    private X509Certificate cert;
    private ConcurrentHashMap<String, X509Certificate> alipayPublicCertMap;
    private ConcurrentHashMap<String, String> alipayPublicKeyMap;

    protected boolean loadTest = false;

    static {
        //清除安全设置
        Security.setProperty("jdk.certpath.disabledAlgorithms", "");

    }

    /**
     * 批量API默认分隔符
     **/
    private static final String BATCH_API_DEFAULT_SPLIT = "#S#";

    public AbstractAlipayClient(String serverUrl, String appId, String format,
                                String charset, String signType) {
        this.serverUrl = serverUrl;
        this.appId = appId;
        if (!StringUtils.isEmpty(format)) {
            this.format = format;
        }
        this.charset = charset;
        if (!StringUtils.isEmpty(signType)) {
            this.signType = signType;
        }
    }

    public AbstractAlipayClient(String serverUrl, String appId, String format,
                                String charset, String signType, String proxyHost,
                                int proxyPort) {
        this(serverUrl, appId, format, charset, signType);
        this.proxyHost = proxyHost;
        this.proxyPort = proxyPort;
    }

    public AbstractAlipayClient(String serverUrl, String appId, String format,
                                String charset, String signType, String encryptType) {
        this(serverUrl, appId, format, charset, signType);
        if (!StringUtils.isEmpty(encryptType)) {
            this.encryptType = encryptType;
        }
    }

    public AbstractAlipayClient(String serverUrl, String appId, String format,
                                String charset, String signType, String certPath,
                                String alipayPublicCertPath, String rootCertPath, String proxyHost,
                                int proxyPort, String encryptType) throws AlipayApiException {
        this(serverUrl, appId, format, charset, signType);
        if (!StringUtils.isEmpty(encryptType)) {
            this.encryptType = encryptType;
        }
        this.proxyHost = proxyHost;
        this.proxyPort = proxyPort;
        //读取根证书（用来校验本地支付宝公钥证书失效后自动从网关下载的新支付宝公钥证书是否有效）
        this.rootCertContent = readFileToString(rootCertPath);
        //alipayRootCertSN根证书序列号
        if (AlipayConstants.SIGN_TYPE_SM2.equals(signType)) {
            this.alipayRootSm2CertSN = AntCertificationUtil.getRootCertSN(this.rootCertContent, "SM2");
        } else {
            this.alipayRootCertSN = AntCertificationUtil.getRootCertSN(this.rootCertContent);
            if (StringUtils.isEmpty(this.alipayRootCertSN)) {
                throw new AlipayApiException("AlipayRootCert Is Invalid");
            }
        }
        //获取应用证书
        this.cert = getCert(certPath);
        //获取支付宝公钥证书
        X509Certificate alipayPublicCert = getCert(alipayPublicCertPath);

        //appCertSN为最终发送给网关的应用证书序列号
        this.appCertSN = getCertSN(cert);
        if (StringUtils.isEmpty(this.appCertSN)) {
            throw new AlipayApiException("AppCert Is Invalid");
        }
        //alipayCertSN为支付宝公钥证书序列号
        this.alipayCertSN = getCertSN(alipayPublicCert);
        //将公钥证书以序列号为key存入map
        ConcurrentHashMap<String, X509Certificate> alipayPublicCertMap = new ConcurrentHashMap<String, X509Certificate>();
        alipayPublicCertMap.put(alipayCertSN, alipayPublicCert);
        this.alipayPublicCertMap = alipayPublicCertMap;
        //获取支付宝公钥以序列号为key存入map
        PublicKey publicKey = alipayPublicCert.getPublicKey();
        ConcurrentHashMap<String, String> alipayPublicKeyMap = new ConcurrentHashMap<String, String>();
        alipayPublicKeyMap.put(alipayCertSN, Base64.encodeBase64String(publicKey.getEncoded()));
        this.alipayPublicKeyMap = alipayPublicKeyMap;
    }

    /**
     * @param certPath 证书路径
     * @return
     * @throws AlipayApiException
     */
    private X509Certificate getCert(String certPath) throws AlipayApiException {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(certPath);
            Security.addProvider(new BouncyCastleProvider());
            CertificateFactory cf = CertificateFactory.getInstance("X.509", "BC");
            X509Certificate cert = (X509Certificate) cf.generateCertificate(inputStream);
            return cert;

        } catch (NoSuchProviderException e) {
            throw new AlipayApiException(e);
        } catch (IOException e) {
            throw new AlipayApiException(e);
        } catch (CertificateException e) {
            throw new AlipayApiException(e);
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new AlipayApiException(e);
            }
        }
    }

    private String getCertSN(X509Certificate cf) throws AlipayApiException {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update((cf.getIssuerX500Principal().getName() + cf.getSerialNumber()).getBytes());
            String certSN = new BigInteger(1, md.digest()).toString(16);
            //BigInteger会把0省略掉，需补全至32位
            certSN = fillMD5(certSN);
            return certSN;
        } catch (NoSuchAlgorithmException e) {
            throw new AlipayApiException(e);
        }
    }

    private static String fillMD5(String md5) {
        return md5.length() == 32 ? md5 : fillMD5("0" + md5);
    }

    private String readFileToString(String rootCertPath) throws AlipayApiException {
        try {
            File file = new File(rootCertPath);
            String client = FileUtils.readFileToString(file);
            return client;
        } catch (IOException e) {
            throw new AlipayApiException(e);
        }

    }

    //校验证书有效期以及是否支付宝颁发
    private boolean verifyCert(String cert) {
        return AntCertificationUtil.isTrusted(cert, this.rootCertContent);
    }

    public <T extends AlipayResponse> T certificateExecute(AlipayRequest<T> request) throws AlipayApiException {
        return certificateExecute(request, null);
    }

    public <T extends AlipayResponse> T certificateExecute(AlipayRequest<T> request, String accessToken) throws AlipayApiException {

        return certificateExecute(request, accessToken, null);
    }

    public <T extends AlipayResponse> T certificateExecute(AlipayRequest<T> request, String accessToken,
                                                           String appAuthToken) throws AlipayApiException {

        return _certificateExecute(request, accessToken, appAuthToken, null);
    }

    public <T extends AlipayResponse> T certificateExecute(AlipayRequest<T> request, String accessToken,
                                                           String appAuthToken, String targetAppId) throws AlipayApiException {

        return _certificateExecute(request, accessToken, appAuthToken, targetAppId);
    }

    public <T extends AlipayResponse> T _certificateExecute(AlipayRequest<T> request, String accessToken,
                                                            String appAuthToken, String targetAppId) throws AlipayApiException {
        T tRsp = null;
        try {
            long beginTime = System.currentTimeMillis();
            Map<String, Object> rt = doPost(request, accessToken, appAuthToken, this.appCertSN, targetAppId);

            Map<String, Long> costTimeMap = new HashMap<String, Long>();
            if (rt.containsKey("prepareTime")) {
                costTimeMap.put("prepareCostTime", (Long) (rt.get("prepareTime")) - beginTime);
                if (rt.containsKey("requestTime")) {
                    costTimeMap.put("requestCostTime", (Long) (rt.get("requestTime")) - (Long) (rt.get("prepareTime")));
                }
            }
            AlipayParser<T> parser = null;
            if (AlipayConstants.FORMAT_XML.equals(this.format)) {
                parser = new ObjectXmlParser<T>(request.getResponseClass());
            } else {
                parser = new ObjectJsonParser<T>(request.getResponseClass());
            }
            // 若需要解密则先解密
            ResponseEncryptItem responseItem = decryptResponse(request, rt, parser);
            // 解析实际串
            tRsp = parser.parse(responseItem.getRealContent());
            tRsp.setBody(responseItem.getRealContent());
            checkResponseCertSign(request, parser, responseItem.getRespContent(), tRsp.isSuccess());

            if (costTimeMap.containsKey("requestCostTime")) {
                costTimeMap.put("postCostTime", System.currentTimeMillis() - (Long) (rt.get("requestTime")));
            }

            tRsp.setParams((AlipayHashMap) rt.get("textParams"));
            if (!tRsp.isSuccess()) {
                AlipayLogger.logErrorScene(rt, tRsp, "", costTimeMap);
            } else {
                AlipayLogger.logBizSummary(rt, tRsp, costTimeMap);
            }
            return tRsp;
        } catch (RuntimeException e) {
            AlipayLogger.logBizError(e);
            throw new AlipayApiException(e);
        } catch (AlipayApiException e) {
            AlipayLogger.logBizError(e);
            throw new AlipayApiException(e);
        }
    }

    /**
     * 检查响应签名
     *
     * @param request
     * @param parser
     * @param responseBody
     * @param responseIsSuccess
     * @throws AlipayApiException
     */
    private <T extends AlipayResponse> void checkResponseCertSign(AlipayRequest<T> request,
                                                                  AlipayParser<T> parser,
                                                                  String responseBody,
                                                                  boolean responseIsSuccess) throws AlipayApiException {
        CertItem certItem = parser.getCertItem(request, responseBody);
        if (certItem == null) {
            throw new AlipayApiException("cert check fail: Body is Empty!");
        }
        if (certItem.getCert() == null && responseIsSuccess
                && !request.getApiMethodName().equals(AlipayOpenAppAlipaycertDownloadRequest.ALIPAYCERT_DOWNLOAD)) {
            throw new AlipayApiException("cert check fail: ALIPAY_CERT_SN is Empty!");
        }
        String alipayPublicKey = null;
        if (certItem.getCert() != null) {
            if (!alipayPublicCertMap.containsKey(certItem.getCert())) {
                //如果返回的支付宝公钥证书序列号与本地支付宝公钥证书序列号不匹配，通过返回的支付宝公钥证书序列号去网关拉取新的支付宝公钥证书
                AlipayOpenAppAlipaycertDownloadRequest alipayRequest = new AlipayOpenAppAlipaycertDownloadRequest();
                alipayRequest.setBizContent("{" +
                        "\"alipay_cert_sn\":\"" + certItem.getCert() + "\"" +
                        "  }");

                Map<String, Object> rt = doPost(alipayRequest, null, null, this.appCertSN, null);
                // 解析实际串
                String respContent = rt.get("rsp").toString();
                AlipayParser<AlipayOpenAppAlipaycertDownloadResponse> parserCert = null;
                parserCert = new ObjectJsonParser<AlipayOpenAppAlipaycertDownloadResponse>(alipayRequest.getResponseClass());
                AlipayOpenAppAlipaycertDownloadResponse alipayResponse = parserCert.parse(respContent);
                if (!alipayResponse.isSuccess()) {
                    throw new AlipayApiException("支付宝公钥证书校验失败，请确认是否为支付宝签发的有效公钥证书");
                }
                String alipayCertContent = alipayResponse.getAlipayCertContent();

                InputStream inputStream = null;
                try {
                    byte[] alipayCert = Base64.decodeBase64String(alipayCertContent);
                    String alipayPublicCertStr = new String(alipayCert);
                    if (!verifyCert(alipayPublicCertStr)) {
                        throw new AlipayApiException("支付宝公钥证书校验失败，请确认是否为支付宝签发的有效公钥证书");
                    }
                    inputStream = new ByteArrayInputStream(alipayCert);
                    CertificateFactory cf = CertificateFactory.getInstance("X.509", "BC");
                    X509Certificate alipayPublicCertNew = (X509Certificate) cf.generateCertificate(inputStream);
                    //获取新证书和公钥添加到map中
                    String alipayCertSNNew = getCertSN(alipayPublicCertNew);
                    this.alipayPublicCertMap.put(alipayCertSNNew, alipayPublicCertNew);
                    PublicKey publicKey = alipayPublicCertNew.getPublicKey();
                    String alipayPublicKeyNew = Base64.encodeBase64String(publicKey.getEncoded());
                    this.alipayPublicKeyMap.put(alipayCertSNNew, alipayPublicKeyNew);

                } catch (NoSuchProviderException e) {
                    throw new AlipayApiException(e);
                } catch (CertificateException e) {
                    throw new AlipayApiException(e);
                } finally {
                    try {
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (IOException e) {
                        throw new AlipayApiException(e);
                    }
                }
            } else if (!alipayPublicKeyMap.containsKey(certItem.getCert())) {
                PublicKey publicKey = alipayPublicCertMap.get(certItem.getCert()).getPublicKey();
                this.alipayPublicKeyMap.put(certItem.getCert(), Base64.encodeBase64String(publicKey.getEncoded()));
            }

            // 针对成功结果且有支付宝公钥的进行验签
            if (alipayPublicCertMap.containsKey(certItem.getCert())) {
                alipayPublicKey = this.alipayPublicKeyMap.get(certItem.getCert());
                if (responseIsSuccess
                        || (!responseIsSuccess && !StringUtils.isEmpty(certItem.getSign()))) {
                    signChecker = new DefaultSignChecker(alipayPublicKey);
                    boolean rsaCheckContent = signChecker.checkCert(certItem.getSignSourceDate(),
                            certItem.getSign(), this.signType, this.charset, alipayPublicKey);
                    if (!rsaCheckContent) {

                        // 针对JSON \/问题，替换/后再尝试做一次验证
                        if (!StringUtils.isEmpty(certItem.getSignSourceDate())
                                && certItem.getSignSourceDate().contains("\\/")) {
                            String srouceData = certItem.getSignSourceDate().replace("\\/", "/");

                            boolean jsonCheck = getSignChecker().check(srouceData, certItem.getSign(),
                                    this.signType, this.charset);
                            if (!jsonCheck) {
                                throw new AlipayApiException(
                                        "cert check fail: check Cert and Data Fail！JSON also！");
                            }
                        } else {

                            throw new AlipayApiException("cert check fail: check Cert and Data Fail!");
                        }
                    }
                }
            } else {

                throw new AlipayApiException("cert check fail: check Cert and Data Fail! CertSN non-existent");
            }
        }

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
        return execute(request, accessToken, appAuthToken, null);
    }

    public <T extends AlipayResponse> T execute(AlipayRequest<T> request, String accessToken,
                                                String appAuthToken, String targetAppId) throws AlipayApiException {

        //如果根证书序列号非空，抛异常提示开发者使用certificateExecute
        if (!StringUtils.isEmpty(this.alipayRootCertSN)) {
            throw new AlipayApiException("检测到证书相关参数已初始化，证书模式下请改为调用certificateExecute");
        }

        AlipayParser<T> parser = null;
        if (AlipayConstants.FORMAT_XML.equals(this.format)) {
            parser = new ObjectXmlParser<T>(request.getResponseClass());
        } else {
            parser = new ObjectJsonParser<T>(request.getResponseClass());
        }

        return _execute(request, parser, accessToken, appAuthToken, targetAppId);
    }

    public BatchAlipayResponse execute(BatchAlipayRequest request) throws AlipayApiException {

        long beginTime = System.currentTimeMillis();

        //发送请求
        Map<String, Object> rt = doPost(request);
        if (rt == null) {
            return null;
        }
        Map<String, Long> costTimeMap = new HashMap<String, Long>();
        if (rt.containsKey("prepareTime")) {
            costTimeMap.put("prepareCostTime", (Long) (rt.get("prepareTime")) - beginTime);
            if (rt.containsKey("requestTime")) {
                costTimeMap.put("requestCostTime", (Long) (rt.get("requestTime")) - (Long) (rt.get("prepareTime")));
            }
        }

        AlipayParser<BatchAlipayResponse> parser = null;
        if (AlipayConstants.FORMAT_XML.equals(this.format)) {
            parser = new ObjectXmlParser<BatchAlipayResponse>(request.getResponseClass());
        } else {
            parser = new ObjectJsonParser<BatchAlipayResponse>(request.getResponseClass());
        }

        BatchAlipayResponse batchAlipayResponse = null;
        try {

            // 若需要解密则先解密
            ResponseEncryptItem responseItem = decryptResponse(request, rt, parser);

            // 解析实际串
            batchAlipayResponse = parser.parse(responseItem.getRealContent());
            batchAlipayResponse.setBody(responseItem.getRealContent());

            // 验签是对请求返回原始串
            checkResponseSign(request, parser, responseItem.getRespContent(), batchAlipayResponse.isSuccess());

            if (costTimeMap.containsKey("requestCostTime")) {
                costTimeMap.put("postCostTime", System.currentTimeMillis() - (Long) (rt.get("requestTime")));
            }

            // 构造响应解释器
            List<AlipayParser<?>> parserList = new ArrayList<AlipayParser<?>>();
            List<AlipayRequestWrapper> requestList = request.getRequestList();
            if (AlipayConstants.FORMAT_XML.equals(this.format)) {
                for (AlipayRequestWrapper aRequestList : requestList) {
                    parserList.add(new ObjectXmlParser(aRequestList.getAlipayRequest().getResponseClass()));
                }
            } else {
                for (AlipayRequestWrapper aRequestList : requestList) {
                    parserList.add(new ObjectJsonParser(aRequestList.getAlipayRequest().getResponseClass()));
                }
            }

            //批量调用失败，直接返回
            if (!batchAlipayResponse.isSuccess()) {
                return batchAlipayResponse;
            }
            String[] responseArray = batchAlipayResponse.getResponseBody().split(BATCH_API_DEFAULT_SPLIT);
            //循环解析业务API响应
            for (int index = 0; index < responseArray.length; index++) {
                AlipayResponse alipayResponse = parserList.get(index).parse(responseArray[index]);
                alipayResponse.setBody(responseArray[index]);
                batchAlipayResponse.addResponse(alipayResponse);
            }
            AlipayLogger.logBizDebug((String) rt.get("rsp"));
            return batchAlipayResponse;
        } catch (RuntimeException e) {

            AlipayLogger.logBizError((String) rt.get("rsp"), costTimeMap);
            throw e;
        } catch (AlipayApiException e) {

            AlipayLogger.logBizError((String) rt.get("rsp"), costTimeMap);
            throw new AlipayApiException(e);
        }
    }

    /**
     * @param request
     * @return
     * @throws AlipayApiException
     */
    private Map<String, Object> doPost(BatchAlipayRequest request) throws AlipayApiException {

        Map<String, Object> result = new HashMap<String, Object>();
        RequestParametersHolder requestHolder = getRequestHolderWithSign(request);

        String url = getRequestUrl(requestHolder);

        // 打印完整请求报文
        if (AlipayLogger.isBizDebugEnabled()) {
            AlipayLogger.logBizDebug(getRedirectUrl(requestHolder));
        }
        result.put("prepareTime", System.currentTimeMillis());

        String rsp = null;
        try {
            rsp = WebUtils.doPost(url, requestHolder.getApplicationParams(), charset,
                    connectTimeout, readTimeout, proxyHost, proxyPort);
        } catch (IOException e) {
            throw new AlipayApiException(e);
        }
        result.put("requestTime", System.currentTimeMillis());
        result.put("rsp", rsp);
        result.put("textParams", requestHolder.getApplicationParams());
        result.put("protocalMustParams", requestHolder.getProtocalMustParams());
        result.put("protocalOptParams", requestHolder.getProtocalOptParams());
        result.put("url", url);
        return result;
    }

    /**
     * 组装批量请求接口参数，处理加密、签名逻辑
     *
     * @param request
     * @return
     * @throws AlipayApiException
     */
    private <T extends AlipayResponse> RequestParametersHolder getRequestHolderWithSign(BatchAlipayRequest request)
            throws AlipayApiException {

        List<AlipayRequestWrapper> requestList = request.getRequestList();
        //校验接口列表非空
        if (requestList == null || requestList.isEmpty()) {
            throw new AlipayApiException("40", "client-error:api request list is empty");
        }

        RequestParametersHolder requestHolder = new RequestParametersHolder();

        //添加协议必须参数
        AlipayHashMap protocalMustParams = new AlipayHashMap();
        protocalMustParams.put(AlipayConstants.METHOD, request.getApiMethodName());
        protocalMustParams.put(AlipayConstants.APP_ID, this.appId);
        protocalMustParams.put(AlipayConstants.SIGN_TYPE, this.signType);
        protocalMustParams.put(AlipayConstants.CHARSET, charset);
        protocalMustParams.put(AlipayConstants.VERSION, request.getApiVersion());

        if (request.isNeedEncrypt()) {
            protocalMustParams.put(AlipayConstants.ENCRYPT_TYPE, this.encryptType);
        }

        //添加协议可选参数
        AlipayHashMap protocalOptParams = new AlipayHashMap();
        protocalOptParams.put(AlipayConstants.FORMAT, format);
        protocalOptParams.put(AlipayConstants.ALIPAY_SDK, AlipayConstants.SDK_VERSION);
        requestHolder.setProtocalOptParams(protocalOptParams);

        Long timestamp = System.currentTimeMillis();
        DateFormat df = new SimpleDateFormat(AlipayConstants.DATE_TIME_FORMAT);
        df.setTimeZone(TimeZone.getTimeZone(AlipayConstants.DATE_TIMEZONE));
        protocalMustParams.put(AlipayConstants.TIMESTAMP, df.format(new Date(timestamp)));
        requestHolder.setProtocalMustParams(protocalMustParams);

        //设置业务参数
        AlipayHashMap appParams = new AlipayHashMap();

        //构造请求主题
        StringBuilder requestBody = new StringBuilder();
        // 组装每个API的请求参数
        for (int index = 0; index < requestList.size(); index++) {
            AlipayRequestWrapper alipayRequestWrapper = requestList.get(index);
            AlipayRequest alipayRequest = alipayRequestWrapper.getAlipayRequest();
            Map<String, Object> apiParams = alipayRequest.getTextParams();
            apiParams.put(AlipayConstants.METHOD, alipayRequest.getApiMethodName());
            apiParams.put(AlipayConstants.APP_AUTH_TOKEN, alipayRequestWrapper.getAppAuthToken());
            apiParams.put(AlipayConstants.ACCESS_TOKEN, alipayRequestWrapper.getAccessToken());
            apiParams.put(AlipayConstants.TARGET_APP_ID, alipayRequestWrapper.getTargetAppId());
            apiParams.put(AlipayConstants.PROD_CODE, alipayRequest.getProdCode());
            apiParams.put(AlipayConstants.NOTIFY_URL, alipayRequest.getNotifyUrl());
            apiParams.put(AlipayConstants.RETURN_URL, alipayRequest.getReturnUrl());
            apiParams.put(AlipayConstants.TERMINAL_INFO, alipayRequest.getTerminalInfo());
            apiParams.put(AlipayConstants.TERMINAL_TYPE, alipayRequest.getTerminalType());
            apiParams.put(AlipayConstants.BATCH_REQUEST_ID, String.valueOf(index));

            // 仅当API包含biz_content参数且值为空时，序列化bizModel填充bizContent
            try {
                if (alipayRequest.getClass().getMethod("getBizContent") != null
                        && StringUtils.isEmpty(appParams.get(AlipayConstants.BIZ_CONTENT_KEY))
                        && alipayRequest.getBizModel() != null) {
                    apiParams.put(AlipayConstants.BIZ_CONTENT_KEY,
                            new JSONWriter().write(alipayRequest.getBizModel(), true));
                }
            } catch (NoSuchMethodException e) {
                // 找不到getBizContent则什么都不做
            } catch (SecurityException e) {
                AlipayLogger.logBizError(e);
            }
            requestBody.append(new JSONWriter().write(apiParams, false));
            if (index != requestList.size() - 1) {
                requestBody.append(BATCH_API_DEFAULT_SPLIT);
            }
        }
        appParams.put(AlipayConstants.BIZ_CONTENT_KEY, requestBody.toString());

        // 只有新接口和设置密钥才能支持加密
        if (request.isNeedEncrypt()) {

            if (StringUtils.isEmpty(appParams.get(AlipayConstants.BIZ_CONTENT_KEY))) {

                throw new AlipayApiException("当前API不支持加密请求");
            }

            // 需要加密必须设置密钥和加密算法
            if (StringUtils.isEmpty(this.encryptType) || getEncryptor() == null) {

                throw new AlipayApiException("API请求要求加密，则必须设置密钥类型和加密器");
            }

            String encryptContent = getEncryptor().encrypt(
                    appParams.get(AlipayConstants.BIZ_CONTENT_KEY), this.encryptType, this.charset);

            appParams.put(AlipayConstants.BIZ_CONTENT_KEY, encryptContent);
        }

        requestHolder.setApplicationParams(appParams);

        if (!StringUtils.isEmpty(this.signType)) {

            String signContent = AlipaySignature.getSignatureContent(requestHolder);
            protocalMustParams.put(AlipayConstants.SIGN,
                    getSigner().sign(signContent, this.signType, charset));

        } else {
            protocalMustParams.put(AlipayConstants.SIGN, "");
        }
        return requestHolder;
    }

    public <T extends AlipayResponse> T pageExecute(AlipayRequest<T> request) throws AlipayApiException {
        return pageExecute(request, "POST");
    }

    public <T extends AlipayResponse> T pageExecute(AlipayRequest<T> request,
                                                    String httpMethod) throws AlipayApiException {
        RequestParametersHolder requestHolder = getRequestHolderWithSign(request, null, null,
                this.appCertSN, null);
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
        RequestParametersHolder requestHolder = getRequestHolderWithSign(request, null, null,
                this.appCertSN, null);
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
     * @param appCertSN    应用证书序列号
     * @return
     * @throws AlipayApiException
     */
    private <T extends AlipayResponse> RequestParametersHolder getRequestHolderWithSign(AlipayRequest<?> request,
                                                                                        String accessToken, String appAuthToken,
                                                                                        String appCertSN, String targetAppId)
            throws AlipayApiException {
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
            if (StringUtils.isEmpty(this.encryptType) || getEncryptor() == null) {

                throw new AlipayApiException("API请求要求加密，则必须设置密钥类型和加密器");
            }

            String encryptContent = getEncryptor().encrypt(
                    appParams.get(AlipayConstants.BIZ_CONTENT_KEY), this.encryptType, this.charset);

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

        if (!StringUtils.isEmpty(targetAppId)) {
            protocalMustParams.put(AlipayConstants.TARGET_APP_ID, targetAppId);
        }

        if (request.isNeedEncrypt()) {
            protocalMustParams.put(AlipayConstants.ENCRYPT_TYPE, this.encryptType);
        }
        //如果应用证书序列号非空，添加应用证书序列号
        if (!StringUtils.isEmpty(appCertSN)) {
            protocalMustParams.put(AlipayConstants.APP_CERT_SN, appCertSN);
        }
        //如果根证书序列号非空，添加根证书序列号
        if (!StringUtils.isEmpty(this.alipayRootCertSN)) {
            protocalMustParams.put(AlipayConstants.ALIPAY_ROOT_CERT_SN, this.alipayRootCertSN);
        }
        //如果SM2根证书序列号非空，添加SM2根证书序列号
        if (!StringUtils.isEmpty(this.alipayRootSm2CertSN)) {
            protocalMustParams.put(AlipayConstants.ALIPAY_ROOT_CERT_SN, this.alipayRootSm2CertSN);
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
                    getSigner().sign(signContent, this.signType, charset));

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
        StringBuilder urlSb = new StringBuilder(serverUrl);
        try {
            String sysMustQuery = WebUtils.buildQuery(loadTest ?
                    LoadTestUtil.getParamsWithLoadTestFlag(requestHolder.getProtocalMustParams())
                    : requestHolder.getProtocalMustParams(), charset);
            String sysOptQuery = WebUtils.buildQuery(requestHolder.getProtocalOptParams(), charset);

            urlSb.append("?");
            urlSb.append(sysMustQuery);
            if (sysOptQuery != null && sysOptQuery.length() > 0) {
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
        StringBuilder urlSb = new StringBuilder(serverUrl);
        try {
            Map<String, String> sortedMap = AlipaySignature.getSortedMap(requestHolder);
            String sortedQuery = WebUtils.buildQuery(loadTest ?
                    LoadTestUtil.getParamsWithLoadTestFlag(sortedMap) : sortedMap, charset);
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
        StringBuilder urlSb = new StringBuilder();
        try {
            Map<String, String> sortedMap = AlipaySignature.getSortedMap(requestHolder);
            String sortedQuery = WebUtils.buildQuery(loadTest ?
                    LoadTestUtil.getParamsWithLoadTestFlag(sortedMap) : sortedMap, charset);
            urlSb.append(sortedQuery);
        } catch (IOException e) {
            throw new AlipayApiException(e);
        }

        return urlSb.toString();
    }

    private <T extends AlipayResponse> T _execute(AlipayRequest<T> request, AlipayParser<T> parser,
                                                  String authToken, String appAuthToken,
                                                  String targetAppId) throws AlipayApiException {

        long beginTime = System.currentTimeMillis();
        //适配新增证书序列号的请求
        Map<String, Object> rt = doPost(request, authToken, appAuthToken, null, targetAppId);
        if (rt == null) {
            return null;
        }
        Map<String, Long> costTimeMap = new HashMap<String, Long>();
        if (rt.containsKey("prepareTime")) {
            costTimeMap.put("prepareCostTime", (Long) (rt.get("prepareTime")) - beginTime);
            if (rt.containsKey("requestTime")) {
                costTimeMap.put("requestCostTime", (Long) (rt.get("requestTime")) - (Long) (rt.get("prepareTime")));
            }
        }

        T tRsp = null;

        try {

            // 若需要解密则先解密
            ResponseEncryptItem responseItem = decryptResponse(request, rt, parser);

            // 解析实际串
            tRsp = parser.parse(responseItem.getRealContent());
            tRsp.setBody(responseItem.getRealContent());

            // 验签是对请求返回原始串
            checkResponseSign(request, parser, responseItem.getRespContent(), tRsp.isSuccess());

            if (costTimeMap.containsKey("requestCostTime")) {
                costTimeMap.put("postCostTime", System.currentTimeMillis() - (Long) (rt.get("requestTime")));
            }
        } catch (RuntimeException e) {

            AlipayLogger.logBizError((String) rt.get("rsp"), costTimeMap);
            throw e;
        } catch (AlipayApiException e) {

            AlipayLogger.logBizError((String) rt.get("rsp"), costTimeMap);
            throw new AlipayApiException(e);
        }

        tRsp.setParams((AlipayHashMap) rt.get("textParams"));
        if (!tRsp.isSuccess()) {
            AlipayLogger.logErrorScene(rt, tRsp, "", costTimeMap);
        } else {
            AlipayLogger.logBizSummary(rt, tRsp, costTimeMap);
        }
        return tRsp;
    }

    /**
     * @param request
     * @param accessToken
     * @param appAuthToken
     * @param appCertSN    应用证书序列号
     * @return
     * @throws AlipayApiException
     */
    private <T extends AlipayResponse> Map<String, Object> doPost(AlipayRequest<T> request,
                                                                  String accessToken, String appAuthToken,
                                                                  String appCertSN, String targetAppId) throws AlipayApiException {
        Map<String, Object> result = new HashMap<String, Object>();
        RequestParametersHolder requestHolder = getRequestHolderWithSign(request, accessToken,
                appAuthToken, appCertSN, targetAppId);

        String url = getRequestUrl(requestHolder);

        // 打印完整请求报文
        if (AlipayLogger.isBizDebugEnabled()) {
            AlipayLogger.logBizDebug(getRedirectUrl(requestHolder));
        }
        result.put("prepareTime", System.currentTimeMillis());

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
        } catch (SSLException e) {
            if (e.getMessage().contains("the trustAnchors parameter must be non-empty")
                    || e.getMessage().contains("PKIX path building failed")) {
                throw new AlipayApiException("SDK已默认开启SSL服务端证书校验，"
                        + "请确认本地JRE默认自带的CA证书库是否正确（JRE主目录下的lib/security/cacerts是否存在。" + e.getMessage(), e);
            }
            throw new AlipayApiException(e);
        } catch (IOException e) {
            throw new AlipayApiException(e);
        }
        result.put("requestTime", System.currentTimeMillis());
        result.put("rsp", rsp);
        result.put("textParams", requestHolder.getApplicationParams());
        result.put("protocalMustParams", requestHolder.getProtocalMustParams());
        result.put("protocalOptParams", requestHolder.getProtocalOptParams());
        result.put("url", url);
        return result;
    }

    /**
     * 检查响应签名
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
        if (getSignChecker() != null) {

            SignItem signItem = parser.getSignItem(request, responseBody);

            if (signItem == null) {

                throw new AlipayApiException("sign check fail: Body is Empty!");
            }

            if (responseIsSucess
                    || (!responseIsSucess && !StringUtils.isEmpty(signItem.getSign()))) {

                boolean rsaCheckContent = getSignChecker().check(signItem.getSignSourceDate(),
                        signItem.getSign(), this.signType, this.charset);

                if (!rsaCheckContent) {

                    // 针对JSON \/问题，替换/后再尝试做一次验证
                    if (!StringUtils.isEmpty(signItem.getSignSourceDate())
                            && signItem.getSignSourceDate().contains("\\/")) {

                        String srouceData = signItem.getSignSourceDate().replace("\\/", "/");

                        boolean jsonCheck = getSignChecker().check(srouceData, signItem.getSign(),
                                this.signType, this.charset);

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
     * 解密响应
     *
     * @param request
     * @param rt
     * @param parser
     * @return
     * @throws AlipayApiException
     */
    private <T extends AlipayResponse> ResponseEncryptItem decryptResponse(AlipayRequest<T> request,
                                                                           Map<String, Object> rt,
                                                                           AlipayParser<T> parser) throws AlipayApiException {

        String responseBody = (String) rt.get("rsp");

        String realBody = null;

        // 解密
        if (request.isNeedEncrypt()) {

            // 解密原始串
            realBody = parser.decryptSourceData(request, responseBody, this.format,
                    getDecryptor(), this.encryptType, this.charset);
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

    void setCharset(String charset) {
        this.charset = charset;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }

    void setCert(X509Certificate cert) {
        this.cert = cert;
    }

    void setAlipayPublicCertMap(ConcurrentHashMap<String, X509Certificate> alipayPublicCertMap) {
        this.alipayPublicCertMap = alipayPublicCertMap;
    }

    public abstract Signer getSigner();

    public abstract SignChecker getSignChecker();

    public abstract Encryptor getEncryptor();

    public abstract Decryptor getDecryptor();
}

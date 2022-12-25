/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api.internal;

import com.alipay.api.AlipayApiException;
import com.alipay.api.CertAlipayRequest;
import com.alipay.api.DefaultAlipayClient;

/**
 * 发起待压测标记OpenAPI请求的AlipayClient
 *
 * @author zhongyu
 * @version $Id: LoadTestAlipayClient.java, v 0.1 2019年09月16日 上午11:31 zhongyu Exp $
 */
public class LoadTestAlipayClient extends DefaultAlipayClient {
    public LoadTestAlipayClient(String serverUrl, String appId, String privateKey) {
        super(serverUrl, appId, privateKey);
        this.loadTest = true;
    }

    public LoadTestAlipayClient(String serverUrl, String appId, String privateKey, String format) {
        super(serverUrl, appId, privateKey, format);
        this.loadTest = true;
    }

    public LoadTestAlipayClient(String serverUrl, String appId, String privateKey, String format, String charset) {
        super(serverUrl, appId, privateKey, format, charset);
        this.loadTest = true;
    }

    public LoadTestAlipayClient(String serverUrl, String appId, String privateKey, String format, String charset,
                                String alipayPublicKey) {
        super(serverUrl, appId, privateKey, format, charset, alipayPublicKey);
        this.loadTest = true;
    }

    public LoadTestAlipayClient(String serverUrl, String appId, String privateKey, String format, String charset,
                                String alipayPublicKey, String signType) {
        super(serverUrl, appId, privateKey, format, charset, alipayPublicKey, signType);
        this.loadTest = true;
    }

    public LoadTestAlipayClient(String serverUrl, String appId, String privateKey, String format, String charset,
                                String alipayPublicKey, String signType, String proxyHost, int proxyPort) {
        super(serverUrl, appId, privateKey, format, charset, alipayPublicKey, signType, proxyHost, proxyPort);
        this.loadTest = true;
    }

    public LoadTestAlipayClient(String serverUrl, String appId, String privateKey, String format, String charset,
                                String alipayPublicKey, String signType, String encryptKey, String encryptType) {
        super(serverUrl, appId, privateKey, format, charset, alipayPublicKey, signType, encryptKey, encryptType);
        this.loadTest = true;
    }

    public LoadTestAlipayClient(CertAlipayRequest certAlipayRequest) throws AlipayApiException {
        super(certAlipayRequest);
        this.loadTest = true;
    }
}
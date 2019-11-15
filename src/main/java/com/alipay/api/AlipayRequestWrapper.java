/**
 * Alipay.com Inc. Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.api;

/**
 * AlipayReqeust的封装实现，仅用于批量调用
 *
 * @author gongyi.tnj
 * @version $Id: AlipayRequestWrapper.java, v 0.1 2018-07-18 上午10:32 gongyi.tnj Exp $
 */
public class AlipayRequestWrapper {

    /**
     * 业务API
     **/
    private AlipayRequest<? extends AlipayRequest> alipayRequest;

    /**
     * 用户授权令牌
     **/
    private String accessToken;

    /**
     * 应用授权令牌
     **/
    private String appAuthToken;

    /**
     * SPI接口路由参数
     */
    private String targetAppId;

    public AlipayRequestWrapper(AlipayRequest alipayRequest, String accessToken, String appAuthToken, String targetAppId) {
        this.alipayRequest = alipayRequest;
        this.accessToken = accessToken;
        this.appAuthToken = appAuthToken;
        this.targetAppId = targetAppId;
    }

    public AlipayRequest getAlipayRequest() {
        return alipayRequest;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getAppAuthToken() {
        return appAuthToken;
    }

    public String getTargetAppId() {
        return targetAppId;
    }
}

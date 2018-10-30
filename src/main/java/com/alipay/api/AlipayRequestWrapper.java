/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.api;

/**
 * AlipayReqeust的封装实现，仅用于批量调用
 * @author gongyi.tnj
 * @version $Id: AlipayRequestWrapper.java, v 0.1 2018-07-18 上午10:32 gongyi.tnj Exp $
 */
public class AlipayRequestWrapper {

    /** 业务API **/
    private AlipayRequest<? extends AlipayRequest> alipayRequest;

    /** 用户授权令牌 **/
    private String                                 accessToken;

    /** 应用授权令牌 **/
    private String                                 appAuthToken;

    public AlipayRequestWrapper() {
    }

    public AlipayRequestWrapper(AlipayRequest alipayRequest) {
        this.alipayRequest = alipayRequest;
    }

    public AlipayRequestWrapper(AlipayRequest alipayRequest, String accessToken) {
        this.alipayRequest = alipayRequest;
        this.accessToken = accessToken;
    }

    public AlipayRequestWrapper(AlipayRequest alipayRequest, String accessToken, String appAuthToken) {
        this.alipayRequest = alipayRequest;
        this.accessToken = accessToken;
        this.appAuthToken = appAuthToken;
    }

    /**
     * Getter method for property <tt>alipayRequest</tt>.
     *
     * @return property value of alipayRequest
     */
    public AlipayRequest getAlipayRequest() {
        return alipayRequest;
    }

    /**
     * Setter method for property <tt>alipayRequest </tt>.
     *
     * @param alipayRequest value to be assigned to property alipayRequest
     */
    public void setAlipayRequest(AlipayRequest alipayRequest) {
        this.alipayRequest = alipayRequest;
    }

    /**
     * Getter method for property <tt>accessToken</tt>.
     *
     * @return property value of accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Setter method for property <tt>accessToken </tt>.
     *
     * @param accessToken value to be assigned to property accessToken
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * Getter method for property <tt>appAuthToken</tt>.
     *
     * @return property value of appAuthToken
     */
    public String getAppAuthToken() {
        return appAuthToken;
    }

    /**
     * Setter method for property <tt>appAuthToken </tt>.
     *
     * @param appAuthToken value to be assigned to property appAuthToken
     */
    public void setAppAuthToken(String appAuthToken) {
        this.appAuthToken = appAuthToken;
    }
}

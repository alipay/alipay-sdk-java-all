/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.alipay.v3.util.model;

import java.util.Map;

/**
 * @author jishupei.jsp
 * @version : CustomizedParams, v0.1 2022年09月22日 4:08 下午 jishupei.jsp Exp $
 */
public class CustomizedParams {

    /**
     * 系统服务商的第三方应用代商家的应用或小程序模板调用支付宝OpenAPI时所传入的授权凭证
     */
    private String appAuthToken;

    /**
     * 额外的header参数
     */
    private Map<String, String> headerParams;

    /**
     * 额外的query参数
     */
    private Map<String, String> queryParams;

    /**
     * body字符串，若bodyContent有值，则请求的body内容为bodyContent
     */
    private String bodyContent;

    /**
     * Getter method for property <tt>appAuthToken</tt>.
     *
     * @return property value of appAuthToken
     */
    public String getAppAuthToken() {
        return appAuthToken;
    }

    /**
     * Setter method for property <tt>appAuthToken</tt>.
     *
     * @param appAuthToken value to be assigned to property appAuthToken
     */
    public void setAppAuthToken(String appAuthToken) {
        this.appAuthToken = appAuthToken;
    }

    /**
     * Getter method for property <tt>headerParams</tt>.
     *
     * @return property value of headerParams
     */
    public Map<String, String> getHeaderParams() {
        return headerParams;
    }

    /**
     * Setter method for property <tt>headerParams</tt>.
     *
     * @param headerParams value to be assigned to property headerParams
     */
    public void setHeaderParams(Map<String, String> headerParams) {
        this.headerParams = headerParams;
    }

    /**
     * Getter method for property <tt>queryParams</tt>.
     *
     * @return property value of queryParams
     */
    public Map<String, String> getQueryParams() {
        return queryParams;
    }

    /**
     * Setter method for property <tt>queryParams</tt>.
     *
     * @param queryParams value to be assigned to property queryParams
     */
    public void setQueryParams(Map<String, String> queryParams) {
        this.queryParams = queryParams;
    }

    /**
     * Getter method for property <tt>bodyContent</tt>.
     *
     * @return property value of bodyContent
     */
    public String getBodyContent() {
        return bodyContent;
    }

    /**
     * Setter method for property <tt>bodyContent</tt>.
     *
     * @param bodyContent value to be assigned to property bodyContent
     */
    public void setBodyContent(String bodyContent) {
        this.bodyContent = bodyContent;
    }
}

/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.alipay.v3.util.model;

import java.io.File;
import java.util.Map;

/**
 * @author jishupei.jsp
 * @version : OpenApiGenericRequest, v0.1 2022年12月14日 12:04 下午 jishupei.jsp Exp $
 */
public class OpenApiGenericRequest {
    /**
     * 系统服务商的第三方应用代商家的应用或小程序模板调用支付宝OpenAPI时所传入的授权凭证
     */
    private String appAuthToken;

    /**
     * path参数
     */
    private Map<String, Object> pathParams;

    /**
     * query参数
     */
    private Map<String, Object> queryParams;

    /**
     * 业务参数
     */
    private Map<String, Object> bizParams;

    /**
     * 文件参数（fileParams不为空则表示文件上传）
     */
    private Map<String, File> fileParams;

    /**
     * 额外的header参数
     */
    private Map<String, String> headerParams;

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
     * Getter method for property <tt>pathParams</tt>.
     *
     * @return property value of pathParams
     */
    public Map<String, Object> getPathParams() {
        return pathParams;
    }

    /**
     * Setter method for property <tt>pathParams</tt>.
     *
     * @param pathParams value to be assigned to property pathParams
     */
    public void setPathParams(Map<String, Object> pathParams) {
        this.pathParams = pathParams;
    }

    /**
     * Getter method for property <tt>queryParams</tt>.
     *
     * @return property value of queryParams
     */
    public Map<String, Object> getQueryParams() {
        return queryParams;
    }

    /**
     * Setter method for property <tt>queryParams</tt>.
     *
     * @param queryParams value to be assigned to property queryParams
     */
    public void setQueryParams(Map<String, Object> queryParams) {
        this.queryParams = queryParams;
    }

    /**
     * Getter method for property <tt>bizParams</tt>.
     *
     * @return property value of bizParams
     */
    public Map<String, Object> getBizParams() {
        return bizParams;
    }

    /**
     * Setter method for property <tt>bizParams</tt>.
     *
     * @param bizParams value to be assigned to property bizParams
     */
    public void setBizParams(Map<String, Object> bizParams) {
        this.bizParams = bizParams;
    }

    /**
     * Getter method for property <tt>fileParams</tt>.
     *
     * @return property value of fileParams
     */
    public Map<String, File> getFileParams() {
        return fileParams;
    }

    /**
     * Setter method for property <tt>fileParams</tt>.
     *
     * @param fileParams value to be assigned to property fileParams
     */
    public void setFileParams(Map<String, File> fileParams) {
        this.fileParams = fileParams;
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
}

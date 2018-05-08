/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.alipay.api;


/**
 * 
 * @author runzhi
 */
public class AlipayApiException extends Exception {

    private static final long serialVersionUID = -238091758285157331L;

    private String            errCode;
    private String            errMsg;

    public AlipayApiException() {
        super();
    }

    public AlipayApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public AlipayApiException(String message) {
        super(message);
    }

    public AlipayApiException(Throwable cause) {
        super(cause);
    }

    public AlipayApiException(String errCode, String errMsg) {
        super(errCode + ":" + errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public String getErrCode() {
        return this.errCode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

}
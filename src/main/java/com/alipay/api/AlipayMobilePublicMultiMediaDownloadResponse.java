/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.alipay.api;

import com.alipay.api.internal.mapping.ApiField;

/**
 * 多媒体文件下载响应
 * @author yikai.hu
 * @version $Id: AlipayMobilePublicMultiMediaDownloadResponse.java, v 0.1 Aug 15, 2014 10:19:31 AM yikai.hu Exp $
 */
public class AlipayMobilePublicMultiMediaDownloadResponse extends AlipayResponse {

    /** serialVersionUID */
    private static final long serialVersionUID = 4500718209713594926L;

    @ApiField("code")
    private String            code;

    @ApiField("msg")
    private String            msg;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    @Override
    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }

}

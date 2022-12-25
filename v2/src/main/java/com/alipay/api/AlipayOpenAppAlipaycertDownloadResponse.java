/**
 * Alipay.com Inc. Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.alipay.api;

import com.alipay.api.internal.mapping.ApiField;

/**
 * 证书文件下载响应
 *
 * @author junying.wjy
 * @version $Id: AlipayOpenAppAlipaycertDownloadResponse.java, v 0.1 2019-07-19 下午04:46 junying.wjy Exp $
 */
public class AlipayOpenAppAlipaycertDownloadResponse extends AlipayResponse {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 4500718209713594926L;

    @ApiField("code")
    private String code;

    @ApiField("msg")
    private String msg;

    @ApiField("alipay_cert_content")
    private String alipayCertContent;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setAlipayCertContent(String alipayCertContent) { this.alipayCertContent = alipayCertContent; }

    public String getAlipayCertContent() { return this.alipayCertContent; }

}

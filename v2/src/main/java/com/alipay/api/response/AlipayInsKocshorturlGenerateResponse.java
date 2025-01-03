package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.kocshorturl.generate response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-15 11:34:55
 */
public class AlipayInsKocshorturlGenerateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2387196911666274186L;

	/** 
	 * 校验成功后，基于入参拼接完链接参数后经转换生成的短链接，在用户进入投保页后会被重定向为原始链接，并由我方前端做进一步解析
	 */
	@ApiField("short_url")
	private String shortUrl;

	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	public String getShortUrl( ) {
		return this.shortUrl;
	}

}

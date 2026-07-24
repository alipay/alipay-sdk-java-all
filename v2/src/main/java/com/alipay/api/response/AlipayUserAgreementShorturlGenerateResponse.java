package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.shorturl.generate response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-16 15:32:44
 */
public class AlipayUserAgreementShorturlGenerateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6619677794736114531L;

	/** 
	 * 原始签约长链接经过转换后得到的短链
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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sign.shakecode.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-19 13:44:45
 */
public class AlipayCommerceSignShakecodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7257989471124748225L;

	/** 
	 * 创建的吱口令，可复制拉起签约页面
	 */
	@ApiField("shake_code")
	private String shakeCode;

	/** 
	 * 签约链接转换的短链接，点击打开签约页面
	 */
	@ApiField("short_url")
	private String shortUrl;

	public void setShakeCode(String shakeCode) {
		this.shakeCode = shakeCode;
	}
	public String getShakeCode( ) {
		return this.shakeCode;
	}

	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	public String getShortUrl( ) {
		return this.shortUrl;
	}

}

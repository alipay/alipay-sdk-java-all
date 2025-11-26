package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.property.manager.auth response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 10:17:37
 */
public class AlipayCommercePropertyManagerAuthResponse extends AlipayResponse {

	private static final long serialVersionUID = 8448115822974598825L;

	/** 
	 * 视频通话页面请求webSocket建联token
	 */
	@ApiField("biz_token")
	private String bizToken;

	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}
	public String getBizToken( ) {
		return this.bizToken;
	}

}

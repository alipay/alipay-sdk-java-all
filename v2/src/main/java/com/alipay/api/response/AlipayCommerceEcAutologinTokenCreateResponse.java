package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.autologin.token.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-15 10:17:42
 */
public class AlipayCommerceEcAutologinTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1431144321521445941L;

	/** 
	 * 令牌
	 */
	@ApiField("auto_login_token")
	private String autoLoginToken;

	public void setAutoLoginToken(String autoLoginToken) {
		this.autoLoginToken = autoLoginToken;
	}
	public String getAutoLoginToken( ) {
		return this.autoLoginToken;
	}

}

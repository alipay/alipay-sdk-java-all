package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.authentication.token.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-28 15:27:48
 */
public class AlipayCommerceMedicalAuthenticationTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3142116245867491312L;

	/** 
	 * 响应的token数据
	 */
	@ApiField("access_token")
	private String accessToken;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getAccessToken( ) {
		return this.accessToken;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.fund.sign.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-30 10:47:34
 */
public class AlipayCommerceEcFundSignApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8365786749733779793L;

	/** 
	 * 签约链接
	 */
	@ApiField("auth_url")
	private String authUrl;

	public void setAuthUrl(String authUrl) {
		this.authUrl = authUrl;
	}
	public String getAuthUrl( ) {
		return this.authUrl;
	}

}

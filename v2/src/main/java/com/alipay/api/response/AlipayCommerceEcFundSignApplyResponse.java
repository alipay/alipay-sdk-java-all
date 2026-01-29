package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.fund.sign.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-28 10:27:42
 */
public class AlipayCommerceEcFundSignApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6725425857517286684L;

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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.orderauth.token.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-21 16:37:36
 */
public class AlipayCommerceTransportOrderauthTokenApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1356298679383122869L;

	/** 
	 * 无需乱码，用来做用户授权
	 */
	@ApiField("industry_auth_token")
	private String industryAuthToken;

	public void setIndustryAuthToken(String industryAuthToken) {
		this.industryAuthToken = industryAuthToken;
	}
	public String getIndustryAuthToken( ) {
		return this.industryAuthToken;
	}

}

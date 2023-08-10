package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.authorization.redicturl.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-27 10:46:58
 */
public class AlipayCommerceEcAuthorizationRedicturlGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5556839265724272729L;

	/** 
	 * 企业端页面链接
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	public String getRedirectUrl( ) {
		return this.redirectUrl;
	}

}

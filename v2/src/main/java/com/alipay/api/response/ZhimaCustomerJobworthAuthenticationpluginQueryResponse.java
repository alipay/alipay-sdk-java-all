package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.jobworth.authenticationplugin.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-07 11:41:43
 */
public class ZhimaCustomerJobworthAuthenticationpluginQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7863786416746852574L;

	/** 
	 * 用于端外直接跳转链接模式的Url入参
	 */
	@ApiField("landing_url")
	private String landingUrl;

	/** 
	 * 用于直接跳转链接模式的Url入参
	 */
	@ApiField("scheme_url")
	private String schemeUrl;

	public void setLandingUrl(String landingUrl) {
		this.landingUrl = landingUrl;
	}
	public String getLandingUrl( ) {
		return this.landingUrl;
	}

	public void setSchemeUrl(String schemeUrl) {
		this.schemeUrl = schemeUrl;
	}
	public String getSchemeUrl( ) {
		return this.schemeUrl;
	}

}

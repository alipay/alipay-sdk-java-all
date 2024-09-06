package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.jobworth.authenticationplugin.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:11
 */
public class ZhimaCustomerJobworthAuthenticationpluginQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6514445914478988848L;

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

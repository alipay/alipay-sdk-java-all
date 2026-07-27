package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.offlinelabor.insurance.sign response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-24 14:14:18
 */
public class AlipayCommerceOfflinelaborInsuranceSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 7142218536314736638L;

	/** 
	 * 企业支付宝签约页面链接
	 */
	@ApiField("sign_page_url")
	private String signPageUrl;

	public void setSignPageUrl(String signPageUrl) {
		this.signPageUrl = signPageUrl;
	}
	public String getSignPageUrl( ) {
		return this.signPageUrl;
	}

}

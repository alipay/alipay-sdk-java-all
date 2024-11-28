package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.taxbill.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-13 19:57:03
 */
public class AlipayCommerceYuntaskTaxbillCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5782693394571386667L;

	/** 
	 * 吱口令短链接
	 */
	@ApiField("sign_url")
	private String signUrl;

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

}

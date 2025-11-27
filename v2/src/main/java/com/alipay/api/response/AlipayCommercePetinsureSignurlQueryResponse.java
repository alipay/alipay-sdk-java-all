package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.petinsure.signurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-03 19:52:08
 */
public class AlipayCommercePetinsureSignurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3899534931571514435L;

	/** 
	 * 商户签约地址
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

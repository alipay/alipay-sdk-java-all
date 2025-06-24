package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.freightflow.accountauth.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-28 16:57:28
 */
public class AlipayCommerceLogisticsFreightflowAccountauthApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5867556546774817413L;

	/** 
	 * 签约地址url
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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.accountpage.get response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-25 14:37:55
 */
public class AlipayCommerceLifeserviceAccountpageGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5359724456633875531L;

	/** 
	 * 充值链接
	 */
	@ApiField("pay_url")
	private String payUrl;

	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}
	public String getPayUrl( ) {
		return this.payUrl;
	}

}

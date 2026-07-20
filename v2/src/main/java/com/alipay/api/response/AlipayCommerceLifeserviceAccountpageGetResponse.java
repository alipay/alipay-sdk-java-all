package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.accountpage.get response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-28 14:42:50
 */
public class AlipayCommerceLifeserviceAccountpageGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2718885527823894874L;

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

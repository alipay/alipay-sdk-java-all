package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.merchantasset.pay response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-03 16:22:32
 */
public class AlipayCommerceRecycleMerchantassetPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 4466385983594243597L;

	/** 
	 * 充值链接，在pc打开该链接，并使用商户账号完成充值
	 */
	@ApiField("pay_link")
	private String payLink;

	public void setPayLink(String payLink) {
		this.payLink = payLink;
	}
	public String getPayLink( ) {
		return this.payLink;
	}

}

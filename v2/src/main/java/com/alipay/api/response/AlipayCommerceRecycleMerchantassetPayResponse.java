package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.merchantasset.pay response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-10 10:14:41
 */
public class AlipayCommerceRecycleMerchantassetPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 3377672942893224981L;

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

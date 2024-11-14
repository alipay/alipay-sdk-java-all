package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.trans.account.deposit response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-28 10:06:46
 */
public class AlipayCommerceEcTransAccountDepositResponse extends AlipayResponse {

	private static final long serialVersionUID = 2739945244946247885L;

	/** 
	 * 充值链接
	 */
	@ApiField("url")
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}

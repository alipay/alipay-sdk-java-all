package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.market.url.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-06 17:02:40
 */
public class AlipayCommerceEcMarketUrlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4395263793474128516L;

	/** 
	 * 行动点跳转地址
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}
	public String getJumpUrl( ) {
		return this.jumpUrl;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.shop.sharecode.generate response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-19 14:07:41
 */
public class AlipayCommerceEcShopSharecodeGenerateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6381484265811536945L;

	/** 
	 * 吱口令
	 */
	@ApiField("share_code")
	private String shareCode;

	public void setShareCode(String shareCode) {
		this.shareCode = shareCode;
	}
	public String getShareCode( ) {
		return this.shareCode;
	}

}

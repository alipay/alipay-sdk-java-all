package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.multideduct.token.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-12 17:27:26
 */
public class AlipayCommerceEducateMultideductTokenApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5274529337558431218L;

	/** 
	 * 校园支付token。用于跳转小程序开通或查询用户开通状态
	 */
	@ApiField("token_id")
	private String tokenId;

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}
	public String getTokenId( ) {
		return this.tokenId;
	}

}

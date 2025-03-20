package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.multideduct.token.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-15 13:12:19
 */
public class AlipayCommerceEducateMultideductTokenApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3218546563932984189L;

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

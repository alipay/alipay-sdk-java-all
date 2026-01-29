package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.token.generate response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-21 14:52:28
 */
public class AlipayFundJointaccountTokenGenerateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2833481229228373192L;

	/** 
	 * 转换存储后的token值
	 */
	@ApiField("token_key")
	private String tokenKey;

	public void setTokenKey(String tokenKey) {
		this.tokenKey = tokenKey;
	}
	public String getTokenKey( ) {
		return this.tokenKey;
	}

}

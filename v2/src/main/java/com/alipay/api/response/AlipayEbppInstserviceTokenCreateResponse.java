package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.instservice.token.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:41
 */
public class AlipayEbppInstserviceTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3254425158465923955L;

	/** 
	 * 预签约令牌
	 */
	@ApiField("sign_token")
	private String signToken;

	public void setSignToken(String signToken) {
		this.signToken = signToken;
	}
	public String getSignToken( ) {
		return this.signToken;
	}

}

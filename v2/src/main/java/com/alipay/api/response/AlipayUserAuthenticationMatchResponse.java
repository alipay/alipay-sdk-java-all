package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.authentication.match response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-21 09:58:15
 */
public class AlipayUserAuthenticationMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 5817692843922473772L;

	/** 
	 * 一致性校验是否通过，T/F
	 */
	@ApiField("match")
	private String match;

	public void setMatch(String match) {
		this.match = match;
	}
	public String getMatch( ) {
		return this.match;
	}

}

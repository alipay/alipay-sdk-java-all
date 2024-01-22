package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.authentication.match response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 10:50:13
 */
public class AlipayUserAuthenticationMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 2713376235215357411L;

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

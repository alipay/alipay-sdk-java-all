package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.authentication.match response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-29 11:06:59
 */
public class AlipayUserAuthenticationMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 4222327439229978286L;

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

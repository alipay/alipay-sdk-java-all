package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.authentication.match response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:14
 */
public class AlipayUserAuthenticationMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 7123772276532681434L;

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

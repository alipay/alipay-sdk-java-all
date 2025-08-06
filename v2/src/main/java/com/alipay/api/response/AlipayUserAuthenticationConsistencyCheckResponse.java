package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.authentication.consistency.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-31 17:01:19
 */
public class AlipayUserAuthenticationConsistencyCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 4741198416341923363L;

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

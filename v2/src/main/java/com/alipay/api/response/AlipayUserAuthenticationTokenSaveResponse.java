package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.authentication.token.save response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-13 14:52:50
 */
public class AlipayUserAuthenticationTokenSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 8285373713452947243L;

	/** 
	 * 认证令牌
	 */
	@ApiField("auth_code")
	private String authCode;

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public String getAuthCode( ) {
		return this.authCode;
	}

}

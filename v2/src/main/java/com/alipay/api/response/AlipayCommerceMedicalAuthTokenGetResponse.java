package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AuthResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.auth.token.get response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-28 15:27:49
 */
public class AlipayCommerceMedicalAuthTokenGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4554219498365195862L;

	/** 
	 * 结果数据
	 */
	@ApiField("auth_result")
	private AuthResult authResult;

	public void setAuthResult(AuthResult authResult) {
		this.authResult = authResult;
	}
	public AuthResult getAuthResult( ) {
		return this.authResult;
	}

}

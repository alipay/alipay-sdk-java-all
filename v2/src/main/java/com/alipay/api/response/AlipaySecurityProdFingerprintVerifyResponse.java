package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.fingerprint.verify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 02:07:38
 */
public class AlipaySecurityProdFingerprintVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5432596476491653511L;

	/** 
	 * IFAA服务端校验结果，true为通过，false为未通过
	 */
	@ApiField("auth_result")
	private Boolean authResult;

	/** 
	 * IFAA标准中用于关联IFAA Server和业务方Server开通状态的token，此token用于提供给业务方关联校验结果。
	 */
	@ApiField("token")
	private String token;

	public void setAuthResult(Boolean authResult) {
		this.authResult = authResult;
	}
	public Boolean getAuthResult( ) {
		return this.authResult;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken( ) {
		return this.token;
	}

}

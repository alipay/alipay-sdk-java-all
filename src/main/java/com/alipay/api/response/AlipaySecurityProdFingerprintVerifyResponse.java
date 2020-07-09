package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.fingerprint.verify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityProdFingerprintVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6348296879829177811L;

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

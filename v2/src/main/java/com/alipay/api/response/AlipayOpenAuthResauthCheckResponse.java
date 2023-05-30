package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.resauth.check response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 01:11:43
 */
public class AlipayOpenAuthResauthCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 7495211699854398983L;

	/** 
	 * 是否授权，1：授权/0：未授权
	 */
	@ApiField("auth_status")
	private Long authStatus;

	public void setAuthStatus(Long authStatus) {
		this.authStatus = authStatus;
	}
	public Long getAuthStatus( ) {
		return this.authStatus;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.resauth.check response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-13 17:15:39
 */
public class AlipayOpenAuthResauthCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 3687155416826828891L;

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

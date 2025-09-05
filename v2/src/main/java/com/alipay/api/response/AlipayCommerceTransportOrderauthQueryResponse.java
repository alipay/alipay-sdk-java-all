package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.orderauth.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-21 14:02:36
 */
public class AlipayCommerceTransportOrderauthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3376833179686373543L;

	/** 
	 * 授权状态
	 */
	@ApiField("auth_status")
	private String authStatus;

	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}
	public String getAuthStatus( ) {
		return this.authStatus;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.secdevice.certify response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-21 11:27:46
 */
public class AlipaySecurityProdSecdeviceCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7855188148765336224L;

	/** 
	 * iifaa响应数据
	 */
	@ApiField("server_response")
	private String serverResponse;

	public void setServerResponse(String serverResponse) {
		this.serverResponse = serverResponse;
	}
	public String getServerResponse( ) {
		return this.serverResponse;
	}

}

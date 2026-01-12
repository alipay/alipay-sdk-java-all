package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.user.open.certify.certify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:31:38
 */
public class MybankCreditUserOpenCertifyCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8329259641548829633L;

	/** 
	 * auth_url
	 */
	@ApiField("auth_url")
	private String authUrl;

	public void setAuthUrl(String authUrl) {
		this.authUrl = authUrl;
	}
	public String getAuthUrl( ) {
		return this.authUrl;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.car.sign response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 02:55:05
 */
public class AlipayPayAppCarSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 2626498945532144219L;

	/** 
	 * 上下文token
	 */
	@ApiField("context_token")
	private String contextToken;

	public void setContextToken(String contextToken) {
		this.contextToken = contextToken;
	}
	public String getContextToken( ) {
		return this.contextToken;
	}

}

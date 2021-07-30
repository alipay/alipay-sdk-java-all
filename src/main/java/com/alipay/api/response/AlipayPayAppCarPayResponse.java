package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.car.pay response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-15 21:17:26
 */
public class AlipayPayAppCarPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 8816498265719676938L;

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

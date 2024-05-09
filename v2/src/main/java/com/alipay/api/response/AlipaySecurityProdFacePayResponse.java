package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.face.pay response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:06:32
 */
public class AlipaySecurityProdFacePayResponse extends AlipayResponse {

	private static final long serialVersionUID = 7884448942192662979L;

	/** 
	 * 1
	 */
	@ApiField("aa")
	private String aa;

	public void setAa(String aa) {
		this.aa = aa;
	}
	public String getAa( ) {
		return this.aa;
	}

}

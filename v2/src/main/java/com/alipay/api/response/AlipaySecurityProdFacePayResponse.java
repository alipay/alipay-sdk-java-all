package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.face.pay response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:36
 */
public class AlipaySecurityProdFacePayResponse extends AlipayResponse {

	private static final long serialVersionUID = 2612761113727879999L;

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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.face.pay.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 01:20:35
 */
public class AlipaySecurityProdFacePayCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7328384483225943294L;

	/** 
	 * 2
	 */
	@ApiField("bbb")
	private String bbb;

	public void setBbb(String bbb) {
		this.bbb = bbb;
	}
	public String getBbb( ) {
		return this.bbb;
	}

}

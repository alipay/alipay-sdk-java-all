package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.test.testa.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-15 16:21:55
 */
public class AlipayOpenAuthTestTestaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2568282372786866331L;

	/** 
	 * test
	 */
	@ApiField("test")
	private String test;

	public void setTest(String test) {
		this.test = test;
	}
	public String getTest( ) {
		return this.test;
	}

}

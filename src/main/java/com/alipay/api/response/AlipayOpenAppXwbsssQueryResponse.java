package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.xwbsss.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 07:03:47
 */
public class AlipayOpenAppXwbsssQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5144738453333824771L;

	/** 
	 * 1
	 */
	@ApiField("a")
	private String a;

	public void setA(String a) {
		this.a = a;
	}
	public String getA( ) {
		return this.a;
	}

}

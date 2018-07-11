package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.xwbsss.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-01-12 14:06:20
 */
public class AlipayOpenAppXwbsssQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8652811835634225162L;

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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.test.gray.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-03 20:07:30
 */
public class AlipayOpenAppTestGrayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3449851514962912595L;

	/** 
	 * 1
	 */
	@ApiField("res")
	private String res;

	public void setRes(String res) {
		this.res = res;
	}
	public String getRes( ) {
		return this.res;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.antest.caselist.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 19:29:15
 */
public class AlipayCommerceAntestCaselistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6448987925781331186L;

	/** 
	 * 用例列表JSONString
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}

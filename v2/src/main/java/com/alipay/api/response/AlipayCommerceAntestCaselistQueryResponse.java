package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.antest.caselist.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 02:19:10
 */
public class AlipayCommerceAntestCaselistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3279785619542712435L;

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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.test.gray.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 20:52:35
 */
public class AlipayOpenAppTestGrayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5655629338799425871L;

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

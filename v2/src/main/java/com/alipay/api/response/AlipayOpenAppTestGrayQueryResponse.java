package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.test.gray.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:03
 */
public class AlipayOpenAppTestGrayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6535165844769372441L;

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

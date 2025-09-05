package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.xwbsss.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class AlipayOpenAppXwbsssQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6751772118719329365L;

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

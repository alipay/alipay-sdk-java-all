package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.isponetest.wzwtest.wzwtest.preview response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 13:10:56
 */
public class AlipayIsponetestWzwtestWzwtestPreviewResponse extends AlipayResponse {

	private static final long serialVersionUID = 5755324477852635381L;

	/** 
	 * 1
	 */
	@ApiField("s")
	private String s;

	public void setS(String s) {
		this.s = s;
	}
	public String getS( ) {
		return this.s;
	}

}

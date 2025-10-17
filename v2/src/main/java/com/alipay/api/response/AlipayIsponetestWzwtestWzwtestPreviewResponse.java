package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.isponetest.wzwtest.wzwtest.preview response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:27:44
 */
public class AlipayIsponetestWzwtestWzwtestPreviewResponse extends AlipayResponse {

	private static final long serialVersionUID = 5795925711857337883L;

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

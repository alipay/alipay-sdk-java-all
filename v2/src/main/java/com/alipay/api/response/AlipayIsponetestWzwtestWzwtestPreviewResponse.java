package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.isponetest.wzwtest.wzwtest.preview response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-03 15:42:30
 */
public class AlipayIsponetestWzwtestWzwtestPreviewResponse extends AlipayResponse {

	private static final long serialVersionUID = 2452113744657163315L;

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

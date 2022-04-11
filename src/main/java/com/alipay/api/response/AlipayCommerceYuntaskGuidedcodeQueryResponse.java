package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.guidedcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-24 13:26:38
 */
public class AlipayCommerceYuntaskGuidedcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1291486814344274682L;

	/** 
	 * 推广码
	 */
	@ApiField("guided_code")
	private String guidedCode;

	public void setGuidedCode(String guidedCode) {
		this.guidedCode = guidedCode;
	}
	public String getGuidedCode( ) {
		return this.guidedCode;
	}

}

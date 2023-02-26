package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.guidedcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 09:31:39
 */
public class AlipayCommerceYuntaskGuidedcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6264843138653531483L;

	/** 
	 * 推广码
	 */
	@ApiField("guided_code")
	private String guidedCode;

	/** 
	 * 推广码图片地址
	 */
	@ApiField("guided_code_img")
	private String guidedCodeImg;

	public void setGuidedCode(String guidedCode) {
		this.guidedCode = guidedCode;
	}
	public String getGuidedCode( ) {
		return this.guidedCode;
	}

	public void setGuidedCodeImg(String guidedCodeImg) {
		this.guidedCodeImg = guidedCodeImg;
	}
	public String getGuidedCodeImg( ) {
		return this.guidedCodeImg;
	}

}

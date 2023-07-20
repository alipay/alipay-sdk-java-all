package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.guidedcode.receive response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-06 14:47:00
 */
public class AlipayCommerceCommonGuidedcodeReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 2839124468873832478L;

	/** 
	 * 二维码地址
	 */
	@ApiField("guided_code")
	private String guidedCode;

	/** 
	 * 二维码图片
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

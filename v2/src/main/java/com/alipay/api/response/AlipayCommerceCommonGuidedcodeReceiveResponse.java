package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.guidedcode.receive response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:03:40
 */
public class AlipayCommerceCommonGuidedcodeReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 1136832142362985195L;

	/** 
	 * 具体跳转的端内链接，为创建模板时的appletId
	 */
	@ApiField("guided_code")
	private String guidedCode;

	/** 
	 * 二维码图片
	 */
	@ApiField("guided_code_img")
	private String guidedCodeImg;

	/** 
	 * 支付宝吱口令
	 */
	@ApiField("guided_share_code")
	private String guidedShareCode;

	/** 
	 * 推广短链接
	 */
	@ApiField("guided_short_url")
	private String guidedShortUrl;

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

	public void setGuidedShareCode(String guidedShareCode) {
		this.guidedShareCode = guidedShareCode;
	}
	public String getGuidedShareCode( ) {
		return this.guidedShareCode;
	}

	public void setGuidedShortUrl(String guidedShortUrl) {
		this.guidedShortUrl = guidedShortUrl;
	}
	public String getGuidedShortUrl( ) {
		return this.guidedShortUrl;
	}

}

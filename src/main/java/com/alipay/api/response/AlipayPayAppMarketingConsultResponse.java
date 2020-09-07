package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.marketing.consult response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-17 11:27:27
 */
public class AlipayPayAppMarketingConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7394628641942554582L;

	/** 
	 * 营销图片地址
	 */
	@ApiField("image")
	private String image;

	/** 
	 * 营销联动唯一标识，商户从响应结果获取到此字段后，在后续调支付宝收单接口进行支付时，需将此字段放入扩展参数中透传带入
	 */
	@ApiField("pre_pay_token")
	private String prePayToken;

	/** 
	 * 营销文案文本内容
	 */
	@ApiField("text")
	private String text;

	public void setImage(String image) {
		this.image = image;
	}
	public String getImage( ) {
		return this.image;
	}

	public void setPrePayToken(String prePayToken) {
		this.prePayToken = prePayToken;
	}
	public String getPrePayToken( ) {
		return this.prePayToken;
	}

	public void setText(String text) {
		this.text = text;
	}
	public String getText( ) {
		return this.text;
	}

}

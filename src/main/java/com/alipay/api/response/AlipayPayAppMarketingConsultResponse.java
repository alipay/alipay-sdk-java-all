package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.marketing.consult response.
 * 
 * @author auto create
 * @since 1.0, 2020-10-22 17:12:28
 */
public class AlipayPayAppMarketingConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8691638674527797243L;

	/** 
	 * 仅当请求使用morse匿名技术时会返回此字段；
morse匿名技术使用的盲签名，商户使用此值与私钥一起对混淆后的密文结果进行解密；
	 */
	@ApiField("blind_signature")
	private String blindSignature;

	/** 
	 * 仅当请求使用morse匿名技术时会返回此字段；
morse匿名技术产出的混淆后的密文结果，需使用商户私钥及接口返回的盲签名对密文进行解密；
	 */
	@ApiListField("confused_cipher_list")
	@ApiField("string")
	private List<String> confusedCipherList;

	/** 
	 * 营销图片地址（使用morse匿名方案时不返回此字段，需要从返回的密文中解密获取）
	 */
	@ApiField("image")
	private String image;

	/** 
	 * 营销联动唯一标识，商户从响应结果获取到此字段后，在后续调支付宝收单接口进行支付时，需将此字段放入扩展参数中透传带入；（使用morse匿名方案时不返回此字段，需要从返回的密文中解密获取）
	 */
	@ApiField("pre_pay_token")
	private String prePayToken;

	/** 
	 * 营销文案文本内容（使用morse匿名方案时不返回此字段，需要从返回的密文中解密获取）
	 */
	@ApiField("text")
	private String text;

	public void setBlindSignature(String blindSignature) {
		this.blindSignature = blindSignature;
	}
	public String getBlindSignature( ) {
		return this.blindSignature;
	}

	public void setConfusedCipherList(List<String> confusedCipherList) {
		this.confusedCipherList = confusedCipherList;
	}
	public List<String> getConfusedCipherList( ) {
		return this.confusedCipherList;
	}

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

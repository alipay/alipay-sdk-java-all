package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.marketing.consult response.
 * 
 * @author auto create
 * @since 1.0, 2020-12-15 10:41:19
 */
public class AlipayPayAppMarketingConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6192494867834795143L;

	/** 
	 * 指定优惠信息；商户无需关注内容，调用收单支付接口时需将此字段的取值放在promo_params中透传带入，key为assignDiscounts
	 */
	@ApiField("assign_discounts")
	private String assignDiscounts;

	/** 
	 * 业务标签；当请求入参need_return_tag为true时才会返回
	 */
	@ApiField("biz_tag")
	private String bizTag;

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
	 * 支付运营扩展信息；商户无需关注内容，调用收单支付接口时需将此字段的取值放在business_params中透传带入，key为payOperationInfo
	 */
	@ApiField("pay_operation_info")
	private String payOperationInfo;

	/** 
	 * 已废弃不再使用
	 */
	@ApiField("pre_pay_token")
	private String prePayToken;

	/** 
	 * 营销文案文本内容（使用morse匿名方案时不返回此字段，需要从返回的密文中解密获取）
	 */
	@ApiField("text")
	private String text;

	public void setAssignDiscounts(String assignDiscounts) {
		this.assignDiscounts = assignDiscounts;
	}
	public String getAssignDiscounts( ) {
		return this.assignDiscounts;
	}

	public void setBizTag(String bizTag) {
		this.bizTag = bizTag;
	}
	public String getBizTag( ) {
		return this.bizTag;
	}

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

	public void setPayOperationInfo(String payOperationInfo) {
		this.payOperationInfo = payOperationInfo;
	}
	public String getPayOperationInfo( ) {
		return this.payOperationInfo;
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

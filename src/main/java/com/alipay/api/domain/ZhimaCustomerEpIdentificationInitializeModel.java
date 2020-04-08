package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业认证V2初始化
 *
 * @author auto create
 * @since 1.0, 2019-08-01 17:30:59
 */
public class ZhimaCustomerEpIdentificationInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 5118525413111963487L;

	/**
	 * 认证模式。
枚举值：法人认证——EP_LEGAL_PERSON_CERTIFY。
	 */
	@ApiField("certify_mode")
	private String certifyMode;

	/**
	 * 值为json串，必须指定身份类型identity_type，不同的身份类型对应的身份信息不同。 当前支持的identity_type=EP_CERT_INFO ，身份信息为法人证件三要素与企业证件三要素，如 {"identity_type": "EP_CERT_INFO", "legal_person_cert_type": "IDENTITY_CARD", "legal_person_cert_name": "收委", "legal_person_cert_no":"260104197909275964", "ep_cert_type": "NATIONAL_LEGAL_MERGE", "ep_cert_name": "xxx有限公司", "ep_cert_no":"91330000327827106L"}。                 

备注：（1）目前法人证件类型仅支持IDENTITY_CARD（身份证），企业证件类型仅支持 NATIONAL_LEGAL（工商注册号）和 NATIONAL_LEGAL_MERGE （ 社会统一信用代码）。 

（2）企业信息可以不填，但是填的话必须填入企业名、企业证件号、企业证件类型。
	 */
	@ApiField("identity_param")
	private String identityParam;

	/**
	 * 认证结束后的商户回调地址。
	 */
	@ApiField("merchant_url")
	private String merchantUrl;

	/**
	 * 产品码，直接使用［示例］给出的值。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 场景码，表示商户在什么场景使用企业认证产品。
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 商户请求的唯一标志，商户要保证其唯一性。值为32位长度的字母数字下划线组合。建议：前面几位字符是商户自定义的简称，中间可以使用一段日期，结尾可以使用一个序列号。
	 */
	@ApiField("transaction_id")
	private String transactionId;

	public String getCertifyMode() {
		return this.certifyMode;
	}
	public void setCertifyMode(String certifyMode) {
		this.certifyMode = certifyMode;
	}

	public String getIdentityParam() {
		return this.identityParam;
	}
	public void setIdentityParam(String identityParam) {
		this.identityParam = identityParam;
	}

	public String getMerchantUrl() {
		return this.merchantUrl;
	}
	public void setMerchantUrl(String merchantUrl) {
		this.merchantUrl = merchantUrl;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}

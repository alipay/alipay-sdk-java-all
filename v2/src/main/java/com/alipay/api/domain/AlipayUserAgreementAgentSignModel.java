package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝个人AI协议签约接口
 *
 * @author auto create
 * @since 1.0, 2025-07-29 14:13:02
 */
public class AlipayUserAgreementAgentSignModel extends AlipayObject {

	private static final long serialVersionUID = 2472361562865612271L;

	/**
	 * 【描述】请按当前接入的方式进行填充，且输入值必须为文档中的参数取值范围。
	 */
	@ApiField("access_params")
	private AccessParams accessParams;

	/**
	 * 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。 格式规则：支持大写小写字母和数字，最长32位。 商户系统按需自定义传入，用于区分用户在同一产品码、同一签约场景下，签订的多份代扣协议。
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/**
	 * 用户在商户侧APP的登录名，如手机号、邮箱、用户名等。用于在签约页面上做展示，脱敏规范为:手机号，显示前3和后2位；email，显示用户名的前3位+*+@域名；如果都不是，隐藏中间四位。如果商户明文传入，支付宝会对内容做脱敏展示。
	 */
	@ApiField("external_logon_id")
	private String externalLogonId;

	/**
	 * 个人签约产品码，商户和支付宝签约时确定，商户可咨询技术支持。
	 */
	@ApiField("personal_product_code")
	private String personalProductCode;

	public AccessParams getAccessParams() {
		return this.accessParams;
	}
	public void setAccessParams(AccessParams accessParams) {
		this.accessParams = accessParams;
	}

	public String getExternalAgreementNo() {
		return this.externalAgreementNo;
	}
	public void setExternalAgreementNo(String externalAgreementNo) {
		this.externalAgreementNo = externalAgreementNo;
	}

	public String getExternalLogonId() {
		return this.externalLogonId;
	}
	public void setExternalLogonId(String externalLogonId) {
		this.externalLogonId = externalLogonId;
	}

	public String getPersonalProductCode() {
		return this.personalProductCode;
	}
	public void setPersonalProductCode(String personalProductCode) {
		this.personalProductCode = personalProductCode;
	}

}

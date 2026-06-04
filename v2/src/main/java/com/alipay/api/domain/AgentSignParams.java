package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能体代理支付签约参数
 *
 * @author auto create
 * @since 1.0, 2026-03-26 17:06:00
 */
public class AgentSignParams extends AlipayObject {

	private static final long serialVersionUID = 3346479668817452538L;

	/**
	 * 签约接入信息
	 */
	@ApiField("access_params")
	private AccessParams accessParams;

	/**
	 * 商户签约号，AI付协议中标示用户的唯一签约号（确保在商户系统中唯一）。 格式规则：支持大写小写字母和数字，最长32位。 商户系统按需自定义传入，用于区分用户在同一产品码、同一签约场景下，签订的多份AI付协议。
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/**
	 * 用户在商户侧APP的登录名，如手机号、邮箱、用户名等。用于在签约页面上做展示，脱敏规范为:手机号，显示前3和后2位；email，显示用户名的前3位+*+@域名；如果都不是，隐藏中间四位。如果商户明文传入，支付宝会对内容做脱敏展示。
	 */
	@ApiField("external_logon_id")
	private String externalLogonId;

	/**
	 * 用户在商户侧的唯一标识
	 */
	@ApiField("external_user_id")
	private String externalUserId;

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

	public String getExternalUserId() {
		return this.externalUserId;
	}
	public void setExternalUserId(String externalUserId) {
		this.externalUserId = externalUserId;
	}

	public String getPersonalProductCode() {
		return this.personalProductCode;
	}
	public void setPersonalProductCode(String personalProductCode) {
		this.personalProductCode = personalProductCode;
	}

}

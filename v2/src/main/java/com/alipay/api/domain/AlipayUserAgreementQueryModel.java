package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝个人代扣协议查询接口
 *
 * @author auto create
 * @since 1.0, 2024-03-15 11:19:15
 */
public class AlipayUserAgreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3569915538993869762L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ） ，如果传了该参数，其他参数会被忽略
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 用户的支付宝登录账号，支持邮箱或手机号码格式。本参数与alipay_open_id 或 alipay_user_id 同时填写，优先按照 alipay_open_id 或 alipay_user_id 处理。
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * 用户的支付宝账号对应 的支付宝唯一用户号，
本参数与alipay_logon_id若都填写，则以本参数为准，优先级高于 alipay_logon_id。
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 用户的支付宝账号对应 的支付宝唯一用户号，以 2088 开头的 16 位纯数字 组成。
本参数与alipay_logon_id若都填写，则以本参数为准，优先级高于 alipay_logon_id。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 代扣协议中标示用户的唯一签约号(确保在商户系统中
唯一)。
格式规则:支持大写小写字母和数字，最长 32 位。
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/**
	 * 协议产品码，商户和支付宝签约时确定，商户可咨询技术支持。
	 */
	@ApiField("personal_product_code")
	private String personalProductCode;

	/**
	 * 签约场景码，该值需要与系统/页面签约接口调用时传入的值保持一 致。如：周期扣款场景与调用 alipay.user.agreement.page.sign(支付宝个人协议页面签约接口) 签约时的 sign_scene 相同。 
注意：当传入商户签约号 external_agreement_no 时，该值不能为空或默认值 DEFAULT|DEFAULT。

	 */
	@ApiField("sign_scene")
	private String signScene;

	/**
	 * 签约第三方主体类型。对于三方协议，表示当前用户和哪一类的第三方主体进行签约。
默认为PARTNER。
	 */
	@ApiField("third_party_type")
	private String thirdPartyType;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAlipayLogonId() {
		return this.alipayLogonId;
	}
	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getExternalAgreementNo() {
		return this.externalAgreementNo;
	}
	public void setExternalAgreementNo(String externalAgreementNo) {
		this.externalAgreementNo = externalAgreementNo;
	}

	public String getPersonalProductCode() {
		return this.personalProductCode;
	}
	public void setPersonalProductCode(String personalProductCode) {
		this.personalProductCode = personalProductCode;
	}

	public String getSignScene() {
		return this.signScene;
	}
	public void setSignScene(String signScene) {
		this.signScene = signScene;
	}

	public String getThirdPartyType() {
		return this.thirdPartyType;
	}
	public void setThirdPartyType(String thirdPartyType) {
		this.thirdPartyType = thirdPartyType;
	}

}

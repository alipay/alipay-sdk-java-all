package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝个人代扣协议查询接口
 *
 * @author auto create
 * @since 1.0, 2019-12-18 19:24:21
 */
public class AlipayUserAgreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7789275961661838512L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ） ，如果传了该参数，其他参数会被忽略
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 用户的支付宝登录账号，支持邮箱或手机号码格式。本参数与alipay_user_id 不可同时为空，若都填写，则以alipay_user_id 为准。
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * 用户的支付宝账号对应 的支付宝唯一用户号，以 2088 开头的 16 位纯数字 组成;
本参数与 alipay_logon_id 不 可同时为空，若都填写，则 以本参数为准，优先级高于 alipay_logon_id。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 代扣协议中标示用户的唯一签约号(确保在商户系统中
唯一)。
格式规则:支持大写小写字 母和数字，最长 32 位。
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/**
	 * 协议产品码，商户和支付宝签约时确定，商户可咨询技术支持。
	 */
	@ApiField("personal_product_code")
	private String personalProductCode;

	/**
	 * 签约协议场景，商户和支付宝签约时确定，商户可咨询技术支持。
当传入商户签约号 external_sign_no 时，场景不能为空或默认值 DEFAULT|DEFAULT。
该值需要与系统/页面签约接口调用时传入的值保持一 致。
	 */
	@ApiField("sign_scene")
	private String signScene;

	/**
	 * 签约第三方主体类型。对于三方协议，表示当前用户和哪一类的第三方主体进行签约。
取值范围:
取值范围：
1. PARTNER（平台商户）;
2. MERCHANT（集团商户），集团下子商户可共享用户签约内容;
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

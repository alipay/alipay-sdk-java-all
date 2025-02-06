package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.sign.effect response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-19 19:22:16
 */
public class AlipayUserAgreementSignEffectResponse extends AlipayResponse {

	private static final long serialVersionUID = 5638327474369461291L;

	/** 
	 * 支付宝用户协议号, 用户签约成功后的支付宝协议号.
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 支付宝账号: 脱敏的支付宝账号.
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/** 
	 * 设备Id
	 */
	@ApiField("device_id")
	private String deviceId;

	/** 
	 * 商户协议号, 代扣协议中标示用户的唯一签约号(确保在商户系统中唯一).
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/** 
	 * 商户登录Id
	 */
	@ApiField("external_logon_id")
	private String externalLogonId;

	/** 
	 * 协议失效时间，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("invalid_time")
	private String invalidTime;

	/** 
	 * 协议产品码，商户和支付宝签约时确定，不同业务场景对应不同的签约产品码。
	 */
	@ApiField("personal_product_code")
	private String personalProductCode;

	/** 
	 * 签约主体类型。
CARD:支付宝账号
CUSTOMER:支付宝用户
	 */
	@ApiField("pricipal_type")
	private String pricipalType;

	/** 
	 * 签约主体标识。
当principal_type为CARD 时，该字段为支付宝用户号;
当principal_type为CUSTOMER时，该字段为支付宝用户标识。一个用户可能有多个支付宝账号，即多个支付宝用户号，但只有一个是支付宝用户标识。
一个支付宝账号对应一个支付宝唯一用户号(以2088开头的16位纯数字组成)。
	 */
	@ApiField("principal_id")
	private String principalId;

	/** 
	 * 签约主体标识。
当principal_type为CARD 时，该字段为支付宝用户号;
当principal_type为CUSTOMER时，该字段为支付宝用户标识。一个用户可能有多个支付宝账号，即多个支付宝用户号，但只有一个是支付宝用户标识。
	 */
	@ApiField("principal_open_id")
	private String principalOpenId;

	/** 
	 * 签约协议的场景。
	 */
	@ApiField("sign_scene")
	private String signScene;

	/** 
	 * 协议签约时间，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("sign_time")
	private String signTime;

	/** 
	 * 协议当前状态.
1. TEMP：暂存，协议未生效过；
2. NORMAL：正常；
3. STOP：暂停
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 签约第三方主体类型。对于三方协议，表示当前用户和哪一类的第三方主体进行签约。
取值范围：
1. PARTNER（平台商户）;
2. MERCHANT（集团商户），集团下子商户可共享用户签约内容;
默认为PARTNER。
	 */
	@ApiField("third_party_type")
	private String thirdPartyType;

	/** 
	 * 协议生效时间，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("valid_time")
	private String validTime;

	/** 
	 * 用户的芝麻信用 openId，供商户查询用户芝麻信用使用。
	 */
	@ApiField("zm_open_id")
	private String zmOpenId;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}
	public String getAlipayLogonId( ) {
		return this.alipayLogonId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceId( ) {
		return this.deviceId;
	}

	public void setExternalAgreementNo(String externalAgreementNo) {
		this.externalAgreementNo = externalAgreementNo;
	}
	public String getExternalAgreementNo( ) {
		return this.externalAgreementNo;
	}

	public void setExternalLogonId(String externalLogonId) {
		this.externalLogonId = externalLogonId;
	}
	public String getExternalLogonId( ) {
		return this.externalLogonId;
	}

	public void setInvalidTime(String invalidTime) {
		this.invalidTime = invalidTime;
	}
	public String getInvalidTime( ) {
		return this.invalidTime;
	}

	public void setPersonalProductCode(String personalProductCode) {
		this.personalProductCode = personalProductCode;
	}
	public String getPersonalProductCode( ) {
		return this.personalProductCode;
	}

	public void setPricipalType(String pricipalType) {
		this.pricipalType = pricipalType;
	}
	public String getPricipalType( ) {
		return this.pricipalType;
	}

	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}
	public String getPrincipalId( ) {
		return this.principalId;
	}

	public void setPrincipalOpenId(String principalOpenId) {
		this.principalOpenId = principalOpenId;
	}
	public String getPrincipalOpenId( ) {
		return this.principalOpenId;
	}

	public void setSignScene(String signScene) {
		this.signScene = signScene;
	}
	public String getSignScene( ) {
		return this.signScene;
	}

	public void setSignTime(String signTime) {
		this.signTime = signTime;
	}
	public String getSignTime( ) {
		return this.signTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setThirdPartyType(String thirdPartyType) {
		this.thirdPartyType = thirdPartyType;
	}
	public String getThirdPartyType( ) {
		return this.thirdPartyType;
	}

	public void setValidTime(String validTime) {
		this.validTime = validTime;
	}
	public String getValidTime( ) {
		return this.validTime;
	}

	public void setZmOpenId(String zmOpenId) {
		this.zmOpenId = zmOpenId;
	}
	public String getZmOpenId( ) {
		return this.zmOpenId;
	}

}

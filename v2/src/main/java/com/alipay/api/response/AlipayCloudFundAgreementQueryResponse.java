package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.fund.agreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-10 10:32:05
 */
public class AlipayCloudFundAgreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4474381582291883954L;

	/** 
	 * 用户签约成功后的协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 返回脱敏的支付宝账号
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/** 
	 * 协议失效时间，格式为 yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("invalid_time")
	private String invalidTime;

	/** 
	 * 协议产品码，商户和支付宝签约时确定，不同业务场景对应不同的签约产品码。
	 */
	@ApiField("personal_product_code")
	private String personalProductCode;

	/** 
	 * 签约主体类型
	 */
	@ApiField("pricipal_type")
	private String pricipalType;

	/** 
	 * 签约协议的场景。
	 */
	@ApiField("sign_scene")
	private String signScene;

	/** 
	 * 协议签约时间，格式为 yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("sign_time")
	private String signTime;

	/** 
	 * 协议当前状态 1. TEMP：暂存，协议未生效过； 2. NORMAL：正常； 3. STOP：暂停
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 签约第三方主体类型。对于三方协议，表示当前用户和哪一类的第三方主体进行签约。 默认为PARTNER。
	 */
	@ApiField("third_party_type")
	private String thirdPartyType;

	/** 
	 * 协议生效时间，格式为 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("valid_time")
	private String validTime;

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

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户签约协议信息
 *
 * @author auto create
 * @since 1.0, 2018-01-05 15:32:09
 */
public class OpenApiSignQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 2546731597974448829L;

	/**
	 * 用户签约成功后的协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

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
	 * 签约主体类型。
CARD:支付宝账号
CUSTOMER:支付宝用户
	 */
	@ApiField("pricipal_type")
	private String pricipalType;

	/**
	 * 签约主体标识。
当principal_type为CARD 时，该字段为支付宝用户号;
当principal_type为 CUSTOMER 时，该字段为支付宝用户标识。一个用户 可能有多个支付宝账号，即多个支付宝用户号，但只有一个是支付宝用户标识。
一个支付宝账号对应一个支付宝唯一用户号(以2088开头的16位纯数字组成)。
	 */
	@ApiField("principal_id")
	private String principalId;

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
	 * 协议当前状态
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
	 * 协议生效时间，格式为 yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("valid_time")
	private String validTime;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getInvalidTime() {
		return this.invalidTime;
	}
	public void setInvalidTime(String invalidTime) {
		this.invalidTime = invalidTime;
	}

	public String getPersonalProductCode() {
		return this.personalProductCode;
	}
	public void setPersonalProductCode(String personalProductCode) {
		this.personalProductCode = personalProductCode;
	}

	public String getPricipalType() {
		return this.pricipalType;
	}
	public void setPricipalType(String pricipalType) {
		this.pricipalType = pricipalType;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getSignScene() {
		return this.signScene;
	}
	public void setSignScene(String signScene) {
		this.signScene = signScene;
	}

	public String getSignTime() {
		return this.signTime;
	}
	public void setSignTime(String signTime) {
		this.signTime = signTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getThirdPartyType() {
		return this.thirdPartyType;
	}
	public void setThirdPartyType(String thirdPartyType) {
		this.thirdPartyType = thirdPartyType;
	}

	public String getValidTime() {
		return this.validTime;
	}
	public void setValidTime(String validTime) {
		this.validTime = validTime;
	}

}

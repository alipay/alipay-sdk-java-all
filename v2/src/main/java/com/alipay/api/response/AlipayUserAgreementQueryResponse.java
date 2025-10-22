package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExecutionPlan;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-29 17:02:19
 */
public class AlipayUserAgreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3537297638488184463L;

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
	 * 授信模式，目前只在花芝代扣（即花芝go）协议时才会返回
	 */
	@ApiField("credit_auth_mode")
	private String creditAuthMode;

	/** 
	 * 设备Id
	 */
	@ApiField("device_id")
	private String deviceId;

	/** 
	 * 还款计划列表
	 */
	@ApiListField("execution_plans")
	@ApiField("execution_plan")
	private List<ExecutionPlan> executionPlans;

	/** 
	 * 代扣协议中标示用户的唯一签约号(确保在商户系统中唯一)。当入参中传了此参数时返回。
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/** 
	 * 外部登录Id。当入参中传了此参数时返回。
	 */
	@ApiField("external_logon_id")
	private String externalLogonId;

	/** 
	 * 协议失效时间，格式为 yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("invalid_time")
	private String invalidTime;

	/** 
	 * 周期扣协议，上次扣款成功时间
	 */
	@ApiField("last_deduct_time")
	private String lastDeductTime;

	/** 
	 * 周期扣协议，预计下次扣款时间
	 */
	@ApiField("next_deduct_time")
	private String nextDeductTime;

	/** 
	 * 协议产品码，商户和支付宝签约时确定，不同业务场景对应不同的签约产品码。
	 */
	@ApiField("personal_product_code")
	private String personalProductCode;

	/** 
	 * 签约主体类型。
	 */
	@ApiField("pricipal_type")
	private String pricipalType;

	/** 
	 * 签约主体标识。
当principal_type为CARD 时，该字段为支付宝用户号;
	 */
	@ApiField("principal_id")
	private String principalId;

	/** 
	 * 签约主体标识。
当principal_type为CARD 时，该字段为支付宝用户号;
	 */
	@ApiField("principal_open_id")
	private String principalOpenId;

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
	 * 单笔代扣额度
	 */
	@ApiField("single_quota")
	private String singleQuota;

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
默认为PARTNER。
	 */
	@ApiField("third_party_type")
	private String thirdPartyType;

	/** 
	 * 协议生效时间，格式为 yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("valid_time")
	private String validTime;

	/** 
	 * 用户的芝麻信用 openId，供商 户查询用户芝麻信用使用。
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

	public void setCreditAuthMode(String creditAuthMode) {
		this.creditAuthMode = creditAuthMode;
	}
	public String getCreditAuthMode( ) {
		return this.creditAuthMode;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceId( ) {
		return this.deviceId;
	}

	public void setExecutionPlans(List<ExecutionPlan> executionPlans) {
		this.executionPlans = executionPlans;
	}
	public List<ExecutionPlan> getExecutionPlans( ) {
		return this.executionPlans;
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

	public void setLastDeductTime(String lastDeductTime) {
		this.lastDeductTime = lastDeductTime;
	}
	public String getLastDeductTime( ) {
		return this.lastDeductTime;
	}

	public void setNextDeductTime(String nextDeductTime) {
		this.nextDeductTime = nextDeductTime;
	}
	public String getNextDeductTime( ) {
		return this.nextDeductTime;
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

	public void setSingleQuota(String singleQuota) {
		this.singleQuota = singleQuota;
	}
	public String getSingleQuota( ) {
		return this.singleQuota;
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

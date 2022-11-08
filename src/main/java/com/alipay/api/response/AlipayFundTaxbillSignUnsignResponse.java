package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.taxbill.sign.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2022-02-16 15:06:43
 */
public class AlipayFundTaxbillSignUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 1188952921164383458L;

	/** 
	 * 解约受理结果
	 */
	@ApiField("accept")
	private Boolean accept;

	/** 
	 * 用工企业和用户以及税筹服务商签订的三方协议的协议ID
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 已弃用字段，签约结果状态请参考sign_status。三方协议状态（已过时）
1.REGISTERED（已签约）
2.TERMINATED（已解约）
	 */
	@ApiField("agreement_status")
	private String agreementStatus;

	/** 
	 * 场景码，固定值：SIGN
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 税筹服务商入驻平台后，平台提供的企业编码
	 */
	@ApiField("contractor_code")
	private String contractorCode;

	/** 
	 * 税筹服务商名称
	 */
	@ApiField("contractor_name")
	private String contractorName;

	/** 
	 * 用工企业入驻后平台后，平台提供的企业编码
	 */
	@ApiField("employer_code")
	private String employerCode;

	/** 
	 * 解约受理失败错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 解约受理失败原因
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 用户在用工企业的唯一性身份标识
	 */
	@ApiField("identification_in_belonging_employer")
	private String identificationInBelongingEmployer;

	/** 
	 * 产品码，固定值：TAX_BILL_PLATFORM
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 用户的签约状态，如果解约处理成功，则返回此字段。参数取值为有限枚举：TERMINATED
	 */
	@ApiField("sign_status")
	private String signStatus;

	/** 
	 * 税优模式，有限枚举。1.TEMPORARY_TAX_REGISTRATION（临时税务登记）2.NATURAL_PERSON_LEVIED（自然人代征）
	 */
	@ApiField("tax_optimization_mode")
	private String taxOptimizationMode;

	/** 
	 * 解约时间
	 */
	@ApiField("terminated_time")
	private String terminatedTime;

	/** 
	 * 已弃用字段，签约结果状态请参考sign_status。用户在平台的会员状态（已过时）：1.TAX_REGISTERED（完成税务注册）2.CONTRACT_TERMINATED（用户已解约）
	 */
	@ApiField("user_status")
	private String userStatus;

	public void setAccept(Boolean accept) {
		this.accept = accept;
	}
	public Boolean getAccept( ) {
		return this.accept;
	}

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId( ) {
		return this.agreementId;
	}

	public void setAgreementStatus(String agreementStatus) {
		this.agreementStatus = agreementStatus;
	}
	public String getAgreementStatus( ) {
		return this.agreementStatus;
	}

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setContractorCode(String contractorCode) {
		this.contractorCode = contractorCode;
	}
	public String getContractorCode( ) {
		return this.contractorCode;
	}

	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}
	public String getContractorName( ) {
		return this.contractorName;
	}

	public void setEmployerCode(String employerCode) {
		this.employerCode = employerCode;
	}
	public String getEmployerCode( ) {
		return this.employerCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setIdentificationInBelongingEmployer(String identificationInBelongingEmployer) {
		this.identificationInBelongingEmployer = identificationInBelongingEmployer;
	}
	public String getIdentificationInBelongingEmployer( ) {
		return this.identificationInBelongingEmployer;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}
	public String getSignStatus( ) {
		return this.signStatus;
	}

	public void setTaxOptimizationMode(String taxOptimizationMode) {
		this.taxOptimizationMode = taxOptimizationMode;
	}
	public String getTaxOptimizationMode( ) {
		return this.taxOptimizationMode;
	}

	public void setTerminatedTime(String terminatedTime) {
		this.terminatedTime = terminatedTime;
	}
	public String getTerminatedTime( ) {
		return this.terminatedTime;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getUserStatus( ) {
		return this.userStatus;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约信息结果
 *
 * @author auto create
 * @since 1.0, 2022-03-30 16:59:21
 */
public class EsignResult extends AlipayObject {

	private static final long serialVersionUID = 6342859271243195481L;

	/**
	 * 用工企业和用户以及税筹ISV签订的三方协议的协议链接
	 */
	@ApiField("agreement_url")
	private String agreementUrl;

	/**
	 * 报税模式，有限枚举。
SUMMARY_DECLARATION（汇总申报）
	 */
	@ApiField("apply_dutiable_mode_enum")
	private String applyDutiableModeEnum;

	/**
	 * 税筹ISV入驻平台后，平台提供的企业编码
	 */
	@ApiField("contractor_code")
	private String contractorCode;

	/**
	 * 税筹ISV公司名称
	 */
	@ApiField("contractor_name")
	private String contractorName;

	/**
	 * 用工企业入驻后平台后，平台提供的企业编码
	 */
	@ApiField("employer_code")
	private String employerCode;

	/**
	 * 用户在用工企业的唯一性身份标识
	 */
	@ApiField("identification_in_belonging_employer")
	private String identificationInBelongingEmployer;

	/**
	 * 发薪模式，有限枚举。
DIRECT_PAYMENT（直接发薪）
	 */
	@ApiField("pay_salary_mode_enum")
	private String paySalaryModeEnum;

	/**
	 * 签约时间
	 */
	@ApiField("sign_time")
	private String signTime;

	/**
	 * 三方协议状态
1.SIGNED（已签约
2.TERMINATING(解约中)
3.TERMINATED(已解约)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 税优模式，有限枚举。1.TEMPORARY_TAX_REGISTRATION（临时税务登记 ）2. NATURAL_PERSON_LEVIED（自然人代征）
	 */
	@ApiField("tax_optimization_mode")
	private String taxOptimizationMode;

	/**
	 * 解约时间
	 */
	@ApiField("termination_time")
	private String terminationTime;

	public String getAgreementUrl() {
		return this.agreementUrl;
	}
	public void setAgreementUrl(String agreementUrl) {
		this.agreementUrl = agreementUrl;
	}

	public String getApplyDutiableModeEnum() {
		return this.applyDutiableModeEnum;
	}
	public void setApplyDutiableModeEnum(String applyDutiableModeEnum) {
		this.applyDutiableModeEnum = applyDutiableModeEnum;
	}

	public String getContractorCode() {
		return this.contractorCode;
	}
	public void setContractorCode(String contractorCode) {
		this.contractorCode = contractorCode;
	}

	public String getContractorName() {
		return this.contractorName;
	}
	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}

	public String getEmployerCode() {
		return this.employerCode;
	}
	public void setEmployerCode(String employerCode) {
		this.employerCode = employerCode;
	}

	public String getIdentificationInBelongingEmployer() {
		return this.identificationInBelongingEmployer;
	}
	public void setIdentificationInBelongingEmployer(String identificationInBelongingEmployer) {
		this.identificationInBelongingEmployer = identificationInBelongingEmployer;
	}

	public String getPaySalaryModeEnum() {
		return this.paySalaryModeEnum;
	}
	public void setPaySalaryModeEnum(String paySalaryModeEnum) {
		this.paySalaryModeEnum = paySalaryModeEnum;
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

	public String getTaxOptimizationMode() {
		return this.taxOptimizationMode;
	}
	public void setTaxOptimizationMode(String taxOptimizationMode) {
		this.taxOptimizationMode = taxOptimizationMode;
	}

	public String getTerminationTime() {
		return this.terminationTime;
	}
	public void setTerminationTime(String terminationTime) {
		this.terminationTime = terminationTime;
	}

}

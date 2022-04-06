package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsurancePerson;
import com.alipay.api.domain.InsurancePeriod;
import com.alipay.api.domain.MobileDeviceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.mobile.code.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-15 09:30:45
 */
public class AlipayInsSceneMobileCodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1452436559911751346L;

	/** 
	 * 投保人
	 */
	@ApiField("applicant")
	private InsurancePerson applicant;

	/** 
	 * 保障期限
	 */
	@ApiField("insurance_period")
	private InsurancePeriod insurancePeriod;

	/** 
	 * 被保人
	 */
	@ApiField("insured")
	private InsurancePerson insured;

	/** 
	 * 设备信息
	 */
	@ApiField("mobile_device_info")
	private MobileDeviceInfo mobileDeviceInfo;

	/** 
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/** 
	 * 保单保费（单位：分）
	 */
	@ApiField("premium")
	private Long premium;

	/** 
	 * 维修类型 unOfficial:严选；official:官修
	 */
	@ApiField("repair_type")
	private String repairType;

	/** 
	 * 保障卡激活状态 
inactivated:未激活，activated:已激活
	 */
	@ApiField("status")
	private String status;

	public void setApplicant(InsurancePerson applicant) {
		this.applicant = applicant;
	}
	public InsurancePerson getApplicant( ) {
		return this.applicant;
	}

	public void setInsurancePeriod(InsurancePeriod insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}
	public InsurancePeriod getInsurancePeriod( ) {
		return this.insurancePeriod;
	}

	public void setInsured(InsurancePerson insured) {
		this.insured = insured;
	}
	public InsurancePerson getInsured( ) {
		return this.insured;
	}

	public void setMobileDeviceInfo(MobileDeviceInfo mobileDeviceInfo) {
		this.mobileDeviceInfo = mobileDeviceInfo;
	}
	public MobileDeviceInfo getMobileDeviceInfo( ) {
		return this.mobileDeviceInfo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyNo( ) {
		return this.policyNo;
	}

	public void setPremium(Long premium) {
		this.premium = premium;
	}
	public Long getPremium( ) {
		return this.premium;
	}

	public void setRepairType(String repairType) {
		this.repairType = repairType;
	}
	public String getRepairType( ) {
		return this.repairType;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}

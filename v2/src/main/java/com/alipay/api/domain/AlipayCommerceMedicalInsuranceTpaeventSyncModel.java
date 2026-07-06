package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * TPA渠道业务事件同步
 *
 * @author auto create
 * @since 1.0, 2026-04-13 21:02:45
 */
public class AlipayCommerceMedicalInsuranceTpaeventSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1561732618993248757L;

	/**
	 * 码值
	 */
	@ApiField("code_value")
	private String codeValue;

	/**
	 * 事件动作
	 */
	@ApiField("event_action")
	private String eventAction;

	/**
	 * {"reason":"xxx"}
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 医院分院医院
	 */
	@ApiField("hospital_branch_code")
	private String hospitalBranchCode;

	/**
	 * 医院分院医院
	 */
	@ApiField("hospital_branch_name")
	private String hospitalBranchName;

	/**
	 * 医院编码
	 */
	@ApiField("hospital_code")
	private String hospitalCode;

	/**
	 * 医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 个单号
	 */
	@ApiField("individual_policy_no")
	private String individualPolicyNo;

	/**
	 * ?付宝?户的唯?ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 机构编号
	 */
	@ApiField("outlet_code")
	private String outletCode;

	/**
	 * 机构名称
	 */
	@ApiField("outlet_name")
	private String outletName;

	/**
	 * 网点类型
	 */
	@ApiField("outlet_type")
	private String outletType;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * TPA编号
	 */
	@ApiField("tpa_id")
	private String tpaId;

	/**
	 * ?付宝?户的唯?ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 就诊日期 
	 */
	@ApiField("visit_date")
	private String visitDate;

	public String getCodeValue() {
		return this.codeValue;
	}
	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}

	public String getEventAction() {
		return this.eventAction;
	}
	public void setEventAction(String eventAction) {
		this.eventAction = eventAction;
	}

	public String getExtData() {
		return this.extData;
	}
	public void setExtData(String extData) {
		this.extData = extData;
	}

	public String getHospitalBranchCode() {
		return this.hospitalBranchCode;
	}
	public void setHospitalBranchCode(String hospitalBranchCode) {
		this.hospitalBranchCode = hospitalBranchCode;
	}

	public String getHospitalBranchName() {
		return this.hospitalBranchName;
	}
	public void setHospitalBranchName(String hospitalBranchName) {
		this.hospitalBranchName = hospitalBranchName;
	}

	public String getHospitalCode() {
		return this.hospitalCode;
	}
	public void setHospitalCode(String hospitalCode) {
		this.hospitalCode = hospitalCode;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getIndividualPolicyNo() {
		return this.individualPolicyNo;
	}
	public void setIndividualPolicyNo(String individualPolicyNo) {
		this.individualPolicyNo = individualPolicyNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutletCode() {
		return this.outletCode;
	}
	public void setOutletCode(String outletCode) {
		this.outletCode = outletCode;
	}

	public String getOutletName() {
		return this.outletName;
	}
	public void setOutletName(String outletName) {
		this.outletName = outletName;
	}

	public String getOutletType() {
		return this.outletType;
	}
	public void setOutletType(String outletType) {
		this.outletType = outletType;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getTpaId() {
		return this.tpaId;
	}
	public void setTpaId(String tpaId) {
		this.tpaId = tpaId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVisitDate() {
		return this.visitDate;
	}
	public void setVisitDate(String visitDate) {
		this.visitDate = visitDate;
	}

}

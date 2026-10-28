package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-21 20:07:58
 */
public class PolicyInfo extends AlipayObject {

	private static final long serialVersionUID = 2681365482165525443L;

	/**
	 * 蚂蚁保单号，销售渠道是蚂蚁保出单时，该字段必填
	 */
	@ApiField("ant_policy_no")
	private String antPolicyNo;

	/**
	 * 直付标识
	 */
	@ApiField("can_direct_pay")
	private String canDirectPay;

	/**
	 * 直付备注
	 */
	@ApiField("can_direct_pay_msg")
	private String canDirectPayMsg;

	/**
	 * 保司类型
	 */
	@ApiField("company_type")
	private String companyType;

	/**
	 * 产品编码
	 */
	@ApiField("dplan_code")
	private String dplanCode;

	/**
	 * 产品名称
	 */
	@ApiField("dplan_name")
	private String dplanName;

	/**
	 * null
	 */
	@ApiListField("duty_residue_amount_list")
	@ApiField("duty_residue_amount")
	private List<DutyResidueAmount> dutyResidueAmountList;

	/**
	 * 电子保单详情，URL链接
	 */
	@ApiField("electronic_policy_url")
	private String electronicPolicyUrl;

	/**
	 * 保单起期，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 是否退保标识
	 */
	@ApiField("end_ind")
	private String endInd;

	/**
	 * 用于理赔理算时的扩展信息透传
	 */
	@ApiField("ext_json")
	private String extJson;

	/**
	 * Y-是  N-否
	 */
	@ApiField("hang_ind")
	private String hangInd;

	/**
	 * 挂起原因
	 */
	@ApiField("hang_reason")
	private String hangReason;

	/**
	 * 是否存在在途理赔
	 */
	@ApiField("has_claims")
	private String hasClaims;

	/**
	 * 是否在途Y-是  N-否
	 */
	@ApiField("has_preservation")
	private String hasPreservation;

	/**
	 * null
	 */
	@ApiListField("person_list")
	@ApiField("policy_person_info")
	private List<PolicyPersonInfo> personList;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 保单类型
	 */
	@ApiField("policy_type")
	private String policyType;

	/**
	 * 是否续保标识
	 */
	@ApiField("renewed_ind")
	private String renewedInd;

	/**
	 * 当前生效保单剩余免赔额，单位：元，保留俩位小数
	 */
	@ApiField("res_deductible_excess")
	private String resDeductibleExcess;

	/**
	 * 权益同步流水号
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 主保单号，加油包场景会有主子保单
	 */
	@ApiField("source_policy_no")
	private String sourcePolicyNo;

	/**
	 * 保单起期，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 保单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 退保原因，按照:「退保类型-退保原因」的格式
	 */
	@ApiField("surrender_reason")
	private String surrenderReason;

	/**
	 * 退保时间
	 */
	@ApiField("surrender_time")
	private String surrenderTime;

	/**
	 * 中止原因文本描述
	 */
	@ApiField("suspended_reason")
	private String suspendedReason;

	/**
	 * 中止时间
	 */
	@ApiField("suspended_time")
	private String suspendedTime;

	/**
	 * 保单生效标识
	 */
	@ApiField("valid_ind")
	private String validInd;

	public String getAntPolicyNo() {
		return this.antPolicyNo;
	}
	public void setAntPolicyNo(String antPolicyNo) {
		this.antPolicyNo = antPolicyNo;
	}

	public String getCanDirectPay() {
		return this.canDirectPay;
	}
	public void setCanDirectPay(String canDirectPay) {
		this.canDirectPay = canDirectPay;
	}

	public String getCanDirectPayMsg() {
		return this.canDirectPayMsg;
	}
	public void setCanDirectPayMsg(String canDirectPayMsg) {
		this.canDirectPayMsg = canDirectPayMsg;
	}

	public String getCompanyType() {
		return this.companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getDplanCode() {
		return this.dplanCode;
	}
	public void setDplanCode(String dplanCode) {
		this.dplanCode = dplanCode;
	}

	public String getDplanName() {
		return this.dplanName;
	}
	public void setDplanName(String dplanName) {
		this.dplanName = dplanName;
	}

	public List<DutyResidueAmount> getDutyResidueAmountList() {
		return this.dutyResidueAmountList;
	}
	public void setDutyResidueAmountList(List<DutyResidueAmount> dutyResidueAmountList) {
		this.dutyResidueAmountList = dutyResidueAmountList;
	}

	public String getElectronicPolicyUrl() {
		return this.electronicPolicyUrl;
	}
	public void setElectronicPolicyUrl(String electronicPolicyUrl) {
		this.electronicPolicyUrl = electronicPolicyUrl;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getEndInd() {
		return this.endInd;
	}
	public void setEndInd(String endInd) {
		this.endInd = endInd;
	}

	public String getExtJson() {
		return this.extJson;
	}
	public void setExtJson(String extJson) {
		this.extJson = extJson;
	}

	public String getHangInd() {
		return this.hangInd;
	}
	public void setHangInd(String hangInd) {
		this.hangInd = hangInd;
	}

	public String getHangReason() {
		return this.hangReason;
	}
	public void setHangReason(String hangReason) {
		this.hangReason = hangReason;
	}

	public String getHasClaims() {
		return this.hasClaims;
	}
	public void setHasClaims(String hasClaims) {
		this.hasClaims = hasClaims;
	}

	public String getHasPreservation() {
		return this.hasPreservation;
	}
	public void setHasPreservation(String hasPreservation) {
		this.hasPreservation = hasPreservation;
	}

	public List<PolicyPersonInfo> getPersonList() {
		return this.personList;
	}
	public void setPersonList(List<PolicyPersonInfo> personList) {
		this.personList = personList;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getPolicyType() {
		return this.policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getRenewedInd() {
		return this.renewedInd;
	}
	public void setRenewedInd(String renewedInd) {
		this.renewedInd = renewedInd;
	}

	public String getResDeductibleExcess() {
		return this.resDeductibleExcess;
	}
	public void setResDeductibleExcess(String resDeductibleExcess) {
		this.resDeductibleExcess = resDeductibleExcess;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getSourcePolicyNo() {
		return this.sourcePolicyNo;
	}
	public void setSourcePolicyNo(String sourcePolicyNo) {
		this.sourcePolicyNo = sourcePolicyNo;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSurrenderReason() {
		return this.surrenderReason;
	}
	public void setSurrenderReason(String surrenderReason) {
		this.surrenderReason = surrenderReason;
	}

	public String getSurrenderTime() {
		return this.surrenderTime;
	}
	public void setSurrenderTime(String surrenderTime) {
		this.surrenderTime = surrenderTime;
	}

	public String getSuspendedReason() {
		return this.suspendedReason;
	}
	public void setSuspendedReason(String suspendedReason) {
		this.suspendedReason = suspendedReason;
	}

	public String getSuspendedTime() {
		return this.suspendedTime;
	}
	public void setSuspendedTime(String suspendedTime) {
		this.suspendedTime = suspendedTime;
	}

	public String getValidInd() {
		return this.validInd;
	}
	public void setValidInd(String validInd) {
		this.validInd = validInd;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-26 19:52:48
 */
public class ClaimResult extends AlipayObject {

	private static final long serialVersionUID = 1457335794199667519L;

	/**
	 * 理赔申请号（保司)
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 支付宝生成的业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 报案号（保司）
	 */
	@ApiField("claim_no")
	private String claimNo;

	/**
	 * 理赔状态
	 */
	@ApiField("claim_status")
	private String claimStatus;

	/**
	 * 保司类型
	 */
	@ApiField("company_type")
	private String companyType;

	/**
	 * 挂号流水号,同就诊id
	 */
	@ApiField("mdtrt_id")
	private String mdtrtId;

	/**
	 * 保单信息
	 */
	@ApiField("policy_info")
	private ClaimResultPolicyInfo policyInfo;

	/**
	 * 报案状态(true，false)
	 */
	@ApiField("report_status")
	private String reportStatus;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getClaimNo() {
		return this.claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getClaimStatus() {
		return this.claimStatus;
	}
	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public String getCompanyType() {
		return this.companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getMdtrtId() {
		return this.mdtrtId;
	}
	public void setMdtrtId(String mdtrtId) {
		this.mdtrtId = mdtrtId;
	}

	public ClaimResultPolicyInfo getPolicyInfo() {
		return this.policyInfo;
	}
	public void setPolicyInfo(ClaimResultPolicyInfo policyInfo) {
		this.policyInfo = policyInfo;
	}

	public String getReportStatus() {
		return this.reportStatus;
	}
	public void setReportStatus(String reportStatus) {
		this.reportStatus = reportStatus;
	}

}

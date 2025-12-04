package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业终本案件明细
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:19:05
 */
public class EpFinalCaseInfo extends AlipayObject {

	private static final long serialVersionUID = 2567493682983435668L;

	/**
	 * 案号
	 */
	@ApiField("case_no")
	private String caseNo;

	/**
	 * 立案时间
	 */
	@ApiField("case_register_date")
	private String caseRegisterDate;

	/**
	 * 终本日期
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 执行法院
	 */
	@ApiField("execution_court")
	private String executionCourt;

	/**
	 * 发布时间
	 */
	@ApiField("issue_date")
	private String issueDate;

	/**
	 * 未履行金额，单位元
	 */
	@ApiField("outstanding_amount")
	private String outstandingAmount;

	/**
	 * 被执行人姓名/名称
	 */
	@ApiField("performed_name")
	private String performedName;

	/**
	 * 执行标的，单位元
	 */
	@ApiField("xzbd")
	private String xzbd;

	public String getCaseNo() {
		return this.caseNo;
	}
	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public String getCaseRegisterDate() {
		return this.caseRegisterDate;
	}
	public void setCaseRegisterDate(String caseRegisterDate) {
		this.caseRegisterDate = caseRegisterDate;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getExecutionCourt() {
		return this.executionCourt;
	}
	public void setExecutionCourt(String executionCourt) {
		this.executionCourt = executionCourt;
	}

	public String getIssueDate() {
		return this.issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getOutstandingAmount() {
		return this.outstandingAmount;
	}
	public void setOutstandingAmount(String outstandingAmount) {
		this.outstandingAmount = outstandingAmount;
	}

	public String getPerformedName() {
		return this.performedName;
	}
	public void setPerformedName(String performedName) {
		this.performedName = performedName;
	}

	public String getXzbd() {
		return this.xzbd;
	}
	public void setXzbd(String xzbd) {
		this.xzbd = xzbd;
	}

}

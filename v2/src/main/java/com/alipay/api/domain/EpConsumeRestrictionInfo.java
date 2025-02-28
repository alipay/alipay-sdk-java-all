package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业限制高消费明细
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:24:35
 */
public class EpConsumeRestrictionInfo extends AlipayObject {

	private static final long serialVersionUID = 2787849668844177442L;

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
	 * 企业信息
	 */
	@ApiField("enterprise_information")
	private String enterpriseInformation;

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
	 * 限制消费人员姓名
	 */
	@ApiField("xzxfryxm")
	private String xzxfryxm;

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

	public String getEnterpriseInformation() {
		return this.enterpriseInformation;
	}
	public void setEnterpriseInformation(String enterpriseInformation) {
		this.enterpriseInformation = enterpriseInformation;
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

	public String getXzxfryxm() {
		return this.xzxfryxm;
	}
	public void setXzxfryxm(String xzxfryxm) {
		this.xzxfryxm = xzxfryxm;
	}

}

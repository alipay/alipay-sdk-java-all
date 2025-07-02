package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 案件信息
 *
 * @author auto create
 * @since 1.0, 2021-08-11 10:21:36
 */
public class ReportInfo extends AlipayObject {

	private static final long serialVersionUID = 8198659818277629927L;

	/**
	 * 赔案号
	 */
	@ApiField("case_no")
	private String caseNo;

	/**
	 * 1-已报案，2-已结案，3-已支付
	 */
	@ApiField("case_status")
	private String caseStatus;

	/**
	 * 赔付次数
	 */
	@ApiField("case_times")
	private String caseTimes;

	/**
	 * 结案赔款金额，单位元，两位小数
	 */
	@ApiField("end_case_amount")
	private String endCaseAmount;

	/**
	 * 结案时间，格式：yyyy-mm-dd hh24:mi:ss
	 */
	@ApiField("end_case_date")
	private String endCaseDate;

	/**
	 * 赔付结论，1赔付 2零结 3商业险拒赔 4整案拒赔 5注销
	 */
	@ApiField("indemnity_conclusion")
	private String indemnityConclusion;

	/**
	 * 支付成功时间，格式：yyyy-mm-dd hh24:mi:ss
	 */
	@ApiField("pay_date")
	private String payDate;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 险种名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 报案时间，格式：yyyy-mm-dd hh24:mi:ss
	 */
	@ApiField("report_date")
	private String reportDate;

	/**
	 * 报案号
	 */
	@ApiField("report_no")
	private String reportNo;

	public String getCaseNo() {
		return this.caseNo;
	}
	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public String getCaseStatus() {
		return this.caseStatus;
	}
	public void setCaseStatus(String caseStatus) {
		this.caseStatus = caseStatus;
	}

	public String getCaseTimes() {
		return this.caseTimes;
	}
	public void setCaseTimes(String caseTimes) {
		this.caseTimes = caseTimes;
	}

	public String getEndCaseAmount() {
		return this.endCaseAmount;
	}
	public void setEndCaseAmount(String endCaseAmount) {
		this.endCaseAmount = endCaseAmount;
	}

	public String getEndCaseDate() {
		return this.endCaseDate;
	}
	public void setEndCaseDate(String endCaseDate) {
		this.endCaseDate = endCaseDate;
	}

	public String getIndemnityConclusion() {
		return this.indemnityConclusion;
	}
	public void setIndemnityConclusion(String indemnityConclusion) {
		this.indemnityConclusion = indemnityConclusion;
	}

	public String getPayDate() {
		return this.payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public String getReportNo() {
		return this.reportNo;
	}
	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

}

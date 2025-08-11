package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业裁判文书明细
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:17:33
 */
public class EpVerdictInfo extends AlipayObject {

	private static final long serialVersionUID = 3114953959933554613L;

	/**
	 * 案由
	 */
	@ApiField("case_cause")
	private String caseCause;

	/**
	 * 案号
	 */
	@ApiField("case_no")
	private String caseNo;

	/**
	 * 法院
	 */
	@ApiField("court")
	private String court;

	/**
	 * 发布时间
	 */
	@ApiField("issue_date")
	private String issueDate;

	/**
	 * 判决时间
	 */
	@ApiField("judgment_date")
	private String judgmentDate;

	/**
	 * 当事人列表
	 */
	@ApiListField("parties")
	@ApiField("ep_verdict_parties_info")
	private List<EpVerdictPartiesInfo> parties;

	/**
	 * 给付金额，返回值带有单位
	 */
	@ApiField("payment_sum")
	private String paymentSum;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public String getCaseCause() {
		return this.caseCause;
	}
	public void setCaseCause(String caseCause) {
		this.caseCause = caseCause;
	}

	public String getCaseNo() {
		return this.caseNo;
	}
	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public String getCourt() {
		return this.court;
	}
	public void setCourt(String court) {
		this.court = court;
	}

	public String getIssueDate() {
		return this.issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getJudgmentDate() {
		return this.judgmentDate;
	}
	public void setJudgmentDate(String judgmentDate) {
		this.judgmentDate = judgmentDate;
	}

	public List<EpVerdictPartiesInfo> getParties() {
		return this.parties;
	}
	public void setParties(List<EpVerdictPartiesInfo> parties) {
		this.parties = parties;
	}

	public String getPaymentSum() {
		return this.paymentSum;
	}
	public void setPaymentSum(String paymentSum) {
		this.paymentSum = paymentSum;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}

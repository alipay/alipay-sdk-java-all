package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约还款计划
 *
 * @author auto create
 * @since 1.0, 2023-01-05 14:19:59
 */
public class InstRepayPlan extends AlipayObject {

	private static final long serialVersionUID = 5589138799779697199L;

	/**
	 * 是否是当期。 默认值为不是当期计划。如果合约最后一期计划都已经逾期，就不再存在当期计划，合约下所有计划明细的该值都为false
	 */
	@ApiField("cur_term")
	private Boolean curTerm;

	/**
	 * 当期利息，单位：元
	 */
	@ApiField("cur_term_interest")
	private String curTermInterest;

	/**
	 * 当期利息罚息，单位：元
	 */
	@ApiField("cur_term_interest_penalty")
	private String curTermInterestPenalty;

	/**
	 * 当期本金，单位：元
	 */
	@ApiField("cur_term_principal")
	private String curTermPrincipal;

	/**
	 * 当期本金罚息，单位：元
	 */
	@ApiField("cur_term_principal_penalty")
	private String curTermPrincipalPenalty;

	/**
	 * 当期已还利息，单位：元
	 */
	@ApiField("repaid_interest")
	private String repaidInterest;

	/**
	 * 当期已还利息罚息，单位：元
	 */
	@ApiField("repaid_interest_penalty")
	private String repaidInterestPenalty;

	/**
	 * 当期已还本金，单位：元
	 */
	@ApiField("repaid_principal")
	private String repaidPrincipal;

	/**
	 * 当期已还本金罚息，单位：元
	 */
	@ApiField("repaid_principal_penalty")
	private String repaidPrincipalPenalty;

	/**
	 * 分期状态（NORMAL：正常，OVD：逾期，CLEAR：已结清)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 本期到期日
	 */
	@ApiField("term_end_date")
	private String termEndDate;

	/**
	 * 期次号
	 */
	@ApiField("term_no")
	private Long termNo;

	/**
	 * 本期开始日
	 */
	@ApiField("term_start_date")
	private String termStartDate;

	public Boolean getCurTerm() {
		return this.curTerm;
	}
	public void setCurTerm(Boolean curTerm) {
		this.curTerm = curTerm;
	}

	public String getCurTermInterest() {
		return this.curTermInterest;
	}
	public void setCurTermInterest(String curTermInterest) {
		this.curTermInterest = curTermInterest;
	}

	public String getCurTermInterestPenalty() {
		return this.curTermInterestPenalty;
	}
	public void setCurTermInterestPenalty(String curTermInterestPenalty) {
		this.curTermInterestPenalty = curTermInterestPenalty;
	}

	public String getCurTermPrincipal() {
		return this.curTermPrincipal;
	}
	public void setCurTermPrincipal(String curTermPrincipal) {
		this.curTermPrincipal = curTermPrincipal;
	}

	public String getCurTermPrincipalPenalty() {
		return this.curTermPrincipalPenalty;
	}
	public void setCurTermPrincipalPenalty(String curTermPrincipalPenalty) {
		this.curTermPrincipalPenalty = curTermPrincipalPenalty;
	}

	public String getRepaidInterest() {
		return this.repaidInterest;
	}
	public void setRepaidInterest(String repaidInterest) {
		this.repaidInterest = repaidInterest;
	}

	public String getRepaidInterestPenalty() {
		return this.repaidInterestPenalty;
	}
	public void setRepaidInterestPenalty(String repaidInterestPenalty) {
		this.repaidInterestPenalty = repaidInterestPenalty;
	}

	public String getRepaidPrincipal() {
		return this.repaidPrincipal;
	}
	public void setRepaidPrincipal(String repaidPrincipal) {
		this.repaidPrincipal = repaidPrincipal;
	}

	public String getRepaidPrincipalPenalty() {
		return this.repaidPrincipalPenalty;
	}
	public void setRepaidPrincipalPenalty(String repaidPrincipalPenalty) {
		this.repaidPrincipalPenalty = repaidPrincipalPenalty;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTermEndDate() {
		return this.termEndDate;
	}
	public void setTermEndDate(String termEndDate) {
		this.termEndDate = termEndDate;
	}

	public Long getTermNo() {
		return this.termNo;
	}
	public void setTermNo(Long termNo) {
		this.termNo = termNo;
	}

	public String getTermStartDate() {
		return this.termStartDate;
	}
	public void setTermStartDate(String termStartDate) {
		this.termStartDate = termStartDate;
	}

}

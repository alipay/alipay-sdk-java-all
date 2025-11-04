package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 还款计划期次
 *
 * @author auto create
 * @since 1.0, 2025-09-01 17:10:11
 */
public class HonorRepayPlanTermDTO extends AlipayObject {

	private static final long serialVersionUID = 1736782521863824654L;

	/**
	 * 优惠后本期总金额，单位:分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 是否逾期
	 */
	@ApiField("overdue")
	private Boolean overdue;

	/**
	 * 逾期金额，单位:分
	 */
	@ApiField("overdue_amount")
	private String overdueAmount;

	/**
	 * 逾期天数
	 */
	@ApiField("overdue_days")
	private Long overdueDays;

	/**
	 * 剩余应还还款金额，单位:分
	 */
	@ApiField("payable_term_amount")
	private String payableTermAmount;

	/**
	 * 剩余应还利息罚息，单位：分，有待还时必传
	 */
	@ApiField("payable_term_inter_penalty")
	private String payableTermInterPenalty;

	/**
	 * 剩余应还还款利息，单位：分，有待还时必传
	 */
	@ApiField("payable_term_interest")
	private String payableTermInterest;

	/**
	 * 剩余应还罚息，单位：分，有待还时必传
	 */
	@ApiField("payable_term_penalty")
	private String payableTermPenalty;

	/**
	 * 剩余应还本金罚息，单位：分，有待还时必传
	 */
	@ApiField("payable_term_prin_penalty")
	private String payableTermPrinPenalty;

	/**
	 * 剩余应还还款本金，单位：分，有待还时必传
	 */
	@ApiField("payable_term_principal")
	private String payableTermPrincipal;

	/**
	 * 应还款日期, yyyyMMdd
	 */
	@ApiField("should_repay_date")
	private String shouldRepayDate;

	/**
	 * 优惠前本期应还总额,单位: 分(termAmount=termPrincipal+termInterest)
	 */
	@ApiField("term_amount")
	private String termAmount;

	/**
	 * 本期应还利息罚息，单位：分
	 */
	@ApiField("term_inter_penalty")
	private String termInterPenalty;

	/**
	 * 优惠前本期应还利息，单位：分
	 */
	@ApiField("term_interest")
	private String termInterest;

	/**
	 * 期次
	 */
	@ApiField("term_no")
	private Long termNo;

	/**
	 * 本期应还罚息，单位：分
	 */
	@ApiField("term_penalty")
	private String termPenalty;

	/**
	 * 本期应还本金罚息，单位：分
	 */
	@ApiField("term_prin_penalty")
	private String termPrinPenalty;

	/**
	 * 本期应还本金，单位：分
	 */
	@ApiField("term_principal")
	private String termPrincipal;

	/**
	 * 当期状态（1-已结清, 2-待还款, 3-部分已还,   4-逾期, 5-宽限期），只有待还款和逾期
	 */
	@ApiField("term_status")
	private Long termStatus;

	/**
	 * 本期优惠金额，单位：分
	 */
	@ApiField("term_total_discount")
	private String termTotalDiscount;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Boolean getOverdue() {
		return this.overdue;
	}
	public void setOverdue(Boolean overdue) {
		this.overdue = overdue;
	}

	public String getOverdueAmount() {
		return this.overdueAmount;
	}
	public void setOverdueAmount(String overdueAmount) {
		this.overdueAmount = overdueAmount;
	}

	public Long getOverdueDays() {
		return this.overdueDays;
	}
	public void setOverdueDays(Long overdueDays) {
		this.overdueDays = overdueDays;
	}

	public String getPayableTermAmount() {
		return this.payableTermAmount;
	}
	public void setPayableTermAmount(String payableTermAmount) {
		this.payableTermAmount = payableTermAmount;
	}

	public String getPayableTermInterPenalty() {
		return this.payableTermInterPenalty;
	}
	public void setPayableTermInterPenalty(String payableTermInterPenalty) {
		this.payableTermInterPenalty = payableTermInterPenalty;
	}

	public String getPayableTermInterest() {
		return this.payableTermInterest;
	}
	public void setPayableTermInterest(String payableTermInterest) {
		this.payableTermInterest = payableTermInterest;
	}

	public String getPayableTermPenalty() {
		return this.payableTermPenalty;
	}
	public void setPayableTermPenalty(String payableTermPenalty) {
		this.payableTermPenalty = payableTermPenalty;
	}

	public String getPayableTermPrinPenalty() {
		return this.payableTermPrinPenalty;
	}
	public void setPayableTermPrinPenalty(String payableTermPrinPenalty) {
		this.payableTermPrinPenalty = payableTermPrinPenalty;
	}

	public String getPayableTermPrincipal() {
		return this.payableTermPrincipal;
	}
	public void setPayableTermPrincipal(String payableTermPrincipal) {
		this.payableTermPrincipal = payableTermPrincipal;
	}

	public String getShouldRepayDate() {
		return this.shouldRepayDate;
	}
	public void setShouldRepayDate(String shouldRepayDate) {
		this.shouldRepayDate = shouldRepayDate;
	}

	public String getTermAmount() {
		return this.termAmount;
	}
	public void setTermAmount(String termAmount) {
		this.termAmount = termAmount;
	}

	public String getTermInterPenalty() {
		return this.termInterPenalty;
	}
	public void setTermInterPenalty(String termInterPenalty) {
		this.termInterPenalty = termInterPenalty;
	}

	public String getTermInterest() {
		return this.termInterest;
	}
	public void setTermInterest(String termInterest) {
		this.termInterest = termInterest;
	}

	public Long getTermNo() {
		return this.termNo;
	}
	public void setTermNo(Long termNo) {
		this.termNo = termNo;
	}

	public String getTermPenalty() {
		return this.termPenalty;
	}
	public void setTermPenalty(String termPenalty) {
		this.termPenalty = termPenalty;
	}

	public String getTermPrinPenalty() {
		return this.termPrinPenalty;
	}
	public void setTermPrinPenalty(String termPrinPenalty) {
		this.termPrinPenalty = termPrinPenalty;
	}

	public String getTermPrincipal() {
		return this.termPrincipal;
	}
	public void setTermPrincipal(String termPrincipal) {
		this.termPrincipal = termPrincipal;
	}

	public Long getTermStatus() {
		return this.termStatus;
	}
	public void setTermStatus(Long termStatus) {
		this.termStatus = termStatus;
	}

	public String getTermTotalDiscount() {
		return this.termTotalDiscount;
	}
	public void setTermTotalDiscount(String termTotalDiscount) {
		this.termTotalDiscount = termTotalDiscount;
	}

}

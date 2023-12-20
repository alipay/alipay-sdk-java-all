package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 贷后还款分期计划
 *
 * @author auto create
 * @since 1.0, 2018-11-12 15:39:25
 */
public class RepayPlanTermVO extends AlipayObject {

	private static final long serialVersionUID = 3444581861627148653L;

	/**
	 * 当期利息
	 */
	@ApiField("int_bal")
	private String intBal;

	/**
	 * 当期利息罚息
	 */
	@ApiField("ovd_int_penalty_bal")
	private String ovdIntPenaltyBal;

	/**
	 * 当期本金罚息
	 */
	@ApiField("ovd_prin_penalty_bal")
	private String ovdPrinPenaltyBal;

	/**
	 * 当期已还利息
	 */
	@ApiField("paid_int_amt")
	private String paidIntAmt;

	/**
	 * 当期已还利息罚息
	 */
	@ApiField("paid_ovd_int_penalty_amt")
	private String paidOvdIntPenaltyAmt;

	/**
	 * 当期已还本金罚息
	 */
	@ApiField("paid_ovd_prin_penalty_amt")
	private String paidOvdPrinPenaltyAmt;

	/**
	 * 当期已还本金
	 */
	@ApiField("paid_prin_amt")
	private String paidPrinAmt;

	/**
	 * 当期本金
	 */
	@ApiField("prin_bal")
	private String prinBal;

	/**
	 * 当期应还总额=当期本金+当期利息+当期本金罚息+当期利息罚息
	 */
	@ApiField("repay_amt_total")
	private String repayAmtTotal;

	/**
	 * 分期状态，取值{NORMAL, OVD, CLEAR}：NORMAL-正常; OVD-逾期; CLEAR-结清
	 */
	@ApiField("status")
	private String status;

	/**
	 * 本期到期日，即应还款日期
	 */
	@ApiField("term_end_date")
	private Date termEndDate;

	/**
	 * 期次号
	 */
	@ApiField("term_no")
	private Long termNo;

	public String getIntBal() {
		return this.intBal;
	}
	public void setIntBal(String intBal) {
		this.intBal = intBal;
	}

	public String getOvdIntPenaltyBal() {
		return this.ovdIntPenaltyBal;
	}
	public void setOvdIntPenaltyBal(String ovdIntPenaltyBal) {
		this.ovdIntPenaltyBal = ovdIntPenaltyBal;
	}

	public String getOvdPrinPenaltyBal() {
		return this.ovdPrinPenaltyBal;
	}
	public void setOvdPrinPenaltyBal(String ovdPrinPenaltyBal) {
		this.ovdPrinPenaltyBal = ovdPrinPenaltyBal;
	}

	public String getPaidIntAmt() {
		return this.paidIntAmt;
	}
	public void setPaidIntAmt(String paidIntAmt) {
		this.paidIntAmt = paidIntAmt;
	}

	public String getPaidOvdIntPenaltyAmt() {
		return this.paidOvdIntPenaltyAmt;
	}
	public void setPaidOvdIntPenaltyAmt(String paidOvdIntPenaltyAmt) {
		this.paidOvdIntPenaltyAmt = paidOvdIntPenaltyAmt;
	}

	public String getPaidOvdPrinPenaltyAmt() {
		return this.paidOvdPrinPenaltyAmt;
	}
	public void setPaidOvdPrinPenaltyAmt(String paidOvdPrinPenaltyAmt) {
		this.paidOvdPrinPenaltyAmt = paidOvdPrinPenaltyAmt;
	}

	public String getPaidPrinAmt() {
		return this.paidPrinAmt;
	}
	public void setPaidPrinAmt(String paidPrinAmt) {
		this.paidPrinAmt = paidPrinAmt;
	}

	public String getPrinBal() {
		return this.prinBal;
	}
	public void setPrinBal(String prinBal) {
		this.prinBal = prinBal;
	}

	public String getRepayAmtTotal() {
		return this.repayAmtTotal;
	}
	public void setRepayAmtTotal(String repayAmtTotal) {
		this.repayAmtTotal = repayAmtTotal;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getTermEndDate() {
		return this.termEndDate;
	}
	public void setTermEndDate(Date termEndDate) {
		this.termEndDate = termEndDate;
	}

	public Long getTermNo() {
		return this.termNo;
	}
	public void setTermNo(Long termNo) {
		this.termNo = termNo;
	}

}

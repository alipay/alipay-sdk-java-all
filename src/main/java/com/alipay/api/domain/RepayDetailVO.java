package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 还款流水明细
 *
 * @author auto create
 * @since 1.0, 2018-11-13 11:12:09
 */
public class RepayDetailVO extends AlipayObject {

	private static final long serialVersionUID = 2847272277126243733L;

	/**
	 * 归还利息
	 */
	@ApiField("paid_int_amt")
	private String paidIntAmt;

	/**
	 * 归还逾期利息
	 */
	@ApiField("paid_ovd_int_amt")
	private String paidOvdIntAmt;

	/**
	 * 归还逾期利息罚息
	 */
	@ApiField("paid_ovd_int_penalty_amt")
	private String paidOvdIntPenaltyAmt;

	/**
	 * 归还逾期本金
	 */
	@ApiField("paid_ovd_prin_amt")
	private String paidOvdPrinAmt;

	/**
	 * 归还逾期本金罚息
	 */
	@ApiField("paid_ovd_prin_penalty_amt")
	private String paidOvdPrinPenaltyAmt;

	/**
	 * 归还本金
	 */
	@ApiField("paid_prin_amt")
	private String paidPrinAmt;

	/**
	 * 还款总金额
	 */
	@ApiField("repay_amt_total")
	private String repayAmtTotal;

	/**
	 * 还款时间
	 */
	@ApiField("repay_date")
	private Date repayDate;

	public String getPaidIntAmt() {
		return this.paidIntAmt;
	}
	public void setPaidIntAmt(String paidIntAmt) {
		this.paidIntAmt = paidIntAmt;
	}

	public String getPaidOvdIntAmt() {
		return this.paidOvdIntAmt;
	}
	public void setPaidOvdIntAmt(String paidOvdIntAmt) {
		this.paidOvdIntAmt = paidOvdIntAmt;
	}

	public String getPaidOvdIntPenaltyAmt() {
		return this.paidOvdIntPenaltyAmt;
	}
	public void setPaidOvdIntPenaltyAmt(String paidOvdIntPenaltyAmt) {
		this.paidOvdIntPenaltyAmt = paidOvdIntPenaltyAmt;
	}

	public String getPaidOvdPrinAmt() {
		return this.paidOvdPrinAmt;
	}
	public void setPaidOvdPrinAmt(String paidOvdPrinAmt) {
		this.paidOvdPrinAmt = paidOvdPrinAmt;
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

	public String getRepayAmtTotal() {
		return this.repayAmtTotal;
	}
	public void setRepayAmtTotal(String repayAmtTotal) {
		this.repayAmtTotal = repayAmtTotal;
	}

	public Date getRepayDate() {
		return this.repayDate;
	}
	public void setRepayDate(Date repayDate) {
		this.repayDate = repayDate;
	}

}

package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 还款计划分期信息
 *
 * @author auto create
 * @since 1.0, 2017-10-30 11:35:46
 */
public class LoanRepayPlanTerm extends AlipayObject {

	private static final long serialVersionUID = 3358934557522186482L;

	/**
	 * 是否当前期
	 */
	@ApiField("current_term")
	private Boolean currentTerm;

	/**
	 * 当期已还金额
	 */
	@ApiField("paid_amt")
	private LoanMoneyTypeAmt paidAmt;

	/**
	 * 剩余应还金额
	 */
	@ApiField("remain_amt")
	private LoanMoneyTypeAmt remainAmt;

	/**
	 * 分期状态，目前支持的分期状态有：
NORMAL: 正常
OVD: 逾期
CLEAR: 结清
	 */
	@ApiField("status")
	private String status;

	/**
	 * 本期到期日
	 */
	@ApiField("term_end_date")
	private Date termEndDate;

	/**
	 * 期次号
	 */
	@ApiField("term_no")
	private Long termNo;

	/**
	 * 本期开始日
	 */
	@ApiField("term_start_date")
	private Date termStartDate;

	/**
	 * 当期总金额
	 */
	@ApiField("total_amt")
	private LoanMoneyTypeAmt totalAmt;

	public Boolean getCurrentTerm() {
		return this.currentTerm;
	}
	public void setCurrentTerm(Boolean currentTerm) {
		this.currentTerm = currentTerm;
	}

	public LoanMoneyTypeAmt getPaidAmt() {
		return this.paidAmt;
	}
	public void setPaidAmt(LoanMoneyTypeAmt paidAmt) {
		this.paidAmt = paidAmt;
	}

	public LoanMoneyTypeAmt getRemainAmt() {
		return this.remainAmt;
	}
	public void setRemainAmt(LoanMoneyTypeAmt remainAmt) {
		this.remainAmt = remainAmt;
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

	public Date getTermStartDate() {
		return this.termStartDate;
	}
	public void setTermStartDate(Date termStartDate) {
		this.termStartDate = termStartDate;
	}

	public LoanMoneyTypeAmt getTotalAmt() {
		return this.totalAmt;
	}
	public void setTotalAmt(LoanMoneyTypeAmt totalAmt) {
		this.totalAmt = totalAmt;
	}

}

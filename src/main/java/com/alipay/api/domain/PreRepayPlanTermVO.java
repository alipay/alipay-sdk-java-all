package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 贷前还款分期计划
 *
 * @author auto create
 * @since 1.0, 2018-11-13 11:12:13
 */
public class PreRepayPlanTermVO extends AlipayObject {

	private static final long serialVersionUID = 4623285656894499717L;

	/**
	 * 当期利息
	 */
	@ApiField("int_bal")
	private String intBal;

	/**
	 * 当期本金
	 */
	@ApiField("prin_bal")
	private String prinBal;

	/**
	 * 当期应还总额=当期本金+当期利息
	 */
	@ApiField("repay_amt_total")
	private String repayAmtTotal;

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

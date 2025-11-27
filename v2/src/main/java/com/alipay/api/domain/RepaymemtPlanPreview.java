package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 还款计划项详情列表
 *
 * @author auto create
 * @since 1.0, 2025-09-18 15:56:06
 */
public class RepaymemtPlanPreview extends AlipayObject {

	private static final long serialVersionUID = 3174518279153387522L;

	/**
	 * 每期优惠利息，单位：元
	 */
	@ApiField("deduct_int_amt")
	private String deductIntAmt;

	/**
	 * 每期到期还款日
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 每期原始利息，单位：元
	 */
	@ApiField("initial_int_amt")
	private String initialIntAmt;

	/**
	 * 每期还款利息，单位：元；字段间关系为 每期还款利息 = 每期原始利息 - 每期优惠利息
	 */
	@ApiField("repay_int_amt")
	private String repayIntAmt;

	/**
	 * 是	每期还款本金，单位：元
	 */
	@ApiField("repay_prin_amt")
	private String repayPrinAmt;

	/**
	 * 每期还款总额，单位：元
	 */
	@ApiField("repay_total_amt")
	private String repayTotalAmt;

	/**
	 * 每期担保费或及服务费，单位：元
	 */
	@ApiField("serv_amt")
	private String servAmt;

	/**
	 * 还款期次
	 */
	@ApiField("term_no")
	private String termNo;

	public String getDeductIntAmt() {
		return this.deductIntAmt;
	}
	public void setDeductIntAmt(String deductIntAmt) {
		this.deductIntAmt = deductIntAmt;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getInitialIntAmt() {
		return this.initialIntAmt;
	}
	public void setInitialIntAmt(String initialIntAmt) {
		this.initialIntAmt = initialIntAmt;
	}

	public String getRepayIntAmt() {
		return this.repayIntAmt;
	}
	public void setRepayIntAmt(String repayIntAmt) {
		this.repayIntAmt = repayIntAmt;
	}

	public String getRepayPrinAmt() {
		return this.repayPrinAmt;
	}
	public void setRepayPrinAmt(String repayPrinAmt) {
		this.repayPrinAmt = repayPrinAmt;
	}

	public String getRepayTotalAmt() {
		return this.repayTotalAmt;
	}
	public void setRepayTotalAmt(String repayTotalAmt) {
		this.repayTotalAmt = repayTotalAmt;
	}

	public String getServAmt() {
		return this.servAmt;
	}
	public void setServAmt(String servAmt) {
		this.servAmt = servAmt;
	}

	public String getTermNo() {
		return this.termNo;
	}
	public void setTermNo(String termNo) {
		this.termNo = termNo;
	}

}

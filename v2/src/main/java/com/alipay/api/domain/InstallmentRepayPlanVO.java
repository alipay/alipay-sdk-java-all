package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分期还款计划
 *
 * @author auto create
 * @since 1.0, 2024-06-11 16:52:22
 */
public class InstallmentRepayPlanVO extends AlipayObject {

	private static final long serialVersionUID = 5128211395987477553L;

	/**
	 * 账单到期还款日
	 */
	@ApiField("due_date")
	private Date dueDate;

	/**
	 * 开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 账单的状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 分期金额
	 */
	@ApiField("term_amount")
	private BillTermAmountVO termAmount;

	/**
	 * 分期期数
	 */
	@ApiField("term_num")
	private String termNum;

	/**
	 * 账单待还款总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public Date getDueDate() {
		return this.dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public BillTermAmountVO getTermAmount() {
		return this.termAmount;
	}
	public void setTermAmount(BillTermAmountVO termAmount) {
		this.termAmount = termAmount;
	}

	public String getTermNum() {
		return this.termNum;
	}
	public void setTermNum(String termNum) {
		this.termNum = termNum;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}

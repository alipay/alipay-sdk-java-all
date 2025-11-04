package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消费贷还款聚合账单还款计划ITEM
 *
 * @author auto create
 * @since 1.0, 2025-04-21 15:15:48
 */
public class ConsumerLoanBillRepayPlanInfoItem extends AlipayObject {

	private static final long serialVersionUID = 4558257835386566482L;

	/**
	 * 该还款计划详情关联的账单ID
	 */
	@ApiField("bill_id")
	private String billId;

	/**
	 * 当前该笔还款所归属的借据号
	 */
	@ApiField("loan_id")
	private String loanId;

	/**
	 * 在该项还款计划所关联的借据中的期号
	 */
	@ApiField("period_no")
	private Long periodNo;

	/**
	 * 还款金额，单位为分，1000代表10.00元
	 */
	@ApiField("repay_amount")
	private Long repayAmount;

	/**
	 * 账单还款日，日期格式为YYYY-MM-DD hh:mm:ss
	 */
	@ApiField("repay_date")
	private String repayDate;

	/**
	 * 还款计划状态，包含逾期（OVER_DUE）或正常（NORMAL）
	 */
	@ApiField("status")
	private String status;

	public String getBillId() {
		return this.billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}

	public String getLoanId() {
		return this.loanId;
	}
	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	public Long getPeriodNo() {
		return this.periodNo;
	}
	public void setPeriodNo(Long periodNo) {
		this.periodNo = periodNo;
	}

	public Long getRepayAmount() {
		return this.repayAmount;
	}
	public void setRepayAmount(Long repayAmount) {
		this.repayAmount = repayAmount;
	}

	public String getRepayDate() {
		return this.repayDate;
	}
	public void setRepayDate(String repayDate) {
		this.repayDate = repayDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消费贷还款聚合账单还款计划ITEM
 *
 * @author auto create
 * @since 1.0, 2024-08-06 11:22:35
 */
public class ConsumerLoanBillRepayPlanInfoItem extends AlipayObject {

	private static final long serialVersionUID = 6885367962522445178L;

	/**
	 * 该还款计划详情关联的账单ID
	 */
	@ApiField("bill_id")
	private String billId;

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

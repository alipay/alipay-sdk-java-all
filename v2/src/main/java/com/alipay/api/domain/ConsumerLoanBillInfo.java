package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 消费贷还款账单信息
 *
 * @author auto create
 * @since 1.0, 2024-08-06 11:22:35
 */
public class ConsumerLoanBillInfo extends AlipayObject {

	private static final long serialVersionUID = 5736871197291535371L;

	/**
	 * 账单列表
	 */
	@ApiListField("bill_list")
	@ApiField("consumer_loan_bill_info_item")
	private List<ConsumerLoanBillInfoItem> billList;

	/**
	 * 借据信息
	 */
	@ApiField("loan_info")
	private ConsumerLoanLoanInfo loanInfo;

	/**
	 * 还款周期数
	 */
	@ApiField("period_count")
	private Long periodCount;

	/**
	 * 还款金额，单位为分，1000代表10.00元
	 */
	@ApiField("repay_amount")
	private Long repayAmount;

	/**
	 * 消费贷还款账单还款计划
	 */
	@ApiField("repay_plan")
	private ConsumerLoanBillRepayPlanInfo repayPlan;

	public List<ConsumerLoanBillInfoItem> getBillList() {
		return this.billList;
	}
	public void setBillList(List<ConsumerLoanBillInfoItem> billList) {
		this.billList = billList;
	}

	public ConsumerLoanLoanInfo getLoanInfo() {
		return this.loanInfo;
	}
	public void setLoanInfo(ConsumerLoanLoanInfo loanInfo) {
		this.loanInfo = loanInfo;
	}

	public Long getPeriodCount() {
		return this.periodCount;
	}
	public void setPeriodCount(Long periodCount) {
		this.periodCount = periodCount;
	}

	public Long getRepayAmount() {
		return this.repayAmount;
	}
	public void setRepayAmount(Long repayAmount) {
		this.repayAmount = repayAmount;
	}

	public ConsumerLoanBillRepayPlanInfo getRepayPlan() {
		return this.repayPlan;
	}
	public void setRepayPlan(ConsumerLoanBillRepayPlanInfo repayPlan) {
		this.repayPlan = repayPlan;
	}

}

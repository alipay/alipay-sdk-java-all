package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 消费贷还款账单还款计划信息
 *
 * @author auto create
 * @since 1.0, 2024-08-06 11:22:35
 */
public class ConsumerLoanBillRepayPlanInfo extends AlipayObject {

	private static final long serialVersionUID = 8535654144149514386L;

	/**
	 * 剩余还款期数
	 */
	@ApiField("last_period_count")
	private Long lastPeriodCount;

	/**
	 * 消费贷还款账单还款计划详情
	 */
	@ApiListField("repay_plan_record")
	@ApiField("consumer_loan_bill_repay_plan_info_item")
	private List<ConsumerLoanBillRepayPlanInfoItem> repayPlanRecord;

	public Long getLastPeriodCount() {
		return this.lastPeriodCount;
	}
	public void setLastPeriodCount(Long lastPeriodCount) {
		this.lastPeriodCount = lastPeriodCount;
	}

	public List<ConsumerLoanBillRepayPlanInfoItem> getRepayPlanRecord() {
		return this.repayPlanRecord;
	}
	public void setRepayPlanRecord(List<ConsumerLoanBillRepayPlanInfoItem> repayPlanRecord) {
		this.repayPlanRecord = repayPlanRecord;
	}

}

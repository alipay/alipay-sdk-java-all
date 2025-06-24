package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动预算实时信息
 *
 * @author auto create
 * @since 1.0, 2024-03-28 14:05:29
 */
public class DtBankBudgetRealTimeInfo extends AlipayObject {

	private static final long serialVersionUID = 2811693447193688112L;

	/**
	 * 活动退款金额，单位分
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * 活动剩余预算，单位分
	 */
	@ApiField("remaining_budget")
	private Long remainingBudget;

	/**
	 * 优惠发放金额，单位为分，立减活动此字段为空
	 */
	@ApiField("send_amount")
	private Long sendAmount;

	/**
	 * 优惠发放数量，立减活动此字段为空
	 */
	@ApiField("send_count")
	private Long sendCount;

	/**
	 * 优惠核销金额，单位分
	 */
	@ApiField("used_amount")
	private Long usedAmount;

	/**
	 * 优惠核销数量
	 */
	@ApiField("used_count")
	private Long usedCount;

	public Long getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public Long getRemainingBudget() {
		return this.remainingBudget;
	}
	public void setRemainingBudget(Long remainingBudget) {
		this.remainingBudget = remainingBudget;
	}

	public Long getSendAmount() {
		return this.sendAmount;
	}
	public void setSendAmount(Long sendAmount) {
		this.sendAmount = sendAmount;
	}

	public Long getSendCount() {
		return this.sendCount;
	}
	public void setSendCount(Long sendCount) {
		this.sendCount = sendCount;
	}

	public Long getUsedAmount() {
		return this.usedAmount;
	}
	public void setUsedAmount(Long usedAmount) {
		this.usedAmount = usedAmount;
	}

	public Long getUsedCount() {
		return this.usedCount;
	}
	public void setUsedCount(Long usedCount) {
		this.usedCount = usedCount;
	}

}

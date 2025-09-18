package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 荣耀逾期信息
 *
 * @author auto create
 * @since 1.0, 2025-09-01 17:26:24
 */
public class HonorOverdueInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5673387118777293246L;

	/**
	 * 逾期总额，单位：分
	 */
	@ApiField("overdue_amount")
	private String overdueAmount;

	/**
	 * 逾期天数，多笔分期/借据逾期 最大逾期天数
	 */
	@ApiField("overdue_days")
	private Long overdueDays;

	/**
	 * 逾期订单数
	 */
	@ApiField("overdue_order")
	private Long overdueOrder;

	/**
	 * 逾期罚息，单位：分，本金罚息+利息罚息
	 */
	@ApiField("overdue_penalty")
	private String overduePenalty;

	public String getOverdueAmount() {
		return this.overdueAmount;
	}
	public void setOverdueAmount(String overdueAmount) {
		this.overdueAmount = overdueAmount;
	}

	public Long getOverdueDays() {
		return this.overdueDays;
	}
	public void setOverdueDays(Long overdueDays) {
		this.overdueDays = overdueDays;
	}

	public Long getOverdueOrder() {
		return this.overdueOrder;
	}
	public void setOverdueOrder(Long overdueOrder) {
		this.overdueOrder = overdueOrder;
	}

	public String getOverduePenalty() {
		return this.overduePenalty;
	}
	public void setOverduePenalty(String overduePenalty) {
		this.overduePenalty = overduePenalty;
	}

}

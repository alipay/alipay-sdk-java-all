package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预算配置信息
 *
 * @author auto create
 * @since 1.0, 2024-03-28 14:05:29
 */
public class DtBankBudgetConfigInfo extends AlipayObject {

	private static final long serialVersionUID = 4893867492861474995L;

	/**
	 * 每日预算类型
	 */
	@ApiField("daily_budget_type")
	private String dailyBudgetType;

	/**
	 * 每日预算值。例如1000，当total_budget为MONEY时，单位为分，表示每日预算为10.00元；当total_budget为COUNT时，表示每日预算为1000份。
	 */
	@ApiField("daily_budget_value")
	private Long dailyBudgetValue;

	/**
	 * 活动最小发放数量，立减活动此参数为空。
	 */
	@ApiField("min_send_count")
	private Long minSendCount;

	/**
	 * 活动总预算，单位为分，例如10000表示总预算为100.00元
	 */
	@ApiField("total_budget")
	private Long totalBudget;

	public String getDailyBudgetType() {
		return this.dailyBudgetType;
	}
	public void setDailyBudgetType(String dailyBudgetType) {
		this.dailyBudgetType = dailyBudgetType;
	}

	public Long getDailyBudgetValue() {
		return this.dailyBudgetValue;
	}
	public void setDailyBudgetValue(Long dailyBudgetValue) {
		this.dailyBudgetValue = dailyBudgetValue;
	}

	public Long getMinSendCount() {
		return this.minSendCount;
	}
	public void setMinSendCount(Long minSendCount) {
		this.minSendCount = minSendCount;
	}

	public Long getTotalBudget() {
		return this.totalBudget;
	}
	public void setTotalBudget(Long totalBudget) {
		this.totalBudget = totalBudget;
	}

}

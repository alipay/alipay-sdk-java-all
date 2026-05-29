package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预算配置信息
 *
 * @author auto create
 * @since 1.0, 2026-04-17 10:59:17
 */
public class DtBankBudgetConfigInfo extends AlipayObject {

	private static final long serialVersionUID = 3777179422926733149L;

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
	 * 天天减活动的实时剩余可报名人数
	 */
	@ApiField("daily_discount_remaining_register_count")
	private Long dailyDiscountRemainingRegisterCount;

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

	public Long getDailyDiscountRemainingRegisterCount() {
		return this.dailyDiscountRemainingRegisterCount;
	}
	public void setDailyDiscountRemainingRegisterCount(Long dailyDiscountRemainingRegisterCount) {
		this.dailyDiscountRemainingRegisterCount = dailyDiscountRemainingRegisterCount;
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

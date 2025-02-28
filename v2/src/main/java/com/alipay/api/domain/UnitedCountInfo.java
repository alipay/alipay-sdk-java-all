package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联合营销消费券场景 用户计次信息模型
 *
 * @author auto create
 * @since 1.0, 2022-12-06 14:49:57
 */
public class UnitedCountInfo extends AlipayObject {

	private static final long serialVersionUID = 1281314819859113768L;

	/**
	 * 日上限
	 */
	@ApiField("max_day_count")
	private Long maxDayCount;

	/**
	 * 终生上限(-1代表不限制)
	 */
	@ApiField("max_life_count")
	private Long maxLifeCount;

	/**
	 * 月上限
	 */
	@ApiField("max_month_count")
	private Long maxMonthCount;

	/**
	 * 周上限
	 */
	@ApiField("max_week_count")
	private Long maxWeekCount;

	/**
	 * 日剩余
	 */
	@ApiField("remain_day_count")
	private Long remainDayCount;

	/**
	 * 终生剩余
	 */
	@ApiField("remain_life_count")
	private Long remainLifeCount;

	/**
	 * 月剩余
	 */
	@ApiField("remain_month_count")
	private Long remainMonthCount;

	/**
	 * 周剩余
	 */
	@ApiField("remain_week_count")
	private Long remainWeekCount;

	public Long getMaxDayCount() {
		return this.maxDayCount;
	}
	public void setMaxDayCount(Long maxDayCount) {
		this.maxDayCount = maxDayCount;
	}

	public Long getMaxLifeCount() {
		return this.maxLifeCount;
	}
	public void setMaxLifeCount(Long maxLifeCount) {
		this.maxLifeCount = maxLifeCount;
	}

	public Long getMaxMonthCount() {
		return this.maxMonthCount;
	}
	public void setMaxMonthCount(Long maxMonthCount) {
		this.maxMonthCount = maxMonthCount;
	}

	public Long getMaxWeekCount() {
		return this.maxWeekCount;
	}
	public void setMaxWeekCount(Long maxWeekCount) {
		this.maxWeekCount = maxWeekCount;
	}

	public Long getRemainDayCount() {
		return this.remainDayCount;
	}
	public void setRemainDayCount(Long remainDayCount) {
		this.remainDayCount = remainDayCount;
	}

	public Long getRemainLifeCount() {
		return this.remainLifeCount;
	}
	public void setRemainLifeCount(Long remainLifeCount) {
		this.remainLifeCount = remainLifeCount;
	}

	public Long getRemainMonthCount() {
		return this.remainMonthCount;
	}
	public void setRemainMonthCount(Long remainMonthCount) {
		this.remainMonthCount = remainMonthCount;
	}

	public Long getRemainWeekCount() {
		return this.remainWeekCount;
	}
	public void setRemainWeekCount(Long remainWeekCount) {
		this.remainWeekCount = remainWeekCount;
	}

}

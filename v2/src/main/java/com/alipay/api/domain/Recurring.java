package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅周期信息
 *
 * @author auto create
 * @since 1.0, 2026-03-29 14:48:37
 */
public class Recurring extends AlipayObject {

	private static final long serialVersionUID = 3144453532631434762L;

	/**
	 * 订阅周期类型，目前支持DAY跟MONTH
	 */
	@ApiField("interval")
	private String interval;

	/**
	 * 订阅周期数量，目前周期单位只支持月或日
	 */
	@ApiField("interval_count")
	private Long intervalCount;

	/**
	 * 试用期天数
	 */
	@ApiField("trial_period_days")
	private Long trialPeriodDays;

	/**
	 * 计费模式
	 */
	@ApiField("usage_type")
	private String usageType;

	public String getInterval() {
		return this.interval;
	}
	public void setInterval(String interval) {
		this.interval = interval;
	}

	public Long getIntervalCount() {
		return this.intervalCount;
	}
	public void setIntervalCount(Long intervalCount) {
		this.intervalCount = intervalCount;
	}

	public Long getTrialPeriodDays() {
		return this.trialPeriodDays;
	}
	public void setTrialPeriodDays(Long trialPeriodDays) {
		this.trialPeriodDays = trialPeriodDays;
	}

	public String getUsageType() {
		return this.usageType;
	}
	public void setUsageType(String usageType) {
		this.usageType = usageType;
	}

}

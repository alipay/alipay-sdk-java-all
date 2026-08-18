package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * SubscriptionRecurring
 *
 * @author auto create
 * @since 1.0, 2026-07-29 10:40:56
 */
public class SubscriptionRecurring extends AlipayObject {

	private static final long serialVersionUID = 5425396664483568562L;

	/**
	 * 计价周期单位，仅支持 DAY 或 MONTH，大小写不敏感；年付使用 MONTH + interval_count=12 表达
	 */
	@ApiField("interval")
	private String interval;

	/**
	 * 计价周期间隔，必须为正整数；当 interval=DAY 时不得小于 7
	 */
	@ApiField("interval_count")
	private Long intervalCount;

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

}

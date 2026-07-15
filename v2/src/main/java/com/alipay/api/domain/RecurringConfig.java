package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 循环计价配置，用于订阅等场景
 *
 * @author auto create
 * @since 1.0, 2026-06-30 22:32:55
 */
public class RecurringConfig extends AlipayObject {

	private static final long serialVersionUID = 6311527691462469294L;

	/**
	 * 计价周期单位，和interval_count组合使用
	 */
	@ApiField("interval")
	private String interval;

	/**
	 * 计价周期间隔，和interval组合使用
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

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 复杂参数
 *
 * @author auto create
 * @since 1.0, 2020-12-25 17:56:25
 */
public class CampaignExtInfo extends AlipayObject {

	private static final long serialVersionUID = 7258888217746249571L;

	/**
	 * 用户不活跃间隔时间，当用户集点满足阙值且满足不活跃间隔时间后，发送召回通知
	 */
	@ApiField("interval_time")
	private String intervalTime;

	/**
	 * 针对每个用户而言的月召回次数上限，且必须不大于平台侧该值全局配置
	 */
	@ApiField("month_limit")
	private String monthLimit;

	/**
	 * 集点阈值，即当用户集点进度达到阈值后才会根据间隔时间下发召回唤醒通知，且必须不小于平台侧该值全局配置
	 */
	@ApiField("threshold")
	private String threshold;

	public String getIntervalTime() {
		return this.intervalTime;
	}
	public void setIntervalTime(String intervalTime) {
		this.intervalTime = intervalTime;
	}

	public String getMonthLimit() {
		return this.monthLimit;
	}
	public void setMonthLimit(String monthLimit) {
		this.monthLimit = monthLimit;
	}

	public String getThreshold() {
		return this.threshold;
	}
	public void setThreshold(String threshold) {
		this.threshold = threshold;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 复杂参数
 *
 * @author auto create
 * @since 1.0, 2020-03-30 10:00:46
 */
public class CampaignExtInfo extends AlipayObject {

	private static final long serialVersionUID = 1811879347794542574L;

	/**
	 * 用户不活跃间隔时间，当用户集点满足阙值且满足不活跃间隔时间后，发送召回通知
	 */
	@ApiField("interval_time")
	private String intervalTime;

	/**
	 * 集点阈值，即当用户集点进度达到阙值后才会根据间隔时间下发召回唤醒
	 */
	@ApiField("threshold")
	private String threshold;

	public String getIntervalTime() {
		return this.intervalTime;
	}
	public void setIntervalTime(String intervalTime) {
		this.intervalTime = intervalTime;
	}

	public String getThreshold() {
		return this.threshold;
	}
	public void setThreshold(String threshold) {
		this.threshold = threshold;
	}

}

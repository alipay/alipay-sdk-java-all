package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康服务时间段
 *
 * @author auto create
 * @since 1.0, 2025-10-30 11:06:48
 */
public class HealthServiceTimeslot extends AlipayObject {

	private static final long serialVersionUID = 5586512284284637549L;

	/**
	 * 时间段结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 时间段开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}

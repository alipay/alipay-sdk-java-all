package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小时维度快递预约时段
 *
 * @author auto create
 * @since 1.0, 2025-09-18 11:00:38
 */
public class HourAppointment extends AlipayObject {

	private static final long serialVersionUID = 8764723129612941634L;

	/**
	 * 结束时间
hh:mm
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 开始时间
hh:mm
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

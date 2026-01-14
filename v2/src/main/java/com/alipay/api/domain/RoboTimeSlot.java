package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营时间段
 *
 * @author auto create
 * @since 1.0, 2025-12-03 11:42:19
 */
public class RoboTimeSlot extends AlipayObject {

	private static final long serialVersionUID = 5344719896415752612L;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 夜间是否运营
	 */
	@ApiField("night_operate")
	private Long nightOperate;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Long getNightOperate() {
		return this.nightOperate;
	}
	public void setNightOperate(Long nightOperate) {
		this.nightOperate = nightOperate;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}

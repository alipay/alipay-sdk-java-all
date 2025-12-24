package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 运营时间范围
 *
 * @author auto create
 * @since 1.0, 2025-12-03 11:42:19
 */
public class RoboOperatingHours extends AlipayObject {

	private static final long serialVersionUID = 2568494842125935311L;

	/**
	 * 每周运营星期天数
	 */
	@ApiListField("day")
	@ApiField("string")
	private List<String> day;

	/**
	 * 每天运营时间范围
	 */
	@ApiListField("time")
	@ApiField("robo_time_slot")
	private List<RoboTimeSlot> time;

	public List<String> getDay() {
		return this.day;
	}
	public void setDay(List<String> day) {
		this.day = day;
	}

	public List<RoboTimeSlot> getTime() {
		return this.time;
	}
	public void setTime(List<RoboTimeSlot> time) {
		this.time = time;
	}

}

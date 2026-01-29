package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 周维度排期
 *
 * @author auto create
 * @since 1.0, 2025-12-03 10:21:05
 */
public class ScheduleWeekPlanInfo extends AlipayObject {

	private static final long serialVersionUID = 4625844656283522594L;

	/**
	 * 每天可排期的结束时间 格式24小时制 21:30
	 */
	@ApiField("close_time")
	private String closeTime;

	/**
	 * 周几  1-7
	 */
	@ApiField("day_of_week")
	private Long dayOfWeek;

	/**
	 * 每天可排期的开始时间 格式24小时制 09:30
	 */
	@ApiField("open_time")
	private String openTime;

	public String getCloseTime() {
		return this.closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	public Long getDayOfWeek() {
		return this.dayOfWeek;
	}
	public void setDayOfWeek(Long dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public String getOpenTime() {
		return this.openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

}

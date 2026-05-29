package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 周维度排期
 *
 * @author auto create
 * @since 1.0, 2026-03-06 16:32:14
 */
public class ScheduleWeekPlanInfo extends AlipayObject {

	private static final long serialVersionUID = 7259927234986298817L;

	/**
	 * 午休时间
	 */
	@ApiListField("break_time")
	@ApiField("string")
	private List<String> breakTime;

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

	public List<String> getBreakTime() {
		return this.breakTime;
	}
	public void setBreakTime(List<String> breakTime) {
		this.breakTime = breakTime;
	}

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

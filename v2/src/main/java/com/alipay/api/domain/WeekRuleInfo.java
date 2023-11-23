package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 周期规则
 *
 * @author auto create
 * @since 1.0, 2023-07-21 11:25:47
 */
public class WeekRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 7152713641527758395L;

	/**
	 * 时间段
	 */
	@ApiField("time_range_info")
	private TimeRangeInfo timeRangeInfo;

	/**
	 * 星期数，以“,”连接多个星期数
	 */
	@ApiField("week_day")
	private String weekDay;

	public TimeRangeInfo getTimeRangeInfo() {
		return this.timeRangeInfo;
	}
	public void setTimeRangeInfo(TimeRangeInfo timeRangeInfo) {
		this.timeRangeInfo = timeRangeInfo;
	}

	public String getWeekDay() {
		return this.weekDay;
	}
	public void setWeekDay(String weekDay) {
		this.weekDay = weekDay;
	}

}

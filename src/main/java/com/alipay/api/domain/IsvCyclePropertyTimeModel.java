package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 周期属性时间Model
 *
 * @author auto create
 * @since 1.0, 2019-04-22 15:52:24
 */
public class IsvCyclePropertyTimeModel extends AlipayObject {

	private static final long serialVersionUID = 2667524749782396611L;

	/**
	 * 日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * * 周期属性时间类型
WEEK("WEEK", "星期"),
DATE("DATE", "日期"),
	 */
	@ApiField("time_type")
	private String timeType;

	/**
	 * 星期
	 */
	@ApiField("week")
	private String week;

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getTimeType() {
		return this.timeType;
	}
	public void setTimeType(String timeType) {
		this.timeType = timeType;
	}

	public String getWeek() {
		return this.week;
	}
	public void setWeek(String week) {
		this.week = week;
	}

}

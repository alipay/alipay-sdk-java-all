package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 节假日明细
 *
 * @author auto create
 * @since 1.0, 2022-04-01 11:56:47
 */
public class FinancialHolidayDayDTO extends AlipayObject {

	private static final long serialVersionUID = 5395814757199723718L;

	/**
	 * 日
	 */
	@ApiField("day")
	private Long day;

	/**
	 * 周
	 */
	@ApiField("day_of_week")
	private String dayOfWeek;

	/**
	 * 节假日'天'类型，全天，半天节假日
	 */
	@ApiField("day_type")
	private String dayType;

	/**
	 * 节假日描述
	 */
	@ApiField("event_name")
	private String eventName;

	/**
	 * 修改日期，时间戳格式
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 月
	 */
	@ApiField("month")
	private Long month;

	/**
	 * 年
	 */
	@ApiField("year")
	private Long year;

	public Long getDay() {
		return this.day;
	}
	public void setDay(Long day) {
		this.day = day;
	}

	public String getDayOfWeek() {
		return this.dayOfWeek;
	}
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public String getDayType() {
		return this.dayType;
	}
	public void setDayType(String dayType) {
		this.dayType = dayType;
	}

	public String getEventName() {
		return this.eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getMonth() {
		return this.month;
	}
	public void setMonth(Long month) {
		this.month = month;
	}

	public Long getYear() {
		return this.year;
	}
	public void setYear(Long year) {
		this.year = year;
	}

}

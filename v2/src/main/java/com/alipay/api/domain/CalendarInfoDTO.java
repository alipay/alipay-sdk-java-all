package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资管日历信息
 *
 * @author auto create
 * @since 1.0, 2024-07-18 15:57:21
 */
public class CalendarInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4523863335278915459L;

	/**
	 * 日历维度重复类型，支持工作日（WORK_DAY）和每天（DAILY）
	 */
	@ApiField("calendar_type")
	private String calendarType;

	/**
	 * 如上面示例值表示每月的1，3，5，7，9号，余额提醒暂不支持
	 */
	@ApiListField("day_list")
	@ApiField("string")
	private List<String> dayList;

	public String getCalendarType() {
		return this.calendarType;
	}
	public void setCalendarType(String calendarType) {
		this.calendarType = calendarType;
	}

	public List<String> getDayList() {
		return this.dayList;
	}
	public void setDayList(List<String> dayList) {
		this.dayList = dayList;
	}

}

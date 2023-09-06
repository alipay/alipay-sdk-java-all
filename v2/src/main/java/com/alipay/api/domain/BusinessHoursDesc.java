package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营业时间，描述共享租赁中点位的营业时间
 *
 * @author auto create
 * @since 1.0, 2021-05-21 14:19:58
 */
public class BusinessHoursDesc extends AlipayObject {

	private static final long serialVersionUID = 4383979294661344148L;

	/**
	 * 一周中的哪几天
	 */
	@ApiListField("days_in_week")
	@ApiField("number")
	private List<Long> daysInWeek;

	/**
	 * 一天中的时间，24小时制
	 */
	@ApiField("hours")
	private String hours;

	public List<Long> getDaysInWeek() {
		return this.daysInWeek;
	}
	public void setDaysInWeek(List<Long> daysInWeek) {
		this.daysInWeek = daysInWeek;
	}

	public String getHours() {
		return this.hours;
	}
	public void setHours(String hours) {
		this.hours = hours;
	}

}

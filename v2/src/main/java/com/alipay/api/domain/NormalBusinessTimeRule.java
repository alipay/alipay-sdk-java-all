package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 正常营业时间规则
 *
 * @author auto create
 * @since 1.0, 2020-08-05 20:13:51
 */
public class NormalBusinessTimeRule extends AlipayObject {

	private static final long serialVersionUID = 2555673496271665269L;

	/**
	 * 指定月份,当为全年时，传入1,2,3,4,5,6,7,8,9,10,11,12
	 */
	@ApiListField("month")
	@ApiField("number")
	private List<Long> month;

	/**
	 * 营业时间的时间段
	 */
	@ApiListField("open_time_list")
	@ApiField("time_range")
	private List<TimeRange> openTimeList;

	/**
	 * 星期
	 */
	@ApiListField("week")
	@ApiField("number")
	private List<Long> week;

	public List<Long> getMonth() {
		return this.month;
	}
	public void setMonth(List<Long> month) {
		this.month = month;
	}

	public List<TimeRange> getOpenTimeList() {
		return this.openTimeList;
	}
	public void setOpenTimeList(List<TimeRange> openTimeList) {
		this.openTimeList = openTimeList;
	}

	public List<Long> getWeek() {
		return this.week;
	}
	public void setWeek(List<Long> week) {
		this.week = week;
	}

}

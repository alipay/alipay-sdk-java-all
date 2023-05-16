package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品可用时段信息
 *
 * @author auto create
 * @since 1.0, 2017-08-24 13:56:10
 */
public class AvailablePeriodInfo extends AlipayObject {

	private static final long serialVersionUID = 3828982293289535212L;

	/**
	 * 每周可用天列表。格式为星期几并用逗号分隔。如周一周二可用则为“1,2”，周五周六可用则为"5,6"
	 */
	@ApiField("available_week_days")
	private String availableWeekDays;

	/**
	 * 商品可用时段结束时间。格式HH:mm，如果22：30
	 */
	@ApiField("time_end")
	private String timeEnd;

	/**
	 * 可用时段开始时间。格式为HH:mm，如08:30
	 */
	@ApiField("time_start")
	private String timeStart;

	public String getAvailableWeekDays() {
		return this.availableWeekDays;
	}
	public void setAvailableWeekDays(String availableWeekDays) {
		this.availableWeekDays = availableWeekDays;
	}

	public String getTimeEnd() {
		return this.timeEnd;
	}
	public void setTimeEnd(String timeEnd) {
		this.timeEnd = timeEnd;
	}

	public String getTimeStart() {
		return this.timeStart;
	}
	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}

}

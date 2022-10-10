package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品可用时间段
 *
 * @author auto create
 * @since 1.0, 2018-09-03 14:58:58
 */
public class AvailableTimeInfo extends AlipayObject {

	private static final long serialVersionUID = 3374162794523597183L;

	/**
	 * limit_period_unit为WEEK_DAY，周范围内日单位[1,7]，limit_period_unit 为DAY，月范围内日单位[1,31]
	 */
	@ApiListField("available_days")
	@ApiField("number")
	private List<Long> availableDays;

	/**
	 * 开始时间如 13:00  代表下午1点
	 */
	@ApiField("from_time")
	private String fromTime;

	/**
	 * WEEK_DAY, "周范围内日单位[1,7]， DAY, "月范围内日单位[1,31]
	 */
	@ApiField("limit_period_unit")
	private String limitPeriodUnit;

	/**
	 * 结束时间 如 14:10  代表下午2点10分
	 */
	@ApiField("to_time")
	private String toTime;

	public List<Long> getAvailableDays() {
		return this.availableDays;
	}
	public void setAvailableDays(List<Long> availableDays) {
		this.availableDays = availableDays;
	}

	public String getFromTime() {
		return this.fromTime;
	}
	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}

	public String getLimitPeriodUnit() {
		return this.limitPeriodUnit;
	}
	public void setLimitPeriodUnit(String limitPeriodUnit) {
		this.limitPeriodUnit = limitPeriodUnit;
	}

	public String getToTime() {
		return this.toTime;
	}
	public void setToTime(String toTime) {
		this.toTime = toTime;
	}

}

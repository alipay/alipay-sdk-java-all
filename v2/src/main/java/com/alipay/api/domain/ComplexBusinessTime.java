package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 复杂营业时间，支持一天多字段
 *
 * @author auto create
 * @since 1.0, 2025-05-20 20:21:29
 */
public class ComplexBusinessTime extends AlipayObject {

	private static final long serialVersionUID = 5164899613249688954L;

	/**
	 * 营业时间段，支持多个时间段，例如08:00-11:00，14:00-16:00
	 */
	@ApiListField("time_period")
	@ApiField("complex_business_time_period")
	private List<ComplexBusinessTimePeriod> timePeriod;

	/**
	 * 本对象表示周几的营业时间。1~6表示周一到周六，7表示周日
	 */
	@ApiField("week_day")
	private Long weekDay;

	public List<ComplexBusinessTimePeriod> getTimePeriod() {
		return this.timePeriod;
	}
	public void setTimePeriod(List<ComplexBusinessTimePeriod> timePeriod) {
		this.timePeriod = timePeriod;
	}

	public Long getWeekDay() {
		return this.weekDay;
	}
	public void setWeekDay(Long weekDay) {
		this.weekDay = weekDay;
	}

}

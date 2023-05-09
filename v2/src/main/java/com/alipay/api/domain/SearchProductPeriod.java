package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 目标时段，包括全天的时段和全年的时段
 *
 * @author auto create
 * @since 1.0, 2021-07-12 16:42:47
 */
public class SearchProductPeriod extends AlipayObject {

	private static final long serialVersionUID = 3387143869276821452L;

	/**
	 * 结束作用日期
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 开始作用日期
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 作用时间区间，e.g. HH:mm-HH:mm-标识
	 */
	@ApiListField("working_hours")
	@ApiField("string")
	private List<String> workingHours;

	/**
	 * 作用一周的星期数
	 */
	@ApiListField("working_weekdays")
	@ApiField("string")
	private List<String> workingWeekdays;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public List<String> getWorkingHours() {
		return this.workingHours;
	}
	public void setWorkingHours(List<String> workingHours) {
		this.workingHours = workingHours;
	}

	public List<String> getWorkingWeekdays() {
		return this.workingWeekdays;
	}
	public void setWorkingWeekdays(List<String> workingWeekdays) {
		this.workingWeekdays = workingWeekdays;
	}

}

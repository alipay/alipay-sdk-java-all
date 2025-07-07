package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 可用时间范围
 *
 * @author auto create
 * @since 1.0, 2024-08-01 16:50:52
 */
public class LimitDayInfo extends AlipayObject {

	private static final long serialVersionUID = 7695517514123143291L;

	/**
	 * 周一到周日可用列表。设置卡的可用时间段，按周维度设置
	 */
	@ApiListField("days_of_week")
	@ApiField("string")
	private List<String> daysOfWeek;

	/**
	 * 限制结束时间（HH:mm:ss）
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 限制结束时间类型。表示end_time是当天还是次日的时间
	 */
	@ApiField("end_time_type")
	private String endTimeType;

	/**
	 * 限制开始时间（HH:mm:ss）。表示限制到具体时间区间
	 */
	@ApiField("start_time")
	private String startTime;

	public List<String> getDaysOfWeek() {
		return this.daysOfWeek;
	}
	public void setDaysOfWeek(List<String> daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getEndTimeType() {
		return this.endTimeType;
	}
	public void setEndTimeType(String endTimeType) {
		this.endTimeType = endTimeType;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}

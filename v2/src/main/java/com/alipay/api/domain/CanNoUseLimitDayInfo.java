package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 不可用时间范围
 *
 * @author auto create
 * @since 1.0, 2024-08-01 16:50:52
 */
public class CanNoUseLimitDayInfo extends AlipayObject {

	private static final long serialVersionUID = 4571498767125796413L;

	/**
	 * 限制结束日期（yyyy-MM-dd）
	 */
	@ApiField("end_date")
	private String endDate;

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
	 * 限制开始日期（格式：yyyy-MM-dd）
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 限制开始时间（HH:mm:ss）。表示限制到具体时间区间
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
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

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}

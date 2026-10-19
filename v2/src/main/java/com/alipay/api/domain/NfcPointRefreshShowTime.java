package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-14 11:22:57
 */
public class NfcPointRefreshShowTime extends AlipayObject {

	private static final long serialVersionUID = 8732285669768355695L;

	/**
	 * 展示结束日期
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 展示结束时间，毫秒时间戳
	 */
	@ApiField("end_date_time_stamp")
	private Long endDateTimeStamp;

	/**
	 * 展示开始日期
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 展示开始时间，毫秒时间戳
	 */
	@ApiField("start_date_time_stamp")
	private Long startDateTimeStamp;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Long getEndDateTimeStamp() {
		return this.endDateTimeStamp;
	}
	public void setEndDateTimeStamp(Long endDateTimeStamp) {
		this.endDateTimeStamp = endDateTimeStamp;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public Long getStartDateTimeStamp() {
		return this.startDateTimeStamp;
	}
	public void setStartDateTimeStamp(Long startDateTimeStamp) {
		this.startDateTimeStamp = startDateTimeStamp;
	}

}

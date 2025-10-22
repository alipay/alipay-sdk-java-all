package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 课时配置记录
 *
 * @author auto create
 * @since 1.0, 2025-05-27 18:48:56
 */
public class EduPeriodConfig extends AlipayObject {

	private static final long serialVersionUID = 4498332769952514987L;

	/**
	 * 课时结束时间，格式"HH:mm"
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 课时节次，表示第几节课
	 */
	@ApiField("period_no")
	private Long periodNo;

	/**
	 * 课时开始时间，格式"HH:mm"
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Long getPeriodNo() {
		return this.periodNo;
	}
	public void setPeriodNo(Long periodNo) {
		this.periodNo = periodNo;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}

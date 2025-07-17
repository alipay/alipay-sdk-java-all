package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 时间区间
 *
 * @author auto create
 * @since 1.0, 2023-12-08 00:43:40
 */
public class TimeRangeStructVO extends AlipayObject {

	private static final long serialVersionUID = 1585956339498515385L;

	/**
	 * 结束时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 开始时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}

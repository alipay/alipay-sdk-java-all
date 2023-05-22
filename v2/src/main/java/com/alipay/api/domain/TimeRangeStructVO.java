package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 时间区间
 *
 * @author auto create
 * @since 1.0, 2023-05-19 17:28:36
 */
public class TimeRangeStructVO extends AlipayObject {

	private static final long serialVersionUID = 6518932161522123472L;

	/**
	 * 结束时间，格式为YYYY-MM-DD hh:mm:ss
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 开始时间，格式为YYYY-MM-DD hh:mm:ss
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

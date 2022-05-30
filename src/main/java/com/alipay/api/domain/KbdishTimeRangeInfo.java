package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 时间范围
 *
 * @author auto create
 * @since 1.0, 2020-12-10 14:08:02
 */
public class KbdishTimeRangeInfo extends AlipayObject {

	private static final long serialVersionUID = 4732758489419374289L;

	/**
	 * 结束时间点
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 起始时间点
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

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预订时间单元
 *
 * @author auto create
 * @since 1.0, 2019-04-22 15:52:27
 */
public class ReservationTimeUnit extends AlipayObject {

	private static final long serialVersionUID = 5899168579655425945L;

	/**
	 * 时间，格式HH:mm
	 */
	@ApiField("time")
	private String time;

	/**
	 * 当日CURRENT_DAY
次日NEXT_DAY
	 */
	@ApiField("time_type")
	private String timeType;

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public String getTimeType() {
		return this.timeType;
	}
	public void setTimeType(String timeType) {
		this.timeType = timeType;
	}

}

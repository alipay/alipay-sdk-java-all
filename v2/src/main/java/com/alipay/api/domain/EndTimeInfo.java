package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结束时间
 *
 * @author auto create
 * @since 1.0, 2023-02-10 13:05:40
 */
public class EndTimeInfo extends AlipayObject {

	private static final long serialVersionUID = 3638457776225816762L;

	/**
	 * 结束时间  格式：HH:mm:ss
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 结束时间类型
	 */
	@ApiField("end_time_type")
	private String endTimeType;

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

}

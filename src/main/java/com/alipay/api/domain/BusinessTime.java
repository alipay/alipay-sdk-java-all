package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营业时间段起止时间
 *
 * @author auto create
 * @since 1.0, 2021-12-24 16:40:44
 */
public class BusinessTime extends AlipayObject {

	private static final long serialVersionUID = 1458588323765944364L;

	/**
	 * 营业时间段中暂停营业时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 营业时间段中开始营业时间
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

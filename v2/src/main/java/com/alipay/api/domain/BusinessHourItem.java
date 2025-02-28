package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺营业时间细项
 *
 * @author auto create
 * @since 1.0, 2020-11-24 18:48:26
 */
public class BusinessHourItem extends AlipayObject {

	private static final long serialVersionUID = 8756932217152592629L;

	/**
	 * 营业结束时间，精确到分钟
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 营业开始时间，精确到分钟。
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

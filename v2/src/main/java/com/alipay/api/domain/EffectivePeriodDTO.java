package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 配送范围生效时间段
 *
 * @author auto create
 * @since 1.0, 2025-03-19 16:22:33
 */
public class EffectivePeriodDTO extends AlipayObject {

	private static final long serialVersionUID = 4725834178185859143L;

	/**
	 * 配送范围生效结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 配送范围生效开始时间
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

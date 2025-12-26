package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 饮酒频率
 *
 * @author auto create
 * @since 1.0, 2025-12-15 13:37:41
 */
public class DrinkFrequency extends AlipayObject {

	private static final long serialVersionUID = 1714311688794218225L;

	/**
	 * 次
	 */
	@ApiField("frequency")
	private String frequency;

	/**
	 * 时间
	 */
	@ApiField("time")
	private String time;

	/**
	 * 单位周
	 */
	@ApiField("time_unit")
	private String timeUnit;

	public String getFrequency() {
		return this.frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public String getTimeUnit() {
		return this.timeUnit;
	}
	public void setTimeUnit(String timeUnit) {
		this.timeUnit = timeUnit;
	}

}

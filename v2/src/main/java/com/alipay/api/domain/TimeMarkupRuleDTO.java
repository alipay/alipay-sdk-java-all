package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 时段加价规则
 *
 * @author auto create
 * @since 1.0, 2025-03-19 16:22:33
 */
public class TimeMarkupRuleDTO extends AlipayObject {

	private static final long serialVersionUID = 7871756499634233519L;

	/**
	 * 时段加价规则的结束时间，格式为HH:MM
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 加价价格，单位元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 时段加价规则开启时间，格式为HH:MM
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}

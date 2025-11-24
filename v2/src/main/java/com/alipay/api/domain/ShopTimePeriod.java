package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营业时间
 *
 * @author auto create
 * @since 1.0, 2025-10-23 10:09:27
 */
public class ShopTimePeriod extends AlipayObject {

	private static final long serialVersionUID = 4543356236871182722L;

	/**
	 * 营业结束时间
	 */
	@ApiField("end")
	private String end;

	/**
	 * 营业结束时间是下一天
	 */
	@ApiField("end_next_day")
	private Boolean endNextDay;

	/**
	 * 营业开始时间
	 */
	@ApiField("start")
	private String start;

	public String getEnd() {
		return this.end;
	}
	public void setEnd(String end) {
		this.end = end;
	}

	public Boolean getEndNextDay() {
		return this.endNextDay;
	}
	public void setEndNextDay(Boolean endNextDay) {
		this.endNextDay = endNextDay;
	}

	public String getStart() {
		return this.start;
	}
	public void setStart(String start) {
		this.start = start;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 不可用时段
 *
 * @author auto create
 * @since 1.0, 2016-05-01 18:48:49
 */
public class ForbiddenVoucherTimeDTO extends AlipayObject {

	private static final long serialVersionUID = 4369141711383873316L;

	/**
	 * 日期范围
	 */
	@ApiField("days")
	private String days;

	/**
	 * 时间段
	 */
	@ApiField("times")
	private String times;

	public String getDays() {
		return this.days;
	}
	public void setDays(String days) {
		this.days = days;
	}

	public String getTimes() {
		return this.times;
	}
	public void setTimes(String times) {
		this.times = times;
	}

}

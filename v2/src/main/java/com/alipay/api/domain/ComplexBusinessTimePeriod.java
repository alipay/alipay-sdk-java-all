package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营业时间段，例如表达10-12点
 *
 * @author auto create
 * @since 1.0, 2025-05-20 20:21:29
 */
public class ComplexBusinessTimePeriod extends AlipayObject {

	private static final long serialVersionUID = 3264821132137424726L;

	/**
	 * 关门时间 格式：HH:mm
	 */
	@ApiField("close_time")
	private String closeTime;

	/**
	 * 开门时间 格式：HH:mm
	 */
	@ApiField("open_time")
	private String openTime;

	public String getCloseTime() {
		return this.closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	public String getOpenTime() {
		return this.openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

}

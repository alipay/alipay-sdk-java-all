package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店经营时间
 *
 * @author auto create
 * @since 1.0, 2025-12-15 11:26:55
 */
public class InteOpShopBusinessTime extends AlipayObject {

	private static final long serialVersionUID = 8368642274321567724L;

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

	/**
	 * 本对象表示周几的营业时间。1~6表示周一到周六，7表示周日
	 */
	@ApiField("week_day")
	private Long weekDay;

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

	public Long getWeekDay() {
		return this.weekDay;
	}
	public void setWeekDay(Long weekDay) {
		this.weekDay = weekDay;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-11 15:17:48
 */
public class LifeServiceShopBusinessTime extends AlipayObject {

	private static final long serialVersionUID = 1745654424184437519L;

	/**
	 * 是否24小时营业
	 */
	@ApiField("always_open")
	private Boolean alwaysOpen;

	/**
	 * 营业结束时间 HH:mm 格式
	 */
	@ApiField("close_time")
	private String closeTime;

	/**
	 * 营业开始时间 HH:mm 格式
	 */
	@ApiField("open_time")
	private String openTime;

	/**
	 * 每周第几天，逗号分割。如：周一、周三对应 1,3
	 */
	@ApiField("week_days")
	private String weekDays;

	public Boolean getAlwaysOpen() {
		return this.alwaysOpen;
	}
	public void setAlwaysOpen(Boolean alwaysOpen) {
		this.alwaysOpen = alwaysOpen;
	}

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

	public String getWeekDays() {
		return this.weekDays;
	}
	public void setWeekDays(String weekDays) {
		this.weekDays = weekDays;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 点位经营时间
 *
 * @author auto create
 * @since 1.0, 2023-11-16 10:35:23
 */
public class PointBusinessTime extends AlipayObject {

	private static final long serialVersionUID = 6541679475247144239L;

	/**
	 * 关门时间 格式HH:mm
	 */
	@ApiField("close_time")
	private String closeTime;

	/**
	 * 开门时间 HH:mm
	 */
	@ApiField("open_time")
	private String openTime;

	/**
	 * 1-7表示星期一到星期日
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

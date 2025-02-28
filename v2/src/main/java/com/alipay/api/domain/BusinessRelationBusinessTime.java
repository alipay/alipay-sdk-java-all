package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基于商业关系的门店营业时间
 *
 * @author auto create
 * @since 1.0, 2023-10-24 10:30:49
 */
public class BusinessRelationBusinessTime extends AlipayObject {

	private static final long serialVersionUID = 4228122678529315234L;

	/**
	 * 关门时间，格式HH:mm
	 */
	@ApiField("close_time")
	private String closeTime;

	/**
	 * 营业开门时间，格式HH:mm
	 */
	@ApiField("open_time")
	private String openTime;

	/**
	 * 表示周几的营业时间。1~6：表示周一到周六，7：表示周日
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

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户步数信息
 *
 * @author auto create
 * @since 1.0, 2017-07-07 11:56:25
 */
public class StepcounterDataInfo extends AlipayObject {

	private static final long serialVersionUID = 6587946593118375375L;

	/**
	 * 用户的日计步值。为用户某个时区下某个日期的步数总值。
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 查询到的步数所在日期。
	 */
	@ApiField("count_date")
	private String countDate;

	/**
	 * 返回的用户日计步数所在时区。若入参中时区不为空，则此返回与入参相同; 若入参中时区为空，则返回用户设备所在时区步数。
	 */
	@ApiField("time_zone")
	private String timeZone;

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getCountDate() {
		return this.countDate;
	}
	public void setCountDate(String countDate) {
		this.countDate = countDate;
	}

	public String getTimeZone() {
		return this.timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

}

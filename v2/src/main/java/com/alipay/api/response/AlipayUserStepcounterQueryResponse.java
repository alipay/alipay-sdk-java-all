package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.stepcounter.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:14
 */
public class AlipayUserStepcounterQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3736824961128834453L;

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

	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCount( ) {
		return this.count;
	}

	public void setCountDate(String countDate) {
		this.countDate = countDate;
	}
	public String getCountDate( ) {
		return this.countDate;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	public String getTimeZone( ) {
		return this.timeZone;
	}

}

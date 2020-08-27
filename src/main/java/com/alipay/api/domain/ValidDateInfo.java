package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 有效期
 *
 * @author auto create
 * @since 1.0, 2016-06-23 17:38:07
 */
public class ValidDateInfo extends AlipayObject {

	private static final long serialVersionUID = 7686313438387791777L;

	/**
	 * 截至时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 相对有效期
	 */
	@ApiField("relative_time")
	private PeriodInfo relativeTime;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 时间模式,RELATIVE=相对时间，RELATIVE=绝对模式
	 */
	@ApiField("time_mode")
	private String timeMode;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public PeriodInfo getRelativeTime() {
		return this.relativeTime;
	}
	public void setRelativeTime(PeriodInfo relativeTime) {
		this.relativeTime = relativeTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getTimeMode() {
		return this.timeMode;
	}
	public void setTimeMode(String timeMode) {
		this.timeMode = timeMode;
	}

}

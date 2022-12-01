package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 奖品使用有效期
 *
 * @author auto create
 * @since 1.0, 2020-06-29 16:04:48
 */
public class PrizeValidPeriod extends AlipayObject {

	private static final long serialVersionUID = 7758935346573641886L;

	/**
	 * 使用生效相对分钟数（相对时间）
	 */
	@ApiField("active_min")
	private Long activeMin;

	/**
	 * 废弃
	 */
	@ApiField("active_mins")
	private Date activeMins;

	/**
	 * 使用开始时间（绝对时间
	 */
	@ApiField("active_time")
	private Date activeTime;

	/**
	 * 使用截止相对分钟数（相对时间）
	 */
	@ApiField("end_min")
	private Long endMin;

	/**
	 * 废弃
	 */
	@ApiField("end_mins")
	private Date endMins;

	/**
	 * 使用截止时间（绝对时间）
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * RELATIVE->相对时间
ABSOLUTE->绝对时间
	 */
	@ApiField("period_type")
	private String periodType;

	public Long getActiveMin() {
		return this.activeMin;
	}
	public void setActiveMin(Long activeMin) {
		this.activeMin = activeMin;
	}

	public Date getActiveMins() {
		return this.activeMins;
	}
	public void setActiveMins(Date activeMins) {
		this.activeMins = activeMins;
	}

	public Date getActiveTime() {
		return this.activeTime;
	}
	public void setActiveTime(Date activeTime) {
		this.activeTime = activeTime;
	}

	public Long getEndMin() {
		return this.endMin;
	}
	public void setEndMin(Long endMin) {
		this.endMin = endMin;
	}

	public Date getEndMins() {
		return this.endMins;
	}
	public void setEndMins(Date endMins) {
		this.endMins = endMins;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getPeriodType() {
		return this.periodType;
	}
	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}

}

package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 某个日期的排期信息
 *
 * @author auto create
 * @since 1.0, 2026-07-09 16:41:20
 */
public class RangeInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7365289129467461217L;

	/**
	 * 是否可约
	 */
	@ApiField("available")
	private Boolean available;

	/**
	 * 日期类型
	 */
	@ApiField("date_type")
	private Long dateType;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 是否立即预约
	 */
	@ApiField("immediately")
	private Boolean immediately;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public Boolean getAvailable() {
		return this.available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public Long getDateType() {
		return this.dateType;
	}
	public void setDateType(Long dateType) {
		this.dateType = dateType;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Boolean getImmediately() {
		return this.immediately;
	}
	public void setImmediately(Boolean immediately) {
		this.immediately = immediately;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}

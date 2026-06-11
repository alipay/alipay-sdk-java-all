package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子任务调整
 *
 * @author auto create
 * @since 1.0, 2026-01-30 10:57:58
 */
public class NSalesSubActivityModify extends AlipayObject {

	private static final long serialVersionUID = 3199841955617968777L;

	/**
	 * 子任务结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 子任务期号
	 */
	@ApiField("period_no")
	private Long periodNo;

	/**
	 * 子任务开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 子任务id
	 */
	@ApiField("sub_activity_id")
	private String subActivityId;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Long getPeriodNo() {
		return this.periodNo;
	}
	public void setPeriodNo(Long periodNo) {
		this.periodNo = periodNo;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getSubActivityId() {
		return this.subActivityId;
	}
	public void setSubActivityId(String subActivityId) {
		this.subActivityId = subActivityId;
	}

}

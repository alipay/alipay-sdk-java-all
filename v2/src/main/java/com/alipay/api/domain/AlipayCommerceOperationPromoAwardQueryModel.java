package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销活动激励信息查询
 *
 * @author auto create
 * @since 1.0, 2026-06-17 14:45:51
 */
public class AlipayCommerceOperationPromoAwardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6141789195741469269L;

	/**
	 * 活动编码，点餐B侧激励活动，编码固定
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 查询截止时间（时间跨度90天以内）
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 查询起始时间（时间跨度90天以内）
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 主体ID，参考报名接口返回的subject_id
	 */
	@ApiField("subject_id")
	private String subjectId;

	/**
	 * 主体类型，参考报名接口返回的subject_type
	 */
	@ApiField("subject_type")
	private String subjectType;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getSubjectId() {
		return this.subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectType() {
		return this.subjectType;
	}
	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

}

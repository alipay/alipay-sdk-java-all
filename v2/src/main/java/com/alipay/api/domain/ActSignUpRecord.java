package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-08 21:57:45
 */
public class ActSignUpRecord extends AlipayObject {

	private static final long serialVersionUID = 7339521276324172664L;

	/**
	 * 活动唯一编码
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 活动结束时间
	 */
	@ApiField("activity_round_end_time")
	private Date activityRoundEndTime;

	/**
	 * 活动开始时间
	 */
	@ApiField("activity_round_start_time")
	private Date activityRoundStartTime;

	/**
	 * 用户活动结束时间
	 */
	@ApiField("activity_user_end_time")
	private Date activityUserEndTime;

	/**
	 * 用户活动开始时间
	 */
	@ApiField("activity_user_start_time")
	private Date activityUserStartTime;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 报名记录唯一ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 活动期次ID
	 */
	@ApiField("round_id")
	private String roundId;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 主体ID
	 */
	@ApiField("subject_id")
	private String subjectId;

	/**
	 * 报名主体类型
	 */
	@ApiField("subject_type")
	private String subjectType;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public Date getActivityRoundEndTime() {
		return this.activityRoundEndTime;
	}
	public void setActivityRoundEndTime(Date activityRoundEndTime) {
		this.activityRoundEndTime = activityRoundEndTime;
	}

	public Date getActivityRoundStartTime() {
		return this.activityRoundStartTime;
	}
	public void setActivityRoundStartTime(Date activityRoundStartTime) {
		this.activityRoundStartTime = activityRoundStartTime;
	}

	public Date getActivityUserEndTime() {
		return this.activityUserEndTime;
	}
	public void setActivityUserEndTime(Date activityUserEndTime) {
		this.activityUserEndTime = activityUserEndTime;
	}

	public Date getActivityUserStartTime() {
		return this.activityUserStartTime;
	}
	public void setActivityUserStartTime(Date activityUserStartTime) {
		this.activityUserStartTime = activityUserStartTime;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getRoundId() {
		return this.roundId;
	}
	public void setRoundId(String roundId) {
		this.roundId = roundId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
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

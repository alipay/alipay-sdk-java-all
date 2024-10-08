package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文体-视频跟练-同步用户跟练记录
 *
 * @author auto create
 * @since 1.0, 2023-10-11 21:23:51
 */
public class AlipayCommerceSportsLessonUserlessonrecordSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4357877189248266149L;

	/**
	 * 数据来源
	 */
	@ApiField("data_source")
	private String dataSource;

	/**
	 * 课程的外部存储id
	 */
	@ApiField("lesson_out_id")
	private String lessonOutId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 跟练记录外部存储id
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 记录发生时间
	 */
	@ApiField("record_time")
	private Date recordTime;

	/**
	 * 学习课程消耗卡路里，单位是卡
	 */
	@ApiField("study_calorie")
	private Long studyCalorie;

	/**
	 * 实际学习时长，单位是秒
	 */
	@ApiField("study_duration")
	private Long studyDuration;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getDataSource() {
		return this.dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getLessonOutId() {
		return this.lessonOutId;
	}
	public void setLessonOutId(String lessonOutId) {
		this.lessonOutId = lessonOutId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public Date getRecordTime() {
		return this.recordTime;
	}
	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}

	public Long getStudyCalorie() {
		return this.studyCalorie;
	}
	public void setStudyCalorie(Long studyCalorie) {
		this.studyCalorie = studyCalorie;
	}

	public Long getStudyDuration() {
		return this.studyDuration;
	}
	public void setStudyDuration(Long studyDuration) {
		this.studyDuration = studyDuration;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

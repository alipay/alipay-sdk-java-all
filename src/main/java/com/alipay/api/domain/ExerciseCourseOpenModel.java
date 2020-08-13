package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 课程模型
 *
 * @author auto create
 * @since 1.0, 2019-01-03 10:33:00
 */
public class ExerciseCourseOpenModel extends AlipayObject {

	private static final long serialVersionUID = 5164361264585331138L;

	/**
	 * 课程类型：团课(CLASS),私教(PRIVATE_LESSON)
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 上课教室名
	 */
	@ApiField("classroom")
	private String classroom;

	/**
	 * 课程详情链接（订单链接）
	 */
	@ApiField("course_detail_url")
	private String courseDetailUrl;

	/**
	 * 教练的手艺人ID
	 */
	@ApiField("craftsman_id")
	private String craftsmanId;

	/**
	 * 教练昵称
	 */
	@ApiField("craftsman_name")
	private String craftsmanName;

	/**
	 * 教练头衔
	 */
	@ApiField("craftsman_title")
	private String craftsmanTitle;

	/**
	 * 课程结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 外部课程ID。课程记录在ISV系统中的ID
	 */
	@ApiField("external_course_id")
	private String externalCourseId;

	/**
	 * 课程名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 来源类型。默认SIGN_UP。枚举：报名（SIGN_UP）,推荐（RECOMMEND）
	 */
	@ApiField("source_type")
	private String sourceType;

	/**
	 * 课程开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getClassroom() {
		return this.classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public String getCourseDetailUrl() {
		return this.courseDetailUrl;
	}
	public void setCourseDetailUrl(String courseDetailUrl) {
		this.courseDetailUrl = courseDetailUrl;
	}

	public String getCraftsmanId() {
		return this.craftsmanId;
	}
	public void setCraftsmanId(String craftsmanId) {
		this.craftsmanId = craftsmanId;
	}

	public String getCraftsmanName() {
		return this.craftsmanName;
	}
	public void setCraftsmanName(String craftsmanName) {
		this.craftsmanName = craftsmanName;
	}

	public String getCraftsmanTitle() {
		return this.craftsmanTitle;
	}
	public void setCraftsmanTitle(String craftsmanTitle) {
		this.craftsmanTitle = craftsmanTitle;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getExternalCourseId() {
		return this.externalCourseId;
	}
	public void setExternalCourseId(String externalCourseId) {
		this.externalCourseId = externalCourseId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}

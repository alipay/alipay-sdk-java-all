package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学分银行成绩数据模型
 *
 * @author auto create
 * @since 1.0, 2020-12-09 22:22:45
 */
public class CreditBankCredit extends AlipayObject {

	private static final long serialVersionUID = 8328716856779427568L;

	/**
	 * 课程名称
	 */
	@ApiField("course_name")
	private String courseName;

	/**
	 * 教育类别，枚举：成人高等教育（30），普通高等教育（31）
	 */
	@ApiField("course_property")
	private Long courseProperty;

	/**
	 * 结果代码，枚举：（40=毕业，41=结业肄业）
	 */
	@ApiField("course_result_code")
	private Long courseResultCode;

	/**
	 * 成绩
	 */
	@ApiField("course_score")
	private Long courseScore;

	/**
	 * 毕业季代码（50=春，51=秋）
	 */
	@ApiField("course_season")
	private Long courseSeason;

	/**
	 * 专业名称
	 */
	@ApiField("course_subject")
	private String courseSubject;

	/**
	 * 届别
	 */
	@ApiField("course_year")
	private String courseYear;

	/**
	 * 学分
	 */
	@ApiField("credit")
	private Long credit;

	/**
	 * 学时
	 */
	@ApiField("credit_hour")
	private Long creditHour;

	/**
	 * 获得成绩id
	 */
	@ApiField("credit_outer_id")
	private String creditOuterId;

	/**
	 * 获取时间，格式yyyy-mm-dd HH:mm:ss
	 */
	@ApiField("experience_time")
	private Date experienceTime;

	/**
	 * 办学机构
	 */
	@ApiField("inst_name")
	private String instName;

	/**
	 * 教育层次，枚举：本科（20），专科（21）
	 */
	@ApiField("learning_stage")
	private Long learningStage;

	public String getCourseName() {
		return this.courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Long getCourseProperty() {
		return this.courseProperty;
	}
	public void setCourseProperty(Long courseProperty) {
		this.courseProperty = courseProperty;
	}

	public Long getCourseResultCode() {
		return this.courseResultCode;
	}
	public void setCourseResultCode(Long courseResultCode) {
		this.courseResultCode = courseResultCode;
	}

	public Long getCourseScore() {
		return this.courseScore;
	}
	public void setCourseScore(Long courseScore) {
		this.courseScore = courseScore;
	}

	public Long getCourseSeason() {
		return this.courseSeason;
	}
	public void setCourseSeason(Long courseSeason) {
		this.courseSeason = courseSeason;
	}

	public String getCourseSubject() {
		return this.courseSubject;
	}
	public void setCourseSubject(String courseSubject) {
		this.courseSubject = courseSubject;
	}

	public String getCourseYear() {
		return this.courseYear;
	}
	public void setCourseYear(String courseYear) {
		this.courseYear = courseYear;
	}

	public Long getCredit() {
		return this.credit;
	}
	public void setCredit(Long credit) {
		this.credit = credit;
	}

	public Long getCreditHour() {
		return this.creditHour;
	}
	public void setCreditHour(Long creditHour) {
		this.creditHour = creditHour;
	}

	public String getCreditOuterId() {
		return this.creditOuterId;
	}
	public void setCreditOuterId(String creditOuterId) {
		this.creditOuterId = creditOuterId;
	}

	public Date getExperienceTime() {
		return this.experienceTime;
	}
	public void setExperienceTime(Date experienceTime) {
		this.experienceTime = experienceTime;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

	public Long getLearningStage() {
		return this.learningStage;
	}
	public void setLearningStage(Long learningStage) {
		this.learningStage = learningStage;
	}

}

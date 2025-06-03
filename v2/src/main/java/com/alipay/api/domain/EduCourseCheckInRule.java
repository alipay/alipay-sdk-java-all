package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 课程签到规则
 *
 * @author auto create
 * @since 1.0, 2025-05-27 18:48:55
 */
public class EduCourseCheckInRule extends AlipayObject {

	private static final long serialVersionUID = 4133752334797557453L;

	/**
	 * 自动刷新二维码
	 */
	@ApiField("automatic_refresh")
	private Boolean automaticRefresh;

	/**
	 * 课程描述
	 */
	@ApiField("course_desc")
	private String courseDesc;

	/**
	 * 课程ID
	 */
	@ApiField("course_id")
	private String courseId;

	/**
	 * 课程名称
	 */
	@ApiField("course_name")
	private String courseName;

	/**
	 * 课程签到规则ID
	 */
	@ApiField("course_rule_id")
	private String courseRuleId;

	/**
	 * 课程签到规则名称
	 */
	@ApiField("course_rule_name")
	private String courseRuleName;

	/**
	 * 签到规则信息
	 */
	@ApiField("edu_check_in_rule")
	private EduCheckInRuleConfig eduCheckInRule;

	/**
	 * 启用课程规则
	 */
	@ApiField("enable_course_rule")
	private Boolean enableCourseRule;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 手动关闭标识
	 */
	@ApiField("manual_close")
	private Boolean manualClose;

	/**
	 * 刷新二维码频率（单位：秒）
	 */
	@ApiField("refresh_qr_code_frequency")
	private Long refreshQrCodeFrequency;

	/**
	 * 学期描述
	 */
	@ApiField("semester_desc")
	private String semesterDesc;

	/**
	 * 学期id
	 */
	@ApiField("semester_id")
	private String semesterId;

	/**
	 * 学期名称
	 */
	@ApiField("semester_name")
	private String semesterName;

	public Boolean getAutomaticRefresh() {
		return this.automaticRefresh;
	}
	public void setAutomaticRefresh(Boolean automaticRefresh) {
		this.automaticRefresh = automaticRefresh;
	}

	public String getCourseDesc() {
		return this.courseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}

	public String getCourseId() {
		return this.courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return this.courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseRuleId() {
		return this.courseRuleId;
	}
	public void setCourseRuleId(String courseRuleId) {
		this.courseRuleId = courseRuleId;
	}

	public String getCourseRuleName() {
		return this.courseRuleName;
	}
	public void setCourseRuleName(String courseRuleName) {
		this.courseRuleName = courseRuleName;
	}

	public EduCheckInRuleConfig getEduCheckInRule() {
		return this.eduCheckInRule;
	}
	public void setEduCheckInRule(EduCheckInRuleConfig eduCheckInRule) {
		this.eduCheckInRule = eduCheckInRule;
	}

	public Boolean getEnableCourseRule() {
		return this.enableCourseRule;
	}
	public void setEnableCourseRule(Boolean enableCourseRule) {
		this.enableCourseRule = enableCourseRule;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public Boolean getManualClose() {
		return this.manualClose;
	}
	public void setManualClose(Boolean manualClose) {
		this.manualClose = manualClose;
	}

	public Long getRefreshQrCodeFrequency() {
		return this.refreshQrCodeFrequency;
	}
	public void setRefreshQrCodeFrequency(Long refreshQrCodeFrequency) {
		this.refreshQrCodeFrequency = refreshQrCodeFrequency;
	}

	public String getSemesterDesc() {
		return this.semesterDesc;
	}
	public void setSemesterDesc(String semesterDesc) {
		this.semesterDesc = semesterDesc;
	}

	public String getSemesterId() {
		return this.semesterId;
	}
	public void setSemesterId(String semesterId) {
		this.semesterId = semesterId;
	}

	public String getSemesterName() {
		return this.semesterName;
	}
	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}

}

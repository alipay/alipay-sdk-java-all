package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 课程签到码保存
 *
 * @author auto create
 * @since 1.0, 2025-06-09 09:58:37
 */
public class AlipayCommerceEducateCourseCheckincodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7338782377194613535L;

	/**
	 * 自动刷新二维码
	 */
	@ApiField("automatic_refresh")
	private Boolean automaticRefresh;

	/**
	 * 课程id
	 */
	@ApiField("course_id")
	private String courseId;

	/**
	 * 课程签到规则ID，修改和删除的时候必填
	 */
	@ApiField("course_rule_id")
	private String courseRuleId;

	/**
	 * 课程签到规则名称
	 */
	@ApiField("course_rule_name")
	private String courseRuleName;

	/**
	 * 新增的时候必填
	 */
	@ApiField("enable_course_rule")
	private Boolean enableCourseRule;

	/**
	 * 结束签到
	 */
	@ApiField("end_check_in")
	private Boolean endCheckIn;

	/**
	 * 机构内标，取值来自学校内标
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
	 * 花名册ID
	 */
	@ApiField("roster_id")
	private String rosterId;

	/**
	 * 规则id
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * 状态，1代表有效，0代表删除
	 */
	@ApiField("status")
	private String status;

	public Boolean getAutomaticRefresh() {
		return this.automaticRefresh;
	}
	public void setAutomaticRefresh(Boolean automaticRefresh) {
		this.automaticRefresh = automaticRefresh;
	}

	public String getCourseId() {
		return this.courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
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

	public Boolean getEnableCourseRule() {
		return this.enableCourseRule;
	}
	public void setEnableCourseRule(Boolean enableCourseRule) {
		this.enableCourseRule = enableCourseRule;
	}

	public Boolean getEndCheckIn() {
		return this.endCheckIn;
	}
	public void setEndCheckIn(Boolean endCheckIn) {
		this.endCheckIn = endCheckIn;
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

	public String getRosterId() {
		return this.rosterId;
	}
	public void setRosterId(String rosterId) {
		this.rosterId = rosterId;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

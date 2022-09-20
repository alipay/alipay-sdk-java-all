package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支课堂课程领取状态更新
 *
 * @author auto create
 * @since 1.0, 2020-09-28 16:44:14
 */
public class AlipayCommerceEducateTrainActivitystatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3365717651935979789L;

	/**
	 * 活动 id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 领取状态
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/**
	 * 课程id
	 */
	@ApiField("course_id")
	private String courseId;

	/**
	 * 加密后的手机号
	 */
	@ApiField("encode_mobile")
	private String encodeMobile;

	/**
	 * 错误描述 (SPECIAL_MOBILE_NUMBER)
	 */
	@ApiField("fail_desc")
	private String failDesc;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	public String getCourseId() {
		return this.courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getEncodeMobile() {
		return this.encodeMobile;
	}
	public void setEncodeMobile(String encodeMobile) {
		this.encodeMobile = encodeMobile;
	}

	public String getFailDesc() {
		return this.failDesc;
	}
	public void setFailDesc(String failDesc) {
		this.failDesc = failDesc;
	}

}

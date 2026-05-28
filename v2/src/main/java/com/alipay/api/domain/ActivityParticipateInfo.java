package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动参与信息
 *
 * @author auto create
 * @since 1.0, 2026-04-29 15:14:06
 */
public class ActivityParticipateInfo extends AlipayObject {

	private static final long serialVersionUID = 5424782887656611513L;

	/**
	 * 活动编码
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 是否可参与当前活动
	 */
	@ApiField("admited")
	private Boolean admited;

	/**
	 * 是否已报名当前活动
	 */
	@ApiField("has_sign_up")
	private Boolean hasSignUp;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Boolean getAdmited() {
		return this.admited;
	}
	public void setAdmited(Boolean admited) {
		this.admited = admited;
	}

	public Boolean getHasSignUp() {
		return this.hasSignUp;
	}
	public void setHasSignUp(Boolean hasSignUp) {
		this.hasSignUp = hasSignUp;
	}

}

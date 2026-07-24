package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 当前在途活动
 *
 * @author auto create
 * @since 1.0, 2026-06-29 15:02:56
 */
public class ActivityPeriodInfo extends AlipayObject {

	private static final long serialVersionUID = 1658572114327637589L;

	/**
	 * 活动唯一编码
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 当期活动结束时间
	 */
	@ApiField("round_end_time")
	private String roundEndTime;

	/**
	 * 活动期次ID
	 */
	@ApiField("round_id")
	private String roundId;

	/**
	 * 期次名称
	 */
	@ApiField("round_name")
	private String roundName;

	/**
	 * 当期活动开始时间
	 */
	@ApiField("round_start_time")
	private String roundStartTime;

	/**
	 * 报名截止时间
	 */
	@ApiField("sign_up_end_time")
	private String signUpEndTime;

	/**
	 * 报名开始时间
	 */
	@ApiField("sign_up_start_time")
	private String signUpStartTime;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getRoundEndTime() {
		return this.roundEndTime;
	}
	public void setRoundEndTime(String roundEndTime) {
		this.roundEndTime = roundEndTime;
	}

	public String getRoundId() {
		return this.roundId;
	}
	public void setRoundId(String roundId) {
		this.roundId = roundId;
	}

	public String getRoundName() {
		return this.roundName;
	}
	public void setRoundName(String roundName) {
		this.roundName = roundName;
	}

	public String getRoundStartTime() {
		return this.roundStartTime;
	}
	public void setRoundStartTime(String roundStartTime) {
		this.roundStartTime = roundStartTime;
	}

	public String getSignUpEndTime() {
		return this.signUpEndTime;
	}
	public void setSignUpEndTime(String signUpEndTime) {
		this.signUpEndTime = signUpEndTime;
	}

	public String getSignUpStartTime() {
		return this.signUpStartTime;
	}
	public void setSignUpStartTime(String signUpStartTime) {
		this.signUpStartTime = signUpStartTime;
	}

}

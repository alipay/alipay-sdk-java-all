package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部活动任务信息同步
 *
 * @author auto create
 * @since 1.0, 2024-10-24 16:04:38
 */
public class AlipayCommerceTransportChargerActivitytaskSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8335526528212392454L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动流水号
	 */
	@ApiField("activity_service_no")
	private String activityServiceNo;

	/**
	 * 任务操作事件情况： SIGNUP(报名) ACHIEVE(达成)
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 运营商侧用户ID
	 */
	@ApiField("operator_uid")
	private String operatorUid;

	/**
	 * 任务达成后，发放的奖励ID（例如：发放会员，即为会员ID）
	 */
	@ApiField("reward_id")
	private String rewardId;

	/**
	 * 活动任务达成时间
	 */
	@ApiField("task_achieve_time")
	private Date taskAchieveTime;

	/**
	 * 报名时间
	 */
	@ApiField("task_registration_time")
	private Date taskRegistrationTime;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityServiceNo() {
		return this.activityServiceNo;
	}
	public void setActivityServiceNo(String activityServiceNo) {
		this.activityServiceNo = activityServiceNo;
	}

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOperatorUid() {
		return this.operatorUid;
	}
	public void setOperatorUid(String operatorUid) {
		this.operatorUid = operatorUid;
	}

	public String getRewardId() {
		return this.rewardId;
	}
	public void setRewardId(String rewardId) {
		this.rewardId = rewardId;
	}

	public Date getTaskAchieveTime() {
		return this.taskAchieveTime;
	}
	public void setTaskAchieveTime(Date taskAchieveTime) {
		this.taskAchieveTime = taskAchieveTime;
	}

	public Date getTaskRegistrationTime() {
		return this.taskRegistrationTime;
	}
	public void setTaskRegistrationTime(Date taskRegistrationTime) {
		this.taskRegistrationTime = taskRegistrationTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

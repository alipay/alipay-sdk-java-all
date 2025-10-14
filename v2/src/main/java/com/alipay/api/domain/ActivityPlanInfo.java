package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动招商方案信息
 *
 * @author auto create
 * @since 1.0, 2017-09-15 15:52:22
 */
public class ActivityPlanInfo extends AlipayObject {

	private static final long serialVersionUID = 6311954794591361697L;

	/**
	 * 平台活动结束时间
	 */
	@ApiField("activity_end_time")
	private String activityEndTime;

	/**
	 * 平台活动开始时间
	 */
	@ApiField("activity_start_time")
	private String activityStartTime;

	/**
	 * 招商结束时间
	 */
	@ApiField("confirm_end_time")
	private String confirmEndTime;

	/**
	 * 平台活动邀约工单号(需要在第三方活动中回传)
	 */
	@ApiField("invite_order_id")
	private String inviteOrderId;

	/**
	 * 规则描述
	 */
	@ApiListField("plan_rule_list")
	@ApiField("plan_rule")
	private List<PlanRule> planRuleList;

	/**
	 * 是个链接地址，下载后是pdf文件
	 */
	@ApiField("plat_activity_agreement")
	private String platActivityAgreement;

	/**
	 * 平台活动id（需要在第三方方活动中回传）
	 */
	@ApiField("plat_activity_id")
	private String platActivityId;

	/**
	 * 平台活动标签类型
	 */
	@ApiField("plat_activity_label_type")
	private String platActivityLabelType;

	/**
	 * 平台活动名称
	 */
	@ApiField("plat_activity_name")
	private String platActivityName;

	/**
	 * 活动规则描述
	 */
	@ApiField("plat_activity_rule_desc")
	private String platActivityRuleDesc;

	/**
	 * 平台活动状态,GOING/FINISH,GOING表示招商中,FINISH表示招商已经结束(再报名活动也无法成功),只有GOING状态可以报名
	 */
	@ApiField("plat_activity_status")
	private String platActivityStatus;

	/**
	 * 其他说明
	 */
	@ApiField("plat_other_desc")
	private String platOtherDesc;

	public String getActivityEndTime() {
		return this.activityEndTime;
	}
	public void setActivityEndTime(String activityEndTime) {
		this.activityEndTime = activityEndTime;
	}

	public String getActivityStartTime() {
		return this.activityStartTime;
	}
	public void setActivityStartTime(String activityStartTime) {
		this.activityStartTime = activityStartTime;
	}

	public String getConfirmEndTime() {
		return this.confirmEndTime;
	}
	public void setConfirmEndTime(String confirmEndTime) {
		this.confirmEndTime = confirmEndTime;
	}

	public String getInviteOrderId() {
		return this.inviteOrderId;
	}
	public void setInviteOrderId(String inviteOrderId) {
		this.inviteOrderId = inviteOrderId;
	}

	public List<PlanRule> getPlanRuleList() {
		return this.planRuleList;
	}
	public void setPlanRuleList(List<PlanRule> planRuleList) {
		this.planRuleList = planRuleList;
	}

	public String getPlatActivityAgreement() {
		return this.platActivityAgreement;
	}
	public void setPlatActivityAgreement(String platActivityAgreement) {
		this.platActivityAgreement = platActivityAgreement;
	}

	public String getPlatActivityId() {
		return this.platActivityId;
	}
	public void setPlatActivityId(String platActivityId) {
		this.platActivityId = platActivityId;
	}

	public String getPlatActivityLabelType() {
		return this.platActivityLabelType;
	}
	public void setPlatActivityLabelType(String platActivityLabelType) {
		this.platActivityLabelType = platActivityLabelType;
	}

	public String getPlatActivityName() {
		return this.platActivityName;
	}
	public void setPlatActivityName(String platActivityName) {
		this.platActivityName = platActivityName;
	}

	public String getPlatActivityRuleDesc() {
		return this.platActivityRuleDesc;
	}
	public void setPlatActivityRuleDesc(String platActivityRuleDesc) {
		this.platActivityRuleDesc = platActivityRuleDesc;
	}

	public String getPlatActivityStatus() {
		return this.platActivityStatus;
	}
	public void setPlatActivityStatus(String platActivityStatus) {
		this.platActivityStatus = platActivityStatus;
	}

	public String getPlatOtherDesc() {
		return this.platOtherDesc;
	}
	public void setPlatOtherDesc(String platOtherDesc) {
		this.platOtherDesc = platOtherDesc;
	}

}

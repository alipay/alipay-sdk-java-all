package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 零售营销任务操作接口
 *
 * @author auto create
 * @since 1.0, 2026-04-20 15:27:45
 */
public class AlipayCommerceRetailTaskSaveModel extends AlipayObject {

	private static final long serialVersionUID = 8319965417887488848L;

	/**
	 * 活动基础信息
	 */
	@ApiField("base_info")
	private String baseInfo;

	/**
	 * 权益
	 */
	@ApiField("benefit")
	private String benefit;

	/**
	 * 奖励规则
	 */
	@ApiField("bonus_rule")
	private String bonusRule;

	/**
	 * 完成规则
	 */
	@ApiField("completed_rule")
	private String completedRule;

	/**
	 * 投放规则
	 */
	@ApiField("delivery_rule")
	private String deliveryRule;

	/**
	 * 限制规则
	 */
	@ApiField("limit_rule")
	private String limitRule;

	/**
	 * 操作类型
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 展示规则
	 */
	@ApiField("show_rule")
	private String showRule;

	/**
	 * 任务行动类型
	 */
	@ApiField("task_action")
	private String taskAction;

	public String getBaseInfo() {
		return this.baseInfo;
	}
	public void setBaseInfo(String baseInfo) {
		this.baseInfo = baseInfo;
	}

	public String getBenefit() {
		return this.benefit;
	}
	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	public String getBonusRule() {
		return this.bonusRule;
	}
	public void setBonusRule(String bonusRule) {
		this.bonusRule = bonusRule;
	}

	public String getCompletedRule() {
		return this.completedRule;
	}
	public void setCompletedRule(String completedRule) {
		this.completedRule = completedRule;
	}

	public String getDeliveryRule() {
		return this.deliveryRule;
	}
	public void setDeliveryRule(String deliveryRule) {
		this.deliveryRule = deliveryRule;
	}

	public String getLimitRule() {
		return this.limitRule;
	}
	public void setLimitRule(String limitRule) {
		this.limitRule = limitRule;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getShowRule() {
		return this.showRule;
	}
	public void setShowRule(String showRule) {
		this.showRule = showRule;
	}

	public String getTaskAction() {
		return this.taskAction;
	}
	public void setTaskAction(String taskAction) {
		this.taskAction = taskAction;
	}

}

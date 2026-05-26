package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 零售营销活动操作接口
 *
 * @author auto create
 * @since 1.0, 2026-05-25 11:37:47
 */
public class AlipayCommerceRetailPromoactivitySaveModel extends AlipayObject {

	private static final long serialVersionUID = 2714122525686937615L;

	/**
	 * 活动类型
	 */
	@ApiField("activity_type")
	private String activityType;

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
	 * 投放规则
	 */
	@ApiField("delivery_rule")
	private String deliveryRule;

	/**
	 * 发放规则
	 */
	@ApiField("grant_rule")
	private String grantRule;

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

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

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

	public String getDeliveryRule() {
		return this.deliveryRule;
	}
	public void setDeliveryRule(String deliveryRule) {
		this.deliveryRule = deliveryRule;
	}

	public String getGrantRule() {
		return this.grantRule;
	}
	public void setGrantRule(String grantRule) {
		this.grantRule = grantRule;
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

}

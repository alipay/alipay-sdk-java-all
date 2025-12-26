package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建员工价立减活动
 *
 * @author auto create
 * @since 1.0, 2025-12-01 20:32:41
 */
public class AlipayCommerceEcActivityDiscountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5486273277424641258L;

	/**
	 * 活动预算信息
	 */
	@ApiField("activity_budget_info")
	private ActivityBudgetInfo activityBudgetInfo;

	/**
	 * 人群规则信息
	 */
	@ApiField("activity_crowd_info")
	private ActivityCrowdInfo activityCrowdInfo;

	/**
	 * 活动的描述
	 */
	@ApiField("activity_description")
	private String activityDescription;

	/**
	 * 活动的名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 活动优惠信息
	 */
	@ApiField("activity_promotion_info")
	private ActivityPromotionInfo activityPromotionInfo;

	/**
	 * 用户使用活动限制规则
	 */
	@ApiField("activity_user_usage_limit_info")
	private ActivityUserUsageLimitInfo activityUserUsageLimitInfo;

	/**
	 * 蚂蚁门店id，用于水平权限鉴权。可通过ant.merchant.expand.shop.create创建蚂蚁门店获取
	 */
	@ApiField("ant_shop_id")
	private String antShopId;

	/**
	 * 活动结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 创建活动的幂等性校验
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 活动开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	public ActivityBudgetInfo getActivityBudgetInfo() {
		return this.activityBudgetInfo;
	}
	public void setActivityBudgetInfo(ActivityBudgetInfo activityBudgetInfo) {
		this.activityBudgetInfo = activityBudgetInfo;
	}

	public ActivityCrowdInfo getActivityCrowdInfo() {
		return this.activityCrowdInfo;
	}
	public void setActivityCrowdInfo(ActivityCrowdInfo activityCrowdInfo) {
		this.activityCrowdInfo = activityCrowdInfo;
	}

	public String getActivityDescription() {
		return this.activityDescription;
	}
	public void setActivityDescription(String activityDescription) {
		this.activityDescription = activityDescription;
	}

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public ActivityPromotionInfo getActivityPromotionInfo() {
		return this.activityPromotionInfo;
	}
	public void setActivityPromotionInfo(ActivityPromotionInfo activityPromotionInfo) {
		this.activityPromotionInfo = activityPromotionInfo;
	}

	public ActivityUserUsageLimitInfo getActivityUserUsageLimitInfo() {
		return this.activityUserUsageLimitInfo;
	}
	public void setActivityUserUsageLimitInfo(ActivityUserUsageLimitInfo activityUserUsageLimitInfo) {
		this.activityUserUsageLimitInfo = activityUserUsageLimitInfo;
	}

	public String getAntShopId() {
		return this.antShopId;
	}
	public void setAntShopId(String antShopId) {
		this.antShopId = antShopId;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}

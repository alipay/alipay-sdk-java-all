package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-01-04 10:47:41
 */
public class ActivityDiscountInfo extends AlipayObject {

	private static final long serialVersionUID = 1766221351269249351L;

	/**
	 * 活动预算信息
	 */
	@ApiField("activity_budget_info")
	private ActivityBudgetInfo activityBudgetInfo;

	/**
	 * 活动人群规则信息
	 */
	@ApiField("activity_crowd_info")
	private ActivityCrowdInfo activityCrowdInfo;

	/**
	 * 活动描述
	 */
	@ApiField("activity_description")
	private String activityDescription;

	/**
	 * 活动ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 活动优惠信息
	 */
	@ApiField("activity_promotion_info")
	private ActivityPromotionInfo activityPromotionInfo;

	/**
	 * 用户使用限制信息
	 */
	@ApiField("activity_user_usage_limit_info")
	private ActivityUserUsageLimitInfo activityUserUsageLimitInfo;

	/**
	 * 活动结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 创建活动的外部幂等号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 活动开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 标识活动当前的状态
	 */
	@ApiField("status")
	private String status;

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

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

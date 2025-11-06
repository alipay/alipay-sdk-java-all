package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券活动
 *
 * @author auto create
 * @since 1.0, 2025-01-10 10:12:12
 */
public class VoucherActivityResponse extends AlipayObject {

	private static final long serialVersionUID = 3271983865252559867L;

	/**
	 * 活动描述
	 */
	@ApiField("activity_describe")
	private String activityDescribe;

	/**
	 * 活动失效时间
	 */
	@ApiField("activity_effective_end_time")
	private Date activityEffectiveEndTime;

	/**
	 * 活动生效时间
	 */
	@ApiField("activity_effective_start_time")
	private Date activityEffectiveStartTime;

	/**
	 * 券活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 券活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 封顶金额，单位元，最多保留两位小数
	 */
	@ApiField("ceiling_amount")
	private String ceilingAmount;

	/**
	 * 折扣力度，保留一位小数
	 */
	@ApiField("promotion_discount")
	private String promotionDiscount;

	/**
	 * 优惠可用时间段
	 */
	@ApiField("promotion_duration")
	private PromotionDurationResponse promotionDuration;

	/**
	 * 限制优惠可用时段
	 */
	@ApiField("promotion_limit")
	private String promotionLimit;

	/**
	 * 门槛金额，单位元，最多保留两位小数
	 */
	@ApiField("threshold_amount")
	private String thresholdAmount;

	/**
	 * 活动券金额，单位元，最多保留两位小数
	 */
	@ApiField("voucher_amount")
	private String voucherAmount;

	/**
	 * 券描述
	 */
	@ApiField("voucher_describe")
	private String voucherDescribe;

	/**
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 券类型
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public String getActivityDescribe() {
		return this.activityDescribe;
	}
	public void setActivityDescribe(String activityDescribe) {
		this.activityDescribe = activityDescribe;
	}

	public Date getActivityEffectiveEndTime() {
		return this.activityEffectiveEndTime;
	}
	public void setActivityEffectiveEndTime(Date activityEffectiveEndTime) {
		this.activityEffectiveEndTime = activityEffectiveEndTime;
	}

	public Date getActivityEffectiveStartTime() {
		return this.activityEffectiveStartTime;
	}
	public void setActivityEffectiveStartTime(Date activityEffectiveStartTime) {
		this.activityEffectiveStartTime = activityEffectiveStartTime;
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

	public String getCeilingAmount() {
		return this.ceilingAmount;
	}
	public void setCeilingAmount(String ceilingAmount) {
		this.ceilingAmount = ceilingAmount;
	}

	public String getPromotionDiscount() {
		return this.promotionDiscount;
	}
	public void setPromotionDiscount(String promotionDiscount) {
		this.promotionDiscount = promotionDiscount;
	}

	public PromotionDurationResponse getPromotionDuration() {
		return this.promotionDuration;
	}
	public void setPromotionDuration(PromotionDurationResponse promotionDuration) {
		this.promotionDuration = promotionDuration;
	}

	public String getPromotionLimit() {
		return this.promotionLimit;
	}
	public void setPromotionLimit(String promotionLimit) {
		this.promotionLimit = promotionLimit;
	}

	public String getThresholdAmount() {
		return this.thresholdAmount;
	}
	public void setThresholdAmount(String thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

	public String getVoucherAmount() {
		return this.voucherAmount;
	}
	public void setVoucherAmount(String voucherAmount) {
		this.voucherAmount = voucherAmount;
	}

	public String getVoucherDescribe() {
		return this.voucherDescribe;
	}
	public void setVoucherDescribe(String voucherDescribe) {
		this.voucherDescribe = voucherDescribe;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}

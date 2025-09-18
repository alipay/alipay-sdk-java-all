package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券详情
 *
 * @author auto create
 * @since 1.0, 2025-01-10 10:12:11
 */
public class VoucherInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 2185576773568984263L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 券发行方名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 封顶金额，单位元，最多保留两位小数
	 */
	@ApiField("ceiling_amount")
	private String ceilingAmount;

	/**
	 * 券logo
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 折扣力度，最多保留一位小数
	 */
	@ApiField("promotion_discount")
	private String promotionDiscount;

	/**
	 * 优惠可用时段
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
	 * 券面额，单位元，最多保留两位小数
	 */
	@ApiField("voucher_amount")
	private String voucherAmount;

	/**
	 * 券使用说明
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	/**
	 * 券失效时间
	 */
	@ApiField("voucher_effective_end_time")
	private Date voucherEffectiveEndTime;

	/**
	 * 券生效时间
	 */
	@ApiField("voucher_effective_start_time")
	private Date voucherEffectiveStartTime;

	/**
	 * 券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 券使用跳链
	 */
	@ApiField("voucher_jump_url")
	private String voucherJumpUrl;

	/**
	 * 优惠券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 已使用
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

	/**
	 * 券类型
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCeilingAmount() {
		return this.ceilingAmount;
	}
	public void setCeilingAmount(String ceilingAmount) {
		this.ceilingAmount = ceilingAmount;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
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

	public String getVoucherDescription() {
		return this.voucherDescription;
	}
	public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}

	public Date getVoucherEffectiveEndTime() {
		return this.voucherEffectiveEndTime;
	}
	public void setVoucherEffectiveEndTime(Date voucherEffectiveEndTime) {
		this.voucherEffectiveEndTime = voucherEffectiveEndTime;
	}

	public Date getVoucherEffectiveStartTime() {
		return this.voucherEffectiveStartTime;
	}
	public void setVoucherEffectiveStartTime(Date voucherEffectiveStartTime) {
		this.voucherEffectiveStartTime = voucherEffectiveStartTime;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public String getVoucherJumpUrl() {
		return this.voucherJumpUrl;
	}
	public void setVoucherJumpUrl(String voucherJumpUrl) {
		this.voucherJumpUrl = voucherJumpUrl;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

	public String getVoucherStatus() {
		return this.voucherStatus;
	}
	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}

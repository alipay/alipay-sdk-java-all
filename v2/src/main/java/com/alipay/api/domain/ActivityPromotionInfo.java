package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 员工价活动优惠信息，包括优惠的类型、优惠金额、优惠的限制信息等
 *
 * @author auto create
 * @since 1.0, 2025-12-01 20:27:41
 */
public class ActivityPromotionInfo extends AlipayObject {

	private static final long serialVersionUID = 3279615556147727285L;

	/**
	 * 优惠时间限制信息，可限制周和天的使用时间段
	 */
	@ApiField("activity_promotion_duration")
	private ActivityPromotionDuration activityPromotionDuration;

	/**
	 * 最高优惠金额，单位元；当promotion_type为VERTICAL_SUBTRACTION时，最高优惠金额要大于立减金额;当promotion_type为DISCOUNT时，最高优惠金额要大于0;
	 */
	@ApiField("ceil_promotion_amount")
	private String ceilPromotionAmount;

	/**
	 * 表示单笔减或者满减金额，单位元；
	 */
	@ApiField("deduction_amount")
	private String deductionAmount;

	/**
	 * 表示优惠类型为折扣优惠时折扣的比例，通过小数表示如8.8表示88折。值的范围[1,9.99]
	 */
	@ApiField("discount_ratio")
	private String discountRatio;

	/**
	 * 支持使用优惠的产品类型，固定枚举值
	 */
	@ApiField("product_type")
	private String productType;

	/**
	 * 支持选择的优惠类型，固定枚举值
	 */
	@ApiField("promotion_type")
	private String promotionType;

	/**
	 * 立减门槛金额，单位元；当promotion_type=SINGLE_DEDUCTION时，单笔减的门槛金额>0；当promotion_type=VERTICAL_SUBTRACTION时，每满金额<10000
	 */
	@ApiField("threshold_amount")
	private String thresholdAmount;

	public ActivityPromotionDuration getActivityPromotionDuration() {
		return this.activityPromotionDuration;
	}
	public void setActivityPromotionDuration(ActivityPromotionDuration activityPromotionDuration) {
		this.activityPromotionDuration = activityPromotionDuration;
	}

	public String getCeilPromotionAmount() {
		return this.ceilPromotionAmount;
	}
	public void setCeilPromotionAmount(String ceilPromotionAmount) {
		this.ceilPromotionAmount = ceilPromotionAmount;
	}

	public String getDeductionAmount() {
		return this.deductionAmount;
	}
	public void setDeductionAmount(String deductionAmount) {
		this.deductionAmount = deductionAmount;
	}

	public String getDiscountRatio() {
		return this.discountRatio;
	}
	public void setDiscountRatio(String discountRatio) {
		this.discountRatio = discountRatio;
	}

	public String getProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getPromotionType() {
		return this.promotionType;
	}
	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

	public String getThresholdAmount() {
		return this.thresholdAmount;
	}
	public void setThresholdAmount(String thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

}

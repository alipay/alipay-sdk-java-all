package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠信息
 *
 * @author auto create
 * @since 1.0, 2026-06-05 21:52:54
 */
public class PromotionCoupon extends AlipayObject {

	private static final long serialVersionUID = 8192725889135151226L;

	/**
	 * 折扣10元金额 单位分
	 */
	@ApiField("amount_off")
	private Long amountOff;

	/**
	 * 优惠编码
	 */
	@ApiField("coupon_id")
	private String couponId;

	/**
	 * 周期性重复类型
支持 forever（永久）、once（一次性）、repeating（重复）模式
	 */
	@ApiField("duration")
	private String duration;

	/**
	 * 在接下来的3个计费周期可重复使用该优惠
	 */
	@ApiField("duration_in_iterations")
	private String durationInIterations;

	/**
	 * 优惠名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 折扣比例，百分比，10%含义为9折
	 */
	@ApiField("percent_off")
	private Long percentOff;

	/**
	 * 优惠到期时间
	 */
	@ApiField("redeem_by")
	private String redeemBy;

	public Long getAmountOff() {
		return this.amountOff;
	}
	public void setAmountOff(Long amountOff) {
		this.amountOff = amountOff;
	}

	public String getCouponId() {
		return this.couponId;
	}
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getDuration() {
		return this.duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDurationInIterations() {
		return this.durationInIterations;
	}
	public void setDurationInIterations(String durationInIterations) {
		this.durationInIterations = durationInIterations;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getPercentOff() {
		return this.percentOff;
	}
	public void setPercentOff(Long percentOff) {
		this.percentOff = percentOff;
	}

	public String getRedeemBy() {
		return this.redeemBy;
	}
	public void setRedeemBy(String redeemBy) {
		this.redeemBy = redeemBy;
	}

}

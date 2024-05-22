package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠券列表
 *
 * @author auto create
 * @since 1.0, 2024-05-20 10:28:28
 */
public class Coupons extends AlipayObject {

	private static final long serialVersionUID = 2799628171283755383L;

	/**
	 * 活动编码
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 面额(分)
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 优惠券编码
	 */
	@ApiField("coupon_code")
	private String couponCode;

	/**
	 * 优惠券类型
 - VOUCHER
 - DISCOUNT
	 */
	@ApiField("coupon_type")
	private String couponType;

	/**
	 * 折扣（0-1）
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 使用门槛-无门槛传0
	 */
	@ApiField("use_threshold")
	private String useThreshold;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCouponCode() {
		return this.couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getCouponType() {
		return this.couponType;
	}
	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	public String getDiscount() {
		return this.discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getUseThreshold() {
		return this.useThreshold;
	}
	public void setUseThreshold(String useThreshold) {
		this.useThreshold = useThreshold;
	}

}

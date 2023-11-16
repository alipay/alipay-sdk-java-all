package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险优惠权益
 *
 * @author auto create
 * @since 1.0, 2022-03-28 17:20:26
 */
public class InsCoupon extends AlipayObject {

	private static final long serialVersionUID = 2878996579428829667L;

	/**
	 * 实际使用的权益值，可选不唯一，可能是金额（分），也可能是业务约定的其他描述
	 */
	@ApiField("actual_coupon_value")
	private String actualCouponValue;

	/**
	 * 实际使用的折扣金额（分），可选不唯一
	 */
	@ApiField("actual_discount_cash")
	private Long actualDiscountCash;

	/**
	 * 权益ID，必选不唯一，营销域分配
	 */
	@ApiField("coupon_id")
	private String couponId;

	/**
	 * 权益类型，可选不唯一，营销域分配
	 */
	@ApiField("coupon_type")
	private String couponType;

	/**
	 * 权益值，可选不唯一，可能是金额（分），也可能是业务约定的其他描述
	 */
	@ApiField("coupon_value")
	private String couponValue;

	public String getActualCouponValue() {
		return this.actualCouponValue;
	}
	public void setActualCouponValue(String actualCouponValue) {
		this.actualCouponValue = actualCouponValue;
	}

	public Long getActualDiscountCash() {
		return this.actualDiscountCash;
	}
	public void setActualDiscountCash(Long actualDiscountCash) {
		this.actualDiscountCash = actualDiscountCash;
	}

	public String getCouponId() {
		return this.couponId;
	}
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getCouponType() {
		return this.couponType;
	}
	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	public String getCouponValue() {
		return this.couponValue;
	}
	public void setCouponValue(String couponValue) {
		this.couponValue = couponValue;
	}

}

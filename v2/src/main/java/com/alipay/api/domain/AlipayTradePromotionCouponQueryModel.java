package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅营销优惠查询
 *
 * @author auto create
 * @since 1.0, 2026-06-08 20:27:54
 */
public class AlipayTradePromotionCouponQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6531256465129898875L;

	/**
	 * 优惠编码
	 */
	@ApiField("coupon_id")
	private String couponId;

	public String getCouponId() {
		return this.couponId;
	}
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

}

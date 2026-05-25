package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅营销券查询
 *
 * @author auto create
 * @since 1.0, 2026-05-11 20:32:49
 */
public class AlipayTradePromotionCouponQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8132284712932437699L;

	/**
	 * 优惠券编码
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

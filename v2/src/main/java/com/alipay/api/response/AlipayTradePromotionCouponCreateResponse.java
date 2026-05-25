package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PromotionCoupon;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.promotion.coupon.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-11 20:26:19
 */
public class AlipayTradePromotionCouponCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8461718416195432915L;

	/** 
	 * 优惠券信息
	 */
	@ApiField("coupon_info")
	private PromotionCoupon couponInfo;

	public void setCouponInfo(PromotionCoupon couponInfo) {
		this.couponInfo = couponInfo;
	}
	public PromotionCoupon getCouponInfo( ) {
		return this.couponInfo;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PromotionCoupon;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.promotion.coupon.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-08 20:37:55
 */
public class AlipayTradePromotionCouponCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1544155331166823163L;

	/** 
	 * 优惠信息
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

package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromotionCoupon;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.promotion.coupon.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-11 20:32:49
 */
public class AlipayTradePromotionCouponQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7642456435259432739L;

	/** 
	 * null
	 */
	@ApiListField("coupon_list")
	@ApiField("promotion_coupon")
	private List<PromotionCoupon> couponList;

	public void setCouponList(List<PromotionCoupon> couponList) {
		this.couponList = couponList;
	}
	public List<PromotionCoupon> getCouponList( ) {
		return this.couponList;
	}

}

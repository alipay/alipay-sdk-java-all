package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CouponDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.coupons.alter.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-22 17:27:03
 */
public class AlipayCloudCloudbaseCouponsAlterQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7342794474276781358L;

	/** 
	 * 优惠券详情列表
	 */
	@ApiListField("coupons")
	@ApiField("coupon_detail")
	private List<CouponDetail> coupons;

	public void setCoupons(List<CouponDetail> coupons) {
		this.coupons = coupons;
	}
	public List<CouponDetail> getCoupons( ) {
		return this.coupons;
	}

}

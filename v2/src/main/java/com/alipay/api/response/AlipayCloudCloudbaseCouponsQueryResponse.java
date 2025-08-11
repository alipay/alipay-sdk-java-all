package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CouponDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.coupons.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-04 11:10:16
 */
public class AlipayCloudCloudbaseCouponsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7585326871877979961L;

	/** 
	 * 全量优惠券列表详情
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

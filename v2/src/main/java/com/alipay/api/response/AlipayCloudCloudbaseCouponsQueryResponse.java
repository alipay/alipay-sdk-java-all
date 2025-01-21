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
 * @since 1.0, 2024-05-22 16:22:02
 */
public class AlipayCloudCloudbaseCouponsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5419653378975123199L;

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

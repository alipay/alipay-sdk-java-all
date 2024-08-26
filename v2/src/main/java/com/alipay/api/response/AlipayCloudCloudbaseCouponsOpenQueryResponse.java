package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CouponDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.coupons.open.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-22 17:27:03
 */
public class AlipayCloudCloudbaseCouponsOpenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4659772591433121334L;

	/** 
	 * 优惠券列表
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

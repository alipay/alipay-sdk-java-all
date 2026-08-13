package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RailwayCouponActivityInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.railway.coupon.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-11 16:47:49
 */
public class AlipayCommerceTransportRailwayCouponQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5643335956373521653L;

	/** 
	 * null
	 */
	@ApiListField("coupon_list")
	@ApiField("railway_coupon_activity_info")
	private List<RailwayCouponActivityInfo> couponList;

	public void setCouponList(List<RailwayCouponActivityInfo> couponList) {
		this.couponList = couponList;
	}
	public List<RailwayCouponActivityInfo> getCouponList( ) {
		return this.couponList;
	}

}

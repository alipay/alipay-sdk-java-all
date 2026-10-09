package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsCouponInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.inscoupon.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-23 10:12:51
 */
public class AlipayInsMarketingInscouponQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8489515635367825784L;

	/** 
	 * null
	 */
	@ApiListField("coupon_list")
	@ApiField("ins_coupon_info")
	private List<InsCouponInfo> couponList;

	public void setCouponList(List<InsCouponInfo> couponList) {
		this.couponList = couponList;
	}
	public List<InsCouponInfo> getCouponList( ) {
		return this.couponList;
	}

}

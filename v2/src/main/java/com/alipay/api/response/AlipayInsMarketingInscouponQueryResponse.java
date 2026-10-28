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
 * @since 1.0, 2026-10-26 17:58:00
 */
public class AlipayInsMarketingInscouponQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6817527137331992549L;

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

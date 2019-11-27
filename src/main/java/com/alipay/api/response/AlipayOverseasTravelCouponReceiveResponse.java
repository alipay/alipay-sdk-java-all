package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.coupon.receive response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-15 16:28:24
 */
public class AlipayOverseasTravelCouponReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 6448815117374566444L;

	/** 
	 * 用户领取优惠成功后，下个操作的链接
	 */
	@ApiField("next_action_url")
	private String nextActionUrl;

	public void setNextActionUrl(String nextActionUrl) {
		this.nextActionUrl = nextActionUrl;
	}
	public String getNextActionUrl( ) {
		return this.nextActionUrl;
	}

}

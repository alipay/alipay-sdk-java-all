package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-27 13:51:50
 */
public class AlipayMarketingActivityOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 4735895465542344222L;

	/** 
	 * 购买商家兑换券的营销订单号。
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.order.refundconfirmcommit response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-27 18:31:03
 */
public class AlipayMarketingActivityOrderRefundconfirmcommitResponse extends AlipayResponse {

	private static final long serialVersionUID = 7648511838651792665L;

	/** 
	 * 购买商家兑换券的营销订单号
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

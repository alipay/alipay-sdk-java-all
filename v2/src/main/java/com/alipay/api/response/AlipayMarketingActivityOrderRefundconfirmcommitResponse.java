package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.order.refundconfirmcommit response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:26:46
 */
public class AlipayMarketingActivityOrderRefundconfirmcommitResponse extends AlipayResponse {

	private static final long serialVersionUID = 2668965453753398718L;

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

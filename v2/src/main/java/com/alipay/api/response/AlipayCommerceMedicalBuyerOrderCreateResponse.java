package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.buyer.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-09 14:17:55
 */
public class AlipayCommerceMedicalBuyerOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2568147582514487318L;

	/** 
	 * 履约单ID
	 */
	@ApiField("fulfillment_no")
	private String fulfillmentNo;

	/** 
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setFulfillmentNo(String fulfillmentNo) {
		this.fulfillmentNo = fulfillmentNo;
	}
	public String getFulfillmentNo( ) {
		return this.fulfillmentNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}

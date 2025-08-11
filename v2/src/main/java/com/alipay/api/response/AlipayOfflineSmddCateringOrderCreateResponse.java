package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.smdd.catering.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-27 14:17:31
 */
public class AlipayOfflineSmddCateringOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5386439129958143792L;

	/** 
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部订单id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}
	public String getOutOrderId( ) {
		return this.outOrderId;
	}

}

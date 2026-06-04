package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.sn.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-09 10:52:49
 */
public class AlipayCommerceTransportEtcSnSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5219459884917994331L;

	/** 
	 * 支付宝侧业务订单号
	 */
	@ApiField("order_id")
	private String orderId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.sn.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-06 20:07:56
 */
public class AlipayCommerceTransportEtcSnSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1141825331752772841L;

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

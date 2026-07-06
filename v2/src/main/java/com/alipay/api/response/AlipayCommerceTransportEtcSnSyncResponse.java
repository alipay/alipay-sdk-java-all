package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.sn.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-08 17:12:56
 */
public class AlipayCommerceTransportEtcSnSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7155247765579245232L;

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

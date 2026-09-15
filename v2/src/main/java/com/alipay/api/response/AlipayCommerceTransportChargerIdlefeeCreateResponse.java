package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.charger.idlefee.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-20 11:47:56
 */
public class AlipayCommerceTransportChargerIdlefeeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8585821143728281371L;

	/** 
	 * 支付宝占位费订单号
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

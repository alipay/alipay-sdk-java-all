package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.charger.pay.precreate response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-19 14:17:41
 */
public class AlipayCommerceTransportChargerPayPrecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3886395327366721617L;

	/** 
	 * 行业支付订单号
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

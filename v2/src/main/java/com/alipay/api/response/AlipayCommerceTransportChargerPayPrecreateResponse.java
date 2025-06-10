package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.charger.pay.precreate response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-14 11:02:30
 */
public class AlipayCommerceTransportChargerPayPrecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1694991789141235247L;

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

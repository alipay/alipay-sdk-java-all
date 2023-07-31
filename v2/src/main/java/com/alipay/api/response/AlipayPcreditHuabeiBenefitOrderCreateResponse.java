package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.benefit.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 20:43:43
 */
public class AlipayPcreditHuabeiBenefitOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2134175913749431893L;

	/** 
	 * 权益订单id
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

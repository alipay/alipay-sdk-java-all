package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerapp.plugin.order response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 07:09:50
 */
public class AlipayOpenMiniInnerappPluginOrderResponse extends AlipayResponse {

	private static final long serialVersionUID = 7651123971864615373L;

	/** 
	 * 订单号
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

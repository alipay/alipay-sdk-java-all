package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerapp.plugin.order response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 16:44:51
 */
public class AlipayOpenMiniInnerappPluginOrderResponse extends AlipayResponse {

	private static final long serialVersionUID = 5615391535538434618L;

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

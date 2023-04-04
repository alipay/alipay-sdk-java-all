package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-04 19:26:42
 */
public class AlipayOpenMiniOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2363786478671661278L;

	/** 
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部商户订单号
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

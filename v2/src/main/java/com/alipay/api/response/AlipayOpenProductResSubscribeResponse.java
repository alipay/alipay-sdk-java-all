package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.product.res.subscribe response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-10 16:07:58
 */
public class AlipayOpenProductResSubscribeResponse extends AlipayResponse {

	private static final long serialVersionUID = 2186929332451626388L;

	/** 
	 * 订阅成功后返回的订阅订单号
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

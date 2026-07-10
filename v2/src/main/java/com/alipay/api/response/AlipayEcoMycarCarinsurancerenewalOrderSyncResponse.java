package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.carinsurancerenewal.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-23 20:22:46
 */
public class AlipayEcoMycarCarinsurancerenewalOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2457516768536481522L;

	/** 
	 * 车生活订单号，在首次同步订单时生成并返回
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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-16 11:00:30
 */
public class AlipayMerchantOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4672522513481798843L;

	/** 
	 * 同步成功后的订单号
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

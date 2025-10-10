package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.address.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-31 10:55:08
 */
public class AntMerchantExpandAddressCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2116173744532244923L;

	/** 
	 * 代表本次操作的工单号，用于后续监听消息时匹配单号使用
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

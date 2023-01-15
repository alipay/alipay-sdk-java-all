package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.shop.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 00:53:43
 */
public class AntMerchantExpandShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3715676255674856618L;

	/** 
	 * 申请单id
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

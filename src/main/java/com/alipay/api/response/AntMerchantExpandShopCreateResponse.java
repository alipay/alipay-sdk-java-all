package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.shop.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-11 17:20:21
 */
public class AntMerchantExpandShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8899256788691827571L;

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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.isv.shop.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-30 11:26:22
 */
public class AntMerchantExpandIsvShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5143443812216757738L;

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

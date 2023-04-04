package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.isv.shop.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 05:13:25
 */
public class AntMerchantExpandIsvShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1767357988943741378L;

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

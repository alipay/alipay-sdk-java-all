package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.shop.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-20 20:32:27
 */
public class AntMerchantExpandShopModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5119984373997876181L;

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

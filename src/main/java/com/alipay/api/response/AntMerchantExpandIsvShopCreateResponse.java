package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.isv.shop.create response.
 * 
 * @author auto create
 * @since 1.0, 2018-08-23 20:00:01
 */
public class AntMerchantExpandIsvShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7441177129948954677L;

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

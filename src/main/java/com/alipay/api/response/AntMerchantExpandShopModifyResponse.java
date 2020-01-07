package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.shop.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-12-11 18:57:29
 */
public class AntMerchantExpandShopModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6631753412535954967L;

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

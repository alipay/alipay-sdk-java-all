package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.shop.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-04 20:02:42
 */
public class AntMerchantExpandShopModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5884666741817474146L;

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

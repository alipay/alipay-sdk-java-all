package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.isv.shop.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-13 15:54:59
 */
public class AntMerchantExpandIsvShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3849793893137827148L;

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

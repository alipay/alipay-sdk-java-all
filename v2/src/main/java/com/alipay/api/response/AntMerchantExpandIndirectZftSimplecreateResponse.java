package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zft.simplecreate response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-11 19:57:04
 */
public class AntMerchantExpandIndirectZftSimplecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3319748922373586699L;

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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zft.simplecreate response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-06 12:31:51
 */
public class AntMerchantExpandIndirectZftSimplecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3326884379549612722L;

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

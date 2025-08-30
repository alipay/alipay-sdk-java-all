package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zft.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-10 15:17:33
 */
public class AntMerchantExpandIndirectZftCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1357311625471612554L;

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

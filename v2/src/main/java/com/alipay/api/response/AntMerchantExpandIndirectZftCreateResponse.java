package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zft.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:25:21
 */
public class AntMerchantExpandIndirectZftCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1759484257365212553L;

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

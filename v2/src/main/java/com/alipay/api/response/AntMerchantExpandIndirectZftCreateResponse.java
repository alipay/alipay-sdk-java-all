package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zft.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 16:46:16
 */
public class AntMerchantExpandIndirectZftCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1574397997328348174L;

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

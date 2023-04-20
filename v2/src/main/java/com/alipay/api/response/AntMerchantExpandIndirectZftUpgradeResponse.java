package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zft.upgrade response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-06 19:16:23
 */
public class AntMerchantExpandIndirectZftUpgradeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4833622857863752532L;

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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zft.settlementmodify response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-21 16:27:30
 */
public class AntMerchantExpandIndirectZftSettlementmodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3468767155945249876L;

	/** 
	 * 申请单ID
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

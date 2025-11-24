package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zft.settlementmodify response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-14 15:22:41
 */
public class AntMerchantExpandIndirectZftSettlementmodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8131565333926954793L;

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

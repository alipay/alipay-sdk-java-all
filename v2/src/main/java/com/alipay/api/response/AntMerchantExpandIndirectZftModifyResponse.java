package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zft.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-21 13:27:32
 */
public class AntMerchantExpandIndirectZftModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2662372181183761868L;

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

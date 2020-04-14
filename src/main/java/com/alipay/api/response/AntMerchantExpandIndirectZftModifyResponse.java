package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zft.modify response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-14 11:46:16
 */
public class AntMerchantExpandIndirectZftModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6832154426967399558L;

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

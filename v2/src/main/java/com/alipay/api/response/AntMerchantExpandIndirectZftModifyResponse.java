package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zft.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-04 15:57:03
 */
public class AntMerchantExpandIndirectZftModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2682374717252821365L;

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

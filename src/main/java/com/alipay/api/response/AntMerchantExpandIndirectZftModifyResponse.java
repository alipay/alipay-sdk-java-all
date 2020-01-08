package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zft.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-01 19:10:01
 */
public class AntMerchantExpandIndirectZftModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6696324757748975193L;

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

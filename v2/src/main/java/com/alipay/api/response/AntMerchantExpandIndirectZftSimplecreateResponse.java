package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zft.simplecreate response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-15 17:21:42
 */
public class AntMerchantExpandIndirectZftSimplecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1743246686337441987L;

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

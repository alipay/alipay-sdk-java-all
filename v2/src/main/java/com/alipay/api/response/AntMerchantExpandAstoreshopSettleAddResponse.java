package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.astoreshop.settle.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-23 10:12:40
 */
public class AntMerchantExpandAstoreshopSettleAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 1539992729784373245L;

	/** 
	 * 单据id
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

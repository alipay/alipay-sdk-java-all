package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.zft.chargerelation.bind response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-28 15:01:57
 */
public class AntMerchantExpandZftChargerelationBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 4296754682458585281L;

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

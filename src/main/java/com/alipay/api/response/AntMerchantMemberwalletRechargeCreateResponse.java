package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.memberwallet.recharge.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 17:17:33
 */
public class AntMerchantMemberwalletRechargeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1449116135327423579L;

	/** 
	 * 充值订单ID
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

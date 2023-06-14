package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.memberwallet.recharge.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:35:43
 */
public class AntMerchantMemberwalletRechargeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5277363436123874361L;

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

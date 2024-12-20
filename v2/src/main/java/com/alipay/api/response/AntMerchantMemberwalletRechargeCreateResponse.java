package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.memberwallet.recharge.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:34:43
 */
public class AntMerchantMemberwalletRechargeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7219657226574654851L;

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

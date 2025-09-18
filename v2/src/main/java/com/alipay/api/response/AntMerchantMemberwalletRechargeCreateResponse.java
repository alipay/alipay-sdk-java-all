package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.memberwallet.recharge.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:22:41
 */
public class AntMerchantMemberwalletRechargeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8167232256139174947L;

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

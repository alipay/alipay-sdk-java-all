package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.outputinvoice.apply.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-12 17:47:04
 */
public class AlipayBossFncOutputinvoiceApplyModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2861356438786895433L;

	/** 
	 * 开票申请的id
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

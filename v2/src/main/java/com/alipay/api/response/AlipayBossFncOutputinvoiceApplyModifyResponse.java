package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.outputinvoice.apply.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-27 19:57:02
 */
public class AlipayBossFncOutputinvoiceApplyModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8276685931496935531L;

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

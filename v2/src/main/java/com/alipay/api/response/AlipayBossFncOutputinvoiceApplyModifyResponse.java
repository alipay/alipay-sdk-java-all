package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.outputinvoice.apply.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-12 20:43:04
 */
public class AlipayBossFncOutputinvoiceApplyModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6578842799825379629L;

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

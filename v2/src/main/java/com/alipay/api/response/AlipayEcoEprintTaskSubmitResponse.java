package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.eprint.task.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 19:54:40
 */
public class AlipayEcoEprintTaskSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 6848549369654653458L;

	/** 
	 * 云平台订单ID
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}
	public String getOutOrderId( ) {
		return this.outOrderId;
	}

}

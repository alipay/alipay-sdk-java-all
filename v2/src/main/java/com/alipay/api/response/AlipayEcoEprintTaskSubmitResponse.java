package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.eprint.task.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:53
 */
public class AlipayEcoEprintTaskSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 8769131858936515194L;

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

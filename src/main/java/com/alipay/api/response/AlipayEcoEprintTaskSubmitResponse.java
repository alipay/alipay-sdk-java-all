package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.eprint.task.submit response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-06 17:56:52
 */
public class AlipayEcoEprintTaskSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 7233643296552439996L;

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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.voyager.flight.supplier.notify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-27 11:37:37
 */
public class AlipayVoyagerFlightSupplierNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6349934779142836857L;

	/** 
	 * 消费完成:CONSUME_SUCCESS
重新消费:RECONSUME_LATER
	 */
	@ApiField("consume_status")
	private String consumeStatus;

	public void setConsumeStatus(String consumeStatus) {
		this.consumeStatus = consumeStatus;
	}
	public String getConsumeStatus( ) {
		return this.consumeStatus;
	}

}

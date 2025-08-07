package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.voyager.industry.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-27 15:17:25
 */
public class AlipayVoyagerIndustryOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7544583585352756764L;

	/** 
	 * 消费状态
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

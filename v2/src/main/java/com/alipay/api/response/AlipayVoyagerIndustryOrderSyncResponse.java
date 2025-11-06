package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.voyager.industry.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-25 11:27:36
 */
public class AlipayVoyagerIndustryOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7136254326817799757L;

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

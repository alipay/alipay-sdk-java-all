package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.agent.delivery.submit response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-05 20:49:12
 */
public class AlipayOpenAgentDeliverySubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 3237313665166838145L;

	/** 
	 * 投放记录唯一标识,用于查询该次投放状态
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}
	public String getDeliveryId( ) {
		return this.deliveryId;
	}

}

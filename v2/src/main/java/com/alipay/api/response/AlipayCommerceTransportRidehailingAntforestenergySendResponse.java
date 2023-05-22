package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ridehailing.antforestenergy.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 14:57:20
 */
public class AlipayCommerceTransportRidehailingAntforestenergySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4333613849842576874L;

	/** 
	 * 发放能量总额
	 */
	@ApiField("full_energy")
	private Long fullEnergy;

	public void setFullEnergy(Long fullEnergy) {
		this.fullEnergy = fullEnergy;
	}
	public Long getFullEnergy( ) {
		return this.fullEnergy;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ridehailing.antforestenergy.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-12 16:34:28
 */
public class AlipayCommerceTransportRidehailingAntforestenergySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6156183351253156653L;

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

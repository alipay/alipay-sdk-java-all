package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ridehailing.antforestenergy.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-28 13:49:23
 */
public class AlipayCommerceTransportRidehailingAntforestenergySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5343915149831277242L;

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

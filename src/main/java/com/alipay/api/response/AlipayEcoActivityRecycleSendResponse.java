package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.activity.recycle.send response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-17 10:31:47
 */
public class AlipayEcoActivityRecycleSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8768417956482369215L;

	/** 
	 * 发放的能量总额，单位克: g
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

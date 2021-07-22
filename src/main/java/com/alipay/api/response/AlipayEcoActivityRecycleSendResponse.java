package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.activity.recycle.send response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-14 14:47:28
 */
public class AlipayEcoActivityRecycleSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7351781453382852337L;

	/** 
	 * 发放的能量总额
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

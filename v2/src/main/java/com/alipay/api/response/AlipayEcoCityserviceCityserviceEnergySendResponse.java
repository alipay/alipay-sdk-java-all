package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cityservice.cityservice.energy.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:55:53
 */
public class AlipayEcoCityserviceCityserviceEnergySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1641224569614531234L;

	/** 
	 * 发放的能量总额，单位：克
	 */
	@ApiField("total_energy")
	private Long totalEnergy;

	public void setTotalEnergy(Long totalEnergy) {
		this.totalEnergy = totalEnergy;
	}
	public Long getTotalEnergy( ) {
		return this.totalEnergy;
	}

}

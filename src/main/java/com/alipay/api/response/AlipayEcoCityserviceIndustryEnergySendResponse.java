package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cityservice.industry.energy.send response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-06 11:51:39
 */
public class AlipayEcoCityserviceIndustryEnergySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6886484912314227145L;

	/** 
	 * 发放的能量总额，单位：克
	 */
	@ApiField("total_energy")
	private String totalEnergy;

	public void setTotalEnergy(String totalEnergy) {
		this.totalEnergy = totalEnergy;
	}
	public String getTotalEnergy( ) {
		return this.totalEnergy;
	}

}

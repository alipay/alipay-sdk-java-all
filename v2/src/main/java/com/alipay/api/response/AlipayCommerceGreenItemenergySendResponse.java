package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.green.itemenergy.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 20:36:52
 */
public class AlipayCommerceGreenItemenergySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3549713691357382485L;

	/** 
	 * 发放的能量数
	 */
	@ApiField("energy_amount")
	private Long energyAmount;

	public void setEnergyAmount(Long energyAmount) {
		this.energyAmount = energyAmount;
	}
	public Long getEnergyAmount( ) {
		return this.energyAmount;
	}

}

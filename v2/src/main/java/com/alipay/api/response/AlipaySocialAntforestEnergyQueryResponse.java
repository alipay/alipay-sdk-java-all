package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antforest.energy.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-14 19:27:12
 */
public class AlipaySocialAntforestEnergyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1594115693251195323L;

	/** 
	 * 当前用户可用能量值（单位是g)
	 */
	@ApiField("current_energy")
	private Long currentEnergy;

	/** 
	 * 用户当前总能量（单位是g)
	 */
	@ApiField("total_energy")
	private Long totalEnergy;

	public void setCurrentEnergy(Long currentEnergy) {
		this.currentEnergy = currentEnergy;
	}
	public Long getCurrentEnergy( ) {
		return this.currentEnergy;
	}

	public void setTotalEnergy(Long totalEnergy) {
		this.totalEnergy = totalEnergy;
	}
	public Long getTotalEnergy( ) {
		return this.totalEnergy;
	}

}

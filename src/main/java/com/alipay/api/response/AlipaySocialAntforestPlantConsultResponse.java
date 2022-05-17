package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antforest.plant.consult response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-14 10:57:26
 */
public class AlipaySocialAntforestPlantConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3714832955761616162L;

	/** 
	 * 当前账户可用能量
	 */
	@ApiField("current_energy")
	private Long currentEnergy;

	/** 
	 * 项目是否可兑换
	 */
	@ApiField("project_alliable")
	private Boolean projectAlliable;

	public void setCurrentEnergy(Long currentEnergy) {
		this.currentEnergy = currentEnergy;
	}
	public Long getCurrentEnergy( ) {
		return this.currentEnergy;
	}

	public void setProjectAlliable(Boolean projectAlliable) {
		this.projectAlliable = projectAlliable;
	}
	public Boolean getProjectAlliable( ) {
		return this.projectAlliable;
	}

}

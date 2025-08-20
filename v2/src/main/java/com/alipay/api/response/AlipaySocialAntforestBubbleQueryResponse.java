package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antforest.bubble.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:27:41
 */
public class AlipaySocialAntforestBubbleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5571764864131117721L;

	/** 
	 * 当前有多少森林能量可收，为0即无能量可收
	 */
	@ApiField("can_collect_energy")
	private Long canCollectEnergy;

	/** 
	 * 是否当前开通森林
	 */
	@ApiField("forest_user")
	private Boolean forestUser;

	public void setCanCollectEnergy(Long canCollectEnergy) {
		this.canCollectEnergy = canCollectEnergy;
	}
	public Long getCanCollectEnergy( ) {
		return this.canCollectEnergy;
	}

	public void setForestUser(Boolean forestUser) {
		this.forestUser = forestUser;
	}
	public Boolean getForestUser( ) {
		return this.forestUser;
	}

}

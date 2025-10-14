package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerapp.pluginservice.publish response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-23 10:16:21
 */
public class AlipayOpenMiniInnerappPluginservicePublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 5313458761151826797L;

	/** 
	 * PL2012211102012056
	 */
	@ApiField("ability_id")
	private String abilityId;

	public void setAbilityId(String abilityId) {
		this.abilityId = abilityId;
	}
	public String getAbilityId( ) {
		return this.abilityId;
	}

}

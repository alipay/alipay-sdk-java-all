package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PlatformPetProfile;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.petprofile.platformprofile.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-30 15:40:33
 */
public class AlipayInsScenePetprofilePlatformprofileQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2399223332519992734L;

	/** 
	 * 宠物档案
	 */
	@ApiField("pet_profile")
	private PlatformPetProfile petProfile;

	public void setPetProfile(PlatformPetProfile petProfile) {
		this.petProfile = petProfile;
	}
	public PlatformPetProfile getPetProfile( ) {
		return this.petProfile;
	}

}

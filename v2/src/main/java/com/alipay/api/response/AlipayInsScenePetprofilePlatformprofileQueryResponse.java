package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PlatformPetProfile;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.petprofile.platformprofile.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 15:02:36
 */
public class AlipayInsScenePetprofilePlatformprofileQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5195567383882733951L;

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

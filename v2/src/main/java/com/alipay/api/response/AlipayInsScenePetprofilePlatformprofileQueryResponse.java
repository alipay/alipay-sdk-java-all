package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PlatformPetProfile;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.petprofile.platformprofile.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 20:05:25
 */
public class AlipayInsScenePetprofilePlatformprofileQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4837643635283663819L;

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

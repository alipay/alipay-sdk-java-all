package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PlatformPetProfile;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.petprofile.platformprofile.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-28 16:53:33
 */
public class AlipayInsScenePetprofilePlatformprofileQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4741197797298445776L;

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

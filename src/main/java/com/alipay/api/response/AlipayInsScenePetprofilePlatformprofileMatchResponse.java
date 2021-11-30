package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PlatformPetProfile;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.petprofile.platformprofile.match response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-30 15:40:33
 */
public class AlipayInsScenePetprofilePlatformprofileMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 1376775661323952359L;

	/** 
	 * 匹配到的宠物档案列表，匹配程度由高到低。
	 */
	@ApiListField("pet_profiles")
	@ApiField("platform_pet_profile")
	private List<PlatformPetProfile> petProfiles;

	public void setPetProfiles(List<PlatformPetProfile> petProfiles) {
		this.petProfiles = petProfiles;
	}
	public List<PlatformPetProfile> getPetProfiles( ) {
		return this.petProfiles;
	}

}

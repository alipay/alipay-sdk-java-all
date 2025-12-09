package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PetMatchScores;
import com.alipay.api.domain.PlatformPetProfile;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.petprofile.platformprofile.match response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 02:15:24
 */
public class AlipayInsScenePetprofilePlatformprofileMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 3539124567623662226L;

	/** 
	 * 用于返回匹配宠物的匹配值分数，类型为List，每一个对象的属性是，宠物petid，和score，分数从0到100整数字符串，分数越高，匹配度越高
	 */
	@ApiListField("match_scores")
	@ApiField("pet_match_scores")
	private List<PetMatchScores> matchScores;

	/** 
	 * 匹配到的宠物档案列表，匹配程度由高到低。
	 */
	@ApiListField("pet_profiles")
	@ApiField("platform_pet_profile")
	private List<PlatformPetProfile> petProfiles;

	public void setMatchScores(List<PetMatchScores> matchScores) {
		this.matchScores = matchScores;
	}
	public List<PetMatchScores> getMatchScores( ) {
		return this.matchScores;
	}

	public void setPetProfiles(List<PlatformPetProfile> petProfiles) {
		this.petProfiles = petProfiles;
	}
	public List<PlatformPetProfile> getPetProfiles( ) {
		return this.petProfiles;
	}

}

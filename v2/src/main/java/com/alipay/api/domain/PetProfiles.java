package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 宠物档案列表
 *
 * @author auto create
 * @since 1.0, 2020-09-14 22:00:18
 */
public class PetProfiles extends AlipayObject {

	private static final long serialVersionUID = 5394126412182465354L;

	/**
	 * 宠物档案列表
	 */
	@ApiListField("pet_profile_list")
	@ApiField("pet_profile")
	private List<PetProfile> petProfileList;

	/**
	 * 宠物类型，如猫、狗
	 */
	@ApiField("pet_type")
	private String petType;

	public List<PetProfile> getPetProfileList() {
		return this.petProfileList;
	}
	public void setPetProfileList(List<PetProfile> petProfileList) {
		this.petProfileList = petProfileList;
	}

	public String getPetType() {
		return this.petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}

}

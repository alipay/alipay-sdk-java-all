package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PetProfiles;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.insassetprod.petprofilelist.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-30 15:30:32
 */
public class AlipayInsSceneInsassetprodPetprofilelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6281314277194932493L;

	/** 
	 * 列表
	 */
	@ApiListField("pet_profiles")
	@ApiField("pet_profiles")
	private List<PetProfiles> petProfiles;

	public void setPetProfiles(List<PetProfiles> petProfiles) {
		this.petProfiles = petProfiles;
	}
	public List<PetProfiles> getPetProfiles( ) {
		return this.petProfiles;
	}

}

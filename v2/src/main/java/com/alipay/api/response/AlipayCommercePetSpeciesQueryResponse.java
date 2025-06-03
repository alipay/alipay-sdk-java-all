package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IndustryPetSpeciesDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.pet.species.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-03 19:57:07
 */
public class AlipayCommercePetSpeciesQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4859632157322342772L;

	/** 
	 * 宠物品种列表
	 */
	@ApiListField("species")
	@ApiField("industry_pet_species_d_t_o")
	private List<IndustryPetSpeciesDTO> species;

	public void setSpecies(List<IndustryPetSpeciesDTO> species) {
		this.species = species;
	}
	public List<IndustryPetSpeciesDTO> getSpecies( ) {
		return this.species;
	}

}

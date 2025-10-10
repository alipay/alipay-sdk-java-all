package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 宠物品种信息，包含宠物品种编号和名称.
 *
 * @author auto create
 * @since 1.0, 2024-08-01 16:34:01
 */
public class IndustryPetSpeciesDTO extends AlipayObject {

	private static final long serialVersionUID = 8498759857962396146L;

	/**
	 * 宠物品种名称
	 */
	@ApiField("pet_species")
	private String petSpecies;

	/**
	 * 宠物品种编码
	 */
	@ApiField("pet_species_code")
	private String petSpeciesCode;

	/**
	 * 宠物类型
	 */
	@ApiField("pet_type")
	private String petType;

	public String getPetSpecies() {
		return this.petSpecies;
	}
	public void setPetSpecies(String petSpecies) {
		this.petSpecies = petSpecies;
	}

	public String getPetSpeciesCode() {
		return this.petSpeciesCode;
	}
	public void setPetSpeciesCode(String petSpeciesCode) {
		this.petSpeciesCode = petSpeciesCode;
	}

	public String getPetType() {
		return this.petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}

}

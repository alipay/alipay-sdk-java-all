package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询宠物种类信息
 *
 * @author auto create
 * @since 1.0, 2024-09-03 15:50:50
 */
public class AlipayCommercePetSpeciesQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7876883395189396315L;

	/**
	 * 宠物类型
	 */
	@ApiField("pet_type")
	private String petType;

	public String getPetType() {
		return this.petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询宠物种类信息
 *
 * @author auto create
 * @since 1.0, 2024-08-01 16:34:01
 */
public class AlipayCommercePetSpeciesQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4424924657261545761L;

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

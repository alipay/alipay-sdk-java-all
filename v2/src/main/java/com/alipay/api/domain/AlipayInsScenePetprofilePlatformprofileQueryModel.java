package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 平台宠物档案查询
 *
 * @author auto create
 * @since 1.0, 2022-03-28 16:53:33
 */
public class AlipayInsScenePetprofilePlatformprofileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2241491644188569975L;

	/**
	 * 宠物ID
	 */
	@ApiField("pet_id")
	private String petId;

	public String getPetId() {
		return this.petId;
	}
	public void setPetId(String petId) {
		this.petId = petId;
	}

}

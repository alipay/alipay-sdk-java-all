package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 平台宠物档案查询
 *
 * @author auto create
 * @since 1.0, 2021-11-30 15:38:01
 */
public class AlipayInsScenePetprofilePlatformprofileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7632726645387569355L;

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

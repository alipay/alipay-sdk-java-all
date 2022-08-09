package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.petprofile.platformprofile.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-28 16:51:03
 */
public class AlipayInsScenePetprofilePlatformprofileCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8154956287783327982L;

	/** 
	 * 宠物ID，唯一标记一份档案。
	 */
	@ApiField("pet_id")
	private String petId;

	public void setPetId(String petId) {
		this.petId = petId;
	}
	public String getPetId( ) {
		return this.petId;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.pet.orgprofile.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-03 16:57:56
 */
public class AlipayInsPetOrgprofileCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7444244473332333642L;

	/** 
	 * 宠物档案唯一标识
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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.material.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-11 18:18:21
 */
public class AlipayMarketingMaterialCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2833211445158283771L;

	/** 
	 * 素材ID。
	 */
	@ApiField("material_id")
	private String materialId;

	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}
	public String getMaterialId( ) {
		return this.materialId;
	}

}

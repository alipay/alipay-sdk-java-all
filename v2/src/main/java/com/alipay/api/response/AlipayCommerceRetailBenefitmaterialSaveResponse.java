package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.benefitmaterial.save response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 15:47:42
 */
public class AlipayCommerceRetailBenefitmaterialSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 6747551712828576269L;

	/** 
	 * 素材id
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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.material.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-14 21:06:41
 */
public class AlipayMarketingMaterialCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8721545917927583318L;

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

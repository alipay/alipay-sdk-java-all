package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.material.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 20:37:48
 */
public class AlipayMarketingMaterialCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3896766472426994633L;

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

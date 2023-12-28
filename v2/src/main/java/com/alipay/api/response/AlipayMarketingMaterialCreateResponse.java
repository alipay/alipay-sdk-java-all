package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.material.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-17 15:41:45
 */
public class AlipayMarketingMaterialCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7248215245977563313L;

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

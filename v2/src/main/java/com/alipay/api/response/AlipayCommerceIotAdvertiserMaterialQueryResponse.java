package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.advertiser.material.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 03:28:35
 */
public class AlipayCommerceIotAdvertiserMaterialQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7799168348796561385L;

	/** 
	 * 物料id
	 */
	@ApiField("id")
	private Long id;

	/** 
	 * 物料地址
	 */
	@ApiField("material_url")
	private String materialUrl;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

	public void setMaterialUrl(String materialUrl) {
		this.materialUrl = materialUrl;
	}
	public String getMaterialUrl( ) {
		return this.materialUrl;
	}

}

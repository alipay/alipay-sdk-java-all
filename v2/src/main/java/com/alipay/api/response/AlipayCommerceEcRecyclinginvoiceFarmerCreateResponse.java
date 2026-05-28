package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.farmer.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-29 15:07:48
 */
public class AlipayCommerceEcRecyclinginvoiceFarmerCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1885456211592828153L;

	/** 
	 * 农户授权链接
	 */
	@ApiField("farmer_auth_url")
	private String farmerAuthUrl;

	/** 
	 * 农户ID
	 */
	@ApiField("farmer_id")
	private String farmerId;

	public void setFarmerAuthUrl(String farmerAuthUrl) {
		this.farmerAuthUrl = farmerAuthUrl;
	}
	public String getFarmerAuthUrl( ) {
		return this.farmerAuthUrl;
	}

	public void setFarmerId(String farmerId) {
		this.farmerId = farmerId;
	}
	public String getFarmerId( ) {
		return this.farmerId;
	}

}

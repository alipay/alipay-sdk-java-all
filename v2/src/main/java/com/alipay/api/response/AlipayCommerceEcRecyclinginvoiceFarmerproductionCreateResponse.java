package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.farmerproduction.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-16 16:50:40
 */
public class AlipayCommerceEcRecyclinginvoiceFarmerproductionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7431375462347737989L;

	/** 
	 * 产量记录唯一标识 
	 */
	@ApiField("farmer_item_id")
	private String farmerItemId;

	public void setFarmerItemId(String farmerItemId) {
		this.farmerItemId = farmerItemId;
	}
	public String getFarmerItemId( ) {
		return this.farmerItemId;
	}

}

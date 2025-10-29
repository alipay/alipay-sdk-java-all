package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.housing.house.sale.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-08 19:57:32
 */
public class AlipayCommerceHousingHouseSaleAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 8367743997852319786L;

	/** 
	 * 房源id
	 */
	@ApiField("housing_id")
	private String housingId;

	public void setHousingId(String housingId) {
		this.housingId = housingId;
	}
	public String getHousingId( ) {
		return this.housingId;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.housing.house.rental.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-14 11:17:28
 */
public class AlipayCommerceHousingHouseRentalAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 5896531866245719953L;

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

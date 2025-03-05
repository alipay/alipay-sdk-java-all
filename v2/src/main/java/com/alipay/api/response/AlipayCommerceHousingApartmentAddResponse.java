package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.housing.apartment.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-04 13:52:24
 */
public class AlipayCommerceHousingApartmentAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 8218931236879542493L;

	/** 
	 * 公寓id
	 */
	@ApiField("apartment_id")
	private String apartmentId;

	public void setApartmentId(String apartmentId) {
		this.apartmentId = apartmentId;
	}
	public String getApartmentId( ) {
		return this.apartmentId;
	}

}

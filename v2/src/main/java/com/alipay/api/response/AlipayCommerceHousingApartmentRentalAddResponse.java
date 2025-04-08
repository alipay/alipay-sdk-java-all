package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.housing.apartment.rental.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-04 13:47:26
 */
public class AlipayCommerceHousingApartmentRentalAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 6449221688347265833L;

	/** 
	 * 公寓房源id
	 */
	@ApiField("apartment_house_id")
	private String apartmentHouseId;

	public void setApartmentHouseId(String apartmentHouseId) {
		this.apartmentHouseId = apartmentHouseId;
	}
	public String getApartmentHouseId( ) {
		return this.apartmentHouseId;
	}

}

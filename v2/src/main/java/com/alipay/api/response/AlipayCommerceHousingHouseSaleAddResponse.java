package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.housing.house.sale.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-13 14:37:25
 */
public class AlipayCommerceHousingHouseSaleAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 5382253245651535734L;

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

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公寓房源查询
 *
 * @author auto create
 * @since 1.0, 2025-03-04 13:52:24
 */
public class AlipayCommerceHousingApartmentRentalQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1418273177978669361L;

	/**
	 * 公寓房源id
	 */
	@ApiField("apartment_house_id")
	private String apartmentHouseId;

	/**
	 * 外部房源id
	 */
	@ApiField("external_id")
	private String externalId;

	public String getApartmentHouseId() {
		return this.apartmentHouseId;
	}
	public void setApartmentHouseId(String apartmentHouseId) {
		this.apartmentHouseId = apartmentHouseId;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

}

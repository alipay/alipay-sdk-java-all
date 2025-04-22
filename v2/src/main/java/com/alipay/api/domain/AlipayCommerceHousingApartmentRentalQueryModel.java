package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公寓房源查询
 *
 * @author auto create
 * @since 1.0, 2025-04-14 11:17:27
 */
public class AlipayCommerceHousingApartmentRentalQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7262563598929115577L;

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

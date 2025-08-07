package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公寓上架
 *
 * @author auto create
 * @since 1.0, 2025-04-14 11:17:28
 */
public class AlipayCommerceHousingApartmentOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 3466429942467568763L;

	/**
	 * 公寓id
	 */
	@ApiField("apartment_id")
	private String apartmentId;

	public String getApartmentId() {
		return this.apartmentId;
	}
	public void setApartmentId(String apartmentId) {
		this.apartmentId = apartmentId;
	}

}

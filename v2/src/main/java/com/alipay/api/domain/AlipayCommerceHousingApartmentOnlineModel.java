package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公寓上架
 *
 * @author auto create
 * @since 1.0, 2025-03-04 13:47:26
 */
public class AlipayCommerceHousingApartmentOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 8581899314592553374L;

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

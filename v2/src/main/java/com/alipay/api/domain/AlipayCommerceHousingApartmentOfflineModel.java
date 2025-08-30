package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公寓下架
 *
 * @author auto create
 * @since 1.0, 2025-04-14 11:17:28
 */
public class AlipayCommerceHousingApartmentOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 1241235127337169114L;

	/**
	 * 公寓id
	 */
	@ApiField("apartment_id")
	private String apartmentId;

	/**
	 * 下架原因
	 */
	@ApiField("reason")
	private String reason;

	public String getApartmentId() {
		return this.apartmentId;
	}
	public void setApartmentId(String apartmentId) {
		this.apartmentId = apartmentId;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}

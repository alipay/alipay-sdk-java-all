package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公寓查询
 *
 * @author auto create
 * @since 1.0, 2025-04-14 11:17:29
 */
public class AlipayCommerceHousingApartmentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3526418358165665536L;

	/**
	 * 业务系统公寓唯一编码
	 */
	@ApiField("apartment_id")
	private String apartmentId;

	/**
	 * 外部房源唯一编码
	 */
	@ApiField("external_id")
	private String externalId;

	public String getApartmentId() {
		return this.apartmentId;
	}
	public void setApartmentId(String apartmentId) {
		this.apartmentId = apartmentId;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

}

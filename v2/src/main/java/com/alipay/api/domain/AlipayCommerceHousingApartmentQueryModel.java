package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公寓查询
 *
 * @author auto create
 * @since 1.0, 2025-03-04 13:47:27
 */
public class AlipayCommerceHousingApartmentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7475265924757298191L;

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

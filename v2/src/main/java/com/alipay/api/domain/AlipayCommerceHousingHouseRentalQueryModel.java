package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租房查询
 *
 * @author auto create
 * @since 1.0, 2025-04-14 11:17:28
 */
public class AlipayCommerceHousingHouseRentalQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7866564932869943455L;

	/**
	 * 服务商房源编码(和房源id二选一进行必传)
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 房源ID(和服务商房源编码二选一进行必传)
	 */
	@ApiField("housing_id")
	private String housingId;

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getHousingId() {
		return this.housingId;
	}
	public void setHousingId(String housingId) {
		this.housingId = housingId;
	}

}

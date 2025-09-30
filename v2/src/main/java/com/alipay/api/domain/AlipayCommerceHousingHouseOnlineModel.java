package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 房源上架
 *
 * @author auto create
 * @since 1.0, 2025-04-14 11:17:28
 */
public class AlipayCommerceHousingHouseOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 2874578648612274285L;

	/**
	 * 房源来源
	 */
	@ApiField("house_source")
	private String houseSource;

	/**
	 * 房源id
	 */
	@ApiField("housing_id")
	private String housingId;

	public String getHouseSource() {
		return this.houseSource;
	}
	public void setHouseSource(String houseSource) {
		this.houseSource = houseSource;
	}

	public String getHousingId() {
		return this.housingId;
	}
	public void setHousingId(String housingId) {
		this.housingId = housingId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 房源上架
 *
 * @author auto create
 * @since 1.0, 2025-03-13 15:42:25
 */
public class AlipayCommerceHousingHouseOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 8217365599419569783L;

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

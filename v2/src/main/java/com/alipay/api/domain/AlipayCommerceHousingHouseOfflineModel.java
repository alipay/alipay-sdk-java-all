package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 房源下架
 *
 * @author auto create
 * @since 1.0, 2025-03-04 13:47:25
 */
public class AlipayCommerceHousingHouseOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 4121621147844877532L;

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

	/**
	 * 下架原因
	 */
	@ApiField("reason")
	private String reason;

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

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}

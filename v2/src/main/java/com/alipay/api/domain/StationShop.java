package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 驿站门店
 *
 * @author auto create
 * @since 1.0, 2023-06-26 13:59:10
 */
public class StationShop extends AlipayObject {

	private static final long serialVersionUID = 8883125738855887953L;

	/**
	 * 驿站平台侧门店id
	 */
	@ApiField("station_shop_id")
	private String stationShopId;

	/**
	 * 驿站平台侧门店名称
	 */
	@ApiField("station_shop_name")
	private String stationShopName;

	public String getStationShopId() {
		return this.stationShopId;
	}
	public void setStationShopId(String stationShopId) {
		this.stationShopId = stationShopId;
	}

	public String getStationShopName() {
		return this.stationShopName;
	}
	public void setStationShopName(String stationShopName) {
		this.stationShopName = stationShopName;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 城市地铁站点信息查询
 *
 * @author auto create
 * @since 1.0, 2026-07-31 21:12:25
 */
public class AlipayCommerceTransportMetroStationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1693783451195762154L;

	/**
	 * 城市code
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 站点名称
	 */
	@ApiField("station_name")
	private String stationName;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getStationName() {
		return this.stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

}

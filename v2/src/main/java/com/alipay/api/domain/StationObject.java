package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 站点列表
 *
 * @author auto create
 * @since 1.0, 2026-07-06 11:41:16
 */
public class StationObject extends AlipayObject {

	private static final long serialVersionUID = 1371176336944879629L;

	/**
	 * 站点唯一编码
	 */
	@ApiField("metro_station_code")
	private String metroStationCode;

	/**
	 * 地铁站点纬度
	 */
	@ApiField("metro_station_latitude")
	private String metroStationLatitude;

	/**
	 * 地铁站点经度
	 */
	@ApiField("metro_station_longitude")
	private String metroStationLongitude;

	/**
	 * 站点名称
	 */
	@ApiField("metro_station_name")
	private String metroStationName;

	public String getMetroStationCode() {
		return this.metroStationCode;
	}
	public void setMetroStationCode(String metroStationCode) {
		this.metroStationCode = metroStationCode;
	}

	public String getMetroStationLatitude() {
		return this.metroStationLatitude;
	}
	public void setMetroStationLatitude(String metroStationLatitude) {
		this.metroStationLatitude = metroStationLatitude;
	}

	public String getMetroStationLongitude() {
		return this.metroStationLongitude;
	}
	public void setMetroStationLongitude(String metroStationLongitude) {
		this.metroStationLongitude = metroStationLongitude;
	}

	public String getMetroStationName() {
		return this.metroStationName;
	}
	public void setMetroStationName(String metroStationName) {
		this.metroStationName = metroStationName;
	}

}

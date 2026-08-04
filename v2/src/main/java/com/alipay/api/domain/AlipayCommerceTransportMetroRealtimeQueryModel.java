package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 城市地铁站点实时信息查询
 *
 * @author auto create
 * @since 1.0, 2026-07-31 21:17:51
 */
public class AlipayCommerceTransportMetroRealtimeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3819857497654479557L;

	/**
	 * 北京市城市代码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 线路code
	 */
	@ApiField("line_code")
	private String lineCode;

	/**
	 * 地铁站名称
	 */
	@ApiField("station_name")
	private String stationName;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getLineCode() {
		return this.lineCode;
	}
	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}

	public String getStationName() {
		return this.stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

}

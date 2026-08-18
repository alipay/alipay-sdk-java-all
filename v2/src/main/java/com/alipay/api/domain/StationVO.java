package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地铁站点信息
 *
 * @author auto create
 * @since 1.0, 2026-07-31 21:12:24
 */
public class StationVO extends AlipayObject {

	private static final long serialVersionUID = 5563843834128614878L;

	/**
	 * 跨线路的全局站点编码（换乘站不同线路同站编码一致）。
	 */
	@ApiField("global_station_code")
	private String globalStationCode;

	/**
	 * 站点中文名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 站点在线路上的序号（字符串形式）。
	 */
	@ApiField("order")
	private String order;

	/**
	 * 站点编码
	 */
	@ApiField("station_code")
	private String stationCode;

	public String getGlobalStationCode() {
		return this.globalStationCode;
	}
	public void setGlobalStationCode(String globalStationCode) {
		this.globalStationCode = globalStationCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOrder() {
		return this.order;
	}
	public void setOrder(String order) {
		this.order = order;
	}

	public String getStationCode() {
		return this.stationCode;
	}
	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

}

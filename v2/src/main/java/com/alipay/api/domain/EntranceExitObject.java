package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 站点出入口信息
 *
 * @author auto create
 * @since 1.0, 2026-07-06 11:41:16
 */
public class EntranceExitObject extends AlipayObject {

	private static final long serialVersionUID = 8663929372411133611L;

	/**
	 * 出入口唯一编码
	 */
	@ApiField("entrance_exit_code")
	private String entranceExitCode;

	/**
	 * 出入口纬度
	 */
	@ApiField("entrance_exit_latitude")
	private String entranceExitLatitude;

	/**
	 * 出入口经度
	 */
	@ApiField("entrance_exit_longitude")
	private String entranceExitLongitude;

	/**
	 * 出入口名称
	 */
	@ApiField("entrance_exit_name")
	private String entranceExitName;

	/**
	 * 地铁站点编号
	 */
	@ApiField("metro_station_code")
	private String metroStationCode;

	public String getEntranceExitCode() {
		return this.entranceExitCode;
	}
	public void setEntranceExitCode(String entranceExitCode) {
		this.entranceExitCode = entranceExitCode;
	}

	public String getEntranceExitLatitude() {
		return this.entranceExitLatitude;
	}
	public void setEntranceExitLatitude(String entranceExitLatitude) {
		this.entranceExitLatitude = entranceExitLatitude;
	}

	public String getEntranceExitLongitude() {
		return this.entranceExitLongitude;
	}
	public void setEntranceExitLongitude(String entranceExitLongitude) {
		this.entranceExitLongitude = entranceExitLongitude;
	}

	public String getEntranceExitName() {
		return this.entranceExitName;
	}
	public void setEntranceExitName(String entranceExitName) {
		this.entranceExitName = entranceExitName;
	}

	public String getMetroStationCode() {
		return this.metroStationCode;
	}
	public void setMetroStationCode(String metroStationCode) {
		this.metroStationCode = metroStationCode;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公交换乘对象
 *
 * @author auto create
 * @since 1.0, 2026-07-06 11:41:16
 */
public class BusTransferObject extends AlipayObject {

	private static final long serialVersionUID = 3632449858313594499L;

	/**
	 * 公交换乘平台
	 */
	@ApiField("bus_transfer_platform")
	private String busTransferPlatform;

	/**
	 * 出入口编码
	 */
	@ApiField("entrance_exit_code")
	private String entranceExitCode;

	/**
	 * 出入口名称
	 */
	@ApiField("entrance_exit_name")
	private String entranceExitName;

	/**
	 * 地铁站点编码
	 */
	@ApiField("metro_station_code")
	private String metroStationCode;

	/**
	 * 地铁站点名称
	 */
	@ApiField("metro_station_name")
	private String metroStationName;

	/**
	 * 驻留线路数量
	 */
	@ApiField("park_route_count")
	private Long parkRouteCount;

	/**
	 * 驻留线路明细，顿号隔开
	 */
	@ApiField("park_route_detail")
	private String parkRouteDetail;

	/**
	 * 站点序号
	 */
	@ApiField("station_index")
	private Long stationIndex;

	public String getBusTransferPlatform() {
		return this.busTransferPlatform;
	}
	public void setBusTransferPlatform(String busTransferPlatform) {
		this.busTransferPlatform = busTransferPlatform;
	}

	public String getEntranceExitCode() {
		return this.entranceExitCode;
	}
	public void setEntranceExitCode(String entranceExitCode) {
		this.entranceExitCode = entranceExitCode;
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

	public String getMetroStationName() {
		return this.metroStationName;
	}
	public void setMetroStationName(String metroStationName) {
		this.metroStationName = metroStationName;
	}

	public Long getParkRouteCount() {
		return this.parkRouteCount;
	}
	public void setParkRouteCount(Long parkRouteCount) {
		this.parkRouteCount = parkRouteCount;
	}

	public String getParkRouteDetail() {
		return this.parkRouteDetail;
	}
	public void setParkRouteDetail(String parkRouteDetail) {
		this.parkRouteDetail = parkRouteDetail;
	}

	public Long getStationIndex() {
		return this.stationIndex;
	}
	public void setStationIndex(Long stationIndex) {
		this.stationIndex = stationIndex;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公交站点信息
 *
 * @author auto create
 * @since 1.0, 2019-08-22 10:27:55
 */
public class CloudbusStop extends AlipayObject {

	private static final long serialVersionUID = 6514731363516583886L;

	/**
	 * 维度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 站点id
	 */
	@ApiField("station_id")
	private String stationId;

	/**
	 * 站点名称
	 */
	@ApiField("station_name")
	private String stationName;

	/**
	 * 站点在线路内的序号
	 */
	@ApiField("station_num")
	private Long stationNum;

	/**
	 * 站间距
	 */
	@ApiField("station_space")
	private Long stationSpace;

	/**
	 * 站点客流
	 */
	@ApiField("station_volume")
	private Long stationVolume;

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getStationId() {
		return this.stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public String getStationName() {
		return this.stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public Long getStationNum() {
		return this.stationNum;
	}
	public void setStationNum(Long stationNum) {
		this.stationNum = stationNum;
	}

	public Long getStationSpace() {
		return this.stationSpace;
	}
	public void setStationSpace(Long stationSpace) {
		this.stationSpace = stationSpace;
	}

	public Long getStationVolume() {
		return this.stationVolume;
	}
	public void setStationVolume(Long stationVolume) {
		this.stationVolume = stationVolume;
	}

}

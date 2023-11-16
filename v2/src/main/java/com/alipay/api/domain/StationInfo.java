package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 站点信息
 *
 * @author auto create
 * @since 1.0, 2023-04-11 18:44:06
 */
public class StationInfo extends AlipayObject {

	private static final long serialVersionUID = 6358571463142558711L;

	/**
	 * 可扩展参数，json格式，由双方约定取值
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 站点维度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 站点经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 当前站点距离上一站点的距离，单位:米
	 */
	@ApiField("station_distance")
	private Long stationDistance;

	/**
	 * 站点id，同一个公交企业应唯一
	 */
	@ApiField("station_id")
	private String stationId;

	/**
	 * 站点在线路中的序号
	 */
	@ApiField("station_index")
	private Long stationIndex;

	/**
	 * 站点名称
	 */
	@ApiField("station_name")
	private String stationName;

	/**
	 * 站点客流量
	 */
	@ApiField("station_volume")
	private Long stationVolume;

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

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

	public Long getStationDistance() {
		return this.stationDistance;
	}
	public void setStationDistance(Long stationDistance) {
		this.stationDistance = stationDistance;
	}

	public String getStationId() {
		return this.stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public Long getStationIndex() {
		return this.stationIndex;
	}
	public void setStationIndex(Long stationIndex) {
		this.stationIndex = stationIndex;
	}

	public String getStationName() {
		return this.stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public Long getStationVolume() {
		return this.stationVolume;
	}
	public void setStationVolume(Long stationVolume) {
		this.stationVolume = stationVolume;
	}

}

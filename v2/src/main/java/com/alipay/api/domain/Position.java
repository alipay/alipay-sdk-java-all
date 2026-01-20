package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 媒体点位信息
 *
 * @author auto create
 * @since 1.0, 2018-09-18 21:24:18
 */
public class Position extends AlipayObject {

	private static final long serialVersionUID = 8481518148358925748L;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 点位唯一标识id
	 */
	@ApiField("device_id")
	private Long deviceId;

	/**
	 * 屏幕类型，枚举值：SLCD、LED
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 公交 或者 地铁：SUBWAY、BUS
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 站点编码
	 */
	@ApiField("station_code")
	private String stationCode;

	/**
	 * 站点等级，共分为4个等级，分别为：LEVELA、LEVLEB、LEVELC 以及 LEVELD
	 */
	@ApiField("station_level")
	private String stationLevel;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public Long getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getStationCode() {
		return this.stationCode;
	}
	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	public String getStationLevel() {
		return this.stationLevel;
	}
	public void setStationLevel(String stationLevel) {
		this.stationLevel = stationLevel;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备相关信息
 *
 * @author auto create
 * @since 1.0, 2017-04-28 11:12:12
 */
public class AlipayMarketingIbsInfo extends AlipayObject {

	private static final long serialVersionUID = 4356414287362672229L;

	/**
	 * 精度
	 */
	@ApiField("accuracy")
	private String accuracy;

	/**
	 * 海拔
	 */
	@ApiField("altitude")
	private String altitude;

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
	 * 时间ms
	 */
	@ApiField("time")
	private String time;

	public String getAccuracy() {
		return this.accuracy;
	}
	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}

	public String getAltitude() {
		return this.altitude;
	}
	public void setAltitude(String altitude) {
		this.altitude = altitude;
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

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

}

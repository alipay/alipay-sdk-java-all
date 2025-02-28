package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * GPS位置点信息
 *
 * @author auto create
 * @since 1.0, 2022-12-29 18:12:03
 */
public class GPSLocationInfo extends AlipayObject {

	private static final long serialVersionUID = 5612829711469283479L;

	/**
	 * 1.0
	 */
	@ApiField("accuracy")
	private String accuracy;

	/**
	 * 方向
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 高度
	 */
	@ApiField("height")
	private String height;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 速度
	 */
	@ApiField("speed")
	private String speed;

	public String getAccuracy() {
		return this.accuracy;
	}
	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}

	public String getDirection() {
		return this.direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getHeight() {
		return this.height;
	}
	public void setHeight(String height) {
		this.height = height;
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

	public String getSpeed() {
		return this.speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}

}

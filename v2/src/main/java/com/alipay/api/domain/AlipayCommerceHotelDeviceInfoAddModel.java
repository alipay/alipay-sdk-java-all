package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备进件
 *
 * @author auto create
 * @since 1.0, 2026-03-05 19:38:14
 */
public class AlipayCommerceHotelDeviceInfoAddModel extends AlipayObject {

	private static final long serialVersionUID = 7831518117187399137L;

	/**
	 * 设备唯一id
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备openid
	 */
	@ApiField("device_open_id")
	private String deviceOpenId;

	/**
	 * 设备平台
	 */
	@ApiField("device_platform")
	private String devicePlatform;

	/**
	 * 酒店编码
	 */
	@ApiField("hotel_code")
	private String hotelCode;

	/**
	 * 酒店集团编码
	 */
	@ApiField("hotel_group_code")
	private String hotelGroupCode;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceOpenId() {
		return this.deviceOpenId;
	}
	public void setDeviceOpenId(String deviceOpenId) {
		this.deviceOpenId = deviceOpenId;
	}

	public String getDevicePlatform() {
		return this.devicePlatform;
	}
	public void setDevicePlatform(String devicePlatform) {
		this.devicePlatform = devicePlatform;
	}

	public String getHotelCode() {
		return this.hotelCode;
	}
	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}

	public String getHotelGroupCode() {
		return this.hotelGroupCode;
	}
	public void setHotelGroupCode(String hotelGroupCode) {
		this.hotelGroupCode = hotelGroupCode;
	}

}

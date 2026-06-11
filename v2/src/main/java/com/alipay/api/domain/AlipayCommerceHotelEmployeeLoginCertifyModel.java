package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒店员工登录
 *
 * @author auto create
 * @since 1.0, 2026-03-05 19:38:14
 */
public class AlipayCommerceHotelEmployeeLoginCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 3341777792349788292L;

	/**
	 * 设备唯一id
	 */
	@ApiField("device_id")
	private String deviceId;

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
	 * 酒店集团code
	 */
	@ApiField("hotel_group_code")
	private String hotelGroupCode;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

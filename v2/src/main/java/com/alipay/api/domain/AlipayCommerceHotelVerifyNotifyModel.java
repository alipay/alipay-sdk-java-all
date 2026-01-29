package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户核身通知
 *
 * @author auto create
 * @since 1.0, 2026-01-21 15:46:37
 */
public class AlipayCommerceHotelVerifyNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 5646145315952269566L;

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
	 * 酒店集团编码
	 */
	@ApiField("hotel_group_code")
	private String hotelGroupCode;

	/**
	 * 名字
	 */
	@ApiField("name")
	private String name;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 核身id
	 */
	@ApiField("verify_id")
	private String verifyId;

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

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getVerifyId() {
		return this.verifyId;
	}
	public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}

}

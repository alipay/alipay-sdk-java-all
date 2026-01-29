package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 视觉货柜产品化设备注册
 *
 * @author auto create
 * @since 1.0, 2025-12-31 10:40:04
 */
public class AlipayMsaasMediarecogMmtcaftscvDeviceBindModel extends AlipayObject {

	private static final long serialVersionUID = 3186315938421956796L;

	/**
	 * IOT统一设备id
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 0-否
1-是
	 */
	@ApiField("dynamic_device")
	private String dynamicDevice;

	/**
	 * 设备所属商户pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 商户设备terminal id
	 */
	@ApiField("isv_tid")
	private String isvTid;

	/**
	 * 设备注册类型
	 */
	@ApiField("register_type")
	private String registerType;

	/**
	 * 0-否
1-是
	 */
	@ApiField("weight_device")
	private String weightDevice;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDynamicDevice() {
		return this.dynamicDevice;
	}
	public void setDynamicDevice(String dynamicDevice) {
		this.dynamicDevice = dynamicDevice;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getIsvTid() {
		return this.isvTid;
	}
	public void setIsvTid(String isvTid) {
		this.isvTid = isvTid;
	}

	public String getRegisterType() {
		return this.registerType;
	}
	public void setRegisterType(String registerType) {
		this.registerType = registerType;
	}

	public String getWeightDevice() {
		return this.weightDevice;
	}
	public void setWeightDevice(String weightDevice) {
		this.weightDevice = weightDevice;
	}

}

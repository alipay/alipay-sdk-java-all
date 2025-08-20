package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备信息
 *
 * @author auto create
 * @since 1.0, 2025-06-19 19:58:56
 */
public class PropertyDeviceInfo extends AlipayObject {

	private static final long serialVersionUID = 6892841677417853342L;

	/**
	 * 设备id
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备名称
	 */
	@ApiField("device_name")
	private String deviceName;

	/**
	 * 设备类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 是否启用
	 */
	@ApiField("enable_status")
	private String enableStatus;

	/**
	 * 开门配置
	 */
	@ApiField("entrance_open_config")
	private String entranceOpenConfig;

	/**
	 * 开门调用类型
	 */
	@ApiField("entrance_open_type")
	private String entranceOpenType;

	/**
	 * 外部设备id
	 */
	@ApiField("out_device_id")
	private String outDeviceId;

	/**
	 * 是否支持远程开门
	 */
	@ApiField("support_open")
	private Boolean supportOpen;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return this.deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getEnableStatus() {
		return this.enableStatus;
	}
	public void setEnableStatus(String enableStatus) {
		this.enableStatus = enableStatus;
	}

	public String getEntranceOpenConfig() {
		return this.entranceOpenConfig;
	}
	public void setEntranceOpenConfig(String entranceOpenConfig) {
		this.entranceOpenConfig = entranceOpenConfig;
	}

	public String getEntranceOpenType() {
		return this.entranceOpenType;
	}
	public void setEntranceOpenType(String entranceOpenType) {
		this.entranceOpenType = entranceOpenType;
	}

	public String getOutDeviceId() {
		return this.outDeviceId;
	}
	public void setOutDeviceId(String outDeviceId) {
		this.outDeviceId = outDeviceId;
	}

	public Boolean getSupportOpen() {
		return this.supportOpen;
	}
	public void setSupportOpen(Boolean supportOpen) {
		this.supportOpen = supportOpen;
	}

}

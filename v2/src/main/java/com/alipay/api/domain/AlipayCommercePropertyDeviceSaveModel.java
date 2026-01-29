package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备新增或更新接口
 *
 * @author auto create
 * @since 1.0, 2025-06-19 19:58:54
 */
public class AlipayCommercePropertyDeviceSaveModel extends AlipayObject {

	private static final long serialVersionUID = 8676152548189941473L;

	/**
	 * 用于外部服务商通过Api接口管理设备信息
	 */
	@ApiField("action")
	private String action;

	/**
	 * 新增时该值不填写
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
	 * 新增时该必须填写。
更新时deviceId及outDeviceId二选一，同时填写时以deviceId为准。
	 */
	@ApiField("out_device_id")
	private String outDeviceId;

	/**
	 * 是否支持远程开门
	 */
	@ApiField("support_open")
	private Boolean supportOpen;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

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

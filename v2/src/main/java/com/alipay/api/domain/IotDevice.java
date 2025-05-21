package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT设备对象
 *
 * @author auto create
 * @since 1.0, 2017-09-14 22:22:29
 */
public class IotDevice extends AlipayObject {

	private static final long serialVersionUID = 3872765653459211939L;

	/**
	 * 蓝牙MAC地址
	 */
	@ApiField("bluetooth_mac")
	private String bluetoothMac;

	/**
	 * 设备控制面板地址
	 */
	@ApiField("control_url")
	private String controlUrl;

	/**
	 * 协议服务商用于唯一标识该设备的设备id(协议服务商定义)
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备名称
	 */
	@ApiField("device_name")
	private String deviceName;

	/**
	 * 协议服务商用于唯一标识一个设备型号的型号id
	 */
	@ApiField("model_id")
	private String modelId;

	/**
	 * 设备序列号
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 设备WIFI的MAC地址
	 */
	@ApiField("wifi_mac")
	private String wifiMac;

	public String getBluetoothMac() {
		return this.bluetoothMac;
	}
	public void setBluetoothMac(String bluetoothMac) {
		this.bluetoothMac = bluetoothMac;
	}

	public String getControlUrl() {
		return this.controlUrl;
	}
	public void setControlUrl(String controlUrl) {
		this.controlUrl = controlUrl;
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

	public String getModelId() {
		return this.modelId;
	}
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getWifiMac() {
		return this.wifiMac;
	}
	public void setWifiMac(String wifiMac) {
		this.wifiMac = wifiMac;
	}

}

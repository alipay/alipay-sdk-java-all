package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * pos设备基本信息
 *
 * @author auto create
 * @since 1.0, 2018-03-05 22:32:03
 */
public class DeviceBasicInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 3837278389264615187L;

	/**
	 * 设备在口碑的唯一键
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备类型
	 */
	@ApiField("device_model")
	private String deviceModel;

	/**
	 * 设备SN号
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 设备类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceModel() {
		return this.deviceModel;
	}
	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

}

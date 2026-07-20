package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-02-26 16:37:42
 */
public class DeviceStatusInfo extends AlipayObject {

	private static final long serialVersionUID = 1327891873666336311L;

	/**
	 * 电量百分比（0-100）
	 */
	@ApiField("battery_percent")
	private Long batteryPercent;

	/**
	 * null
	 */
	@ApiListField("device_attrs")
	@ApiField("device_attr")
	private List<DeviceAttr> deviceAttrs;

	/**
	 * 机器人编号
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 机器人状态，参考枚举值
	 */
	@ApiField("status")
	private String status;

	public Long getBatteryPercent() {
		return this.batteryPercent;
	}
	public void setBatteryPercent(Long batteryPercent) {
		this.batteryPercent = batteryPercent;
	}

	public List<DeviceAttr> getDeviceAttrs() {
		return this.deviceAttrs;
	}
	public void setDeviceAttrs(List<DeviceAttr> deviceAttrs) {
		this.deviceAttrs = deviceAttrs;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

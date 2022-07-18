package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Kds设备信息
 *
 * @author auto create
 * @since 1.0, 2018-12-21 10:30:51
 */
public class KdsDeviceModel extends AlipayObject {

	private static final long serialVersionUID = 7147238259545261955L;

	/**
	 * 设备编号
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 设备sn号
	 */
	@ApiField("sn_id")
	private String snId;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSnId() {
		return this.snId;
	}
	public void setSnId(String snId) {
		this.snId = snId;
	}

}

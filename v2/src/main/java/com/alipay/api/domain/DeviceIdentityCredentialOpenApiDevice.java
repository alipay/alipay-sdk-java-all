package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-21 16:37:54
 */
public class DeviceIdentityCredentialOpenApiDevice extends AlipayObject {

	private static final long serialVersionUID = 5899295144645795833L;

	/**
	 * 设备的SN或MAC地址
	 */
	@ApiField("device_id")
	private String deviceId;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

}

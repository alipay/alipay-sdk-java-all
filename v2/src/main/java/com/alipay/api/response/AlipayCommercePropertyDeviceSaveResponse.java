package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.property.device.save response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 10:27:37
 */
public class AlipayCommercePropertyDeviceSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 1624522792434159671L;

	/** 
	 * 设备id
	 */
	@ApiField("device_id")
	private String deviceId;

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceId( ) {
		return this.deviceId;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.device.baseinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 01:40:49
 */
public class AlipayCommerceIotDeviceBaseinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4733324643117841417L;

	/** 
	 * 设备ID，biztid
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

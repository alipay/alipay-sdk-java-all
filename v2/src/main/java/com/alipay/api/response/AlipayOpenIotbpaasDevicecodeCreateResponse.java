package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotbpaas.devicecode.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 09:11:56
 */
public class AlipayOpenIotbpaasDevicecodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6617958857467235988L;

	/** 
	 * 设备短码，由码平台生成，同一类设备的短码相同
	 */
	@ApiField("short_code")
	private String shortCode;

	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}
	public String getShortCode( ) {
		return this.shortCode;
	}

}

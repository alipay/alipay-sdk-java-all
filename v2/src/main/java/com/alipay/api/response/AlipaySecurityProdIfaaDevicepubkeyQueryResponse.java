package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.ifaa.devicepubkey.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 23:27:26
 */
public class AlipaySecurityProdIfaaDevicepubkeyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5458728923411843168L;

	/** 
	 * 加密过的设备公钥信息。
	 */
	@ApiField("device_key_info")
	private String deviceKeyInfo;

	public void setDeviceKeyInfo(String deviceKeyInfo) {
		this.deviceKeyInfo = deviceKeyInfo;
	}
	public String getDeviceKeyInfo( ) {
		return this.deviceKeyInfo;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.collaborate.device.unbind response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-06 10:37:52
 */
public class AlipayOfflineProviderCollaborateDeviceUnbindResponse extends AlipayResponse {

	private static final long serialVersionUID = 5598945926596996733L;

	/** 
	 * 设备SN
	 */
	@ApiField("device_sn")
	private String deviceSn;

	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}
	public String getDeviceSn( ) {
		return this.deviceSn;
	}

}

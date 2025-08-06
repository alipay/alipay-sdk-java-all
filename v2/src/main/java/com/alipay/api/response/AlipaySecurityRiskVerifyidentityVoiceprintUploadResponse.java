package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.verifyidentity.voiceprint.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-23 19:12:26
 */
public class AlipaySecurityRiskVerifyidentityVoiceprintUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6327524398743569296L;

	/** 
	 * 当前设备数据
	 */
	@ApiField("device_data")
	private String deviceData;

	public void setDeviceData(String deviceData) {
		this.deviceData = deviceData;
	}
	public String getDeviceData( ) {
		return this.deviceData;
	}

}

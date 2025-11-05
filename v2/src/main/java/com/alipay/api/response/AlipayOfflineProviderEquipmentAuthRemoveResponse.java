package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.equipment.auth.remove response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 14:37:35
 */
public class AlipayOfflineProviderEquipmentAuthRemoveResponse extends AlipayResponse {

	private static final long serialVersionUID = 6289437483598331831L;

	/** 
	 * 被解绑的机具编号
	 */
	@ApiField("device_id")
	private String deviceId;

	/** 
	 * 机具厂商PID
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceId( ) {
		return this.deviceId;
	}

	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}
	public String getMerchantPid( ) {
		return this.merchantPid;
	}

}

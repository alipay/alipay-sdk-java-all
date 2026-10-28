package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-21 16:37:54
 */
public class DeviceIdentityCredentialOpenApiGenerateResult extends AlipayObject {

	private static final long serialVersionUID = 6387463471618278398L;

	/**
	 * 加密后的凭证信息
	 */
	@ApiField("credential_hex")
	private String credentialHex;

	/**
	 * 设备的SN或MAC地址
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备的凭证生成状态
	 */
	@ApiField("status")
	private String status;

	public String getCredentialHex() {
		return this.credentialHex;
	}
	public void setCredentialHex(String credentialHex) {
		this.credentialHex = credentialHex;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

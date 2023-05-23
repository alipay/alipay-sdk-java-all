package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.fingerprint.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 15:45:27
 */
public class AlipaySecurityProdFingerprintApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3263414814556172546L;

	/** 
	 * IFAA标准中的校验类型，目前1为指纹
	 */
	@ApiField("auth_type")
	private String authType;

	/** 
	 * 设备的唯一ID，IFAA标准体系中的设备的唯一标识，用于关联设备的开通状态
	 */
	@ApiField("device_id")
	private String deviceId;

	/** 
	 * IFAA标准中用于关联IFAA Server和业务方Server开通状态的token，此token用于后续校验和注销操作。
	 */
	@ApiField("token")
	private String token;

	public void setAuthType(String authType) {
		this.authType = authType;
	}
	public String getAuthType( ) {
		return this.authType;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceId( ) {
		return this.deviceId;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken( ) {
		return this.token;
	}

}

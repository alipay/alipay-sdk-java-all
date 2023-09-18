package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * establish接口风控信息。
Fraud data provided by Apple as outlined in separate Fraud SIA document, if applicable.
 *
 * @author auto create
 * @since 1.0, 2020-02-20 20:02:56
 */
public class EstablishFraudData extends AlipayObject {

	private static final long serialVersionUID = 4813243746137963664L;

	/**
	 * Wallet所在设备的设备id映射的uuid。
	 */
	@ApiField("device_identifier")
	private String deviceIdentifier;

	/**
	 * 生物核身是否可获取。 true if device is capable of biometric authentication, otherwise false
	 */
	@ApiField("is_biometric_capable")
	private String isBiometricCapable;

	/**
	 * Wallet登录icloud账户id映射的uuid。
	 */
	@ApiField("user_identifier")
	private String userIdentifier;

	public String getDeviceIdentifier() {
		return this.deviceIdentifier;
	}
	public void setDeviceIdentifier(String deviceIdentifier) {
		this.deviceIdentifier = deviceIdentifier;
	}

	public String getIsBiometricCapable() {
		return this.isBiometricCapable;
	}
	public void setIsBiometricCapable(String isBiometricCapable) {
		this.isBiometricCapable = isBiometricCapable;
	}

	public String getUserIdentifier() {
		return this.userIdentifier;
	}
	public void setUserIdentifier(String userIdentifier) {
		this.userIdentifier = userIdentifier;
	}

}

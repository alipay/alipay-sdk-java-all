package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 指纹风险机型查询
 *
 * @author auto create
 * @since 1.0, 2022-07-18 14:41:34
 */
public class AlipaySecurityProdFingerprintRiskcontrolQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1299784569373523292L;

	/**
	 * aaid:指纹SDK获取到的aaid，与设备密钥一一对应，为IFAA定义的一个设备型号信息;
	 */
	@ApiField("aaid")
	private String aaid;

	/**
	 * IFAA标准中的校验类型，目前1为指纹
	 */
	@ApiField("auth_type")
	private String authType;

	/**
	 * buildModel，通过IFAA客户端SDK获取到的设备具体型号，android可通过设备厂商的公开API获取，iOS为设备的internalname，用于标示一台具体市场上的设备名称，
	 */
	@ApiField("build_model")
	private String buildModel;

	/**
	 * 设备ID，android为IFAA TA里定义，iOS为IFAA定义后存储在keyChain，接入方调用指纹客户端SDK获取，无需自己取值，用于用户绑定，区分单设备用户
	 */
	@ApiField("device_id")
	private String deviceId;

	public String getAaid() {
		return this.aaid;
	}
	public void setAaid(String aaid) {
		this.aaid = aaid;
	}

	public String getAuthType() {
		return this.authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getBuildModel() {
		return this.buildModel;
	}
	public void setBuildModel(String buildModel) {
		this.buildModel = buildModel;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

}

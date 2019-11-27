package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚁盾设备指纹
 *
 * @author auto create
 * @since 1.0, 2019-07-30 00:06:25
 */
public class SsdataDataserviceRiskDigitalidentityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2222214271756951959L;

	/**
	 * 服务端生成的设备码（由我方提供的sdk或JS(H5)生成）
	 */
	@ApiField("device_code")
	private String deviceCode;

	/**
	 * device_code对应的设备终端类型,根据生成方式来确定。若使用设备指纹SDK生成则填写APP，若用H5生成则填写PC。若不填写，则默认使用APP
	 */
	@ApiField("terminal_type")
	private String terminalType;

	public String getDeviceCode() {
		return this.deviceCode;
	}
	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}

	public String getTerminalType() {
		return this.terminalType;
	}
	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于传输分享代付安全拓展参数
 *
 * @author auto create
 * @since 1.0, 2021-12-02 19:44:13
 */
public class SharePeerPaySecurityInfo extends AlipayObject {

	private static final long serialVersionUID = 5128862631764372115L;

	/**
	 * 来源应用
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 客户端ip
	 */
	@ApiField("client_ip")
	private String clientIp;

	/**
	 * 外部终端设备id
	 */
	@ApiField("external_device_id")
	private String externalDeviceId;

	/**
	 * 终端类型
客户端-client/PC-pc/WAP-wap
	 */
	@ApiField("terminal_type")
	private String terminalType;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getClientIp() {
		return this.clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getExternalDeviceId() {
		return this.externalDeviceId;
	}
	public void setExternalDeviceId(String externalDeviceId) {
		this.externalDeviceId = externalDeviceId;
	}

	public String getTerminalType() {
		return this.terminalType;
	}
	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 环境信息
 *
 * @author auto create
 * @since 1.0, 2026-06-25 11:09:54
 */
public class VoyagerEnvInfo extends AlipayObject {

	private static final long serialVersionUID = 4461889378622282397L;

	/**
	 * 客户端ip
	 */
	@ApiField("client_ip")
	private String clientIp;

	/**
	 * 系统类型
	 */
	@ApiField("os_type")
	private String osType;

	/**
	 * 终端类型，字段类型与请求参数保持一致
	 */
	@ApiField("terminal_type")
	private String terminalType;

	public String getClientIp() {
		return this.clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getOsType() {
		return this.osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}

	public String getTerminalType() {
		return this.terminalType;
	}
	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}

}

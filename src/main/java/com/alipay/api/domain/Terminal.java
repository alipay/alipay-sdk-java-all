package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 终端信息
 *
 * @author auto create
 * @since 1.0, 2019-04-25 15:34:20
 */
public class Terminal extends AlipayObject {

	private static final long serialVersionUID = 8892597149151465171L;

	/**
	 * 终端运行环境MAC地址列表，多个用“,”分割
	 */
	@ApiField("mac")
	private String mac;

	/**
	 * 操作系统类型
	 */
	@ApiField("os")
	private String os;

	/**
	 * 操作系统架构
	 */
	@ApiField("os_arch")
	private String osArch;

	/**
	 * 操作系统版本号
	 */
	@ApiField("os_version")
	private String osVersion;

	/**
	 * 终端类型
	 */
	@ApiField("terminal_type")
	private String terminalType;

	/**
	 * 终端版本号
	 */
	@ApiField("terminal_version")
	private String terminalVersion;

	public String getMac() {
		return this.mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getOs() {
		return this.os;
	}
	public void setOs(String os) {
		this.os = os;
	}

	public String getOsArch() {
		return this.osArch;
	}
	public void setOsArch(String osArch) {
		this.osArch = osArch;
	}

	public String getOsVersion() {
		return this.osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getTerminalType() {
		return this.terminalType;
	}
	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}

	public String getTerminalVersion() {
		return this.terminalVersion;
	}
	public void setTerminalVersion(String terminalVersion) {
		this.terminalVersion = terminalVersion;
	}

}

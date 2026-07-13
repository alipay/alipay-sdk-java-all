package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询链接时，一次请求里的订单信息
 *
 * @author auto create
 * @since 1.0, 2026-04-18 12:20:47
 */
public class VerifyOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 8817756661229562631L;

	/**
	 * 用于标识是线上还是线下门店
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 用于标识终端所在系统
	 */
	@ApiField("os_type")
	private String osType;

	/**
	 * 用于表示发起方使用的终端类型
	 */
	@ApiField("terminal_type")
	private String terminalType;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
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

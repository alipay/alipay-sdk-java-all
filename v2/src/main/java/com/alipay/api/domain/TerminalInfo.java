package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 航站楼信息
 *
 * @author auto create
 * @since 1.0, 2026-09-15 18:04:04
 */
public class TerminalInfo extends AlipayObject {

	private static final long serialVersionUID = 1658775758289332269L;

	/**
	 * 自提时间说明
	 */
	@ApiField("pickup_time_desc")
	private String pickupTimeDesc;

	/**
	 * 航站楼编码
	 */
	@ApiField("terminal_code")
	private String terminalCode;

	/**
	 * 航站楼名称
	 */
	@ApiField("terminal_name")
	private String terminalName;

	public String getPickupTimeDesc() {
		return this.pickupTimeDesc;
	}
	public void setPickupTimeDesc(String pickupTimeDesc) {
		this.pickupTimeDesc = pickupTimeDesc;
	}

	public String getTerminalCode() {
		return this.terminalCode;
	}
	public void setTerminalCode(String terminalCode) {
		this.terminalCode = terminalCode;
	}

	public String getTerminalName() {
		return this.terminalName;
	}
	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}

}

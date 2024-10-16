package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充电指令结果确认
 *
 * @author auto create
 * @since 1.0, 2024-01-02 15:34:50
 */
public class AlipayCommerceTransportChargerCommandConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 7449731294684359127L;

	/**
	 * 有序充电指令执行结果
	 */
	@ApiField("command_result")
	private String commandResult;

	/**
	 * 指令流水号，全局唯一
	 */
	@ApiField("command_serial_number")
	private String commandSerialNumber;

	public String getCommandResult() {
		return this.commandResult;
	}
	public void setCommandResult(String commandResult) {
		this.commandResult = commandResult;
	}

	public String getCommandSerialNumber() {
		return this.commandSerialNumber;
	}
	public void setCommandSerialNumber(String commandSerialNumber) {
		this.commandSerialNumber = commandSerialNumber;
	}

}

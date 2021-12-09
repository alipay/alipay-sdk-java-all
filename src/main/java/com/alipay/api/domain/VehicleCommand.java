package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车联车控命令
 *
 * @author auto create
 * @since 1.0, 2021-10-08 12:02:21
 */
public class VehicleCommand extends AlipayObject {

	private static final long serialVersionUID = 8416443553115652997L;

	/**
	 * 指令描述
	 */
	@ApiField("command_desc")
	private String commandDesc;

	/**
	 * 成功
	 */
	@ApiField("command_result")
	private String commandResult;

	/**
	 * 指令流水号
	 */
	@ApiField("command_seq_no")
	private String commandSeqNo;

	/**
	 * 指令时间戳
	 */
	@ApiField("command_timestamp")
	private String commandTimestamp;

	/**
	 * 指令类型
	 */
	@ApiField("command_type")
	private String commandType;

	/**
	 * 指令值 如是调节温度则是具体的温度值
	 */
	@ApiField("command_value")
	private String commandValue;

	public String getCommandDesc() {
		return this.commandDesc;
	}
	public void setCommandDesc(String commandDesc) {
		this.commandDesc = commandDesc;
	}

	public String getCommandResult() {
		return this.commandResult;
	}
	public void setCommandResult(String commandResult) {
		this.commandResult = commandResult;
	}

	public String getCommandSeqNo() {
		return this.commandSeqNo;
	}
	public void setCommandSeqNo(String commandSeqNo) {
		this.commandSeqNo = commandSeqNo;
	}

	public String getCommandTimestamp() {
		return this.commandTimestamp;
	}
	public void setCommandTimestamp(String commandTimestamp) {
		this.commandTimestamp = commandTimestamp;
	}

	public String getCommandType() {
		return this.commandType;
	}
	public void setCommandType(String commandType) {
		this.commandType = commandType;
	}

	public String getCommandValue() {
		return this.commandValue;
	}
	public void setCommandValue(String commandValue) {
		this.commandValue = commandValue;
	}

}

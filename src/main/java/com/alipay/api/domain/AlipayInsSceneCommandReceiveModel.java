package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 命令接收
 *
 * @author auto create
 * @since 1.0, 2019-03-20 22:17:04
 */
public class AlipayInsSceneCommandReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 7782218695512878586L;

	/**
	 * 命令对象
	 */
	@ApiField("command")
	private Command command;

	public Command getCommand() {
		return this.command;
	}
	public void setCommand(Command command) {
		this.command = command;
	}

}

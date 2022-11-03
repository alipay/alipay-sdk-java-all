package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 命令接收
 *
 * @author auto create
 * @since 1.0, 2022-10-12 18:36:07
 */
public class AlipayInsSceneCommandReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 1215898845111781692L;

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

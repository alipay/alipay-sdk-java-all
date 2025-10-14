package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 打印服务调用的具体内容
 *
 * @author auto create
 * @since 1.0, 2021-04-07 21:35:06
 */
public class PrintMessageVO extends AlipayObject {

	private static final long serialVersionUID = 1492872468734128469L;

	/**
	 * 打印指令类型
	 */
	@ApiField("cmd_type")
	private String cmdType;

	/**
	 * 打印指令内容
	 */
	@ApiField("cmds")
	private String cmds;

	public String getCmdType() {
		return this.cmdType;
	}
	public void setCmdType(String cmdType) {
		this.cmdType = cmdType;
	}

	public String getCmds() {
		return this.cmds;
	}
	public void setCmds(String cmds) {
		this.cmds = cmds;
	}

}

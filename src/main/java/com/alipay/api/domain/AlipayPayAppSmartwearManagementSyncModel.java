package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能穿戴设备管控接口
 *
 * @author auto create
 * @since 1.0, 2022-07-25 20:29:36
 */
public class AlipayPayAppSmartwearManagementSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3563465161932819513L;

	/**
	 * 具体的子操作类型
	 */
	@ApiField("command")
	private String command;

	/**
	 * 业务信息
	 */
	@ApiField("payload")
	private String payload;

	public String getCommand() {
		return this.command;
	}
	public void setCommand(String command) {
		this.command = command;
	}

	public String getPayload() {
		return this.payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}

}

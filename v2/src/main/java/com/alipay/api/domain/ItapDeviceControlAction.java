package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能终端设备控制行为模型
 *
 * @author auto create
 * @since 1.0, 2020-01-09 00:04:18
 */
public class ItapDeviceControlAction extends AlipayObject {

	private static final long serialVersionUID = 8297626247388224953L;

	/**
	 * 行为描述
	 */
	@ApiField("action")
	private String action;

	/**
	 * 定制控制参数
	 */
	@ApiField("params")
	private String params;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

}

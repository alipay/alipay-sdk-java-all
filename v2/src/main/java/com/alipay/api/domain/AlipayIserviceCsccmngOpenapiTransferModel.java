package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * csccmng应用cc2.0服务
 *
 * @author auto create
 * @since 1.0, 2023-05-23 14:25:33
 */
public class AlipayIserviceCsccmngOpenapiTransferModel extends AlipayObject {

	private static final long serialVersionUID = 1855848916562979429L;

	/**
	 * action参数作为内部processor分支标识
	 */
	@ApiField("action")
	private String action;

	/**
	 * 内部小二登陆热线工作台的坐席id
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 应用内部方法执行参数
	 */
	@ApiField("params")
	private String params;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

}

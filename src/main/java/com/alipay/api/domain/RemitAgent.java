package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汇款代理信息
 *
 * @author auto create
 * @since 1.0, 2017-06-14 07:56:42
 */
public class RemitAgent extends AlipayObject {

	private static final long serialVersionUID = 5415837948782617851L;

	/**
	 * agent_address, 代理地址
	 */
	@ApiField("agent_address")
	private String agentAddress;

	/**
	 * agent_id, 汇款机构分配的代理的id
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * agentType, 说明代理类型。目前支持：RECEIVE_AGENT和SEND_AGENT
	 */
	@ApiField("agent_type")
	private String agentType;

	public String getAgentAddress() {
		return this.agentAddress;
	}
	public void setAgentAddress(String agentAddress) {
		this.agentAddress = agentAddress;
	}

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentType() {
		return this.agentType;
	}
	public void setAgentType(String agentType) {
		this.agentType = agentType;
	}

}

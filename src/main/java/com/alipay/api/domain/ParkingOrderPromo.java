package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车订单营销信息对象
 *
 * @author auto create
 * @since 1.0, 2021-11-08 15:11:40
 */
public class ParkingOrderPromo extends AlipayObject {

	private static final long serialVersionUID = 8563861664691143222L;

	/**
	 * 停车交易返佣pid
	 */
	@ApiField("agent_pid")
	private String agentPid;

	public String getAgentPid() {
		return this.agentPid;
	}
	public void setAgentPid(String agentPid) {
		this.agentPid = agentPid;
	}

}

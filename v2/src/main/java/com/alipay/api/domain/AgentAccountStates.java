package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 坐席信息
 *
 * @author auto create
 * @since 1.0, 2023-08-03 20:57:17
 */
public class AgentAccountStates extends AlipayObject {

	private static final long serialVersionUID = 2113746948913196748L;

	/**
	 * 坐席的ID
	 */
	@ApiField("agent_id")
	private Long agentId;

	/**
	 * 坐席的名称
	 */
	@ApiField("agent_name")
	private String agentName;

	/**
	 * 分级号码
	 */
	@ApiField("dn")
	private String dn;

	/**
	 * 实例ID
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * 坐席的登录名称
	 */
	@ApiField("login_name")
	private String loginName;

	/**
	 * 坐席状态
	 */
	@ApiField("state")
	private String state;

	/**
	 * 坐席状态持续时长
	 */
	@ApiField("state_duration")
	private String stateDuration;

	public Long getAgentId() {
		return this.agentId;
	}
	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public String getAgentName() {
		return this.agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getDn() {
		return this.dn;
	}
	public void setDn(String dn) {
		this.dn = dn;
	}

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getLoginName() {
		return this.loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getStateDuration() {
		return this.stateDuration;
	}
	public void setStateDuration(String stateDuration) {
		this.stateDuration = stateDuration;
	}

}

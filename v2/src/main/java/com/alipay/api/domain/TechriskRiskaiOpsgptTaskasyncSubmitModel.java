package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询task任务执行结果
 *
 * @author auto create
 * @since 1.0, 2024-09-03 09:55:19
 */
public class TechriskRiskaiOpsgptTaskasyncSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 2245669653537218192L;

	/**
	 * 业务需求请求的具体智能体id，不同的智能体可以完成不同的工作，id 由服务提供方分配。
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 用户的意图，用于描述用户的问题或者疑问
	 */
	@ApiField("intention")
	private ChatMsg intention;

	/**
	 * 用户的 user_id 或者 open_id 或者商户系统中自己的用户标识
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 来源平台字段，用于统计和控制任务的来源，由服务提供方分配，仅合法的 task_source 才能通过校验。
	 */
	@ApiField("task_source")
	private String taskSource;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public ChatMsg getIntention() {
		return this.intention;
	}
	public void setIntention(ChatMsg intention) {
		this.intention = intention;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getTaskSource() {
		return this.taskSource;
	}
	public void setTaskSource(String taskSource) {
		this.taskSource = taskSource;
	}

}

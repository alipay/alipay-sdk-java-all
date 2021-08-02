package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.cs.channel.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayBossCsChannelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5194634495295545992L;

	/** 
	 * 平均通话时长
	 */
	@ApiField("att")
	private String att;

	/** 
	 * 备注
	 */
	@ApiField("comment")
	private String comment;

	/** 
	 * 接通率
	 */
	@ApiField("connection_rate")
	private String connectionRate;

	/** 
	 * 通话中人数
	 */
	@ApiField("curr_agent_talking")
	private String currAgentTalking;

	/** 
	 * 在线小二数
	 */
	@ApiField("curr_agents_logged_in")
	private String currAgentsLoggedIn;

	/** 
	 * 排队数
	 */
	@ApiField("curr_number_waiting_calls")
	private String currNumberWaitingCalls;

	/** 
	 * 小休人数
	 */
	@ApiField("current_not_ready_agents")
	private String currentNotReadyAgents;

	/** 
	 * 等待人数
	 */
	@ApiField("current_ready_agents")
	private String currentReadyAgents;

	/** 
	 * 主键
	 */
	@ApiField("row_key")
	private String rowKey;

	/** 
	 * 流入量
	 */
	@ApiField("visitor_inflow")
	private String visitorInflow;

	/** 
	 * 应答量
	 */
	@ApiField("visitor_response")
	private String visitorResponse;

	/** 
	 * 应答量[转接]
	 */
	@ApiField("visitor_response_transfer")
	private String visitorResponseTransfer;

	public void setAtt(String att) {
		this.att = att;
	}
	public String getAtt( ) {
		return this.att;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getComment( ) {
		return this.comment;
	}

	public void setConnectionRate(String connectionRate) {
		this.connectionRate = connectionRate;
	}
	public String getConnectionRate( ) {
		return this.connectionRate;
	}

	public void setCurrAgentTalking(String currAgentTalking) {
		this.currAgentTalking = currAgentTalking;
	}
	public String getCurrAgentTalking( ) {
		return this.currAgentTalking;
	}

	public void setCurrAgentsLoggedIn(String currAgentsLoggedIn) {
		this.currAgentsLoggedIn = currAgentsLoggedIn;
	}
	public String getCurrAgentsLoggedIn( ) {
		return this.currAgentsLoggedIn;
	}

	public void setCurrNumberWaitingCalls(String currNumberWaitingCalls) {
		this.currNumberWaitingCalls = currNumberWaitingCalls;
	}
	public String getCurrNumberWaitingCalls( ) {
		return this.currNumberWaitingCalls;
	}

	public void setCurrentNotReadyAgents(String currentNotReadyAgents) {
		this.currentNotReadyAgents = currentNotReadyAgents;
	}
	public String getCurrentNotReadyAgents( ) {
		return this.currentNotReadyAgents;
	}

	public void setCurrentReadyAgents(String currentReadyAgents) {
		this.currentReadyAgents = currentReadyAgents;
	}
	public String getCurrentReadyAgents( ) {
		return this.currentReadyAgents;
	}

	public void setRowKey(String rowKey) {
		this.rowKey = rowKey;
	}
	public String getRowKey( ) {
		return this.rowKey;
	}

	public void setVisitorInflow(String visitorInflow) {
		this.visitorInflow = visitorInflow;
	}
	public String getVisitorInflow( ) {
		return this.visitorInflow;
	}

	public void setVisitorResponse(String visitorResponse) {
		this.visitorResponse = visitorResponse;
	}
	public String getVisitorResponse( ) {
		return this.visitorResponse;
	}

	public void setVisitorResponseTransfer(String visitorResponseTransfer) {
		this.visitorResponseTransfer = visitorResponseTransfer;
	}
	public String getVisitorResponseTransfer( ) {
		return this.visitorResponseTransfer;
	}

}

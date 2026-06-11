package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.guardrails.agent.detect response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-27 13:47:51
 */
public class AlipaySecurityRiskGuardrailsAgentDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 6756958366891144252L;

	/** 
	 * 安全动作
	 */
	@ApiField("action_code")
	private String actionCode;

	/** 
	 * 安全动作相关文案
	 */
	@ApiField("action_msg")
	private String actionMsg;

	/** 
	 * 检测数据ID
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 是否安全无风险，true: 安全无风险，false: 有风险
	 */
	@ApiField("safe")
	private Boolean safe;

	/** 
	 * 会话动作
	 */
	@ApiField("session_action")
	private String sessionAction;

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}
	public String getActionCode( ) {
		return this.actionCode;
	}

	public void setActionMsg(String actionMsg) {
		this.actionMsg = actionMsg;
	}
	public String getActionMsg( ) {
		return this.actionMsg;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setSafe(Boolean safe) {
		this.safe = safe;
	}
	public Boolean getSafe( ) {
		return this.safe;
	}

	public void setSessionAction(String sessionAction) {
		this.sessionAction = sessionAction;
	}
	public String getSessionAction( ) {
		return this.sessionAction;
	}

}

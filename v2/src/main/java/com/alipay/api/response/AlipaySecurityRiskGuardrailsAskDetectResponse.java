package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GuardrailsBiz;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.guardrails.ask.detect response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-18 17:58:13
 */
public class AlipaySecurityRiskGuardrailsAskDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 2237519927433898332L;

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
	 * 风险识别标签内容
	 */
	@ApiListField("detect_check_labels")
	@ApiField("string")
	private List<String> detectCheckLabels;

	/** 
	 * 检测数据ID
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 代答内容
	 */
	@ApiListField("rewrite_content")
	@ApiField("guardrails_biz")
	private List<GuardrailsBiz> rewriteContent;

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

	/** 
	 * 处置建议：pass、review、block
	 */
	@ApiField("suggestion")
	private String suggestion;

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

	public void setDetectCheckLabels(List<String> detectCheckLabels) {
		this.detectCheckLabels = detectCheckLabels;
	}
	public List<String> getDetectCheckLabels( ) {
		return this.detectCheckLabels;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setRewriteContent(List<GuardrailsBiz> rewriteContent) {
		this.rewriteContent = rewriteContent;
	}
	public List<GuardrailsBiz> getRewriteContent( ) {
		return this.rewriteContent;
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

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	public String getSuggestion( ) {
		return this.suggestion;
	}

}

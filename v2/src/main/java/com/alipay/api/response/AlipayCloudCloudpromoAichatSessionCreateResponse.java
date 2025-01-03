package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AIChatAgentInfo;
import com.alipay.api.domain.AIChatCustomerLike;
import com.alipay.api.domain.AIChatWelcomeMessage;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.aichat.session.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-26 10:49:33
 */
public class AlipayCloudCloudpromoAichatSessionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1422912629437785658L;

	/** 
	 * 智能体内容，query_config.need_agent_content=true时返回
	 */
	@ApiField("agent_content")
	private String agentContent;

	/** 
	 * 智能体信息，query_config.need_agent_info=true时返回
	 */
	@ApiField("agent_info")
	private AIChatAgentInfo agentInfo;

	/** 
	 * 用户行为习惯
	 */
	@ApiField("customer_like")
	private AIChatCustomerLike customerLike;

	/** 
	 * 猜你想问问题列表，query_config.need_guess_question=true时返回
	 */
	@ApiListField("guess_question_list")
	@ApiField("string")
	private List<String> guessQuestionList;

	/** 
	 * 是否为新的会话id
	 */
	@ApiField("new_session_id")
	private Boolean newSessionId;

	/** 
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	/** 
	 * 欢迎语信息,query_config.need_welcom_message=true时返回
	 */
	@ApiField("welcome_message")
	private AIChatWelcomeMessage welcomeMessage;

	public void setAgentContent(String agentContent) {
		this.agentContent = agentContent;
	}
	public String getAgentContent( ) {
		return this.agentContent;
	}

	public void setAgentInfo(AIChatAgentInfo agentInfo) {
		this.agentInfo = agentInfo;
	}
	public AIChatAgentInfo getAgentInfo( ) {
		return this.agentInfo;
	}

	public void setCustomerLike(AIChatCustomerLike customerLike) {
		this.customerLike = customerLike;
	}
	public AIChatCustomerLike getCustomerLike( ) {
		return this.customerLike;
	}

	public void setGuessQuestionList(List<String> guessQuestionList) {
		this.guessQuestionList = guessQuestionList;
	}
	public List<String> getGuessQuestionList( ) {
		return this.guessQuestionList;
	}

	public void setNewSessionId(Boolean newSessionId) {
		this.newSessionId = newSessionId;
	}
	public Boolean getNewSessionId( ) {
		return this.newSessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getSessionId( ) {
		return this.sessionId;
	}

	public void setWelcomeMessage(AIChatWelcomeMessage welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}
	public AIChatWelcomeMessage getWelcomeMessage( ) {
		return this.welcomeMessage;
	}

}

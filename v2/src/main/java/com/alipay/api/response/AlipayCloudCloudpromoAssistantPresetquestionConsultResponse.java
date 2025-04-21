package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PresetQuesiton;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.assistant.presetquestion.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-26 10:49:33
 */
public class AlipayCloudCloudpromoAssistantPresetquestionConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7425672883767593811L;

	/** 
	 * 回答内容
	 */
	@ApiField("answer_content")
	private String answerContent;

	/** 
	 * 询问时间
	 */
	@ApiField("ask_time")
	private Date askTime;

	/** 
	 * 客户的名称标识，用来标识本次对话的客户身份，必须传，进而在历史会话查询是可以通过用户身份查询对应的历史会话
	 */
	@ApiField("customer_id")
	private String customerId;

	/** 
	 * 当前这条消息的请求唯一ID
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 会话唯一标识，用来表是否是同一个会话，用户传递时使用用户的标识，没有传递时系统自动生成会话id进行标识
	 */
	@ApiField("session_id")
	private String sessionId;

	/** 
	 * 建议的引导问题
	 */
	@ApiListField("suggestion_questions")
	@ApiField("preset_quesiton")
	private List<PresetQuesiton> suggestionQuestions;

	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}
	public String getAnswerContent( ) {
		return this.answerContent;
	}

	public void setAskTime(Date askTime) {
		this.askTime = askTime;
	}
	public Date getAskTime( ) {
		return this.askTime;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerId( ) {
		return this.customerId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getSessionId( ) {
		return this.sessionId;
	}

	public void setSuggestionQuestions(List<PresetQuesiton> suggestionQuestions) {
		this.suggestionQuestions = suggestionQuestions;
	}
	public List<PresetQuesiton> getSuggestionQuestions( ) {
		return this.suggestionQuestions;
	}

}

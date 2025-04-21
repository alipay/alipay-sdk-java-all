package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RobotAnswer;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.robot.session.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-11 10:26:10
 */
public class AlipayIserviceCcmRobotSessionConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8337786825831563714L;

	/** 
	 * 机器人答案
	 */
	@ApiField("answer")
	private RobotAnswer answer;

	/** 
	 * DOCUMENT:大模型文档问答；
KNOWLEDGE：知识点问答；
DST：多轮问答；
SORRY：致歉语；
	 */
	@ApiField("answer_type")
	private String answerType;

	/** 
	 * 对话id
	 */
	@ApiField("chat_uuid")
	private String chatUuid;

	/** 
	 * 机器人会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	public void setAnswer(RobotAnswer answer) {
		this.answer = answer;
	}
	public RobotAnswer getAnswer( ) {
		return this.answer;
	}

	public void setAnswerType(String answerType) {
		this.answerType = answerType;
	}
	public String getAnswerType( ) {
		return this.answerType;
	}

	public void setChatUuid(String chatUuid) {
		this.chatUuid = chatUuid;
	}
	public String getChatUuid( ) {
		return this.chatUuid;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getSessionId( ) {
		return this.sessionId;
	}

}

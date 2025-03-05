package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QAChatDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.robot.chat.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-21 12:27:05
 */
public class AlipayIserviceCcmRobotChatQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7582737966261222396L;

	/** 
	 * 机器人问答对话记录
	 */
	@ApiListField("qa_chats")
	@ApiField("q_a_chat_detail")
	private List<QAChatDetail> qaChats;

	/** 
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	public void setQaChats(List<QAChatDetail> qaChats) {
		this.qaChats = qaChats;
	}
	public List<QAChatDetail> getQaChats( ) {
		return this.qaChats;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getSessionId( ) {
		return this.sessionId;
	}

}

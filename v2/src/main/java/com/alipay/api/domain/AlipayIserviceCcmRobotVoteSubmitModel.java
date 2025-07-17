package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机器人回答评价
 *
 * @author auto create
 * @since 1.0, 2023-12-21 19:27:57
 */
public class AlipayIserviceCcmRobotVoteSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 1799398855725712493L;

	/**
	 * 对话id
	 */
	@ApiField("chat_uuid")
	private String chatUuid;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 对话的评价
	 */
	@ApiField("vote_type")
	private String voteType;

	public String getChatUuid() {
		return this.chatUuid;
	}
	public void setChatUuid(String chatUuid) {
		this.chatUuid = chatUuid;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getVoteType() {
		return this.voteType;
	}
	public void setVoteType(String voteType) {
		this.voteType = voteType;
	}

}

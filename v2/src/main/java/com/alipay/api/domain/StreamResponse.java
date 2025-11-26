package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 结构
 *
 * @author auto create
 * @since 1.0, 2025-11-20 10:12:41
 */
public class StreamResponse extends AlipayObject {

	private static final long serialVersionUID = 3372333726446597997L;

	/**
	 * 智能体id
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 业务信息，和入参映射
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 对话ID
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * null
	 */
	@ApiListField("contents")
	@ApiField("a_i_stream_content")
	private List<AIStreamContent> contents;

	/**
	 * 全局业务信息
	 */
	@ApiField("out_biz_content")
	private String outBizContent;

	/**
	 * 会话ID
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 推送轮次
	 */
	@ApiField("turn")
	private Long turn;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public List<AIStreamContent> getContents() {
		return this.contents;
	}
	public void setContents(List<AIStreamContent> contents) {
		this.contents = contents;
	}

	public String getOutBizContent() {
		return this.outBizContent;
	}
	public void setOutBizContent(String outBizContent) {
		this.outBizContent = outBizContent;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public Long getTurn() {
		return this.turn;
	}
	public void setTurn(Long turn) {
		this.turn = turn;
	}

}

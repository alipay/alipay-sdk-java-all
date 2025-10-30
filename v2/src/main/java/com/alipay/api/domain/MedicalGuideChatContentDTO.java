package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗导诊对话内容模型
 *
 * @author auto create
 * @since 1.0, 2023-11-24 15:50:46
 */
public class MedicalGuideChatContentDTO extends AlipayObject {

	private static final long serialVersionUID = 8279754539349893938L;

	/**
	 * 对话chatId
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 医疗导诊具体会话
	 */
	@ApiField("content")
	private MedicalGuideContentDTO content;

	/**
	 * 导诊机器人调用耗时(ms)
	 */
	@ApiField("cost")
	private Long cost;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public MedicalGuideContentDTO getContent() {
		return this.content;
	}
	public void setContent(MedicalGuideContentDTO content) {
		this.content = content;
	}

	public Long getCost() {
		return this.cost;
	}
	public void setCost(Long cost) {
		this.cost = cost;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会话输出最终结果
 *
 * @author auto create
 * @since 1.0, 2024-11-05 17:25:41
 */
public class DTAgentChatResult extends AlipayObject {

	private static final long serialVersionUID = 8887818952193649452L;

	/**
	 * 会话结果内容
	 */
	@ApiListField("chat_contents")
	@ApiField("d_t_agent_chat_content")
	private List<DTAgentChatContent> chatContents;

	/**
	 * 单次对话id
	 */
	@ApiField("chat_message_id")
	private String chatMessageId;

	public List<DTAgentChatContent> getChatContents() {
		return this.chatContents;
	}
	public void setChatContents(List<DTAgentChatContent> chatContents) {
		this.chatContents = chatContents;
	}

	public String getChatMessageId() {
		return this.chatMessageId;
	}
	public void setChatMessageId(String chatMessageId) {
		this.chatMessageId = chatMessageId;
	}

}

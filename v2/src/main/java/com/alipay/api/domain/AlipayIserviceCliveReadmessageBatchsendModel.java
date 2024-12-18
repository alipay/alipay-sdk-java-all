package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 访客已读消息批量更新
 *
 * @author auto create
 * @since 1.0, 2023-10-07 15:25:02
 */
public class AlipayIserviceCliveReadmessageBatchsendModel extends AlipayObject {

	private static final long serialVersionUID = 5278844986236319492L;

	/**
	 * 会话id
	 */
	@ApiField("conversation_id")
	private String conversationId;

	/**
	 * 已读的消息id集合，UUID
	 */
	@ApiListField("message_ids")
	@ApiField("string")
	private List<String> messageIds;

	/**
	 * 已读时间
	 */
	@ApiField("read_time")
	private Date readTime;

	public String getConversationId() {
		return this.conversationId;
	}
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public List<String> getMessageIds() {
		return this.messageIds;
	}
	public void setMessageIds(List<String> messageIds) {
		this.messageIds = messageIds;
	}

	public Date getReadTime() {
		return this.readTime;
	}
	public void setReadTime(Date readTime) {
		this.readTime = readTime;
	}

}

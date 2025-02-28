package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MessageDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.anttech.dtspark.conversation.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-26 10:22:24
 */
public class DatadigitalAnttechDtsparkConversationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6247763942751419737L;

	/** 
	 * 历史会话消息详情：包含消息内容、是否点赞等字段
	 */
	@ApiListField("messages")
	@ApiField("message_detail")
	private List<MessageDetail> messages;

	public void setMessages(List<MessageDetail> messages) {
		this.messages = messages;
	}
	public List<MessageDetail> getMessages( ) {
		return this.messages;
	}

}

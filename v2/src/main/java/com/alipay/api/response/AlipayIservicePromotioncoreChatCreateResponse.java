package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.promotioncore.chat.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-19 12:02:42
 */
public class AlipayIservicePromotioncoreChatCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6548658965622127421L;

	/** 
	 * 消息内容
	 */
	@ApiField("message_content")
	private String messageContent;

	/** 
	 * 消息id，用于幂等
	 */
	@ApiField("message_id")
	private String messageId;

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public String getMessageContent( ) {
		return this.messageContent;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getMessageId( ) {
		return this.messageId;
	}

}

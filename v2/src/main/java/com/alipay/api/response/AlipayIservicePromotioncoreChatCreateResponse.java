package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.promotioncore.chat.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-12 11:22:43
 */
public class AlipayIservicePromotioncoreChatCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4723994999323242599L;

	/** 
	 * 消息id，用于幂等
	 */
	@ApiField("message_id")
	private String messageId;

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getMessageId( ) {
		return this.messageId;
	}

}

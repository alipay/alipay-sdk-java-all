package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.content.publish response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 02:11:46
 */
public class AlipayOpenPublicContentPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 1741563734595662563L;

	/** 
	 * message_id 用于描述生成的消息id
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

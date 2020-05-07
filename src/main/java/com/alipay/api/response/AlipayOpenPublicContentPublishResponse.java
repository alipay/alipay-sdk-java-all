package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.content.publish response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-07 16:56:48
 */
public class AlipayOpenPublicContentPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 4692379573233923424L;

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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.message.total.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 21:42:58
 */
public class AlipayOpenPublicMessageTotalSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1775144674295891781L;

	/** 
	 * 消息ID
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

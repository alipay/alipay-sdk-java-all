package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.message.total.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:05:18
 */
public class AlipayOpenPublicMessageTotalSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1178988124285245327L;

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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.message.total.send response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-23 10:46:02
 */
public class AlipayOpenPublicMessageTotalSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8583179539961653753L;

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

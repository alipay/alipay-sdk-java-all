package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.message.group.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 14:07:12
 */
public class AlipayOpenPublicMessageGroupSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5146562237461224668L;

	/** 
	 * 2013121100055554f1000b64-3f05-4581-a5e1-16e29d242950
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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.sdarttool.message.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-31 17:55:49
 */
public class AlipayCommerceIotSdarttoolMessageSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3824515598476241618L;

	/** 
	 * 消息ID
	 */
	@ApiField("message_no")
	private String messageNo;

	public void setMessageNo(String messageNo) {
		this.messageNo = messageNo;
	}
	public String getMessageNo( ) {
		return this.messageNo;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.sdarttool.message.send response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-07 15:15:43
 */
public class AlipayCommerceIotSdarttoolMessageSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7149995316789929337L;

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

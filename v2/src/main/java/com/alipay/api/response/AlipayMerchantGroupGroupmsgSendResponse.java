package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.groupmsg.send response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-29 18:24:56
 */
public class AlipayMerchantGroupGroupmsgSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5556774352293594782L;

	/** 
	 * msg_id消息id
	 */
	@ApiField("msg_id")
	private String msgId;

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	public String getMsgId( ) {
		return this.msgId;
	}

}

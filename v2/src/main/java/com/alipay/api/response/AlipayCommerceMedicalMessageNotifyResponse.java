package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.message.notify response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-12 11:42:29
 */
public class AlipayCommerceMedicalMessageNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3168438731939994238L;

	/** 
	 * 消息发送ID
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

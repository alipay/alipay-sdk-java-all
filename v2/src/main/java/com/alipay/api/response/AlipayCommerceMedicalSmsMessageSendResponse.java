package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.sms.message.send response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-27 10:27:49
 */
public class AlipayCommerceMedicalSmsMessageSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2224333771444447189L;

	/** 
	 * 短信回执id，用于后续查询短信发送状态
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

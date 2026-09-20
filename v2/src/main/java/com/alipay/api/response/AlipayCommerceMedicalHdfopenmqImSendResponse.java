package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdfopenmq.im.send response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-24 19:27:49
 */
public class AlipayCommerceMedicalHdfopenmqImSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1579623842394265498L;

	/** 
	 * 同步消息内容
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 消息id
	 */
	@ApiField("msgid")
	private String msgid;

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setMsgid(String msgid) {
		this.msgid = msgid;
	}
	public String getMsgid( ) {
		return this.msgid;
	}

}

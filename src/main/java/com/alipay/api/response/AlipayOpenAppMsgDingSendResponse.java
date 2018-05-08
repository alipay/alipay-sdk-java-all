package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.msg.ding.send response.
 * 
 * @author auto create
 * @since 1.0, 2016-12-08 11:46:56
 */
public class AlipayOpenAppMsgDingSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2355778739489792415L;

	/** 
	 * 企业消息的id
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

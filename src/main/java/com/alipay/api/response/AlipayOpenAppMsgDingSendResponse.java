package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.msg.ding.send response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-05 15:05:53
 */
public class AlipayOpenAppMsgDingSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6238912354845989491L;

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

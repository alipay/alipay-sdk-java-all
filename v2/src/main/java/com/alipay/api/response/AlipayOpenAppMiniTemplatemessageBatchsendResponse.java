package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.mini.templatemessage.batchsend response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-23 21:50:59
 */
public class AlipayOpenAppMiniTemplatemessageBatchsendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8798914177985934647L;

	/** 
	 * 批量发送记录ID，唯一标识一次消息模板批量发送
	 */
	@ApiField("batch_msg_id")
	private String batchMsgId;

	public void setBatchMsgId(String batchMsgId) {
		this.batchMsgId = batchMsgId;
	}
	public String getBatchMsgId( ) {
		return this.batchMsgId;
	}

}

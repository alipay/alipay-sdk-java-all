package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.mini.templatemessage.batchsend response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-06 11:44:53
 */
public class AlipayOpenAppMiniTemplatemessageBatchsendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7768897441899573964L;

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

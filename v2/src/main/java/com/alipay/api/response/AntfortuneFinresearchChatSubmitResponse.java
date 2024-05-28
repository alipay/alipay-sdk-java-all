package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.finresearch.chat.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-24 11:37:03
 */
public class AntfortuneFinresearchChatSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 2737857137761722682L;

	/** 
	 * 消息id,可用于后续异步轮询查询消息结果
	 */
	@ApiField("message_id")
	private String messageId;

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getMessageId( ) {
		return this.messageId;
	}

}

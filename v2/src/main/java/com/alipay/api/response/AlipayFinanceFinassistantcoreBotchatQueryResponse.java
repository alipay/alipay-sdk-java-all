package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ZXBBotChatResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.finassistantcore.botchat.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-05 21:36:43
 */
public class AlipayFinanceFinassistantcoreBotchatQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3788872316396457381L;

	/** 
	 * 支小宝的回复内容
	 */
	@ApiField("zxb_chat_response")
	private ZXBBotChatResult zxbChatResponse;

	public void setZxbChatResponse(ZXBBotChatResult zxbChatResponse) {
		this.zxbChatResponse = zxbChatResponse;
	}
	public ZXBBotChatResult getZxbChatResponse( ) {
		return this.zxbChatResponse;
	}

}

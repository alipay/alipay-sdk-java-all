package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ZXBBotChatResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.finassistantcore.botchat.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-07 20:56:44
 */
public class AlipayFinanceFinassistantcoreBotchatQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4266978593839761368L;

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

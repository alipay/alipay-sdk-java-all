package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ChatResponseData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.chat.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-01 00:22:34
 */
public class AlipayCloudCloudpromoChatCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6747774479281737668L;

	/** 
	 * 消息内容。其中，chat 事件和 message 事件的格式不同。
chat 事件中，data 为 Chat Object。
message、audio 事件中，data 为 Message Object。
	 */
	@ApiField("data")
	private ChatResponseData data;

	/** 
	 * 当前流式返回的数据包事件。
	 */
	@ApiField("event")
	private String event;

	public void setData(ChatResponseData data) {
		this.data = data;
	}
	public ChatResponseData getData( ) {
		return this.data;
	}

	public void setEvent(String event) {
		this.event = event;
	}
	public String getEvent( ) {
		return this.event;
	}

}

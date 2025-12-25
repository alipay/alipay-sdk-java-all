package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AmpeChatContent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.general.chat.send response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-17 15:32:28
 */
public class AlipayOpenMiniGeneralChatSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5516119561848543731L;

	/** 
	 * 标注返回的流式结构内容
	 */
	@ApiField("data")
	private AmpeChatContent data;

	/** 
	 * 标注返回的流式结构类型
	 */
	@ApiField("event")
	private String event;

	/** 
	 * 标注返回的流式结构序号
	 */
	@ApiField("id")
	private String id;

	public void setData(AmpeChatContent data) {
		this.data = data;
	}
	public AmpeChatContent getData( ) {
		return this.data;
	}

	public void setEvent(String event) {
		this.event = event;
	}
	public String getEvent( ) {
		return this.event;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

}

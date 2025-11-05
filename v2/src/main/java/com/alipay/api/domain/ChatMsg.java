package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户聊天消息数据结构，用户提问与模型回答共用本通用结构。
content 的数据结构与 type 相关，即 type 决定 content 中的内容。
 *
 * @author auto create
 * @since 1.0, 2024-09-03 09:55:19
 */
public class ChatMsg extends AlipayObject {

	private static final long serialVersionUID = 7818871741125264825L;

	/**
	 * 消息的具体内容
	 */
	@ApiField("content")
	private ChatContent content;

	/**
	 * 描述消息的类型
	 */
	@ApiField("type")
	private String type;

	public ChatContent getContent() {
		return this.content;
	}
	public void setContent(ChatContent content) {
		this.content = content;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

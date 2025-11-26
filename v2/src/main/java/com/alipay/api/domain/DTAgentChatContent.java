package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会话内容，用于提问&回答的内容结构
 *
 * @author auto create
 * @since 1.0, 2024-11-05 17:25:41
 */
public class DTAgentChatContent extends AlipayObject {

	private static final long serialVersionUID = 6696968294941653124L;

	/**
	 * 具体会话内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 内容类型，当前仅支持text
	 */
	@ApiField("content_type")
	private String contentType;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

}

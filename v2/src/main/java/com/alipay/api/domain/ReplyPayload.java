package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对话返回体
 *
 * @author auto create
 * @since 1.0, 2025-05-12 14:12:27
 */
public class ReplyPayload extends AlipayObject {

	private static final long serialVersionUID = 3428474678414299657L;

	/**
	 * 回复内容
	 */
	@ApiField("reply_content")
	private ReplyChatContent replyContent;

	/**
	 * 回复类型
	 */
	@ApiField("reply_type")
	private String replyType;

	public ReplyChatContent getReplyContent() {
		return this.replyContent;
	}
	public void setReplyContent(ReplyChatContent replyContent) {
		this.replyContent = replyContent;
	}

	public String getReplyType() {
		return this.replyType;
	}
	public void setReplyType(String replyType) {
		this.replyType = replyType;
	}

}

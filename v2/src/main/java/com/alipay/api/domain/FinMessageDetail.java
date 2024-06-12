package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对话详情
 *
 * @author auto create
 * @since 1.0, 2024-04-18 15:46:09
 */
public class FinMessageDetail extends AlipayObject {

	private static final long serialVersionUID = 8474526883551732542L;

	/**
	 * 流程节点内容
	 */
	@ApiField("addition")
	private String addition;

	/**
	 * 会话内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 消息ID
	 */
	@ApiField("message_id")
	private String messageId;

	/**
	 * 消息类型
	 */
	@ApiField("type")
	private String type;

	public String getAddition() {
		return this.addition;
	}
	public void setAddition(String addition) {
		this.addition = addition;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getMessageId() {
		return this.messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

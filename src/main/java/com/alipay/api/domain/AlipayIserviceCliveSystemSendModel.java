package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 给客服发送系统消息
 *
 * @author auto create
 * @since 1.0, 2022-04-28 16:36:16
 */
public class AlipayIserviceCliveSystemSendModel extends AlipayObject {

	private static final long serialVersionUID = 7652311722382146872L;

	/**
	 * 系统消息内容，纯文本
	 */
	@ApiField("content")
	private String content;

	/**
	 * 会话ID
	 */
	@ApiField("conversation_id")
	private String conversationId;

	/**
	 * 渠道来源字段
	 */
	@ApiField("src")
	private String src;

	/**
	 * 渠道侧唯一用户标识
	 */
	@ApiField("visitor_id")
	private String visitorId;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getConversationId() {
		return this.conversationId;
	}
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public String getSrc() {
		return this.src;
	}
	public void setSrc(String src) {
		this.src = src;
	}

	public String getVisitorId() {
		return this.visitorId;
	}
	public void setVisitorId(String visitorId) {
		this.visitorId = visitorId;
	}

}

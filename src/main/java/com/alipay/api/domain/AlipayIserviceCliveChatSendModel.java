package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 给客服发送消息
 *
 * @author auto create
 * @since 1.0, 2021-08-27 09:57:36
 */
public class AlipayIserviceCliveChatSendModel extends AlipayObject {

	private static final long serialVersionUID = 1843172115814735699L;

	/**
	 * 消息内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 消息类型：
TEXT，代表文本消息，此时content字段是文本；
IMG，代表图片消息，此时content内容是可访问的图片URL
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * DT端会话ID
	 */
	@ApiField("conversation_id")
	private String conversationId;

	/**
	 * 访问DT的渠道 11:LINKS 12:HELLO_BIKE
	 */
	@ApiField("src")
	private String src;

	/**
	 * 渠道端用户唯一标识
	 */
	@ApiField("visitor_id")
	private String visitorId;

	/**
	 * 访客名字
	 */
	@ApiField("visitor_name")
	private String visitorName;

	/**
	 * DT端访客token，即本次的消息发送者
	 */
	@ApiField("visitor_token")
	private String visitorToken;

	/**
	 * 访客类型：1,代表匿名访客；2,代表有名访客
	 */
	@ApiField("visitor_type")
	private String visitorType;

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

	public String getVisitorName() {
		return this.visitorName;
	}
	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	public String getVisitorToken() {
		return this.visitorToken;
	}
	public void setVisitorToken(String visitorToken) {
		this.visitorToken = visitorToken;
	}

	public String getVisitorType() {
		return this.visitorType;
	}
	public void setVisitorType(String visitorType) {
		this.visitorType = visitorType;
	}

}

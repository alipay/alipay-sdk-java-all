package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对话消息
 *
 * @author auto create
 * @since 1.0, 2021-05-19 17:22:33
 */
public class ChatMessage extends AlipayObject {

	private static final long serialVersionUID = 7658198543889841946L;

	/**
	 * 消息内容
	 */
	@ApiField("message_content")
	private String messageContent;

	/**
	 * 消息内容类型,默认TEXT,包括: TEXT(文本消息),IMAGE(图片消息),FILE(文件消息)
	 */
	@ApiField("message_type")
	private String messageType;

	/**
	 * 消息发送时间，按照ISO8601标准表示，比如：2018-12-24T15:38:17.824+08:00
	 */
	@ApiField("send_time")
	private Date sendTime;

	/**
	 * 发送者名称
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 发送者类型: VISITOR(访客) ,AGENT(在线客服) ,SYSTEM(系统)
	 */
	@ApiField("user_type")
	private String userType;

	public String getMessageContent() {
		return this.messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	public String getMessageType() {
		return this.messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public Date getSendTime() {
		return this.sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}

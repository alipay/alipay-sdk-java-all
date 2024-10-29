package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI智能导购对话接口
 *
 * @author auto create
 * @since 1.0, 2023-09-25 17:43:26
 */
public class TechriskInnovateSalesgptChatSendModel extends AlipayObject {

	private static final long serialVersionUID = 1196933548134733766L;

	/**
	 * 对话机器人id，由AI导购平台提供
	 */
	@ApiField("chat_bot_id")
	private String chatBotId;

	/**
	 * 支付宝开放平台中的商户id
	 */
	@ApiField("mer_pid")
	private String merPid;

	/**
	 * 消息内容
	 */
	@ApiField("message_content")
	private String messageContent;

	/**
	 * 消息类型，默认text
	 */
	@ApiField("message_type")
	private String messageType;

	/**
	 * 支付宝开放平台OpenId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝开放平台中的appId
	 */
	@ApiField("source_app_id")
	private String sourceAppId;

	/**
	 * 用户唯一id
	 */
	@ApiField("user_id")
	private String userId;

	public String getChatBotId() {
		return this.chatBotId;
	}
	public void setChatBotId(String chatBotId) {
		this.chatBotId = chatBotId;
	}

	public String getMerPid() {
		return this.merPid;
	}
	public void setMerPid(String merPid) {
		this.merPid = merPid;
	}

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSourceAppId() {
		return this.sourceAppId;
	}
	public void setSourceAppId(String sourceAppId) {
		this.sourceAppId = sourceAppId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

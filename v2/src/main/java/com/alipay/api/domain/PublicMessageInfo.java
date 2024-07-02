package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发送消息查询
 *
 * @author auto create
 * @since 1.0, 2020-07-06 16:46:18
 */
public class PublicMessageInfo extends AlipayObject {

	private static final long serialVersionUID = 5452985878692112479L;

	/**
	 * 内容信息
	 */
	@ApiListField("articles")
	@ApiField("image_text_item")
	private List<ImageTextItem> articles;

	/**
	 * 消息id
	 */
	@ApiField("message_id")
	private String messageId;

	/**
	 * 消息发送时间
	 */
	@ApiField("send_time")
	private String sendTime;

	/**
	 * 发送状态。INIT：未开始发送、RUNNING：发送中、SUCCESS：发送成功、FAILURE：发送失败、RECALLING：撤回中、RECALLED：撤回失败
	 */
	@ApiField("status")
	private String status;

	/**
	 * 消息状态：未开始发送、发送失败、正在处理中、撤回中、撤回成功、发送成功
	 */
	@ApiField("status_desc")
	private String statusDesc;

	public List<ImageTextItem> getArticles() {
		return this.articles;
	}
	public void setArticles(List<ImageTextItem> articles) {
		this.articles = articles;
	}

	public String getMessageId() {
		return this.messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getSendTime() {
		return this.sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

}

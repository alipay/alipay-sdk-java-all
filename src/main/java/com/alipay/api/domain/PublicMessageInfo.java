package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发送消息查询
 *
 * @author auto create
 * @since 1.0, 2017-09-20 17:31:09
 */
public class PublicMessageInfo extends AlipayObject {

	private static final long serialVersionUID = 2214118985419762743L;

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

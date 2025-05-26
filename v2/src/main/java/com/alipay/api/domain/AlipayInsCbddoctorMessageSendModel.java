package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 家医CBD医生消息发送
 *
 * @author auto create
 * @since 1.0, 2025-05-12 11:37:56
 */
public class AlipayInsCbddoctorMessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 4547592111489114965L;

	/**
	 * 互医生成的msgId。需要唯一，用于防止消息发送重复。
	 */
	@ApiField("client_msg_id")
	private String clientMsgId;

	/**
	 * 问诊对话消息体
	 */
	@ApiField("message")
	private CBDMessageBody message;

	/**
	 * 蚂蚁服务工单编号
	 */
	@ApiField("service_order_id")
	private String serviceOrderId;

	public String getClientMsgId() {
		return this.clientMsgId;
	}
	public void setClientMsgId(String clientMsgId) {
		this.clientMsgId = clientMsgId;
	}

	public CBDMessageBody getMessage() {
		return this.message;
	}
	public void setMessage(CBDMessageBody message) {
		this.message = message;
	}

	public String getServiceOrderId() {
		return this.serviceOrderId;
	}
	public void setServiceOrderId(String serviceOrderId) {
		this.serviceOrderId = serviceOrderId;
	}

}

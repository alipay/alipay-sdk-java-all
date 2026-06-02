package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫IMMQ转发
 *
 * @author auto create
 * @since 1.0, 2026-05-27 16:42:48
 */
public class AlipayCommerceMedicalHdfimMqSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4771559838121546446L;

	/**
	 * 同步信息，接口不反序列化此字段，直接透传到SOFAMQ
	 */
	@ApiField("msg_body")
	private String msgBody;

	/**
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * RabbitMQ routing key，用于路由消息到对应的SOFAMQ topic。支持精确匹配和前缀匹配，例如 sendGroupMessage.BaseFlow.doctor.text.success 会匹配到 sendGroupMessage 前缀
	 */
	@ApiField("routing_key")
	private String routingKey;

	public String getMsgBody() {
		return this.msgBody;
	}
	public void setMsgBody(String msgBody) {
		this.msgBody = msgBody;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRoutingKey() {
		return this.routingKey;
	}
	public void setRoutingKey(String routingKey) {
		this.routingKey = routingKey;
	}

}

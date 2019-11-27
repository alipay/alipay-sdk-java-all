package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁金融云系统向主站adatabus发送消息，例如CTU异步事件
 *
 * @author auto create
 * @since 1.0, 2018-10-24 16:19:52
 */
public class AlipayDataDataserviceDatabusSendModel extends AlipayObject {

	private static final long serialVersionUID = 8149153826961113389L;

	/**
	 * 这里先写ctu需求中的eventCode
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * 传给adatabus的ctu属性+基本的key列表，约定为json格式。基本key列表如下：clientId、clientIp、serverId、clientMac，userId、clientPCIDGuid，具体含义请咨询ctu同学，然后ctu属性也放在这里。
	 */
	@ApiField("event_payload")
	private String eventPayload;

	/**
	 * 这里不需要填写
	 */
	@ApiField("payload_class")
	private String payloadClass;

	/**
	 * 目前请写死 TP_UCT
	 */
	@ApiField("topic")
	private String topic;

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getEventPayload() {
		return this.eventPayload;
	}
	public void setEventPayload(String eventPayload) {
		this.eventPayload = eventPayload;
	}

	public String getPayloadClass() {
		return this.payloadClass;
	}
	public void setPayloadClass(String payloadClass) {
		this.payloadClass = payloadClass;
	}

	public String getTopic() {
		return this.topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}

}

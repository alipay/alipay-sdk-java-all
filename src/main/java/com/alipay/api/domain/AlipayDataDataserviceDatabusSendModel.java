package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁金融云系统向主站adatabus发送消息，例如CTU异步事件
 *
 * @author auto create
 * @since 1.0, 2018-01-24 10:03:37
 */
public class AlipayDataDataserviceDatabusSendModel extends AlipayObject {

	private static final long serialVersionUID = 1816578258557222994L;

	/**
	 * 对应于adatabus这边的eventCode纬度，databus这边是通过topic+eventCode纬度来找到对应的数据源，用于适配databus这边的数据源模型，可以参考主站消息中心的topic和eventCode的命名方式。
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * 传给adatabus的消息体，约定为json格式
	 */
	@ApiField("event_payload")
	private String eventPayload;

	/**
	 * event_payload的类型，消息到了databus之后，会把event_payload的json串根据本参数转换成特定的类型。如果没有提供此参数，默认是转换成Map结构。

需要注意的是，这个类需要在adatabus中能找到，并且和当前的json串是匹配的，如果adatabus这边没有这个类，可以通过业务jar的方式在adatabus中注册
	 */
	@ApiField("payload_class")
	private String payloadClass;

	/**
	 * 对应于adatabus这边的topic纬度，databus这边是通过topic+eventCode纬度来找到对应的数据源，用于适配databus这边的数据源模型，可以参考主站消息中心的topic和eventCode的命名方式。
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

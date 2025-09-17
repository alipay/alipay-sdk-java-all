package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.message.subscription.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:18
 */
public class AlipayOpenAppMessageSubscriptionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3259251394197499267L;

	/** 
	 * 消息接入方式，例如HTTP
	 */
	@ApiField("comm_type")
	private String commType;

	/** 
	 * 消息标签
	 */
	@ApiField("tag")
	private String tag;

	/** 
	 * 消息主题名称
	 */
	@ApiField("topic")
	private String topic;

	public void setCommType(String commType) {
		this.commType = commType;
	}
	public String getCommType( ) {
		return this.commType;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getTag( ) {
		return this.tag;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getTopic( ) {
		return this.topic;
	}

}

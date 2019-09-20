package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.message.subscription.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-23 11:10:01
 */
public class AlipayOpenAppMessageSubscriptionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1234121311441684596L;

	/** 
	 * 消息接入方式，例如HTTP
	 */
	@ApiField("comm_type")
	private String commType;

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

	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getTopic( ) {
		return this.topic;
	}

}

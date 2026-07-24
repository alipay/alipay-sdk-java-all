package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdfim.mq.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-27 16:42:48
 */
public class AlipayCommerceMedicalHdfimMqSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3578529853816353834L;

	/** 
	 * 实际转发的SOFAMQ tag
	 */
	@ApiField("tag")
	private String tag;

	/** 
	 * 实际转发的SOFAMQ topic
	 */
	@ApiField("topic")
	private String topic;

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

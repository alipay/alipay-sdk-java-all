package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.topic.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-13 20:11:15
 */
public class AlipayOpenPublicTopicCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3695742385397713627L;

	/** 
	 * 营销位id
	 */
	@ApiField("topic_id")
	private String topicId;

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}
	public String getTopicId( ) {
		return this.topicId;
	}

}

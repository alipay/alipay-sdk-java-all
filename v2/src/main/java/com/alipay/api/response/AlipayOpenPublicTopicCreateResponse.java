package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.topic.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 06:42:53
 */
public class AlipayOpenPublicTopicCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4634578578328346346L;

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

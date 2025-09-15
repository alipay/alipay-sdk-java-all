package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.icommunity.topic.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-22 16:52:24
 */
public class AlipayCommerceIcommunityTopicCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4394435616752886692L;

	/** 
	 * 当前话题创建请求传入的外部请求id
	 */
	@ApiField("out_request_id")
	private String outRequestId;

	/** 
	 * 创建话题生成的话题唯一标识
	 */
	@ApiField("topic_id")
	private String topicId;

	public void setOutRequestId(String outRequestId) {
		this.outRequestId = outRequestId;
	}
	public String getOutRequestId( ) {
		return this.outRequestId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}
	public String getTopicId( ) {
		return this.topicId;
	}

}

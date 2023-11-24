package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Topic;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.topic.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-12 06:48:22
 */
public class AlipayOpenPublicTopicBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4535881417794966696L;

	/** 
	 * 营销位列表
	 */
	@ApiListField("topic_list")
	@ApiField("topic")
	private List<Topic> topicList;

	public void setTopicList(List<Topic> topicList) {
		this.topicList = topicList;
	}
	public List<Topic> getTopicList( ) {
		return this.topicList;
	}

}

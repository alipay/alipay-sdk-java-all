package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TopicItemVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.content.community.topic.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AntfortuneContentCommunityTopicListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2845772713674976491L;

	/** 
	 * 话题VO列表
	 */
	@ApiListField("topic_list")
	@ApiField("topic_item_vo")
	private List<TopicItemVo> topicList;

	public void setTopicList(List<TopicItemVo> topicList) {
		this.topicList = topicList;
	}
	public List<TopicItemVo> getTopicList( ) {
		return this.topicList;
	}

}

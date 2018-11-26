package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销位删除接口
 *
 * @author auto create
 * @since 1.0, 2017-12-06 11:22:56
 */
public class AlipayOpenPublicTopicDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5638239312591248155L;

	/**
	 * 营销位id
	 */
	@ApiField("topic_id")
	private String topicId;

	public String getTopicId() {
		return this.topicId;
	}
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

}

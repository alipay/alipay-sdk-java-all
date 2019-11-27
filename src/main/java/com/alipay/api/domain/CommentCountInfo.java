package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 被评论对象的评论计数等摘要信息
 *
 * @author auto create
 * @since 1.0, 2016-11-10 10:23:56
 */
public class CommentCountInfo extends AlipayObject {

	private static final long serialVersionUID = 6239632332139473788L;

	/**
	 * 评论总数
	 */
	@ApiField("feed_count")
	private Long feedCount;

	/**
	 * 被评论对象ID
	 */
	@ApiField("target_id")
	private String targetId;

	public Long getFeedCount() {
		return this.feedCount;
	}
	public void setFeedCount(Long feedCount) {
		this.feedCount = feedCount;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

}

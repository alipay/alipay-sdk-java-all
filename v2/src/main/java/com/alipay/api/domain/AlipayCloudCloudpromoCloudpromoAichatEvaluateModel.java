package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能问答用户反馈评价
 *
 * @author auto create
 * @since 1.0, 2024-08-20 18:09:19
 */
public class AlipayCloudCloudpromoCloudpromoAichatEvaluateModel extends AlipayObject {

	private static final long serialVersionUID = 3628593661131152969L;

	/**
	 * 用于记录用户对问答内容反馈的具体评论
	 */
	@ApiField("comment")
	private String comment;

	/**
	 * 表示用户对问答的评价等级
	 */
	@ApiField("rating")
	private String rating;

	/**
	 * 请求唯一标识，该字段由问答接口返回
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 标识某个bot，该字段由和客户约定产生。
	 */
	@ApiField("scene_id")
	private String sceneId;

	public String getComment() {
		return this.comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getRating() {
		return this.rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

}

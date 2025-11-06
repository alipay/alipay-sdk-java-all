package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 访客提交评价
 *
 * @author auto create
 * @since 1.0, 2023-10-07 15:24:51
 */
public class AlipayIserviceCliveFeedbackSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 4187721116184963977L;

	/**
	 * 会话ID
	 */
	@ApiField("conversation_id")
	private String conversationId;

	/**
	 * 评价内容
	 */
	@ApiField("feedback_note")
	private String feedbackNote;

	/**
	 * 评分，0 非常满意；1 满意 ； 2 一般；3 不满意；5 暂不评价
	 */
	@ApiField("score")
	private String score;

	/**
	 * 渠道端访客ID
	 */
	@ApiField("visitor_id")
	private String visitorId;

	public String getConversationId() {
		return this.conversationId;
	}
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public String getFeedbackNote() {
		return this.feedbackNote;
	}
	public void setFeedbackNote(String feedbackNote) {
		this.feedbackNote = feedbackNote;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

	public String getVisitorId() {
		return this.visitorId;
	}
	public void setVisitorId(String visitorId) {
		this.visitorId = visitorId;
	}

}

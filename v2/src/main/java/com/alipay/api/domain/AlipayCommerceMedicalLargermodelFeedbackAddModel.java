package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医疗大模型服务对外接口_流式会话点踩
 *
 * @author auto create
 * @since 1.0, 2025-08-11 14:35:12
 */
public class AlipayCommerceMedicalLargermodelFeedbackAddModel extends AlipayObject {

	private static final long serialVersionUID = 6188551118113152363L;

	/**
	 * 对话id
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 踩的文本
	 */
	@ApiListField("feed_back_tags")
	@ApiField("string")
	private List<String> feedBackTags;

	/**
	 * 点踩反馈值
	 */
	@ApiField("feedback")
	private Long feedback;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户id
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 当out_user_id为2088uid时，需将这个值设置为：ALIPAY_UID；当out_user_id为其他值时，可将这个值设置为：OTHER_UID；
	 */
	@ApiField("out_user_type")
	private String outUserType;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public List<String> getFeedBackTags() {
		return this.feedBackTags;
	}
	public void setFeedBackTags(List<String> feedBackTags) {
		this.feedBackTags = feedBackTags;
	}

	public Long getFeedback() {
		return this.feedback;
	}
	public void setFeedback(Long feedback) {
		this.feedback = feedback;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getOutUserType() {
		return this.outUserType;
	}
	public void setOutUserType(String outUserType) {
		this.outUserType = outUserType;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}

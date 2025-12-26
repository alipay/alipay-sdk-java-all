package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云营销智能问答流式接口
 *
 * @author auto create
 * @since 1.0, 2024-08-19 19:58:53
 */
public class AlipayCloudCloudpromoAichatStreammsgCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3652454181226567795L;

	/**
	 * 业务场景信息
	 */
	@ApiField("biz_trans_data")
	private String bizTransData;

	/**
	 * 提问内容是文本还是语音。
	 */
	@ApiField("chat_type")
	private String chatType;

	/**
	 * 客户唯一标识,该字段由客户生成并提供。
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 用户提问内容
	 */
	@ApiField("question")
	private String question;

	/**
	 * 一次请求全局唯一标识。如果为空，系统会默认生成，如果不为空，则使用传入的requestID作为唯一标识。如果重试字段retry为true，则此字段必传，表示需要重试的记录
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 当前请求是否是重试请求，如果为true，则requestId必须不为空，且为需要重试的请求。其他情况可以不传此字段
	 */
	@ApiField("retry")
	private Boolean retry;

	/**
	 * 场景ID，该字段由问答系统生成并给到业务方使用。
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 会话ID。该字段由问答系统生成。
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 原始请求的appID
	 */
	@ApiField("source_id")
	private String sourceId;

	public String getBizTransData() {
		return this.bizTransData;
	}
	public void setBizTransData(String bizTransData) {
		this.bizTransData = bizTransData;
	}

	public String getChatType() {
		return this.chatType;
	}
	public void setChatType(String chatType) {
		this.chatType = chatType;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getQuestion() {
		return this.question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getRetry() {
		return this.retry;
	}
	public void setRetry(Boolean retry) {
		this.retry = retry;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}

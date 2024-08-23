package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云营销智能问答同步接口
 *
 * @author auto create
 * @since 1.0, 2024-07-08 17:47:10
 */
public class AlipayCloudCloudpromoAichatSyncmsgCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3424362519367977648L;

	/**
	 * 业务场景信息
	 */
	@ApiField("biz_trans_data")
	private String bizTransData;

	/**
	 * 提问类型。
	 */
	@ApiField("chat_type")
	private String chatType;

	/**
	 * 客户唯一标识，由客户提供
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 用户提问内容
	 */
	@ApiField("question")
	private String question;

	/**
	 * 场景ID，该字段由和客户约定产生。
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 会话ID，标识一通包含多轮对话的问答。该字段为可选自选，若客户自行进行会话管理，则传入该字段；若不传该字段，则由问答系统进行会话管理。
	 */
	@ApiField("session_id")
	private String sessionId;

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

}

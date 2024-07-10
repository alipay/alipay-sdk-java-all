package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云营销智能问答流式接口
 *
 * @author auto create
 * @since 1.0, 2024-07-02 17:57:09
 */
public class AlipayCloudCloudpromoAichatStreammsgCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3373463612589472994L;

	/**
	 * 业务场景信息
	 */
	@ApiField("biz_trans_data")
	private String bizTransData;

	/**
	 * 提问类型
如果值为AUDIO，quesiton字段值为经过base64之后的语音流
	 */
	@ApiField("chat_type")
	private String chatType;

	/**
	 * 客户唯一标识
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 用户提问内容
	 */
	@ApiField("question")
	private String question;

	/**
	 * 场景ID
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 会话ID
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

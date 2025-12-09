package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医疗大模型服务对外接口_点踩
 *
 * @author auto create
 * @since 1.0, 2025-08-18 14:20:54
 */
public class AlipayCommerceMedicalLargermodelFeedbackSetModel extends AlipayObject {

	private static final long serialVersionUID = 3723964363633586126L;

	/**
	 * 行业侧生成，首次为空
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 0：踩
1：赞
-1：取消
	 */
	@ApiField("feedback")
	private String feedback;

	/**
	 * ["内容低质","事实错误",....]
	 */
	@ApiListField("feedback_tags")
	@ApiField("string")
	private List<String> feedbackTags;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户id，为对外开放新增字段，对外开放时必填。（可以为外部用户ID，同一次陪诊需要传同一个ID）
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 当out_user_id为2088uid时，需将这个值设置为：ALIPAY_UID；当out_user_id为其他值时，可将这个值设置为：OTHER_UID；
	 */
	@ApiField("outer_user_type")
	private String outerUserType;

	/**
	 * 场景Code
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * session_id
	 */
	@ApiField("session_id")
	private String sessionId;

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getFeedback() {
		return this.feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public List<String> getFeedbackTags() {
		return this.feedbackTags;
	}
	public void setFeedbackTags(List<String> feedbackTags) {
		this.feedbackTags = feedbackTags;
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

	public String getOuterUserType() {
		return this.outerUserType;
	}
	public void setOuterUserType(String outerUserType) {
		this.outerUserType = outerUserType;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}

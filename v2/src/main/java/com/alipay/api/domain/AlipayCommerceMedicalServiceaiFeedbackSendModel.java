package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * BadCase反馈接口
 *
 * @author auto create
 * @since 1.0, 2025-11-20 10:12:41
 */
public class AlipayCommerceMedicalServiceaiFeedbackSendModel extends AlipayObject {

	private static final long serialVersionUID = 3188444792993993435L;

	/**
	 * 智能体ID
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * AI生成内容
	 */
	@ApiField("answer")
	private String answer;

	/**
	 * 对话ID
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 用户主动反馈内容
	 */
	@ApiField("feedback")
	private String feedback;

	/**
	 * 支付宝openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部用户的唯一ID
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 当out_user_id为2088uid时，需将这个值设置为：ALIPAY_UID；当out_user_id为其他值时，可将这个值设置为：OTHER_UID，当传入out_open_id时，out_user_type对应的值为ALIPAY_OPENID
	 */
	@ApiField("out_user_type")
	private String outUserType;

	/**
	 * AI Query
	 */
	@ApiField("query")
	private String query;

	/**
	 * AI生成后用户针对AI生成内容做出部分改写后采用
	 */
	@ApiField("rewrite")
	private String rewrite;

	/**
	 * 场景code
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 会话ID
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 支付宝链路id
	 */
	@ApiField("trace_no")
	private String traceNo;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAnswer() {
		return this.answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

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

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getRewrite() {
		return this.rewrite;
	}
	public void setRewrite(String rewrite) {
		this.rewrite = rewrite;
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

	public String getTraceNo() {
		return this.traceNo;
	}
	public void setTraceNo(String traceNo) {
		this.traceNo = traceNo;
	}

}

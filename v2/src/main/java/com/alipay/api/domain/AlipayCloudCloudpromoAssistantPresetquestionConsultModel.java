package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云营销AI助手预设问题引导
 *
 * @author auto create
 * @since 1.0, 2024-08-27 20:57:16
 */
public class AlipayCloudCloudpromoAssistantPresetquestionConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6536525117991196618L;

	/**
	 * 询问时间
	 */
	@ApiField("ask_time")
	private Date askTime;

	/**
	 * 客户的名称标识，用来标识本次对话的客户身份，必须传，进而在历史会话查询是可以通过用户身份查询对应的历史会话
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 问题内容
	 */
	@ApiField("question_content")
	private String questionContent;

	/**
	 * 问题的唯一标识，用于请求本次问题预设置的引导回答的内容
	 */
	@ApiField("question_id")
	private String questionId;

	/**
	 * 定义助手的业务场景
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 会话唯一标识，用来表是否是同一个会话，用户传递时使用用户的标识，没有传递时系统自动生成会话id进行标识
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 用于标识请求方的来源id，由接口提供方的请求方进行约定
	 */
	@ApiField("source_id")
	private String sourceId;

	public Date getAskTime() {
		return this.askTime;
	}
	public void setAskTime(Date askTime) {
		this.askTime = askTime;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getQuestionContent() {
		return this.questionContent;
	}
	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}

	public String getQuestionId() {
		return this.questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
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

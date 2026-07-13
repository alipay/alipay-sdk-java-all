package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机器人聊天返回模型
 *
 * @author auto create
 * @since 1.0, 2026-05-26 21:25:36
 */
public class RobotChatResponse extends AlipayObject {

	private static final long serialVersionUID = 2225837867937165558L;

	/**
	 * agent回答具体信息。
	 */
	@ApiField("answer_content")
	private String answerContent;

	/**
	 * 具体回答的业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	public String getAnswerContent() {
		return this.answerContent;
	}
	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

}

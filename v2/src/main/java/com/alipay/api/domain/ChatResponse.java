package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对话返回结构
 *
 * @author auto create
 * @since 1.0, 2026-05-22 14:12:15
 */
public class ChatResponse extends AlipayObject {

	private static final long serialVersionUID = 2621822586527139513L;

	/**
	 * Agent回答内容
	 */
	@ApiField("answer_content")
	private AnswerContent answerContent;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 子agent能力
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public AnswerContent getAnswerContent() {
		return this.answerContent;
	}
	public void setAnswerContent(AnswerContent answerContent) {
		this.answerContent = answerContent;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}

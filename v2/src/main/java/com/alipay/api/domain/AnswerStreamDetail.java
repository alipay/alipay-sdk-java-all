package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机器人对话问答返回的流式详情
 *
 * @author auto create
 * @since 1.0, 2024-07-31 11:02:41
 */
public class AnswerStreamDetail extends AlipayObject {

	private static final long serialVersionUID = 7125725755467476189L;

	/**
	 * 流式回复前置文案
	 */
	@ApiField("follow_question")
	private String followQuestion;

	/**
	 * 是否流式输出
	 */
	@ApiField("stream_out")
	private Boolean streamOut;

	public String getFollowQuestion() {
		return this.followQuestion;
	}
	public void setFollowQuestion(String followQuestion) {
		this.followQuestion = followQuestion;
	}

	public Boolean getStreamOut() {
		return this.streamOut;
	}
	public void setStreamOut(Boolean streamOut) {
		this.streamOut = streamOut;
	}

}

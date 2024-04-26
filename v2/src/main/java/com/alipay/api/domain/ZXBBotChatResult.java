package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支小宝回复内容
 *
 * @author auto create
 * @since 1.0, 2023-09-05 20:40:21
 */
public class ZXBBotChatResult extends AlipayObject {

	private static final long serialVersionUID = 2831712213244331545L;

	/**
	 * 支小宝回复模板列表
	 */
	@ApiField("answer")
	private String answer;

	/**
	 * 渠道是小宝还是大模型
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 对话成功失败标识
	 */
	@ApiField("success")
	private Boolean success;

	public String getAnswer() {
		return this.answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}

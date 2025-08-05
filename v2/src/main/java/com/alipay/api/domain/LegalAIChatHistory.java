package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 法务大模型会话历史
 *
 * @author auto create
 * @since 1.0, 2023-10-23 10:09:04
 */
public class LegalAIChatHistory extends AlipayObject {

	private static final long serialVersionUID = 4189136572173316521L;

	/**
	 * 模型回答
	 */
	@ApiField("assistant")
	private String assistant;

	/**
	 * 用户输入内容
	 */
	@ApiField("user")
	private String user;

	public String getAssistant() {
		return this.assistant;
	}
	public void setAssistant(String assistant) {
		this.assistant = assistant;
	}

	public String getUser() {
		return this.user;
	}
	public void setUser(String user) {
		this.user = user;
	}

}

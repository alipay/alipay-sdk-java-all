package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户行为习惯
 *
 * @author auto create
 * @since 1.0, 2024-09-02 16:54:17
 */
public class AIChatCustomerLike extends AlipayObject {

	private static final long serialVersionUID = 6384911186332691289L;

	/**
	 * 是否第一次进行对话
	 */
	@ApiField("first_chat")
	private Boolean firstChat;

	/**
	 * 输入方式
	 */
	@ApiField("input_method")
	private String inputMethod;

	public Boolean getFirstChat() {
		return this.firstChat;
	}
	public void setFirstChat(Boolean firstChat) {
		this.firstChat = firstChat;
	}

	public String getInputMethod() {
		return this.inputMethod;
	}
	public void setInputMethod(String inputMethod) {
		this.inputMethod = inputMethod;
	}

}

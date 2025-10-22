package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 问答错误
 *
 * @author auto create
 * @since 1.0, 2024-08-19 19:58:53
 */
public class ChatError extends AlipayObject {

	private static final long serialVersionUID = 2218822245529981485L;

	/**
	 * 流式回答应答码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 未识别到客户意图等之后给出的答案
	 */
	@ApiField("message")
	private String message;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}

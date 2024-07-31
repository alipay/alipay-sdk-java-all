package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 问答错误
 *
 * @author auto create
 * @since 1.0, 2024-07-02 17:57:09
 */
public class ChatError extends AlipayObject {

	private static final long serialVersionUID = 5822118553848146841L;

	/**
	 * 错误码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 错误描述
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

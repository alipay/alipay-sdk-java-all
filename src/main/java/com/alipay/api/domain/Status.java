package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 返回状态码
 *
 * @author auto create
 * @since 1.0, 2022-06-10 15:34:40
 */
public class Status extends AlipayObject {

	private static final long serialVersionUID = 6881339334888821197L;

	/**
	 * 状态码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 详细信息
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

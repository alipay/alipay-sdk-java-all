package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * web层基本返回对象
 *
 * @author auto create
 * @since 1.0, 2021-10-08 15:26:16
 */
public class BaseWebResponse extends AlipayObject {

	private static final long serialVersionUID = 7366499383254443753L;

	/**
	 * response code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 返回错误信息
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

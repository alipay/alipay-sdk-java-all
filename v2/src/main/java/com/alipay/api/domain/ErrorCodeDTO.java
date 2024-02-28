package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * JSAPI错误码
 *
 * @author auto create
 * @since 1.0, 2019-12-26 14:43:20
 */
public class ErrorCodeDTO extends AlipayObject {

	private static final long serialVersionUID = 5567353814849413257L;

	/**
	 * jsapi参数描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 错误码,SYSTEM_ERROR:系统错误
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误解决方案
	 */
	@ApiField("solution")
	private String solution;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getSolution() {
		return this.solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}

}

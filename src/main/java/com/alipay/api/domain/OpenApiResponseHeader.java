package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ApplePay公用响应头
 *
 * @author auto create
 * @since 1.0, 2020-02-25 21:30:13
 */
public class OpenApiResponseHeader extends AlipayObject {

	private static final long serialVersionUID = 4516572122447425573L;

	/**
	 * 自定义状态码
	 */
	@ApiField("status_code")
	private String statusCode;

	/**
	 * 状态信息
	 */
	@ApiField("status_message")
	private String statusMessage;

	/**
	 * 子状态码
	 */
	@ApiField("sub_status_code")
	private String subStatusCode;

	public String getStatusCode() {
		return this.statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return this.statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getSubStatusCode() {
		return this.subStatusCode;
	}
	public void setSubStatusCode(String subStatusCode) {
		this.subStatusCode = subStatusCode;
	}

}

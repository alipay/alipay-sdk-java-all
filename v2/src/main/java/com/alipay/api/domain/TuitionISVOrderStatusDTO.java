package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 留学缴费-订单状态模型
 *
 * @author auto create
 * @since 1.0, 2021-08-16 15:52:31
 */
public class TuitionISVOrderStatusDTO extends AlipayObject {

	private static final long serialVersionUID = 5467399661746245173L;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误信息
	 */
	@ApiField("error_message")
	private String errorMessage;

	/**
	 * 状态码
	 */
	@ApiField("status_code")
	private String statusCode;

	/**
	 * 状态描述
	 */
	@ApiField("status_desc")
	private String statusDesc;

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getStatusCode() {
		return this.statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

}

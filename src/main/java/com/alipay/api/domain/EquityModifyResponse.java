package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 返回权益修改的结果信息，包含推荐是否应当重试，错误码以及错误信息
 *
 * @author auto create
 * @since 1.0, 2022-03-07 21:54:00
 */
public class EquityModifyResponse extends AlipayObject {

	private static final long serialVersionUID = 8893529337969852261L;

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
	 * 黑卡侧推荐是否应当重试
	 */
	@ApiField("should_retry")
	private Boolean shouldRetry;

	/**
	 * 表示接口是否成功
	 */
	@ApiField("success")
	private Boolean success;

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

	public Boolean getShouldRetry() {
		return this.shouldRetry;
	}
	public void setShouldRetry(Boolean shouldRetry) {
		this.shouldRetry = shouldRetry;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}

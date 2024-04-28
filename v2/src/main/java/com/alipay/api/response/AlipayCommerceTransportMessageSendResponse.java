package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.message.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:59
 */
public class AlipayCommerceTransportMessageSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8747163583771761867L;

	/** 
	 * 请求失败时返回的子错误码信息
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 请求失败时的错误信息
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 失败的支付宝用户id（对外版）列表
	 */
	@ApiField("failed_open_ids")
	private String failedOpenIds;

	/** 
	 * 失败的支付宝用户id列表。
	 */
	@ApiField("failed_user_ids")
	private String failedUserIds;

	/** 
	 * 业务成功标志。true表示业务成功，false表示业务失败。
	 */
	@ApiField("success")
	private Boolean success;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setFailedOpenIds(String failedOpenIds) {
		this.failedOpenIds = failedOpenIds;
	}
	public String getFailedOpenIds( ) {
		return this.failedOpenIds;
	}

	public void setFailedUserIds(String failedUserIds) {
		this.failedUserIds = failedUserIds;
	}
	public String getFailedUserIds( ) {
		return this.failedUserIds;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.message.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-27 18:34:23
 */
public class AlipayCommerceTransportMessageSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2784574692785199994L;

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

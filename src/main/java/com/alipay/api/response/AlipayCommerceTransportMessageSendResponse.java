package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.message.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-30 17:51:58
 */
public class AlipayCommerceTransportMessageSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2887553992764861245L;

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

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.device.crashinfo.upload response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:57
 */
public class KoubeiMerchantDeviceCrashinfoUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6472884632485951998L;

	/** 
	 * 系统错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * "错误信息描述"
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 接口调用是否重试的标识
	 */
	@ApiField("retry")
	private Boolean retry;

	/** 
	 * 接口调用是否成功的标识
	 */
	@ApiField("success")
	private Boolean success;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}

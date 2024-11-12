package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.code.verify response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-12 13:27:50
 */
public class AlipayPassCodeVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1641721586742625964L;

	/** 
	 * 返回核销流水号及操作结果
	 */
	@ApiField("biz_result")
	private String bizResult;

	/** 
	 * 返回码.
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 是否发码成功的标识。
	 */
	@ApiField("success")
	private Boolean success;

	public void setBizResult(String bizResult) {
		this.bizResult = bizResult;
	}
	public String getBizResult( ) {
		return this.bizResult;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}

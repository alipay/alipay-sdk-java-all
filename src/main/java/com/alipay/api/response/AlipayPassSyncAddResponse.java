package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.sync.add response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:12:42
 */
public class AlipayPassSyncAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 8491236231387535872L;

	/** 
	 * 成功时返回的业务参数信息。
	 */
	@ApiField("biz_result")
	private String bizResult;

	/** 
	 * 当新增alipass不成功时，产生的错误码。
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 成功标识
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

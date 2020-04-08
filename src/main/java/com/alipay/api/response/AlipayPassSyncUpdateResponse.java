package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.sync.update response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayPassSyncUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7718786599365725437L;

	/** 
	 * 更新成功时的业务信息
	 */
	@ApiField("biz_result")
	private String bizResult;

	/** 
	 * 当新增alipass不成功时，产生的错误码.
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 是否更新成功的标识。
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

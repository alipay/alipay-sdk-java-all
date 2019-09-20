package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.verify.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayPassVerifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5716491365828954555L;

	/** 
	 * 查询成功时返回的结果信息
	 */
	@ApiField("biz_result")
	private String bizResult;

	/** 
	 * 返回码。
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 查询是否成功的标识
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

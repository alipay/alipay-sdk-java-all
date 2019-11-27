package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.sync.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayPassSyncSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5439176575121829962L;

	/** 
	 * 接口返回错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 接口调用返回结果信息
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 操作成功标识【T：成功；F：失败】
	 */
	@ApiField("success")
	private String success;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}

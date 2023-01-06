package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.tpl.content.add response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-14 20:04:50
 */
public class AlipayPassTplContentAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 5279427433426566448L;

	/** 
	 * 业务结果
	 */
	@ApiField("biz_result")
	private String bizResult;

	/** 
	 * 业务错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 是否成功标识:T-成功；F-失败
	 */
	@ApiField("success")
	private String success;

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

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}

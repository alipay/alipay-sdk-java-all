package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.instservice.deduct.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-20 12:12:01
 */
public class AlipayEbppInstserviceDeductConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 1839119512523821528L;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * success 成功
failure 失败
	 */
	@ApiField("status")
	private String status;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}

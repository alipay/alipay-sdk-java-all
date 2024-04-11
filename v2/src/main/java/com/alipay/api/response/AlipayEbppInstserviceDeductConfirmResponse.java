package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.instservice.deduct.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:07
 */
public class AlipayEbppInstserviceDeductConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 8174411113978481663L;

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

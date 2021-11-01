package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.instservice.deduct.sign response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:12:30
 */
public class AlipayEbppInstserviceDeductSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 1556244249547737933L;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 流程ID用于校验
	 */
	@ApiField("process_id")
	private String processId;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public String getProcessId( ) {
		return this.processId;
	}

}

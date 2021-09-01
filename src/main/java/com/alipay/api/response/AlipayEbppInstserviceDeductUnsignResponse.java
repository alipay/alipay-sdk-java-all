package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.instservice.deduct.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:12:30
 */
public class AlipayEbppInstserviceDeductUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 1717311696784553434L;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 流程id
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

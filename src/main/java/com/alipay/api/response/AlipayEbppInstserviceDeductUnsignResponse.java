package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.instservice.deduct.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-27 17:16:41
 */
public class AlipayEbppInstserviceDeductUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 2254733432317784419L;

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

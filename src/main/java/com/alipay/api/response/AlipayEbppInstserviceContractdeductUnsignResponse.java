package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.instservice.contractdeduct.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 16:57:11
 */
public class AlipayEbppInstserviceContractdeductUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 5555263834826769814L;

	/** 
	 * 代扣流程id
	 */
	@ApiField("process_id")
	private String processId;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 返回的结果码描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/** 
	 * 操作状态：
false-失败
true-成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public String getProcessId( ) {
		return this.processId;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}

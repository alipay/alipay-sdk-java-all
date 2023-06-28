package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.gravity.workflow.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-12 12:06:56
 */
public class AlipaySecurityRiskGravityWorkflowCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8332393235951624558L;

	/** 
	 * 错误码
	 */
	@ApiField("code_error")
	private String codeError;

	/** 
	 * 错误描述
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 处理结果
	 */
	@ApiField("process_success")
	private String processSuccess;

	/** 
	 * 合规流程id
	 */
	@ApiField("pu_id")
	private String puId;

	public void setCodeError(String codeError) {
		this.codeError = codeError;
	}
	public String getCodeError( ) {
		return this.codeError;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setProcessSuccess(String processSuccess) {
		this.processSuccess = processSuccess;
	}
	public String getProcessSuccess( ) {
		return this.processSuccess;
	}

	public void setPuId(String puId) {
		this.puId = puId;
	}
	public String getPuId( ) {
		return this.puId;
	}

}

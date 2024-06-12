package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.gravity.workflow.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:01:54
 */
public class AlipaySecurityRiskGravityWorkflowQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6467289768279668312L;

	/** 
	 * 错误码
	 */
	@ApiField("code_error")
	private String codeError;

	/** 
	 * 错误描述
	 */
	@ApiField("code_message")
	private String codeMessage;

	/** 
	 * 最后操作的状态：如同意或拒绝
	 */
	@ApiField("last_operate")
	private String lastOperate;

	/** 
	 * 出来结果
	 */
	@ApiField("process_success")
	private Boolean processSuccess;

	/** 
	 * 流程状态
	 */
	@ApiField("state")
	private String state;

	public void setCodeError(String codeError) {
		this.codeError = codeError;
	}
	public String getCodeError( ) {
		return this.codeError;
	}

	public void setCodeMessage(String codeMessage) {
		this.codeMessage = codeMessage;
	}
	public String getCodeMessage( ) {
		return this.codeMessage;
	}

	public void setLastOperate(String lastOperate) {
		this.lastOperate = lastOperate;
	}
	public String getLastOperate( ) {
		return this.lastOperate;
	}

	public void setProcessSuccess(Boolean processSuccess) {
		this.processSuccess = processSuccess;
	}
	public Boolean getProcessSuccess( ) {
		return this.processSuccess;
	}

	public void setState(String state) {
		this.state = state;
	}
	public String getState( ) {
		return this.state;
	}

}

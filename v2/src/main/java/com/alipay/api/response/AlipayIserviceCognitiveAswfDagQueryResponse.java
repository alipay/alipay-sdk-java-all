package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.aswf.dag.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 02:41:26
 */
public class AlipayIserviceCognitiveAswfDagQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6419931913152266576L;

	/** 
	 * 工作流id
	 */
	@ApiField("dag_id")
	private String dagId;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误描述
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * true: 业务处理成功
false: 业务处理失败
	 */
	@ApiField("success")
	private Boolean success;

	public void setDagId(String dagId) {
		this.dagId = dagId;
	}
	public String getDagId( ) {
		return this.dagId;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}

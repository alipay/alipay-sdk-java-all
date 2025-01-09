package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.classification.feedback.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:32:00
 */
public class AlipayIserviceCognitiveClassificationFeedbackSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2494289988479252651L;

	/** 
	 * 错误code
	 */
	@ApiField("err_code")
	private String errCode;

	/** 
	 * 错误描述
	 */
	@ApiField("err_msg")
	private String errMsg;

	/** 
	 * 接口返回
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * trace_id
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public String getErrCode( ) {
		return this.errCode;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getErrMsg( ) {
		return this.errMsg;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}

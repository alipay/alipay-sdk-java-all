package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.inst.auth.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:09:36
 */
public class MybankCreditSceneprodInstAuthConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8178713622264247781L;

	/** 
	 * 是否准入
	 */
	@ApiField("auth")
	private String auth;

	/** 
	 * 咨询内容返回的结果
	 */
	@ApiField("consult_result")
	private String consultResult;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setAuth(String auth) {
		this.auth = auth;
	}
	public String getAuth( ) {
		return this.auth;
	}

	public void setConsultResult(String consultResult) {
		this.consultResult = consultResult;
	}
	public String getConsultResult( ) {
		return this.consultResult;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.loan.modify response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-27 14:37:18
 */
public class MybankCreditSceneprodLoanModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4521624885715312654L;

	/** 
	 * 在特定状态修改完毕后的返回内容，里面包含合作机构推进流程的信息。
	 */
	@ApiField("result_content")
	private String resultContent;

	/** 
	 * 是否重试
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setResultContent(String resultContent) {
		this.resultContent = resultContent;
	}
	public String getResultContent( ) {
		return this.resultContent;
	}

	public void setRetry(String retry) {
		this.retry = retry;
	}
	public String getRetry( ) {
		return this.retry;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}

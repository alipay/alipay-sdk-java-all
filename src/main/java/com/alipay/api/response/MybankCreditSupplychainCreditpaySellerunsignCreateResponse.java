package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.creditpay.sellerunsign.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-04 11:22:21
 */
public class MybankCreditSupplychainCreditpaySellerunsignCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6899292854434339847L;

	/** 
	 * 失败原因码，解约失败时返回
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 是否可重试
	 */
	@ApiField("retry")
	private Boolean retry;

	/** 
	 * trace信息
	 */
	@ApiField("trace_id")
	private String traceId;

	/** 
	 * 解约结果：true/false
	 */
	@ApiField("unsign_result")
	private Boolean unsignResult;

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

	public void setUnsignResult(Boolean unsignResult) {
		this.unsignResult = unsignResult;
	}
	public Boolean getUnsignResult( ) {
		return this.unsignResult;
	}

}

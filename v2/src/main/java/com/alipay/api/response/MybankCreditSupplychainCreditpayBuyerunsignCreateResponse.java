package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.creditpay.buyerunsign.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:06
 */
public class MybankCreditSupplychainCreditpayBuyerunsignCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1665558827979475755L;

	/** 
	 * 失败原因码：解约失败时返回
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 是否可以重试
	 */
	@ApiField("retry")
	private Boolean retry;

	/** 
	 * 网商日志跟踪ID
	 */
	@ApiField("trace_id")
	private String traceId;

	/** 
	 * 解约结果
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

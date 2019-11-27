package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.action.test.pay response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEbppIndustryActionTestPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 3434249171865737138L;

	/** 
	 * 系统商请求唯一标示,保证用户请求的幂等性.
	 */
	@ApiField("trace_id")
	private String traceId;

	/** 
	 * 云平台请求唯一标示,保证用户请求的幂等性.
	 */
	@ApiField("transaction_id")
	private String transactionId;

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionId( ) {
		return this.transactionId;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.trust.status.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-20 11:06:31
 */
public class AntfortuneStockTrustStatusSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8884359787962587592L;

	/** 
	 * traceId，用来唯一定位某次调用，方便问题排查
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}

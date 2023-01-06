package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.verify.report.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-19 16:30:18
 */
public class AntfortuneStockVerifyReportSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8568892453937487638L;

	/** 
	 * 域内 trace-id，用来联系蚂蚁排查问题
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

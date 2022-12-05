package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.product.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-18 09:21:07
 */
public class AntfortuneStockProductSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4112855469353721135L;

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

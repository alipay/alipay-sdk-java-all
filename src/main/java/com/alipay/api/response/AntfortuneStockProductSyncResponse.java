package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.product.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-06 19:46:42
 */
public class AntfortuneStockProductSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5431252231465968162L;

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

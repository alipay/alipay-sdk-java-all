package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.miniapp.meta.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-20 09:56:49
 */
public class AntfortuneStockMiniappMetaCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1346775751173969516L;

	/** 
	 * traceid
	 */
	@ApiField("trace")
	private String trace;

	public void setTrace(String trace) {
		this.trace = trace;
	}
	public String getTrace( ) {
		return this.trace;
	}

}
